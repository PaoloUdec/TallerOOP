package Ej1.members.imp;

import Ej1.members.IItem;
import Ej1.members.IStock;

import java.util.HashMap;

public class Stock implements IStock {

    private HashMap<IItem, Integer> stock = new HashMap<IItem, Integer>();

    @Override
    public Boolean stockIsEmpty() {
        return stock.isEmpty();
    }

    @Override
    public Boolean outOfItem(IItem item) {
        return stock.get(item) <= 0;
    }

    @Override
    public void add(IItem item, int number) {
        stock.put(item, number);
    }

    @Override
    public void remove(IItem item, int number) {
        int num = stock.get(item) - number;
        stock.put(item, num);
    }

    @Override
    public int totalOfItem(IItem item) {
        return stock.get(item);
    }
}
