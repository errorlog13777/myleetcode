class Solution {
    public int numberOfSteps(int num) {
        // if (num == 0) return 
        // if (num % 2 == 0) return numberOfSteps(n / 2);
        // else return numberOfSteps(n - 1);
        int n = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else --num;
            ++n;
        }
        return n;
    }
}