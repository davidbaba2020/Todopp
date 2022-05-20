package com.company;

import java.util.ArrayList;
import java.util.List;

public class TodoImplementation implements TodoServiceImpl{
    private List<Task> listOfTasks = new ArrayList<>();

    public TodoImplementation(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }

    public TodoImplementation() {
    }

    public void setListOfTasks(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }


    @Override
    public String createTask(int id, String taskTitle) {
        Task newTask = new Task();
        newTask.setId(id);
        newTask.setTaskTitle(taskTitle);
        listOfTasks.add(newTask);
        return "Task Created successfully";
    }

    @Override
    public List<Task> fetchTasks() {
        return this.listOfTasks;
    }

    @Override
    public Task fetchTask(int taskId) {
        Task task = new Task();
        for (int i = 0; i < listOfTasks.size(); i++){
            if(listOfTasks.get(i).getId() == taskId){
                task = listOfTasks.get(i);
            }
        }
        return task;
    }

    @Override
    public String deleteTask(int taskId) {
        String msg = "";
        for (int i = 0; i < listOfTasks.size(); i++){
            if(listOfTasks.get(i).getId() == taskId){
                listOfTasks.remove(i);
                msg = "Task deleted successfully";
            } else {
                msg = "Task with id: "+taskId+ " was not found";
            }
        }
        return msg;
    }

    @Override
    public String updateTaskStatus(String Status) {
        return null;
    }

    @Override
    public String toString() {
        return "TaskServiceImplementation{" +
                "listOfTasks=" + listOfTasks +
                '}';
    }
}
