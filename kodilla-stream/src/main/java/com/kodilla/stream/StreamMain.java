package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.ToSpaceOut;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class StreamMain {

        public static void main(String[] args) {
            System.out.println("Welcome to module 7 - Stream");

            PoemBeautifier poemBeautifier = new PoemBeautifier();

            String name = "Anna";

            poemBeautifier.beautify(name, (text) -> "ABC " + text + " ABC");
            poemBeautifier.beautify(name, (text) -> "*** " + text + " ***");
            poemBeautifier.beautify(name, (text) -> toUpperCase(text));
            poemBeautifier.beautify(name, ToSpaceOut::spaceOut);
        }
}
