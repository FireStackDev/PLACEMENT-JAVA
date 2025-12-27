class Solution {
    public int maxProfit(int[] prices) {
        int best_buy = prices[0], max_profit = 0;

        for(int i = 1 ; i < prices.length ; i++){
            // profit calculation
            if ( prices[i] > best_buy ){
                max_profit = Math.max(max_profit, prices[i] - best_buy);
            } 
            // minimum price tracking for profit calculation in later prices
            else {
                best_buy = prices[i];
            }
        }

        return max_profit;
    }
}

public class Stock_1{    
    public static void main(String[] args) {
        int[][][] testcases = {{{7,1,5,3,6,4},{5}}, {{7,6,4,3,1},{0}}};
        Solution sol = new Solution();
        int count = 1, passed = 0;

        for (int[][] test : testcases) {
            if (sol.maxProfit(test[0]) == test[1][0]){
                System.out.println("Test Case "+count+" = Passed");
                passed++;
            } else {
                System.out.println("Test Case "+count+" = Failed");
            }
            count++;
        }

        if ( count-1 == passed){
            System.out.println("All Test Case Passed !");
        } else {
            System.out.println((count-passed)+"Testcase Failed !");
        }
    }
}