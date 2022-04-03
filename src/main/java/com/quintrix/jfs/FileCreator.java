package com.quintrix.jfs;

import java.io.File;
import java.io.IOException;

public class FileCreator {

  private String fileName = "default.txt";

  public FileCreator() {
    super();
  }

  public FileCreator(String fileName) {
    super();
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public File createFile() {
    try {
      File myFile = new File(fileName);
      if (myFile.createNewFile()) {
        System.out.println("Successfully created " + myFile.getName());
      } else {
        System.out.println(myFile.getName() + " already exists");
      }
      return myFile;
    } catch (IOException e) {
      System.out.println("An error occured while creating the file");
      e.printStackTrace();
      return null;
    }
  }

}

