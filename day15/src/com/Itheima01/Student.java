package com.Itheima01;

public class Student {
    private  int id;
    private  String name;
    private  int age;
    private  String diZhi;

    public Student() {
    }

    public Student(int id, String name, int age, String diZhi) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diZhi = diZhi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiZhi() {
        return diZhi;
    }

    public void setDiZhi(String diZhi) {
        this.diZhi = diZhi;
    }
}
