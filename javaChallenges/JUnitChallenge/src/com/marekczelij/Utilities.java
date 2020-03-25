package com.marekczelij;

public class Utilities {
    //returns a char containing every nth char.
    //When sourceArray.length < n return sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){

        if(sourceArray.length<n || sourceArray == null){
            return sourceArray;
        }

        int returnedArrayLength = sourceArray.length / n;

        char[] returnedArray = new char[returnedArrayLength];
        for (int i = 1; i <= returnedArrayLength; i++) {
            returnedArray[i-1]=sourceArray[n*i-1];
        }

        return returnedArray;
    }

    //Return array where pairs of same character that
    // are next to each other, are removed by removing on a occurenced
    //of the character
    //"AABCDEEF" ->"ABCEDF"
    public String removePairs(String source){
        if(source ==null || source.length()<2){
            return source;
        }
        String outString="";
        char[] sourceCharArray = source.toCharArray();

        for (int i = 0; i < source.length(); i++) {
            outString+=sourceCharArray[i];
            if(i<source.length()-1 && sourceCharArray[i]==sourceCharArray[i+1]){
                i++;
            }
        }
        return outString;
    }

    //perform a conversion based on some business rule
    public int coversion(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return (a/b) + (a*30) - 2;
    }

    public String nullIfOddLength(String source){
        if(source!=null && source.length()%2==0){
            return source;
        }
        return null;
    }

}
