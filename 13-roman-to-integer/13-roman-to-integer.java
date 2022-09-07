class Solution{
private static final String[] ROMAN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
private static final int[] ARABIC = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

public int romanToInt(String s) {
    
    String remaining = s;
    int result = 0;
    
    for (int i = 0; i < ROMAN.length; i++) {
        while(remaining.startsWith(ROMAN[i])) {
            remaining = remaining.substring(ROMAN[i].length());
            result+=ARABIC[i];
        }    
    }
    
    return result;
    
}
}