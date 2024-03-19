package com.openclassrooms.myrepo.ui;



import com.openclassrooms.myrepo.R;
import com.openclassrooms.myrepo.model.Task;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/**
 * L'activité principale de l'application, affichant la liste de tâches dans un RecyclerView.
 */
public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private TaskRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupRecyclerView();
        setupViewModel();
    }

    /**
     * Configure le RecyclerView pour afficher la liste de tâches.
     */
    private void setupRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TaskRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);
    }

    /**
     * Configure le ViewModel et observe les changements dans la liste de tâches.
     */
    private void setupViewModel() {
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getTasks().observe(this, this::updateTaskList);
    }

    /**
     * Met à jour la liste de tâches affichée dans l'adaptateur.
     *
     * @param tasks La liste mise à jour de tâches.
     */
    private void updateTaskList(List<Task> tasks) {
        adapter.submitList(tasks);
    }
}
