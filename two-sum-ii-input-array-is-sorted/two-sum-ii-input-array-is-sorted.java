class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] arr = new int[2];
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        arr[0] = l + 1;
        arr[1] = r + 1;
        return arr;
    }
}