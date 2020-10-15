package Ej2.members;

public interface IProject {
    double getTotalDays();
    double getTotalCost();
    void addTask(ITask task);
    void removeTask(ITask task);
    String getName();
}
