package com.mycompany.taskmanagerapp;

/*import dao.TaskDAO;
import model.Task;
import dao.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        TaskDAO dao= new TaskDAO();
              
      //  Task task = new Task ("Finish jAva Project","Complete the task manager backend", "PENDING");
        Task task = new Task("Finish Java Project","Complete backend CRUD","PENDING");
        dao.addTask(task);
        
        // Update task with ID 1
    dao.updateTaskStatus(1, "COMPLETED");

    // Delete task with ID 2
    dao.deleteTask(2);
        
         // Fetch and display tasks
        List<Task> tasks = dao.getAllTasks();

        for (Task t : tasks) {
            System.out.println("ID: " + t.getId());
            System.out.println("Title: " + t.getTitle());
            System.out.println("Description: " + t.getDescription());
            System.out.println("Status: " + t.getStatus());
            System.out.println("------------------------");
        }
        try {
            Connection conn = DatabaseConnection.getConnection();
            System.out.println("Connected successfully!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
}*/

import dao.TaskDAO;
import model.Task;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskDAO dao = new TaskDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n==== TASK MANAGER ====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();

                    Task task = new Task(title, description, "PENDING");
                    dao.addTask(task);
                    break;

                case 2:
                    List<Task> tasks = dao.getAllTasks();

                    for (Task t : tasks) {
                        System.out.println("ID: " + t.getId());
                        System.out.println("Title: " + t.getTitle());
                        System.out.println("Description: " + t.getDescription());
                        System.out.println("Status: " + t.getStatus());
                        System.out.println("----------------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter task ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    dao.updateTaskStatus(updateId, "COMPLETED");
                    break;

                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    dao.deleteTask(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

