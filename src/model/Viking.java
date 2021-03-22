package model;

import interfaces.Drink;
import interfaces.Topee;

public class Viking extends Human {

    private Integer professionalDrinker;

    public Viking(String name, Integer age, Integer weight, Drink drink, Topee topee) {
        super(name, age, weight,drink, topee);
        this.professionalDrinker = this.setLevelOfProfessionalDrinker();
    }

    public Integer getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }

    public int setLevelOfProfessionalDrinker() {
        //En general, para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula
        int m = 1;
        int n = 10;
        return (int) Math.floor(Math.random()*(n-m+1)+m);
    }

    @Override
    public String toString() {
        return  super.toString() + "Viking{" +
                "professionalDrinker=" + professionalDrinker +
                '}';
    }


}
