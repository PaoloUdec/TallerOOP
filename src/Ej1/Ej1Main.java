package Ej1;

import Ej1.members.imp.BranchOffice;
import Ej1.members.imp.Catalogue;
import Ej1.members.imp.Item;
import Ej1.members.imp.Stock;

public class Ej1Main {
    public static void main(String[] args) {
        Item cd = new Item("cd", "A nice disk");
        Item notebook = new Item("notebook", "Take notes uwu");

        Item[] items = {cd, notebook};

        Stock bogotaStock = new Stock();
        Catalogue bogotaCatalogue = new Catalogue(items);
        BranchOffice bogotaOffice = new BranchOffice(bogotaStock, bogotaCatalogue);

        //Simulates a restock of the branch store
        bogotaOffice.addToStock(cd, 50);
        bogotaOffice.addToStock(notebook, 20);

        //Simulates a group of sales
        bogotaOffice.removeFromStock(cd, 15);
        bogotaOffice.removeFromStock(notebook, 4);
        
        bogotaOffice.requestStock(cd, 20); //Request 20 new CDs

    }
}
