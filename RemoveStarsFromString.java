class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '*') {
                result.append(c);
            } else {
                result.setLength(result.length() - 1);
            }
        }
        return result.toString();

    }
}
