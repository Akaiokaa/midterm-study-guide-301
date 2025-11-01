import static org.junit.Assert.*;

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
        assertEquals(1, actual);
    }
    

    // TODO: Make tests for each problem you solve
    
}


