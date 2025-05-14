public class ProductInfoRunner {
    public static void main(String[] args) {
        ProductInfo.saveProductName("Mobile");
        ProductInfo.saveProductName("Laptop");
        ProductInfo.saveProductName("Pen");
        ProductInfo.saveProductName("Mobile");
        System.out.println("=================read method===============");
        ProductInfo.readProducts();
        System.out.println("==========update ==========");
        ProductInfo.updateByProductName("Mobile","watch");
        ProductInfo.readProducts();

    }
}
