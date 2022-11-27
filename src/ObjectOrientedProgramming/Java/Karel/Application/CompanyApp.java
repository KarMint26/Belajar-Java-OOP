package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Karel Trisnanto Utomo");
        
        Company.Employee employee = company.new Employee();
        employee.setName("Clarine Eugene");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        System.out.println("\nObject ke 2");
        Company company2 = new Company();
        company2.setName("Natasha Quine");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Clarine Gainer");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
        
    }
}
