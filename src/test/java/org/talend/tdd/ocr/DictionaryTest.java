package org.talend.tdd.ocr;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for the Dictionary enum.
 */
public class DictionaryTest {


    @Test
    public void shouldBeOne() {
        //formatter:off
        String input = "   "+
                       "  |" +
                       "  |";
        //formatter:on

        assertEquals(input, Dictionary.ONE.getInput());
    }

    @Test
    public void shouldBeTwo() {
        //formatter:off
        String input = " _ "+
                       " _|" +
                       "|_ ";
        //formatter:on

        assertEquals(input, Dictionary.TWO.getInput());
    }

    @Test
    public void shouldBeThree() {
        //formatter:off
        String input = " _ "+
                       " _|" +
                       " _|";
        //formatter:on

        assertEquals(input, Dictionary.THREE.getInput());
    }


    @Test
    public void shouldBeFour() {
        //formatter:off
        String input = "   "+
                       "|_|" +
                       "  |";
        //formatter:on

        assertEquals(input, Dictionary.FOUR.getInput());
    }

    @Test
    public void shouldBeFive() {
        //formatter:off
        String input = " _ "+
                       "|_ " +
                       " _|";
        //formatter:on

        assertEquals(input, Dictionary.FIVE.getInput());
    }

    @Test
    public void shouldBeSix() {
        //formatter:off
        String input = " _ "+
                       "|_ " +
                       "|_|";
        //formatter:on

        assertEquals(input, Dictionary.SIX.getInput());
    }

    @Test
    public void shouldBeSeven() {
        //formatter:off
        String input = " _ "+
                       "  |" +
                       "  |";
        //formatter:on

        assertEquals(input, Dictionary.SEVEN.getInput());
    }

    @Test
    public void shouldBeEight() {
        //formatter:off
        String input = " _ "+
                       "|_|" +
                       "|_|";
        //formatter:on

        assertEquals(input, Dictionary.EIGHT.getInput());
    }

    @Test
    public void shouldBeNine() {
        //formatter:off
        String input = " _ "+
                       "|_|" +
                       " _|";
        //formatter:on

        assertEquals(input, Dictionary.NINE.getInput());
    }


}