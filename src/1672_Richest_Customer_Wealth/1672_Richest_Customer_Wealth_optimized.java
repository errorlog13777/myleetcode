class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int i = 0; i < accounts.length; ++i) {
            int result = 0;
            for (int j = 0; j < accounts[i].length; ++j) {
                result += accounts[i][j];
            }
            if (richest < result) richest = result;
        }
        return richest;
    } 
}