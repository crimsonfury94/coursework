package com.company;

public class Main {
    private static Employee[] employees = new Employee[10];

    private static String toString(Employee obj) {
        return "ID № " + obj.getId() + " " + obj.getWorkerName() + " " + obj.getDepartment() + " " + obj.getWorkersSalary();
    }

    private static void allEmployee(Employee[] arr) {
        for (Employee employee : arr) {
            System.out.println(toString(employee));
        }
    }

    private static double salarySum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getWorkersSalary();
        }
        return sum;
    }

    private static void totalSum(Employee[] employees) {
        System.out.println("Общие затраты на зарплату в месяц составляют " + salarySum(employees) + " рублей.");
    }

    private static void maxSalary(Employee[] employees) {
        Employee maxValue = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWorkersSalary() > maxValue.getWorkersSalary()) {
                maxValue = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + maxValue.getWorkersSalary() + " рублей: " + "ID № " + maxValue.getId() + " " + maxValue.getWorkerName() + " из отдела № " + maxValue.getDepartment());
    }

    private static void minSalary(Employee[] employees) {
        Employee minValue = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWorkersSalary() < minValue.getWorkersSalary()) {
                minValue = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + minValue.getWorkersSalary() + " рублей: " + "ID № " + minValue.getId() + " " + minValue.getWorkerName() + " из отдела № " + minValue.getDepartment());
    }

    private static void averageSalary(Employee[] employees) {
        double average = salarySum(employees) / employees.length;
        System.out.println("Среднаяя зарплата сотрудников составляет " + average + " рублей.");
    }

    private static void list(Employee[] names) {
        for (Employee name : names) {
            System.out.println(name.getWorkerName());
        }
    }

    private static void upSalary(Employee[] salaryPercent, int percent) {
        System.out.println("Зарплата сотрудников после индексации стала: ");
        for (Employee percents : salaryPercent) {
            double salaryAfter = (percents.getWorkersSalary() * percent / 100) + percents.getWorkersSalary();
            percents.setWorkersSalary(salaryAfter);
            System.out.println("ID № " + percents.getId() + " " + percents.getWorkerName() + " " + percents.getDepartment() + " " + salaryAfter);
        }
    }

    private static void departmentMinSalary(Employee[] department, int dep) {
        Employee minSalary = null;
        double minSalaryValue = Integer.MAX_VALUE;
        for (int i = 1; i < department.length; i++) {
            if (department[i].getDepartment() == dep && department[i].getWorkersSalary() < minSalaryValue) {
                minSalary = department[i];
                minSalaryValue = department[i].getWorkersSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + minSalary.getWorkersSalary() + " рублей: " + "ID № " + minSalary.getId() + " " + minSalary.getWorkerName());
    }


    private static void departmentMaxSalary(Employee[] department, int dep) {
        Employee maxSalary = null;
        double maxSalaryValue = Integer.MIN_VALUE;
        for (int i = 1; i < department.length; i++) {
            if (department[i].getDepartment() == dep && department[i].getWorkersSalary() > maxSalaryValue) {
                maxSalary = department[i];
                maxSalaryValue = department[i].getWorkersSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalary.getWorkersSalary() + " рублей: " + "ID № " + maxSalary.getId() + " " + maxSalary.getWorkerName());
    }

    private static double departmentSalarySum(Employee[] department, int dep) {
        double sum = 0;
        for (Employee employee : department) {
            if (employee.getDepartment() == dep) {
                sum += employee.getWorkersSalary();
            }
        }
        return sum;
    }

    private static void departmentTotalSalary(Employee[] employees) {
        System.out.println("Общая сумма зарплат по отделу составляют: " + departmentSalarySum(employees, 3) + " рублей.");
    }

    private static void departmentAverage(Employee[] department, int dep) {
        int num = 0;
        double average;
        for (Employee employee : department) {
            if (employee.getDepartment() == dep) {
                num++;
            }
        }
        average = departmentSalarySum(department, 3) / num;
        System.out.println("Средняя зарплата по отделу составляет: " + average);
    }

    private static void departmentUpSalary(Employee[] department, int dep, int percent) {
        System.out.println("Зарплата сотрудников после индексации стала: ");
        for (Employee percents : department) {
            if (percents.getDepartment() == dep) {
                double departmentSalaryAfter = (percents.getWorkersSalary() * percent / 100) + percents.getWorkersSalary();
                percents.setWorkersSalary(departmentSalaryAfter);
                System.out.println("ID № " + percents.getId() + " " + percents.getWorkerName() + " " + percents.getDepartment() + " " + departmentSalaryAfter);
            }
        }
    }


    private static void employeesDepartment(Employee[] department, int dep) {
        for (int i = 0; i < department.length; i++) {
            if (department[i].getDepartment() == dep)
                System.out.println("ID № " + department[i].getId() + " " + department[i].getWorkerName() + " " + department[i].getWorkersSalary());
        }
    }


    private static void lessNumber(Employee[] num, int number) {
        for (Employee employee : num) {
            if (employee.getWorkersSalary() < number) {
                System.out.println("ID № " + employee.getId() + " " + employee.getWorkerName() + " " + employee.getWorkersSalary());
            }
        }
    }

    private static void moreNumber(Employee[] num, int number) {
        for (Employee employee : num) {
            if (employee.getWorkersSalary() >= number) {
                System.out.println("ID № " + employee.getId() + " " + employee.getWorkerName() + " " + employee.getWorkersSalary());
            }
        }
    }


    public static void main(String[] args) {
        employees[0] = new Employee("Бусина Валентина Юрьевна", 3, 25000);
        employees[1] = new Employee("Семенов Степан Олегович", 2, 27000);
        employees[2] = new Employee("Дарницкий Петр Семенович", 3, 29000);
        employees[3] = new Employee("Петров Александр Валентинович", 4, 22000);
        employees[4] = new Employee("Евстегнеев Станислав Петрович", 5, 21000);
        employees[5] = new Employee("Шляпин Егор Владимирович", 4, 23000);
        employees[6] = new Employee("Сырков Велерий Федорович", 3, 24000);
        employees[7] = new Employee("Шарикова Елена Павловна", 2, 28000);
        employees[8] = new Employee("Кысь Юлия Петровна", 1, 30000);
        employees[9] = new Employee("Кошкина Валерия Дмитриевна", 5, 45000);

        System.out.println("----------");
        allEmployee(employees);
        System.out.println("----------");
        totalSum(employees);
        System.out.println("----------");
        maxSalary(employees);
        System.out.println("----------");
        minSalary(employees);
        System.out.println("----------");
        averageSalary(employees);
        System.out.println("----------");
        System.out.println("Список сотрудников: ");
        list(employees);
        System.out.println("----------");
        upSalary(employees, 12);
        System.out.println("----------");
        departmentMinSalary(employees, 3);
        System.out.println("----------");
        departmentMaxSalary(employees, 3);
        System.out.println("----------");
        departmentTotalSalary(employees);
        System.out.println("----------");
        departmentAverage(employees, 3);
        System.out.println("----------");
        departmentUpSalary(employees, 3, 5);
        System.out.println("----------");
        System.out.println("Список сотрудников из отдела № 3: ");
        employeesDepartment(employees, 3);
        System.out.println("----------");
        lessNumber(employees, 30000);
        System.out.println("----------");
        moreNumber(employees, 26000);
        System.out.println("----------");

    }
}
