class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int min = Integer.MAX_VALUE;
        char ans = letters[0];

        for (int i = 0; i < letters.length; i++) {

            int diff = letters[i] - target;

            if (diff > 0 && diff < min) {
                min = diff;
                ans = letters[i];
            }
        }

        return ans;
    }
}