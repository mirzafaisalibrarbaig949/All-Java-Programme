package com.accolite.assignment;
import java.util.*;

public class WeirdLogic {
    public static boolean weirdLogic(int[] arr) {
        int countX = 0;
        int countOthers = 0;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(found) {
                if(arr[i] == arr[i - 1]) {
                    countX++;
                }
            } else {
                if(countX > countOthers) {
                    found = true;
                } else {
                    int x = arr[i];
                    for(int j = 0; j < arr.length; j++) {
                        if(arr[j] == x) {
                            countX++;
                        } else {
                            countOthers++;
                        }
                    }
                }
            }
        }

        return found && countX > countOthers;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 3, 3};
        System.out.println(weirdLogic(arr));
    }
}