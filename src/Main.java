import interfaces.Drink;
import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        //Human viking = new Viking("julio",60,120,new VikingDrinkImp(),new VikingPeeingImp(),20);
        //System.out.println(viking);

        List<Viking> humanVikingList = new ArrayList<Viking>();
        List<Spartan> humanSpartanList = new ArrayList<Spartan>();

        Viking viking1 = new Viking("julio",60,120,new VikingDrinkImp(),new VikingPeeingImp());
        Viking viking2 = new Viking("pepe",45,120,new VikingDrinkImp(),new VikingPeeingImp());
        Viking viking3 = new Viking("fulano",32,120,new VikingDrinkImp(),new VikingPeeingImp());

        humanVikingList.add(viking1);
        humanVikingList.add(viking2);
        humanVikingList.add(viking3);

        System.out.println("Lista de vikingos: ");
        for (Viking var:humanVikingList) {

            System.out.println("Nombre del vikingo: " + var.getName() +
                    " - edad: " + var.getAge() +
                    " - peso: " + var.getWeight() +
                    " - nivel de profesional es: " + var.getProfessionalDrinker() + "\n");

        }

        Spartan spartan1 = new Spartan("mengano",33,120,new EspartanDrinkImp(),new EspartanPeeing());
        Spartan spartan2 = new Spartan("zultano",50,120,new EspartanDrinkImp(),new EspartanPeeing());
        Spartan spartan3 = new Spartan("coco",23,120,new EspartanDrinkImp(),new EspartanPeeing());

        humanSpartanList.add(spartan1);
        humanSpartanList.add(spartan2);
        humanSpartanList.add(spartan3);

        System.out.println("\n Lista de espartanos: ");
        for (Spartan var:humanSpartanList) {

            System.out.println(var.getName() + " su nivel de tolerancia extra es: " + var.getExtraTolerance());
        }

        System.out.println("\n");

        //zona de la batalla



        
    }

}
