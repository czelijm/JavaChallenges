package com.marekczelij;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    Utilities uti;
    private String input;
    private String expectedOutput;

    public UtilitiesTestParameterized(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

//    @org.junit.jupiter.api.BeforeAll
//    void setup(){
//        uti = new Utilities();
//        System.out.println("Running the test...");
//    }


    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs() {
        uti = new Utilities();
        assertEquals(expectedOutput,uti.removePairs(input));
    }


}
