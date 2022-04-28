package com.company;

public class Employee {
    private final String workerName;
    private final int department;
    private final double workersSalary;
    private final int id;
    private static int counter = 1;


    public Employee(String workerName, int department, double workersSalary) {
        this.workerName = workerName;
        this.department = department;
        this.workersSalary = workersSalary;
        this.id = counter++;

    }

    public String getWorkerName() {
        return workerName;
    }

    public int getDepartment() {
        return department;
    }

    public double getWorkersSalary() {
        return workersSalary;
    }

    public int getId() {
        return id;
    }

    public int setDepartment() {
        return department;
    }

    public double setWorkersSalary() {
        return workersSalary;
    }

}
