package problems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class highestLowestFreq {

    public static int[] getFrequencies(int []v) {
        // Write Your Code Here

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int i : v) {
            int value = freqMap.getOrDefault(i, 0)+1;
            freqMap.put(i, value);
        }

        int maxFreqElement = Integer.MAX_VALUE;
        int minFreqElement = Integer.MAX_VALUE;

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {

            int currentElement = entry.getKey();
            int currentFreq = entry.getValue();

            if (currentFreq > maxFreq) {
                maxFreqElement = currentElement;
                maxFreq = currentFreq;
            } else if (entry.getValue() == maxFreq && entry.getKey() < maxFreqElement) {
                maxFreqElement = currentElement;
            }

            if (currentFreq < minFreq) {
                minFreqElement = entry.getKey();
                minFreq = entry.getValue();
            } else if (currentFreq == minFreq && currentElement < minFreqElement) {
                minFreqElement = currentElement;
            }
        }

        return new int[]{maxFreqElement,minFreqElement};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFrequencies(new int[]{1, 2, 3, 1, 1, 4})));
    }
}
