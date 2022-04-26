package com.company;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static String toString(Employee obj) {
        return obj.getWorkerName() + " " + obj.getDepartment() + " " + obj.getWorkersSalary();
    }
    public static void allEmployee (Employee [] arr) {
        for (Employee employee : arr) {
            System.out.println(toString(employee));
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Шушанина Валентина Юрьевна", 1, 25000);
        employees[1] = new Employee("Семенов Степан Олегович", 2, 27000);
        employees[2] = new Employee("Дарницкий Петр Семенович", 3, 29000);
        employees[3] = new Employee("Петров Александр Валентинович", 4, 22000);
        employees[4] = new Employee("Евстегнеев Станислав Петрович", 5, 21000);
        employees[5] = new Employee("Шляпин Егор Владимирович", 4, 23000);
        employees[6] = new Employee("Сырков Велерий Федорович", 3, 24000);
        employees[7] = new Employee("Шарикова Елена Павловна", 2, 28000);
        employees[8] = new Employee("Кысь Юлия Петровна", 1, 30000);
        employees[9] = new Employee("Кошкина Валерия Дмитриевна", 5, 45000);


        allEmployee(employees);
    }
}
