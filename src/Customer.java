public class Customer implements DiscountRate {
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        switch (customerType) {
            case "Premium":
                return GET_PREMIUM_SERVICE_DISCOUNT;
            case "Gold":
                return GET_GOLD_SERVICE_DISCOUNT;
            case "Silver":
                return GET_SILVER_SERVICE_DISCOUNT;
            default:
                return GET_NORMAL_SERVICE_DISCOUNT;
        }
    }

    @Override
    public double getProductMemberDiscount() {
        switch (customerType) {
            case "Premium":
                return GET_PREMIUM_PRODUCT_DISCOUNT;
            case "Gold":
                return GET_GOLD_PRODUCT_DISCOUNT;
            case "Silver":
                return GET_SILVER_PRODUCT_DISCOUNT;
            default:
                return GET_NORMAL_PRODUCT_DISCOUNT;
        }
    }
}