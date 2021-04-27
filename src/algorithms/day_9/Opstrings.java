package algorithms.day_9;

import java.util.function.Function;
/*
Day-9 (Moves in squared strings (I))
This kata is the first of a sequence of four about "Squared Strings".

You are given a string of n lines, each substring being n characters long: For example:

s = "abcd\nefgh\nijkl\nmnop"

We will study some transformations of this square of strings.

Vertical mirror: vert_mirror (or vertMirror or vert-mirror)
vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"
Horizontal mirror: hor_mirror (or horMirror or hor-mirror)
hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"
or printed:

vertical mirror   |horizontal mirror
abcd --> dcba     |abcd --> mnop
efgh     hgfe     |efgh     ijkl
ijkl     lkji     |ijkl     efgh
mnop     ponm     |mnop     abcd
Task:
Write these two functions
and

high-order function oper(fct, s) where

fct is the function of one variable f to apply to the string s (fct will be one of vertMirror, horMirror)

Examples:
s = "abcd\nefgh\nijkl\nmnop"
oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"
oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd"
Note:
The form of the parameter fct in oper changes according to the language. You can see each form according to the language in "Sample Tests".

Bash Note:
The input strings are separated by , instead of \n. The output strings should be separated by \r instead of \n. See "Sample Tests".
 */

public class Opstrings {
    public static void main(String[] args) {
        System.out.println(oper(Opstrings::vertMirror, "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"));
        System.out.println(oper(Opstrings::horMirror, "njMK\ndbrZ\nLPKo\ncEYz"));
    }

    public static String vertMirror (String strng) {
        String[] s = strng.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String value : s) {
            StringBuilder wb = new StringBuilder(value);
            sb.append(wb.reverse()).append("\n");
        }
        return sb.toString().trim();
    }
    public static String horMirror (String strng) {
        String[] s = strng.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]).append("\n");
        }
        return sb.toString().trim();
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
