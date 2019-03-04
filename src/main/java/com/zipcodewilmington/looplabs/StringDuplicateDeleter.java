package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String[] results = new String[array.length];
        int toReturn = 0;
        for (int i = 0; i < array.length; i++) {
            if(countDuplicates(array[i], array) < maxNumberOfDuplications) {
                results[i] = array[i];
                toReturn++;
            }
        }

        String[] trimmedArray = trimArray(results, toReturn);

        return trimmedArray;
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] exactResults = new String[array.length];
        int toReturn = 0;
        for (int i = 0; i < array.length; i++) {
            if(countDuplicates(array[i], array) != exactNumberOfDuplications) {
                exactResults[i] = array[i];
                toReturn++;
            }
        }

        String[] trimmedExactArray = trimArray(exactResults, toReturn);

        return trimmedExactArray;
    }

    private Integer countDuplicates(String stringToCheck, String[] intArray) {

        Integer count = 0;

        for (String string : intArray) {

            if(stringToCheck == string) {
                count++;
            }
        }
        return count;
    }

    private String[] trimArray(String[] results, int sizeOfArray) {
        String[] newArray = new String[sizeOfArray];
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
