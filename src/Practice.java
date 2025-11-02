import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        /* Questions to ask
         * Should I have to worry about the list having the same number?
         * Should I be worried about edge cases?
         * To clarify when we say difference we want largest - smallest not the other way arount?
         * Am I allowed to call upon a java util?
         */
        // TODO: implement this
        /*
         * pseudo code
         *  int[] newList.sort = varible;
         * return newlist[0] - newlist[len(newlist) - 1]
         */
        /*first method */
        // Arrays.sort(nums);
        // return nums[nums.length - 1] - nums[0];

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one
    public static String longestWordStartingWithChar(char letter, List<String> words) {
        /*
         * do i have to worry about all the words being the same?
         * will the list passed in allways contain a word that has the "char"?
         * do i have to worry about casing?
         */
        /*
         * psuedo code
         * varble = store longestWordWithChar
         * 
         * loop through
         *   word in words
         *      if the word.length > longestWordwithchar.length and word.charAt(0) == letter
         *         longestword = word;
         * return longestword
         */
        if (words.isEmpty()) return "";

        String longestWordWithChar = "";
        for(String word: words){
            if(word.length() > longestWordWithChar.length() && 
               word.toLowerCase().charAt(0) == letter){
                longestWordWithChar = word;
            }
        }
        return longestWordWithChar;
    }

    public static int countWordsBetweenLengths(int n, int m, Set<String> words) {
        /*
         * do i have to worry about the set having any empty inputs?
         * will I have to worry about any of the words not matching the betweenlengths?
         * is this inclusive or not? i assume non-inclusive.
         */
        /*
         * psuedocode
         * int countWordsBetweenLengths = 0;
         * for loop
         *  if word.size() > n && < m
         *      count++
         * return count words between
        */
        if (words.isEmpty()) return 0;
        int countWordsBetweenLengths = 0;
        for(String word: words){
            if (word.length() > n && word.length() < m) {
                countWordsBetweenLengths++;
            }
        }
        return countWordsBetweenLengths;
        /* o of n where n equals the length of our words */
    }
    public static int differenceOddEvenValues(Map<Integer, Integer> map) {
        /*
         * Will I have to worry about an empty map? should I make a casing
         * Will I have to worry about a map having only even or odd values?
         * Are there any edges cases I should implement?
         */
        /*
         * pseudo code
         * int oddCount = 0;
         * int evenCount = 0;
         * 
         * for(Integer number in map.values()){
         *      if number % 2 == 0 {
         *          oddcount ++
         *      } else
         *          evencount ++;
         * }
         * return oddcount - evencount
         */
        int oddCount = 0;
        int evenCount = 0;
        for(Integer number: map.values()){
            if (number % 2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }

        return oddCount - evenCount;
    }
    //keys
    public static int secondLargestNumber(Map<Integer, Integer> map){
        return 0;
    }



    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}