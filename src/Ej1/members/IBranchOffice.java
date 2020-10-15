package Ej1.members;

import java.lang.reflect.Array;

public interface IBranchOffice {
    IItem[] getCatalogue();
    void updateCatalogue(ICatalogue catalogue);
    void removeFromStock(IItem item, int number);
    void addToStock(IItem item, int number);
    void requestStock(IItem item, int number);
    int stockOfItem(IItem item);
}
