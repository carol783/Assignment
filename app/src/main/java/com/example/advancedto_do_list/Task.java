
package com.example.advancedto_do_list;
import com.example.advancedto_do_list.Task;

    public class Task {
    private String name;
    private boolean isCompleted;

    public Task(String name, boolean isCompleted) {
        this.name = name;
        this.isCompleted = isCompleted;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for isCompleted
    public boolean isCompleted() {
        return isCompleted;
    }

    // Setter for isCompleted
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
