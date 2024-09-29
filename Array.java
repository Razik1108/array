public class Array{
    public static int BuyAndSellStock(int Prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0 ; i<Prices.length ; i++){
            if(BuyPrice <  Prices[i]){
                int Profit = Prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit , Profit);
            }
            else{
                BuyPrice = Prices[i];
            }
        }

        return MaxProfit;
    }
    public static void main(String args[]){
        int Prices[] = {2,1,4,5,3};
        System.out.println(BuyAndSellStock(Prices));
    }
      
}