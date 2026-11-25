class Solution {
    public int maxProfit(int[] prices) {
        int i=0, j=1;
        int max=0;

        while (j < prices.length){
            if (prices[i] < prices[j]) {
                int diff = prices[j] - prices[i];
                if (diff > max) max = diff;
            } else {
                i = j;
            }
            j++;
        }
        if(max<0) max=0;

        return max;
    }
}
