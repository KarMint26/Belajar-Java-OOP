public class ShapeApp {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        myShape.getCorner(); // Menghasilkan Angka 0
        System.out.println(myShape.getCorner());

        Rectangle myRectangle = new Rectangle();
        myRectangle.getCorner(); //Akan mengeluarkan angka 4 karena ada method overriding didalamnya.
        System.out.println(myRectangle.getCorner());

        myRectangle.getParentCorner(); //Akan mengeluarkan angka 0 karena ada super keyword mengakses Parent
        System.out.println(myRectangle.getParentCorner());
    }
}
