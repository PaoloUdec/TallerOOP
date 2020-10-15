package Ej1.members.imp;

import Ej1.members.IBranchOffice;
import Ej1.members.ICatalogue;
import Ej1.members.IItem;
import Ej1.members.IStock;

import java.lang.reflect.Array;

public class BranchOffice implements IBranchOffice {
    private final IStock stock;
    private ICatalogue catalogue;

    public BranchOffice(IStock starterStock, ICatalogue starterCatalogue) {
        this.stock = starterStock;
        this.catalogue = starterCatalogue;
    }

    @Override
    public IItem[] getCatalogue() {
        return catalogue.getItems();
    }

    @Override
    public void updateCatalogue(ICatalogue catalogue) {
        this.catalogue = catalogue;
    }

    @Override
    public void removeFromStock(IItem item, int number) {
        if (!stock.stockIsEmpty()){
            stock.remove(item, number);
        } else if (stock.totalOfItem(item) < 10) {
            requestStock(item, 10);
        } else {
            System.out.println("No more stock, canceling");
        }
    }

    @Override
    public void addToStock(IItem item, int number) {
        stock.add(item, number);
    }

    @Override
    public void requestStock(IItem item, int number) {
        System.out.println("Requesting a total of " + number + " items");
        addToStock(item, number);
    }

    @Override
    public int stockOfItem(IItem item) {
        return stock.totalOfItem(item);
    }
}
