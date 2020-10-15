package Ej2;

import Ej2.members.imp.Project;
import Ej2.members.imp.Task;

public class Ej2 {
    public static void main(String[] args) {

        // Create a project
        Project safin = new Project("Safin");

        // Create main tasks
        Task androidVersion = new Task(20, "Android version", 'a');
        Task appleVersion = new Task(20, "IOS version", 'a');

        // Android sub tasks
        Task codeFragments = new Task(5, "Code app fragments", 'b');
        Task codeViews = new Task(1, "Code app views", 'c');
        codeFragments.addTask(codeViews);
        androidVersion.addTask(codeFragments);

        // Apple sub tasks
        Task codeSecurity = new Task(4, "code app security", 'b');
        Task connectToApi = new Task(2, "Connect to api", 'b');

        Task makeViews = new Task(7, "connect views", 'a');
        Task makeLayouts = new Task(2, "Make layouts", 'b');
        Task makeLogic = new Task(4, "Make logic", 'a');
        Task connectView = new Task(1, "Connect view", 'c');
        makeViews.addTask(makeLogic);
        makeViews.addTask(connectView);
        makeViews.addTask(makeLayouts);

        appleVersion.addTask(makeViews);
        appleVersion.addTask(codeSecurity);
        appleVersion.addTask(connectToApi);

        safin.addTask(appleVersion);
        safin.addTask(androidVersion);

        System.out.println("Safin project times and costs: ");
        System.out.println("Total costs: " + safin.getTotalCost() + "$");
        System.out.println("Max time: " + safin.getTotalDays() + " Days");
        System.out.println("Android task takes: " + androidVersion.getTotalDays() + " Days");
        System.out.println("IOS task costs: " + appleVersion.getTotalCost() + "$");
    }

}
