package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        return sourceList.stream()
                .map(s -> s * s)
                .collect(Collectors.toCollection(TreeSet::new))
                .subSet(lowerBound, true, upperBound, true);
    }
}
