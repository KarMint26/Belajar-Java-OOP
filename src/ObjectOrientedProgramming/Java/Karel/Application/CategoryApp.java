package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        Category category = new Category();
        System.out.println(category.getId()); // bernilai null karena setId nya belum ada.
        System.out.println(category.isExpensive()); // bernilai false karena setExpensive nya belum ada.

        System.out.println();

        category.setId("Karel");
        System.out.println(category.getId()); // output nya adalah Karel karena di setId nya.

        category.setExpensive(true);
        System.out.println(category.isExpensive()); // outputnya adalah true karena ada setExpensive.

        System.out.println();

        category.setId(null); // akan tetap bernilai karel karena sudah diset di atas dan syarat nya tidak sama dengan null.
        System.out.println(category.getId());

        category.setExpensive(false);
        System.out.println(category.isExpensive()); // akan tetap bernilai true karena sudah ada syarat jika True maka akan masuk return variable expensive boolean.

        System.out.println();

        category.setId("Florentina");
        System.out.println(category.getId());

        category.setId("Natasha");
        System.out.println(category.getId());
    }
}
