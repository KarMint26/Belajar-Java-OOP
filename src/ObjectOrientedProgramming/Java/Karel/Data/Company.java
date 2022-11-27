package ObjectOrientedProgramming.Java.Karel.Data;

public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {

        private String name;

        public String getCompany() {
            return Company.this.name; // Private bisa diakses melalui inner class
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
