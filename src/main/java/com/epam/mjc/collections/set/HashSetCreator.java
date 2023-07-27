package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        return sourceList.stream()
                .flatMap(source -> source % 2 == 1
                        ? Stream.of(source, source * 2)
                        : Stream.iterate(source, s -> s % 2 == 0, s -> s / 2)
                                .flatMap(s -> Stream.of(s, s / 2))
                                .distinct())
                .collect(Collectors.toCollection(HashSet::new));
    }
}