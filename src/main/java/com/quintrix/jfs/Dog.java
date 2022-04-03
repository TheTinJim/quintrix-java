package com.quintrix.jfs;

import java.util.Objects;

public class Dog implements Comparable<Dog> {
  private int dogId;
  private String breed;
  private int age;
  private String color;

  public static final int NUM_OF_LEGS = 4;

  public Dog() {

  }

  public Dog(int dogId, String breed, int age, String color) {
    super();
    this.dogId = dogId;
    this.breed = breed;
    this.age = age;
    this.color = color;
  }

  public int getDogId() {
    return dogId;
  }

  public void setDogId(int dogId) {
    this.dogId = dogId;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  void barking() {}

  void hungry() {}

  void sleeping() {}

  @Override
  public String toString() {
    return "Dog [dogId=" + dogId + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(dogId);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dog other = (Dog) obj;
    return dogId == other.dogId;
  }

  @Override
  public int compareTo(Dog o) {
    // TODO Auto-generated method stub
    if (Integer.compare(getDogId(), o.getDogId()) == 0) {
      return Integer.compare(getAge(), o.getAge());
    } else {
      return Integer.compare(getDogId(), o.getDogId());
    }
  }

}
