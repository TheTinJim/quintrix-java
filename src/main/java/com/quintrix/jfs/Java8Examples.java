package com.quintrix.jfs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Java8Examples {

  public static void main(String[] args) {
    List<String> memberNames = new ArrayList<>();
    memberNames.add("Amitabh");
    memberNames.add("Shekhar");
    memberNames.add("Aman");
    memberNames.add("Rahul");
    memberNames.add("Shahrukh");
    memberNames.add("Salman");
    memberNames.add("Yana");
    memberNames.add("Lokesh");

    Function x;

    memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase)
        .forEach(System.out::println);
  }

}

