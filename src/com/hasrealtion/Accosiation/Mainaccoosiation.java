package com.hasrealtion.Accosiation;

public class Mainacco {
    public static void main(String[] args) {
        Employee employee1  = new Employee(1213,"shubham");
        Employee employee2  = new Employee(12,"ashish");
        Employee employee3  = new Employee(45,"pratik");

        Employee[] employees = new Employee[3];
        employees[0]=employee1;
        employees[1]=employee2;
        employees[2]=employee3;

        Department department = new Department(12,"Enginnering",employees);
        department.show();
    }
}
