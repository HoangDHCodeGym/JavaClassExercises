public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice("34.5");
        stock.setCurrentPrice("34.35");
        String changePercent = stock.getChangePercent();
        System.out.println("The change percent of Oracle is " + changePercent + "%");
    }
}
