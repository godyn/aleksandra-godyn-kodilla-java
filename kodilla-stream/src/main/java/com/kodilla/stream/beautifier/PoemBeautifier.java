package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public PoemBeautifier() {
    }

    public void beautify (String text, PoemDecorator poemDecorator){

        String effect = poemDecorator.decorate(text);

        System.out.println(effect);

    }
}
