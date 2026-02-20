/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
/**
 *
 * @author User
 */
public class Task {
    private int id;
    private String title;
    private String description;
    private String status;
    private LocalDate createdAt;
    
    public Task() {}

    public Task(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
       // this.dueDate = dueDate;
    }

    //to find getters and setters of values
    public int getId() { return id; }
    public void setId(int id) {this.id=id;}
    
    public String getTitle() { return title; }
    public void setTitle(String title) {this.title = title;}
    
    public String getDescription() { return description; }
    public void setDescription(String description) {this.description =description;}
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

  //public LocalDate getDueDate(){return dueDate;}
    //public void setDueDate(LocalDate dueDate) {this.dueDate = dueDate; }
    
    /*@Override
    public String toString() {
        return id + " | " + title + " | " + status;
    }*/
}
