package Ej2.members.imp;

import Ej2.members.ITask;

import java.util.ArrayList;
import java.util.List;

public class Task implements ITask {

    private List<ITask> subTasks = new ArrayList<>();
    private char complexity; // a, b, c maxima, media, minima en ese orden
    private double cost;
    private int time;
    private String name;

    public Task(int time, String name, char complexity) {
        this.time = time;
        this.name = name;
        this.complexity = complexity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getTotalDays() {
        if (complexity == 'c') {
            return time + 5;
        } else if (complexity == 'b') {
            return time * 1.01;
        } else {
            return time * 1.02 + 8;
        }
    }

    @Override
    public double getTotalCost() {
        if (complexity == 'c') {
            this.cost = 25 * this.time;
        } else if (complexity == 'b') {
            this.cost = (25 * this.time) * 1.05;
        } else {
            if (time < 10) {
                this.cost = (this.time * 25) * 1.05;
            } else {
                this.cost = (this.time * 25) * 1.05 + (this.time - 10)*10;
            }
        }

        this.cost += getChildCost();

        if (this.subTasks.size() > 3) {
            this.cost += this.cost * 0.04;
        }

        return this.cost;
    }

    @Override
    public void addTask(ITask task) {
        subTasks.add(task);
    }

    @Override
    public void removeTask(ITask task) {
        subTasks.remove(task);
    }

    public double getChildCost() {
        double total = 0;
        for (ITask subTask : this.subTasks) {
            total += subTask.getTotalCost();
        }
        return total;
    }

    public void printAllTasks() {
        System.out.println("Tareas");
        for (ITask subTask : this.subTasks) {
            System.out.println(subTask.getName());
        }
    }
}
