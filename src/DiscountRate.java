public interface DiscountRate {
    double GET_PREMIUM_SERVICE_DISCOUNT = 0.2;
    double GET_GOLD_SERVICE_DISCOUNT = 0.15;
    double GET_SILVER_SERVICE_DISCOUNT = 0.1;
    double GET_NORMAL_SERVICE_DISCOUNT = 0;
    double GET_PREMIUM_PRODUCT_DISCOUNT = 0.1;
    double GET_GOLD_PRODUCT_DISCOUNT = 0.1;
    double GET_SILVER_PRODUCT_DISCOUNT = 0.1;
    double GET_NORMAL_PRODUCT_DISCOUNT = 0;

    double getServiceMemberDiscount();
    double getProductMemberDiscount();
}



