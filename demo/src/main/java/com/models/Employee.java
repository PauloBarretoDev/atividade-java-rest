package com.models;

public class Employee {
    private String id;
    private String name;
    private int salario;

    public Employee(String id, String name, int salario){
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
