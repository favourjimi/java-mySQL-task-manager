/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {

    public void addTask(Task task) {

        String sql = "INSERT INTO tasks (title, description, status) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, task.getTitle());
            stmt.setString(2, task.getDescription());
            stmt.setString(3, task.getStatus());

            stmt.executeUpdate();
            System.out.println("Task added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

public List<Task> getAllTasks() {

    List<Task> tasks = new ArrayList<>();
    String sql = "SELECT * FROM tasks";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Task task = new Task();
            task.setId(rs.getInt("id"));
            task.setTitle(rs.getString("title"));
            task.setDescription(rs.getString("description"));
            task.setStatus(rs.getString("status"));

            tasks.add(task);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return tasks;
}

public void updateTaskStatus(int id, String newStatus) {

    String sql = "UPDATE tasks SET status = ? WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, newStatus);
        stmt.setInt(2, id);

        int rows = stmt.executeUpdate();

        if (rows > 0) {
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Task not found.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void deleteTask(int id) {

    String sql = "DELETE FROM tasks WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);

        int rows = stmt.executeUpdate();

        if (rows > 0) {
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}



}
