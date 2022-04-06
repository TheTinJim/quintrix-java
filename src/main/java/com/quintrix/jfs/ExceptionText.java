package com.quintrix.jfs;

public class ExceptionText {

  public static void main(String[] args) {

    String str = "abc";

    long num = 0;
    try {
      num = Long.parseLong(str);
    } catch (NumberFormatException e) {
      System.out.println("Could not convert " + str);
      num = -1;
    } finally {

    }

    System.out.println("Converted number is: " + num);
  }

}

