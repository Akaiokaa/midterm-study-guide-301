import static org.junit.Assert.*;

import java.util.List;

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
    
}


