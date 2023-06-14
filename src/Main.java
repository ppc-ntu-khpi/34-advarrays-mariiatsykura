import java.util.Arrays;

/**
 * Демонструє обчислення суми елементів матриці.
 */
public class Main {

    /**
     * Головний метод є точкою входу в програму.
     * Він створює матрицю і обчислює суму її елементів, використовуючи клас MatrixUtils.
     * Елементи матриці можуть бути змінені за потреби.
     *
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 7, 6},
                {7, 8, 9}
        };

        int sum = MatrixUtils.calculateSum(matrix);
        System.out.println("Sum of elements: " + sum);
    }
}