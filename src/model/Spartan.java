package model;


import interfaces.Drink;
import interfaces.Topee;

public class Spartan extends Human{

    private Integer extraTolerance;

    public Spartan(String name, Integer age, Integer weight, Drink drink, Topee topee) {
        super(name, age, weight,drink, topee);
        this.extraTolerance = this.setLevelOfExtraTolerance();
    }

    public Integer getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    public int setLevelOfExtraTolerance() {
        //En general, para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula
        int m = 1;
        int n = 10;
        return (int) Math.floor(Math.random()*(n-m+1)+m);
    }

    @Override
    public String toString() {
        return super.toString() + "Spartan{" +
                "extraTolerance=" + extraTolerance +
                '}';
    }
}
