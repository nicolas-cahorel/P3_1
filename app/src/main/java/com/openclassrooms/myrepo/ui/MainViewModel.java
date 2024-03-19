package com.openclassrooms.myrepo.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.openclassrooms.myrepo.data.repository.TaskRepository;
import com.openclassrooms.myrepo.model.Task;

import java.util.List;

/**
 * ViewModel responsable de la gestion des données relatives aux tâches.
 * Il interagit avec le repository pour obtenir les tâches et les expose via LiveData.
 */
public class MainViewModel extends ViewModel {

    private final TaskRepository taskRepository;
    private final MutableLiveData<List<Task>> tasksLiveData;

    /**
     * Initialise le ViewModel en créant un repository et en chargeant les tâches.
     */
    public MainViewModel() {
        taskRepository = new TaskRepository();
        tasksLiveData = new MutableLiveData<>();
        loadTasks();
    }
    /**
     * Récupère les tâches exposées via LiveData.
     *
     * @return Une instance LiveData contenant la liste de tâches actuelle.
     */
    public LiveData<List<Task>> getTasks() {
        return tasksLiveData;
    }

    /**
     * Charge les tâches à partir du repository et les publie via LiveData.
     * Cette méthode est appelée lors de l'initialisation du ViewModel.
     */
    private void loadTasks() {
        List<Task> tasks = taskRepository.getTasks();
        tasksLiveData.postValue(tasks);
    }
}
