public class Main {
    public static void main(String[] args) {
        
        Customer customer = new Customer("John Doe", "Premium");

     
        Sale sale = new Sale(customer, "2024-03-15");

        sale.setServiceExpense(100);
        sale.setProductExpense(200);

        
        sale.displayInfo();

        double serviceDiscount = customer.getServiceMemberDiscount() * sale.getServiceExpense();
        double productDiscount = customer.getProductMemberDiscount() * sale.getProductExpense();

        
        System.out.println("Service Discount: " + serviceDiscount);
        System.out.println("Product Discount: " + productDiscount);
        System.out.println("Total Discount: " + (serviceDiscount + productDiscount));
    }
}