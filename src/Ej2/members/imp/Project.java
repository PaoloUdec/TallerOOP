package Ej2.members.imp;

import Ej2.members.IProject;
import Ej2.members.ITask;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {

    private List<ITask> tasks = new ArrayList<>();
    private double totalCost;
    private String name;

    public Project(String name) {
        this.name = name;
    }

    @Override
    public double getTotalDays() {
        double days = 0;
        for (ITask subTask : this.tasks) {
            days += subTask.getTotalDays();
        }
        return days;
    }

    @Override
    public double getTotalCost() {
        calculateTotal();
        return this.totalCost;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addTask(ITask task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(ITask task) {
        tasks.remove(task);
    }

    void calculateTotal() {
        double total = 0;
        for (ITask subTask : this.tasks) {
            total += subTask.getTotalCost();
        }
        this.totalCost = total;
    }
}
