package com.galvatron.functionalprogramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FP_OptionalClass {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Berry", "Strawberry", "Pineapple", "Blueberry");
        Predicate<? super String> predicate = fruit -> fruit.startsWith("B");
        Optional<String> optional = fruits.stream()
                .filter(predicate)
                .findFirst();
        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        optional.ifPresent(System.out::println);
    }
}
