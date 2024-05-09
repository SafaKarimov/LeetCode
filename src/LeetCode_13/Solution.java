package LeetCode_13;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'V' || c == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I')
                    num -= 2;

            }
            if (c == 'L' || c == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X')
                    num -= 20;
            }
            if (c == 'D' || c == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C')
                    num -= 200;
            }
            num += map.get(c);
        }

        return num;
    }

}