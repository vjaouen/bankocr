package org.talend.tdd.ocr;

public enum Dictionary {

    ONE   ("     |  |"),
    TWO   (" _  _||_ "),
    THREE (" _  _| _|"),
    FOUR  ("   |_|  |"),
    FIVE  (" _ |_  _|"),
    SIX   (" _ |_ |_|"),
    SEVEN (" _   |  |"),
    EIGHT (" _ |_||_|"),
    NINE  (" _ |_| _|");

    private String input;

    Dictionary(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
