package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public final class Test {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        skills.add("java");

        List<String> skill = new ArrayList<>();
        skill.add("Python");
        skill.add("spring");

        Customer c1 = new Customer(1,"Bhantu",skill);
        Customer c2 = new Customer(2,"Deepak",skills);
        c1.getSkills().add("c++");

        System.out.println(c1);
        System.out.println(c2);
    }
}
class Customer{
    private final int id;
    private final String name;
    private final List<String> skills;

    public Customer(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}