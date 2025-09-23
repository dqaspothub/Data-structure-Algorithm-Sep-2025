package ds.stack;


import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};

        int[] finalPrices = finalPrices(prices);

        System.out.println("Original Prices: " + Arrays.toString(prices));
        System.out.println("Final Prices after Discount: " + Arrays.toString(finalPrices));
    }
    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
