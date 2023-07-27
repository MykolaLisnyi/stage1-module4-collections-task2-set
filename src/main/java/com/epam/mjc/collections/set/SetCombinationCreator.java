package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> fourthSet = new HashSet<>(firstSet);
        fourthSet.retainAll(secondSet);
        fourthSet.removeAll(thirdSet);

        Set<String> resulthSet = new HashSet<>(thirdSet);
        resulthSet.removeAll(firstSet);
        resulthSet.removeAll(secondSet);

        resulthSet.addAll(fourthSet);

        return resulthSet;
    }
}
