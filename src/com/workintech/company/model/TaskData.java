package com.workintech.company.model;

import java.util.*;

public class TaskData {

    private Set<Task> annTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolTasks;
    private Set<Task> unassignedTask;

    public TaskData(Set<Task> annTasks, Set<Task> bobsTasks, Set<Task> carolTasks , Set<Task> unassignedTask) {
        this.annTasks = annTasks;
        this.bobsTasks = bobsTasks;
        this.carolTasks = carolTasks;
        this.unassignedTask=unassignedTask;
    }

    public Set<Task> getUnassignedTask() {
        return unassignedTask;
    }

    public Set<Task> getAnnTasks() {
        return annTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolTasks() {
        return carolTasks;
    }

    public Set<Task> getTasks(String taskOwner) {
        if (taskOwner.equals("ann")) {
            return annTasks;
        }
        if (taskOwner.equals("bob")) {
            return bobsTasks;
        }
        if (taskOwner.equals("carol")) {
            return carolTasks;
        }
        if (taskOwner.equals("all")) {
            List<Set<Task>> taskList = new ArrayList<>();
            taskList.add(annTasks);
            taskList.add(carolTasks);
            taskList.add(bobsTasks);
            return getUnion(taskList);
        }
        return null;

    }

    public Set<Task> getUnion(List<Set<Task>> taskList) {

        Set<Task> totals = new LinkedHashSet<>();
        for (Set<Task> tasks : taskList) {
           // System.out.println("Task: " + tasks);
            totals.addAll(tasks);
        }
        return totals;
    }

    public Set<Task> getIntersection(Set<Task> first, Set<Task> second){
        Set<Task> intersection=new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }
    public Set<Task> getDifference(Set<Task> first, Set<Task> second){
        Set<Task> difference=new HashSet<>(first);
        difference.removeAll(second);
        return difference;
    }


    public Set<Task> getUnion(Set<Task>... taskList){
        return null;
    }

}
