class Solution {
    public int maximumWealth(int[][] accounts) {
        for (int i = 0; i < accounts.length; ++i) {
            int result = 0;
            for (int j = 0; j < accounts[i].length; ++j) {
                result += accounts[i][j];
            }
            accounts[i][0] = result;
        }
        // find the richest
        int richest = 0;
        for (int i = 0; i < accounts.length; ++i) {
           if (accounts[i][0] > richest) richest = accounts[i][0];
        }
        return richest;
    } 
}