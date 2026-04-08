package Dsa_problems;

public class byeAndSellStocks {
    public static int byeSellStocks(int prices[]){
        int byePrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){  
            if(byePrice<prices[i]){ //profit
                int profit=prices[i]-byePrice; //today`s profit.
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                byePrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(byeSellStocks(prices));
    }
    
}
