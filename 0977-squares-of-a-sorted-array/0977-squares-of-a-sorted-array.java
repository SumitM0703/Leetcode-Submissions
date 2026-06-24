class Solution {
    public int[] sortedSquares(int[] nums) {

        int posCount = 0;
        int negCount = 0;

        for (int num : nums) {
            if (num >= 0)
                posCount++;
            else
                negCount++;
        }

        int[] positive = new int[posCount];
        int[] negative = new int[negCount];

        int p = 0;
        int q = 0;

        for (int num : nums) {
            if (num >= 0)
                positive[p++] = num * num;
            else
                negative[q++] = num * num;
        }

        int i = negCount - 1;
        int j = 0;
        int k = 0;

        int[] result = new int[nums.length];

        while (i >= 0 && j < posCount) {
            if (negative[i] <= positive[j]) {
                result[k++] = negative[i--];
            } else {
                result[k++] = positive[j++];
            }
        }

        while (i >= 0) {
            result[k++] = negative[i--];
        }

        while (j < posCount) {
            result[k++] = positive[j++];
        }

        return result;
    }
}