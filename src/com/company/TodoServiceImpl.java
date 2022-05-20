package com.company;

import java.util.List;

public interface TodoServiceImpl {
    String createTask(int id, String taskTitle);
    List<Task> fetchTasks();
    Task fetchTask(int taskId);
    String deleteTask(int taskId);
    String updateTaskStatus(String Status);
}
