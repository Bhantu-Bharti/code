package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOne {
    public static void main(String[] args) {
        Owner owner1 = new Owner(1,"owner1");
        Owner owner2 = new Owner(2,"owner2");
        Owner owner3 = new Owner(3,"owner3");
        Map<Integer,Owner> map = new HashMap<>();
        map.put(11,owner1);
        Tenant t1 = new Tenant(11,"T1",map);
        System.out.println(t1);
        owner1.setName("Akash");

        System.out.println(t1);
        map.put(12,owner2);
        System.out.println(t1);
    }

}
final class Tenant{
    private final int id;
    private final String name;

    private final Map<Integer,Owner> owners;

    public Tenant(int id, String name, Map<Integer,Owner> owners) {
        this.id = id;
        this.name = name;
        this.owners = new HashMap<>(owners);
        for (Integer key : owners.keySet()) {
            this.owners.put(key,owners.get(key));
        }
    }

    public Map<Integer, Owner> getOwners() {
        return new HashMap<>(owners);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owners=" + owners +
                '}';
    }
}
class Owner{
    private int id;
    private String name;

    public Owner(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}