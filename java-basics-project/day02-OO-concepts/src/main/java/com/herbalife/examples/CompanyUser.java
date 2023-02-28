package com.herbalife.examples;

public class CompanyUser {
    public static void main(String[] args) {
        Company hl = new Company();
        System.out.println(Company.getNumberOfCompanies());

        //Not allowed in C#
        System.out.println(hl.getNumberOfCompanies());
    }
}
