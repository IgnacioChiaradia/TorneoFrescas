package model;

import interfaces.Drink;
import interfaces.Topee;

import java.util.ArrayList;
import java.util.List;

public abstract class Human implements Comparable<Human>{

    private String name;
    private Integer age;
    private Integer weight;

    private Drink drink;
    private Topee topee;

    public Human(String name, Integer age, Integer weight, Drink drink, Topee topee)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.drink = drink;
        this.topee = topee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Human h) {
        if (this.age < h.age) {
            return -1;
        }
        if (this.age > h.age) {
            return 1;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", drink=" + drink._drink() +
                ", topee=" + topee._topee() +
                '}';
    }
}
