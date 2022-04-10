package com.quintrix.jfs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {

    TestFP testFP = (a, b) -> "1";

    fpAsArg(testFP);

    long biggerNum = 1000L;

    boolean checkNum = false;

    Map<String, String> stateMap;
    {
      stateMap = new HashMap<>();
      stateMap.put("CO", "Colorado");
      stateMap.put("OH", "Ohio");
      stateMap.put("NJ", "New Jersey");
      stateMap.put("CA", "California");
    }

    String str1 = new String("Hello");

    String str2 = new String("Hello");

    /*
     * if(str1 == str2) { System.out.println("They are equal"); } else {
     * System.out.println("They are not equal"); }
     */
    Integer carsCounter1 = 10;

    Integer carsCounter2 = 10;

    Date curDate = new Date();

    // System.out.println("curDate is: " + curDate.getTime());

    // System.out.println(Math.pow(5, 3));

    List<Integer> intSet = new ArrayList<>();

    intSet.add(10);

    intSet.add(12);

    intSet.add(15);

    intSet.add(8);

    intSet.add(10);

    intSet.sort(null);

    Predicate<Dog> p = (d) -> d.getAge() > 2;

    List<Integer> evenNumbersList =
        intSet.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNumbersList);

    for (Integer i : intSet) {
      // System.out.println(i);
    }

    List<Dog> dogList = new ArrayList<>();

    Dog dog1 = new Dog(1, "A", 2, "Black");

    dogList.add(dog1);

    Dog dog2 = new Dog(2, "B", 1, "White");

    Dog dog3 = new Dog(1, "C", 4, "Blue");

    Dog dog4 = new Dog(4, "A", 2, "Blue");

    dogList.add(dog2);

    dogList.add(dog3);

    dogList.add(dog4);

    Collections.sort(dogList);

    List<Dog> dogListFiltered =
        dogList.stream().filter(d -> d.getAge() > 2).collect(Collectors.toList());

    System.out.println(dogListFiltered);

    for (Dog dog : dogList) {
      // System.out.println(dog);
    }

    if (stateMap.get("CA") != null) {
      // System.out.println(stateMap.get("CA"));
    } else {
      // System.out.println("Not in the map");
    }

    for (String key : stateMap.keySet()) {
      // System.out.println(key);
    }
    // System.out.println("Dog is: " + dog.getBreed);

    SpecialDog specialDog = new SpecialDog();

    specialDog.fight();

    // DateFormat dateFormat = new SimpleDateFormat("M/d F");
    // String strDate = dateFormat.format(curDate);
    // System.out.println("Converted String: " + strDate);


    if (carsCounter1 == carsCounter2) {
      // System.out.println("They are equal");
    } else {
      // System.out.println("They are not equal");
    }

    int carsCounter = 0;

    char alphabet = '\u2764';


    double testDecimalVal = 1.0;

    testDecimalVal = testDecimalVal + 0.2;



    carsCounter = (int) biggerNum;

    carsCounter++;

    // System.out.println("Test Output: " + testDecimalVal);

    String fileName = "quintrix.txt";

    FileCreator quintrixFileCreator = new FileCreator(fileName);

    File quintrixFile = quintrixFileCreator.createFile();

    try { // write to file
      FileWriter writer = new FileWriter(fileName);
      writer.write("Quintrix Solutions");
      writer.close();
      System.out.println("Write operation successful");
    } catch (IOException e) {
      System.out.println("An error occured");
      e.printStackTrace();
    }

    try { // read from file
      Scanner reader = new Scanner(quintrixFile);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        System.out.println(data);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    FileCreator defaultFileCreator = new FileCreator();
    File defaultFile = defaultFileCreator.createFile();
    try { // write to file
      FileWriter writer = new FileWriter(defaultFileCreator.getFileName());
      writer.write("default");
      writer.close();
      System.out.println("Write operation successful");
    } catch (IOException e) {
      System.out.println("An error occured");
      e.printStackTrace();
    }

    try { // read from file
      Scanner reader = new Scanner(defaultFile);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        System.out.println(data);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  private static int fpAsArg(TestFP testFP) {
    return 1;
  }
}
