package ru.otus.java.basic.homeworks.homework15;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {

    }

    private static List<Integer> createRange(int min, int max) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            integerList.add(i);
        }

        return integerList;
    }

    private static int sumElementsGreaterThanFive(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (i > 5) {
                sum += i;
            }
        }

        return sum;
    }

    private static void fillListWithValue(List<Integer> list, int value) {
        Collections.fill(list, value);
    }

    private static List<Integer> incrementElements(List<Integer> list, int value) {
        list.replaceAll(integer -> integer * 5);
        return list;
    }

    private static List<Integer> reverse(List<Integer> list) {
        return list.reversed();
    }

    private static List<String> removeDuplicates(List<String> strings) {
        return strings.stream()
                .distinct()
                .toList();
    }

    public static List<Integer> getDifference(List<Integer> list1, List<Integer> list2) {
        Set<Integer> excludeSet = new HashSet<>(list2);
        return list1.stream()
                .filter(element -> !excludeSet.contains(element))
                .toList();
    }
}
