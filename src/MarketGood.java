public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate) {
        this(name, retailPrice); // 첫 번째 문장으로 이동
        if (discountRate < 0 || discountRate > 100) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountedPrice() {
        return (int) (retailPrice * (1 - discountRate / 100.0));
    }
}