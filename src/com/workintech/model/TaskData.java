package com.workintech.model;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData() {
        // Her bir set, her bir calışanın görevini tutacak.
        // Sıralama önemli olmadığı durum için tercih edebiliyorduk.
        // Ayrıca aynı görevi aynı kişinin ya da aynı görevi başka kişilerin eklememesi için önemli.
        annsTasks = new HashSet<>();
        bobsTasks = new HashSet<>();
        carolsTasks = new HashSet<>();
    }

    public Set<Task> getTasks(String employee) {
        switch (employee) {
            case ("ann"):
                return annsTasks;
            case ("bob"):
                return bobsTasks;
            case ("carol"):
                return carolsTasks;
            case ("all"):
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            default:
                return new HashSet<>();
        }
    }

    // İki set'in birleşimini döndüren metot
    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        Set<Task> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    // İki set'in kesişimini döndüren metot
    public Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    // İki set arasındaki farkı döndüren metot
    public Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

}
