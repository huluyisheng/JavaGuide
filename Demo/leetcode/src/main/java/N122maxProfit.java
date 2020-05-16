public class N122maxProfit {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        if (prices.length > 1){
            for (int i = 0 ;i < prices.length-1; i++){
                if (prices[i] < prices[i+1]){
                    sum += prices[i+1] - prices[i];
                }
            }
        }
        return sum;
    }
}
