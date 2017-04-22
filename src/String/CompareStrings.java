package String;

import java.util.ArrayList;

/**
 * Created by Hotown on 17/4/15.
 */
public class CompareStrings {
    public boolean compareStringsSolution(String A, String B) {
        int res[] = new int[26];

        /**
         * initial res[]
         */
        for(int i = 0; i< 26; i++) {
            res[i] = 0;
        }

        for(int i = 0; i < A.length(); i++) {
            res[A.charAt(i) - 'A'] += 1;
        }

        for (int i = 0; i < B.length(); i++) {
            res[B.charAt(i) -'A'] --;
            if(res[B.charAt(i) -'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}
