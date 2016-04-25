/*
 * Copyright (c) 2016 Justin W. Flory
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
            List<String> fileContents = Files.readAllLines(Paths.get(FILE_NAME));
            for (String s : fileContents) System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
