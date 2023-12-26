package com.galvatron.functionalprogramming;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FP_functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<String> fruits = List.of("Apple", "Berry", "Strawberry", "Pineapple", "Blueberry");
        printList(numbers); // Prints the list of numbers
        printEvenList(numbers); // Prints the list of even numbers
        printOddList(numbers); // Prints the list of odd numbers
        printFruitsWithAppleKeyword(fruits); // Prints the list of fruits with Apple keyword in it
        printFruitsWithMoreThan5Characters(fruits); // Prints the list of fruits which has more 5 letters in it

    }

    private static void printList(@NotNull List<Integer> numbers) {
        System.out.println("Number list: ");
        numbers.forEach(System.out::print);
        System.out.print("\n\n");
    }

    private static void printEvenList(@NotNull List<Integer> numbers) {
        System.out.println("Even number list: ");
        numbers.stream()
                .filter(FP_functional::isEven) // Method reference
                .forEach(System.out::print);
        System.out.print("\n\n");
    }

    private static void printOddList(@NotNull List<Integer> numbers) {
        System.out.println("Odd number list: ");
        numbers.stream()
                .filter(number -> number % 2 != 0) // Lambda expression
                .forEach(System.out::print);
        System.out.print("\n\n");
    }

    private static void printFruitsWithAppleKeyword(@NotNull List<String> fruits) {
        System.out.println("Fruits with Apple keyword in it: ");
        fruits.stream()
                .filter(fruit -> fruit.toLowerCase().contains("apple")) // Lambda expression
                .forEach(fruit -> System.out.print(fruit+ "\n"));
        System.out.print("\n");
    }

    private static void printFruitsWithMoreThan5Characters(@NotNull List<String> fruits) {
        System.out.println("Fruits which has more than 5 letters: ");
        fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .forEach(fruit -> System.out.print(fruit+ "\n"));
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
