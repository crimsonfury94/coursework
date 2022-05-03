package com.company;

public class Employee {
    private final String workerName;
    private int department;
    private double workersSalary;
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

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWorkersSalary(double workersSalary) {
        this.workersSalary = workersSalary;
    }

}
