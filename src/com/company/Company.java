package com.company;
/*
 *
 * Classname : Company
 * Description : POJO class Company
 *
 *  23 June 2020
 *
 * @version 1.0 2020.06.23
 * @author Khnyznytskyj Evgen
 *
 * */
public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                '}';
    }
}
