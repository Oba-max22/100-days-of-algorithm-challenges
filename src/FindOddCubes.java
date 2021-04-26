import java.util.Arrays;

// Day-1
// Find the sum of the odd numbers within an array, after cubing the initial integers.
// The function should return undefined/None/nil/NULL if any of the values aren't numbers.
// Note: There are ONLY integers in the JAVA and C# versions of this Kata.

public class FindOddCubes {
    public static void main(String[] args) {
        System.out.println(FindOddCubes.cubeOdd(new int[] {-5, -5, 5, 5}));
        System.out.println(FindOddCubes.cubeOdd(new int[] {1, 2, 3, 4}));
        System.out.println(FindOddCubes.cubeOdd(new int[] {-3, -2, 2, 3}));
    }
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr).map(n -> n = (n * n * n)).filter(n -> n % 2 == 1 || n % 2 == -1).sum();
    }
}
