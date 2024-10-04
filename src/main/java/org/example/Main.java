package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


      /*  Set<Task> annsTasks= new HashSet<>();
        Task taskAnn= new Task("workintech","des","ann", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2= new Task("workintech","des2","ann", Status.IN_PROGRESS, Priority.HIGH);
        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);


        Set<Task> bobsTasks= new HashSet<>();
        Task bobsTask= new Task("workintech","des","bob", Status.IN_PROGRESS, Priority.HIGH);
        Task bobsTask2= new Task("workintech","des2","bob", Status.IN_PROGRESS, Priority.HIGH);
        bobsTasks.add(bobsTask);
        bobsTasks.add(bobsTask2);


        Set<Task> carolsTasks= new HashSet<>();
        Task carolsTask= new Task("workintech","des","carol", Status.IN_PROGRESS, Priority.HIGH);
        Task carolsTask2= new Task("workintech","des2","carol", Status.IN_PROGRESS, Priority.HIGH);
        bobsTasks.add(carolsTask);
        bobsTasks.add(carolsTask2);


        Set<Task> unassignedTasks= new HashSet<>();
        Task unnasignedTask= new Task("workintech","des",null, Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(unnasignedTask);

        TaskData taskData= new TaskData(annsTasks, bobsTasks,carolsTasks,unassignedTasks);
        System.out.println("bobstasks: "+taskData.getTasks("bob"));
        System.out.println("annstasks: "+taskData.getTasks("ann"));
        System.out.println("alltasks: "+taskData.getTasks("all"));
        taskData.getIntersection(annsTasks,bobsTasks);
        taskData.getIntersection(annsTasks,carolsTasks);
        taskData.getIntersection(bobsTasks,carolsTasks);


        System.out.println ("unassigned: " + taskData.getDifferences(unassignedTasks,taskData.getTasks("ann"))); */

        StringSet.findUniqueWords();





    }
}