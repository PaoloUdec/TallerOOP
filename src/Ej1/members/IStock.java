package Ej1.members;

public interface IStock {
    Boolean stockIsEmpty();
    Boolean outOfItem(IItem item);
    void add(IItem item, int number);
    void remove(IItem item, int number);
    int totalOfItem(IItem item);
}
