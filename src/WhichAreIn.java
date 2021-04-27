import java.util.*;

// Day-2
/*
 Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

 #Example 1: a1 = ["arp", "live", "strong"]

 a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

 returns ["arp", "live", "strong"]

 #Example 2: a1 = ["tarp", "mice", "bull"]

 a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

 returns []
 */

public class WhichAreIn {
    public static void main(String[] args) {
        String a[] = new String[]{ "strong", "arp", "live" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(Arrays.toString(WhichAreIn.inArray(a, b))); // { "arp", "live", "strong" }
    }
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> r = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    if (!(r.contains(array1[i]))) {
                        r.add(array1[i]);
                    }
                }
            }
        }

        Collections.sort(r);

        String[] res = new String[r.size()];
        for (int i = 0; i < r.size(); i++) {
            res[i] = r.get(i);
        }

        return res;
    }
}
