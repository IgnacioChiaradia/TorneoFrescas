package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Battle {

    private ArrayList<Viking> humanVikingList;
    private ArrayList<Spartan> humanSpartanList;

    public Battle(ArrayList<Viking> humanVikingList, ArrayList<Spartan> humanSpartanList)
    {
        this.humanVikingList = humanVikingList;
        this.humanSpartanList = humanSpartanList;
    }

    public void presentFighters()
    {
        Collections.sort(humanVikingList);
        Collections.sort(humanSpartanList);

        System.out.println("Lista de vikingos: ");
        for (Viking var:humanVikingList) {

            System.out.println("Nombre del vikingo: " + var.getName() +
                    "Edad: " + var.getAge() +
                    "Peso:" + var.getWeight() +
                    "nivel de profesional es: " + var.getProfessionalDrinker());
        }

        System.out.println("\n Lista de espartanos: ");
        for (Spartan var:humanSpartanList) {

            System.out.println("Nombre del espartano: " + var.getName() +
                    "Edad: " + var.getAge() +
                    "Peso:" + var.getWeight() +
                    "nivel de profesional es: " + var.getExtraTolerance());
        }

        System.out.println(humanVikingList);
        System.out.println("\n soy un separador");
        System.out.println(humanSpartanList);
    }

    public void startBattle()
    {
        this.presentFighters();

        for (int i = 0; i < humanVikingList.size(); i++) {

            for (int j = 0; j < humanSpartanList.size(); j++) {

                if(humanVikingList)
                {
                    
                }
            }

        }
    }
}
