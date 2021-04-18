package com.CA;

import java.util.ArrayList;

// control class to run all methods
public class Control
{
    public static void main(String[] args)
    {
        // array to store file names we will use to search through
        ArrayList<String> files = new ArrayList<String>();
        // add file names into array
        files.add("deaths.txt");
        files.add("gillette.txt");
        files.add("stonks.txt");
        files.add("train.txt");

        String local_store = files.get(0);
        FileProcessor file1 = new FileProcessor(local_store);
        file1.openFile();
        file1.readFile("stonks");
        String readlines = file1.readFile("stonks");
        System.out.println(readlines);

    }

}
