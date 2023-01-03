// import java.util.Arrays;

class Solution {
    // private void offset(int[] strongest, int n) {
    //     for (int i = strongest.length - 2; i >= n; --i) {
    //         strongest[i + 1] = strongest[i];
    //     }
    // }

    private int findSmallest(int[] arr) {
        int small = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < small) {
                small = arr[i];
                index = i;
            }
        }
        return index;
    }

    public int[] kWeakestRows(int[][] mat, int k) {    
        
        int[] soldiers = new int[mat.length];
        int[] strongest = new int[k];
        for (int i = 0; i < mat.length; ++i) {
            int soldier = 0;
            for (int j = 0; j < mat[i].length; ++j) {
                if (mat[i][j] == 1) ++soldier;
                else break;
            }
            soldiers[i] = soldier; // soldiers's row => row, soldiers[i] => val
        }

        // 每次尋找 soldiers 中最小的元素, 已經取用過的則改為 9999

        for (int i = 0; i < strongest.length; ++i) {
            int smallestIndex = findSmallest(soldiers);
            strongest[i] = smallestIndex;
            soldiers[smallestIndex] = 99999;
        }

        return strongest;

        // sort soldiers
        // 依順序填入 strongest

        // offset(soldiers, 1);
        // return soldiers;
        // 預設值問題
        // int[] strongest = new int[k];
        // for (int i = 0; i < strongest.length; ++i) {
        //     strongest[i] = i;
        // }
        // for (int i = 0; i < soldiers.length; ++i) {
        //     for (int j = 0; j < strongest.length; ++j) {
        //         if (soldiers[strongest[j]] > soldiers[i]) {
        //             offset(strongest, j);
        //             strongest[j] = i;
        //             break;
        //         }
        //     }
        // }
        // return strongest;
        // sort
        // for (int i = 0; i < soldiers.length; ++i) {
        //     for (int j = 0; j < strongest.length; ++j) {
        //         if (soldiers[i] > soldiers[strongest[j]]) { // row i val < strongest[j] val
        //             // offset + 1 (全部後移)
        //             for (int z = j; z < strongest.length - 1; ++z) {
        //                 strongest[z + 1] = strongest[z];
        //             }
        //             strongest[j] = i;
        //             soldiers[strongest[j]] = 1000;
        //         }
        //     }
        // }
        // return strongest;
    }
}