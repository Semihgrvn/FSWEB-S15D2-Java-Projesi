package com.workintech.company.model;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Java Col", "Write List", "Ann", Priority.LOW, Status.ASSIGNED);
        Task task2 = new Task("Java Col", "Write Set", "Bob", Priority.LOW, Status.ASSIGNED);
        Task task3 = new Task("Java Col", "Write Map", "Carol", Priority.LOW, Status.ASSIGNED);
        Task task4 = new Task("Java Col", "Write Link", "Ann", Priority.LOW, Status.ASSIGNED);
        Task task5 = new Task("Java Col", "Write List", "Bob", Priority.LOW, Status.ASSIGNED);
        Task task6 = new Task("Java Col", "Write List in Set", "Ann", Priority.MED, Status.IN_QUEUE);
        Task task7 = new Task("Java Col", "Write List", "Bob", Priority.LOW, Status.ASSIGNED);


        Set<Task> totalTasks= new HashSet<>();
        totalTasks.add(task1);
        totalTasks.add(task2);
        totalTasks.add(task3);
        totalTasks.add(task4);
        totalTasks.add(task5);
        totalTasks.add(task6);

        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);
        annsTask.add(task5);

        Set<Task> bobTasks = new LinkedHashSet<>();
        bobTasks.add(task2);
        bobTasks.add(task4);

        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(task3);

        Set<Task> unassignedTasks = new HashSet<>();
        unassignedTasks.add(task6);

        TaskData taskData = new TaskData(annsTask, bobTasks, carolsTasks,unassignedTasks);
     //  List<Set<Task>> tasks = new ArrayList<>();
     //  tasks.add(annsTask);
     //  tasks.add(bobTasks);
     //  tasks.add(carolsTasks);
     //  System.out.println(taskData.getUnion(tasks));

        System.out.println("All tasks: ");
        System.out.println(taskData.getTasks("all"));

        System.out.println(taskData.getAnnTasks());
        System.out.println(taskData.getBobsTasks());
        System.out.println(taskData.getCarolTasks());

        System.out.println(taskData.getDifference(totalTasks, taskData.getTasks("all")));

        //***

        System.out.println(taskData.getIntersection(annsTask, carolsTasks));

    }
}
