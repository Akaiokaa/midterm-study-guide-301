import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    @Test
    void testMaxDiffAllSameNumbers() {
        //Arrange
        int[] numbers = {1,1,1,1,1};
        //Act
        int actual = Practice.maxDiff(numbers);
        //Assert
        assertEquals(0, actual);
    }
    
    @Test
    void testMaxDiffWithVariedNumbers(){
        //Arrange
        int[] numbers = {1, 0, 1000, 10, 10000};
        //Act
        int actual = Practice.maxDiff(numbers);
        //Assert
        assertEquals(10000, actual);
    }
    @Test

    void testMaxDiffWithNegativeAndZero(){
        //Arrange
        int[] numbers = {0, -1};
        //Act
        int actual = Practice.maxDiff(numbers);
        //Assert
        assertEquals(1, actual);
    }

    // TODO: Make tests for each problem you solve

    //Test cases for longestWordStartingWithChar
    @Test
    void testlongestWordStartingWithChar_VariousWords(){
        //Arrange
        List<String> input = List.of("hello", "fire", "tree", "kingdom", "keterlomber");
        //Act
        String actual = Practice.longestWordStartingWithChar('k', input);
        //Assert
        assertEquals("keterlomber", actual);
    }
    @Test
    void testlongestWordStartingWithChar_NoMatchingWord() {
        // Arrange
        List<String> input = List.of("apple", "banana", "cherry");
        // Act
        String actual = Practice.longestWordStartingWithChar('z', input);
        // Assert
        assertEquals("", actual); 
    }

    @Test
    void testlongestWordStartingWithChar_MultipleSameLength() {
        // Arrange
        List<String> input = List.of("cat", "car", "cup", "cap");
        // Act
        String actual = Practice.longestWordStartingWithChar('c', input);
        // Assert
        assertEquals("cat", actual);
    }

    @Test
    void testlongestWordStartingWithChar_SingleWord() {
        // Arrange
        List<String> input = List.of("zebra");
        // Act
        String actual = Practice.longestWordStartingWithChar('z', input);
        // Assert
        assertEquals("zebra", actual);
    }

    // test cases for countWordsBetweenLengths
    @Test
    void testCountWordsBetweenLengths_BetweenFourAndEightLetters(){
        //Arrange
        Set<String> input = Set.of("fivee","hello","trouble");
        //Act
        int actual = Practice.countWordsBetweenLengths(4, 8, input);
        //Assert
        //Allowed numbers 5,6,7
        assertEquals(3, actual);
    }

    @Test
    void testCountWordsBetweenLengths_NoWordsInRange() {
        // Arrange
        Set<String> input = Set.of("a", "be", "cat");
        // Act
        int actual = Practice.countWordsBetweenLengths(4, 6, input);
        //Assert
        //Allowed number 5
        assertEquals(0, actual); 
    }
    
    @Test
    void testCountWordsBetweenLengths_SomeWordsInRange() {
        //Arrange
        Set<String> input = Set.of("apple", "banana", "kiwi", "orange");
        //Act
        int actual = Practice.countWordsBetweenLengths(5, 7, input);
        //Assert
        //Allowed numbers 6 letters exactly
        assertEquals(2, actual);
    }

    @Test
    void testCountWordsBetweenLengths_EmptySet() {
        //Arrange
        Set<String> input = Set.of();
        //Act
        int actual = Practice.countWordsBetweenLengths(1, 10, input);
        //Assert
        assertEquals(0, actual); 
    }

    
}


