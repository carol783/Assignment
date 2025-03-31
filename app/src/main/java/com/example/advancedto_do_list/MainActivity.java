package com.example.advancedto_do_list;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTask;
    private Button buttonAdd;
    private RecyclerView recyclerViewTasks;
    private Taskadapter taskAdapter;
    private ArrayList<Task> taskList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        editTextTask = findViewById(R.id.editTextTask);
        buttonAdd = findViewById(R.id.buttonAdd);
        recyclerViewTasks = findViewById(R.id.recyclerViewTasks);

        // Initialize task list
        taskList = new ArrayList<>();
        taskList.add(new Task("Buy groceries", false));
        taskList.add(new Task("Call mom", true));
        taskList.add(new Task("Finish homework", false));

        // Set up RecyclerView and adapter
        taskAdapter = new Taskadapter(taskList);
        recyclerViewTasks.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTasks.setAdapter(taskAdapter);

        // Add task button functionality
        buttonAdd.setOnClickListener(view -> {
            String taskName = editTextTask.getText().toString().trim();
            if (!TextUtils.isEmpty(taskName)) {
                taskList.add(new Task(taskName, false)); // Add new task to the list
                taskAdapter.notifyItemInserted(taskList.size() - 1); // Notify adapter
                editTextTask.setText(""); // Clear input field
            }
        });
    }

}
