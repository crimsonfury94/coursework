package com.company;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static String toString(Employee obj) {
        return "ID № " + obj.getId() + " " + obj.getWorkerName() + " " + obj.getDepartment() + " " + obj.getWorkersSalary();
    }

    public static void allEmployee(Employee[] arr) {
        for (Employee employee : arr) {
            System.out.println(toString(employee));
        }
        System.out.println("----------");
    }

    public static void salarySum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getWorkersSalary();
        }
        System.out.println("Общие затраты на зарплату в месяц составляют " + sum + " рублей.");
        System.out.println("----------");
    }

    public static void maxSalary(Employee[] employees) {
        Employee maxValue = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWorkersSalary() > maxValue.getWorkersSalary()) {
                maxValue = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + maxValue.getWorkersSalary() + " рублей: " + "ID № " + maxValue.getId() + " " + maxValue.getWorkerName() + " из отдела № " + maxValue.getDepartment());
        System.out.println("----------");
    }

    public static void minSalary(Employee[] employees) {
        Employee minValue = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWorkersSalary() < minValue.getWorkersSalary()) {
                minValue = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + minValue.getWorkersSalary() + " рублей: " + "ID № " + minValue.getId() + " " + minValue.getWorkerName() + " из отдела № " + minValue.getDepartment());
        System.out.println("----------");
    }

    public static void averageSalary(Employee[] employees) {
        double average = 0;
        for (Employee salary : employees) {
            average += salary.getWorkersSalary();
        }
        System.out.println("Среднаяя зарплата сотрудников составляет " + average / employees.length + " рублей.");
        System.out.println("----------");
    }

    public static void list(Employee[] names) {
        System.out.println("Список сотрудников: ");
        for (Employee name : names) {
            System.out.println(name.getWorkerName());
        }
        System.out.println("----------");
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
        salarySum(employees);
        maxSalary(employees);
        minSalary(employees);
        averageSalary(employees);
        list(employees);
    }
}
