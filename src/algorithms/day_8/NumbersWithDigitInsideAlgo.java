package algorithms.day_8;

/*
You have to search all numbers from inclusive 1 to inclusive a given number x, that have the given digit d in it.
The value of d will always be 0 - 9.
The value of x will always be greater than 0.

You have to return as an array

the count of these numbers,
their sum
and their product.

For example:
x = 11
d = 1
->
Numbers: 1, 10, 11
Return: [3, 22, 110]

If there are no numbers, which include the digit, return [0,0,0].

 */
public class NumbersWithDigitInsideAlgo {
    public static long[] NumbersWithDigitInside(long x, long d)
    {
        long[] result = new long[3];
        long count = 0;
        long sum = 0;
        long product = 1;

        for (long i = d; i <= x; i++) {
            String j = String.valueOf(i);
            if (j.contains(String.valueOf(d)) && i != 0) {
                sum += i;
                product *= i;
                count++;
            }
        }

        result[0] = count;
        result[1] = sum;
        if (count == 0) {
            product = 0;
        }
        result[2] = product;
        return result;
    }
}
