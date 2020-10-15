package Ej1.members.imp;

import Ej1.members.ICatalogue;
import Ej1.members.IItem;

import java.lang.reflect.Array;

public class Catalogue implements ICatalogue {

    private IItem[] items;

    public Catalogue(IItem[] items) {
        this.items = items;
    }

    @Override
    public IItem[] getItems() {
        return items;
    }
}
