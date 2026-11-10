package homework.h14;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

public class T1 {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int last = stack.length() - 1;

            if (last >= 0 && stack.charAt(last) == current) {
                stack.deleteCharAt(last);
            } else {
                stack.append(current);
            }
        }

        return stack.toString();
    }
}