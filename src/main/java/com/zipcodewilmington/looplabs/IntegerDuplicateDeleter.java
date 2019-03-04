package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
//    Integer[] intArray;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] results = new Integer[array.length];
        int toReturn = 0;
        for (int i = 0; i < array.length; i++) {
            if(countDuplicates(array[i], array) < maxNumberOfDuplications) {
                results[i] = array[i];
                toReturn++;
            }
        }

        Integer[] trimmedArray = trimArray(results, toReturn);

        return trimmedArray;
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] exactResults = new Integer[array.length];
        int toReturn = 0;
        for (int i = 0; i < array.length; i++) {
            if(countDuplicates(array[i], array) != exactNumberOfDuplications) {
                exactResults[i] = array[i];
                toReturn++;
            }
        }

        Integer[] trimmedExactArray = trimArray(exactResults, toReturn);

        return trimmedExactArray;
    }



    private Integer countDuplicates(Integer numberToCheck, Integer[] intArray) {

        Integer count = 0;

        for (int number : intArray) {

            if(numberToCheck == number) {
               count++;
            }
        }
        return count;
    }

    private Integer[] trimArray(Integer[] results, int sizeOfArray) {
        Integer[] newArray = new Integer[sizeOfArray];
        int nextIndex = 0;
        for (int i = 0; i < results.length; i++) {
            if(results[i] != null) {
                newArray[nextIndex] = results[i];
                nextIndex++;
            }
        }
        return newArray;
    }
}



