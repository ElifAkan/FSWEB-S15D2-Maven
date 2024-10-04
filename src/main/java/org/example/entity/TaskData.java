package org.example.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;


    
    public TaskData(Set<Task> annsTasks, Set<Task> bobTasks, Set<Task>carolsTasks,Set<Task> unassignedTasks){
        this.carolsTasks=carolsTasks;
        this.annsTasks=annsTasks;
        this.bobTasks=bobTasks;
        this.unassignedTasks=unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name) {
            case "ann":
                return this.annsTasks;
            case "bob":
                return this.bobTasks;
            case "carol":
                return this.carolsTasks;
            case "all":
                return getUnion(bobTasks, annsTasks, carolsTasks);
        }
        return new HashSet<>();
    }

    public  Set<Task> getUnion(Set<Task>... sets) {
        HashSet<Task> allTasks = new LinkedHashSet<>();
        for (Set<Task> tasks : sets) {
            allTasks.addAll(tasks);
        }
        return allTasks;
    }

    public Set<Task> getIntersection(Set<Task> first, Set<Task> second) {
        Set<Task> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public Set<Task> getDifferences(Set<Task> first, Set<Task> second) {
        Set<Task> difference = new HashSet<>(first);
        difference.removeAll(second);
        return difference;

    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobTasks() {
        return bobTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }
}
