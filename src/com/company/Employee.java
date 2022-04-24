package com.company;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Employee {
    private final String workerName;
    private final int department;
    private final int workersSalary;
    public static int id;
    public final AtomicInteger employee = new AtomicInteger(1);


    public Employee(String workerName, int department, int workersSalary) {
        this.workerName = workerName;
        this.department = department;
        this.workersSalary = workersSalary;
        id = employee.getAndIncrement();

    }

    public String getWorkerName() {
        return workerName;
    }

    public int getDepartment() {
        return department;
    }

    public int getWorkersSalary() {
        return workersSalary;
    }

    public int getId() {
        return id++;
    }

    public int setDepartment() {
        return department;
    }

    public int setWorkersSalary() {
        return workersSalary;
    }
}
