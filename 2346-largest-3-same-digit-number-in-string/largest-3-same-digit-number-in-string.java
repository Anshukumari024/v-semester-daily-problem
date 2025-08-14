class Solution {
    public String largestGoodInteger(String num) {
        String maxst = "";
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                maxst = maxst.compareTo(num.substring(i, i+3)) > 0 ? maxst : num.substring(i, i+3);
            }
        }
        return maxst;
    }
}