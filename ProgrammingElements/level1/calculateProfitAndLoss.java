public class calculateProfitAndLoss {
        public static void calculateProfitAndLossFunction(double costPrice, double sellingPrice) {
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
    public static void main(String[] args) {
        double costPrice = 1000;
        double sellingPrice = 1200;
        calculateProfitAndLossFunction(costPrice, sellingPrice);
    }
}
