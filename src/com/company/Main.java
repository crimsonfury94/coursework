package com.company;

public class Main {

    public static void employeesArr(Employee employee) {
        Employee[] employees;
        employees = new Employee[10];
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
        for (int i = 0; i < 10; i++) {
            System.out.println(employees[i].getId() + ") " + employees[i].getWorkerName() + " отдел " + employees[i].getDepartment() + " зарплата " + employees[i].getWorkersSalary());
        }
    }

    public static void main(String[] args) {

    }


}
