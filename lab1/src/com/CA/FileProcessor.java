/*
Author: Adlane Boulmelh (C19367031)
Date: 19/03/2021
Control: FileProcessor class with built in methods to open, read and close files
CA 2
*/
package com.CA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessor
{
    // attributes
    private String fileName;
    private File fileStore;
    private static String words;
    private String newName;

    public FileProcessor(String fileName)
    {
        this.fileName = fileName;
    }

    public static String getRoles()
    {
        return words;
    }

    public static void setRoles(String roles) {
        FileProcessor.words = roles;
    }


    // getter and setter methods
    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Method designed to open file
    public void openFile()
    {
        // opening file
        fileStore = new File(fileName);
    }

    // method designed to read the file and words in each file
    public String readFile() throws FileNotFoundException {
        String fileLine = "";
        // try catch deployed for error catching if file is not found etc
        Scanner scanner1 = new Scanner(fileStore);
        while (scanner1.hasNextLine())
        {
            words = scanner1.nextLine();
        }
        return fileLine;
    }


}

