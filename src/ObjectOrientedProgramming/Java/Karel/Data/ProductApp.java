package ObjectOrientedProgramming.Java.Karel.Data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Iphone 14 Pro Max", 25_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        Product product2 = new Product("Iphone 14 Pro Max", 25_000_000);
        System.out.println(product.equals(product2)); // True karena hasil kedua object sama ketika override method Equals

        System.out.println(product.hashCode() == product2.hashCode()); // True karena HashCode nya sama.

        Product product3 = new Product("Mac Book Air", 15_000_000);
        System.out.println(product.equals(product3)); // False karena ada Override method Equals

        System.out.println(product2.hashCode() == product3.hashCode()); // False karena ada Override hashCode

    }
}
