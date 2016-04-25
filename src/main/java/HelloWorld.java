/*
 * Copyright (c) 2016 Justin W. Flory
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * HelloWorld.java
 * <p>
 * This class is intended to be used as a working example and demonstration of using Git and GitHub for a project. In
 * this example, we're going to show committing, pushing, and reverting code.
 *
 * @author Justin W. Flory
 * @version 2016.04.25.v1
 */
public class HelloWorld {

    // Constant
    String FILE_NAME = "test-info.txt";

    /**
     * Main method that prints a line and then calls the constructor to read in a text file.
     *
     * @param args arguments passed in via the command line (not used in this demo)
     */
    public static void main(String[] args) {
        System.out.println("Hello world!\n");
        new HelloWorld();
    }

    /**
     * Simple constructor that reads a file and prints the first line of the file.
     */
    public HelloWorld() {
        try {
            BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
            System.out.println("Reading in one line of " + FILE_NAME + ":\n" +
                    in.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
