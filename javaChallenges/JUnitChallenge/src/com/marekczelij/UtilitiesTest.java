package com.marekczelij;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    Utilities uti;

    @org.junit.jupiter.api.BeforeEach
    void setup(){
        uti = new Utilities();
    }

    @org.junit.jupiter.api.Test
    void everyNthChar() {
        //char[] desiredOutput =  {'e','l'}
        assertArrayEquals("el".toCharArray(),uti.everyNthChar("hello".toCharArray(),2));
    }
    @org.junit.jupiter.api.Test
    void everyNthCharArrayLength() {
        //char[] desiredOutput =  {'e','l'}
        assertArrayEquals("hello".toCharArray(),uti.everyNthChar("hello".toCharArray(),100));
    }


    @org.junit.jupiter.api.Test
    void removePairs() {
        assertEquals("ABCDEF",uti.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF",uti.removePairs("ABCCABDEEF"));
        assertNull(uti.removePairs(null));
        assertEquals("A",uti.removePairs("A"));
        assertEquals("",uti.removePairs(""));
    }

    @org.junit.jupiter.api.Test
    void coversion() {
        assertEquals(300,uti.coversion(10,5));
        //assertThrows(ArithmeticException.class,() -> uti.coversion(10,0));
    }

    @org.junit.jupiter.api.Test
    void coversionDividedByZero() {
        assertThrows(ArithmeticException.class,() -> uti.coversion(10,0));
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength() {

       // assertEquals("hi",uti.nullIfOddLength("hi"));
        assertNotNull(uti.nullIfOddLength("hi"));
        assertNull(uti.nullIfOddLength("hii"));
        assertNull(uti.nullIfOddLength(null));



    }
}