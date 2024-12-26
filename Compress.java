class Solution {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0)
            return 0;
        if (chars.length == 1)
            return 1;
        int compressionIndex = 0;
        char previousChar = chars[0];
        int countOccurence = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == previousChar) {
                countOccurence++;
            } else {
                compressionIndex = placeChar(chars, compressionIndex, countOccurence, previousChar);
                countOccurence = 1;
                previousChar = chars[i];
            }

        }

        compressionIndex = placeChar(chars, compressionIndex, countOccurence, previousChar);

        return compressionIndex;

    }

    public int placeChar(char[] chars, int index, int occurence, char previousChar) {
        chars[index] = previousChar;
        index++;
        if (occurence > 1) {
            String occurenseString = String.valueOf(occurence);
            for (char co : occurenseString.toCharArray()) {
                chars[index] = co;
                index++;
            }
        }
        return index;
    }
}
