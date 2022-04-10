package com.quintrix.jfs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FPDemo {

  public static void main(String[] args) {
    // Create a list of names for testing
    List<String> nameList = new ArrayList<>();
    nameList.add("Alyssa");
    nameList.add("Brandon");
    nameList.add("Alex");
    nameList.add("Layla");
    nameList.add("Demeter");
    nameList.add("Summer");
    nameList.add("Lance");
    nameList.add("Peyton");
    nameList.add("Justin");
    nameList.add("Matthew");
    nameList.add("Masen");
    nameList.add("Gio");
    System.out.println("Starting name list:\n");
    nameList.stream().forEach(System.out::println);
    System.out.println();

    // Intermediate Example 1: filter()
    System.out.println("Listing every name that starts with M:\n");
    nameList.stream().filter(n -> n.startsWith("M")).forEach(System.out::println);;
    System.out.println();

    // Intermediate Example 2: sorted()
    System.out.println("Listing every name in reverse alphabetical order:\n");
    List<String> sortedNameList =
        nameList.stream().sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());;
    sortedNameList.stream().forEach(System.out::println);
    System.out.println();

    // Intermediate Example 3: map()
    System.out.println("Listing every unique first letter:\n");
    nameList.stream().map(n -> n.charAt(0)).distinct().forEach(System.out::println);;
    System.out.println();

    // Terminal Example 1: min()
    System.out.println("Listing the shortest name:\n");
    System.out.println(
        nameList.stream().min((n1, n2) -> Integer.compare(n1.length(), n2.length())).get());
    System.out.println();

    // Terminal Example 2: count()
    System.out.println("Counting the number of names starting with A:\n");
    System.out.println(nameList.stream().filter(n -> n.startsWith("A")).count());
    System.out.println();

    // Terminal Example 3: findAny()
    System.out.println("Grabbing a name from the list:\n");
    nameList.stream().parallel().findAny().ifPresent(System.out::println);
  }

}

