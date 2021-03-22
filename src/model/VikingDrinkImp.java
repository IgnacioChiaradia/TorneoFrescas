package model;

import interfaces.Drink;

public class VikingDrinkImp implements Drink {

    @Override
    public String _drink() {
        return "Drinking as viking.";
    }
}
