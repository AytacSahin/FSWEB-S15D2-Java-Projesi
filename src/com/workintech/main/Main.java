package com.workintech.main;

import com.workintech.model.Priority;
import com.workintech.model.Status;
import com.workintech.model.Task;
import com.workintech.model.TaskData;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Görevlerin tutulduğu listeyi oluşturma:
        TaskData taskData = new TaskData();

        //Görev oluşturma:
        Task gorev1 = new Task("Proje 1", "Tasarımı olustur.", "ann", Priority.HIGH, Status.ASSIGNED);
        Task gorev1a = new Task("Proje 1a", "Tasarımı çiz..", "ann", Priority.HIGH, Status.ASSIGNED);
        Task gorev2 = new Task("Proje 1", "Kodları yaz.", "bob", Priority.MED, Status.IN_PROGRESS);
        Task gorev3 = new Task("Proje 1", "Test kodlarını yaz.", "carol", Priority.LOW, Status.IN_PROGRESS);

        //Kontrol:
        //System.out.println(gorev1);

        // Görevleri ekleme:
        taskData.getTasks("ann").add(gorev1);
        taskData.getTasks("ann").add(gorev1a);
        taskData.getTasks("bob").add(gorev2);
        taskData.getTasks("carol").add(gorev3);

        // Tek bir çalışanın görevlerini görüntüleme:
        Set<Task> annTasks = taskData.getTasks("ann");
        for (Task task: annTasks) {
            System.out.println("Ann Görevleri: " + task.getDescription());
        }

        // Bütün çalışanların görevlerini görüntüleme:
        Set<Task> allTasks = taskData.getTasks("all");
        for (Task task : allTasks) {
            System.out.println("Kim Yapıyor: " + task.getAssignee() + " - Açıklama: " + task.getDescription());
        }
    }
}