package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String [][] workers = {
            {"1224345", "John", "Smith"},
            {"5634534", "Anna", "Wilk"},
            {"3525255", "Jan", "Dym"},
            {"34534635", "Julia", "Bil"},
            {"34536546", "Darek", "Wrona"}};

    private double [] salaries = { 4500.00, 3200.00, 7300.00, 12800.00, 2800.00};

    public String getWorker(int n){
        if(n> salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", "+ workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
