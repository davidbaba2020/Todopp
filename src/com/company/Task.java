package com.company;

import java.time.LocalDateTime;

public class Task {
    private int id;
    private String taskTitle;
    private LocalDateTime time = LocalDateTime.now();

    public Task() {
    }

    public Task(int id, String taskTitle, LocalDateTime time) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.time = time;
    }

    public Task(int id, String taskTitle) {
        this.id = id;
        this.taskTitle = taskTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskTitle='" + taskTitle + '\'' +
                ", time=" + time +
                '}';
    }
}
