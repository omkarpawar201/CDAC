package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Teemo_Attacking_495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {

        int count = 0;
        Set<Integer> lst = new TreeSet<>();

        for (int i = 0; i < timeSeries.length; i++) {
            for (int j = 0; j < duration; j++) {
                
                lst.add(timeSeries[i]++);

            }
        }
        System.out.println(lst);
        return lst.size();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int duration = 2;

        System.out.println("Total : " + findPoisonedDuration(arr, duration));
    }
}
