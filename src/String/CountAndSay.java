package String;

/**
 * Created by Hotown on 17/6/3.
 */
public class CountAndSay {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        // Write your code here
        String oldString = "1";
        while (--n > 0) {
            StringBuffer newString = new StringBuffer();
            for (int i = 0, length = oldString.length(); i < oldString.length(); i++) {
                int count = 1;
                while ((i + 1) < length && oldString.charAt(i) == oldString.charAt(i + 1)) {
                    count++;
                    i++;
                }
                newString.append(String.valueOf(count)+oldString.charAt(i));
            }
            oldString = newString.toString();
        }
        return oldString;
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(6));
    }
}
