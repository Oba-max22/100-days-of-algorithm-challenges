package algorithms.day_10;

/*
(Mumbling)
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.


 */
public class Accumul {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        int n = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    result.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    result.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            if (i != s.length()-1) {
                result.append("-");
            }
            n++;
        }
        return result.toString();
    }
}
