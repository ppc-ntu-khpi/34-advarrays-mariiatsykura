import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixUtilsTest {

    @Test
    public void testCalculateSum() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int actualSum = MatrixUtils.calculateSum(matrix);

        Assertions.assertEquals(45, actualSum);
    }
}
