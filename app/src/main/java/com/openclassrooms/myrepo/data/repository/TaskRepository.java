package com.openclassrooms.myrepo.data.repository;

import com.openclassrooms.myrepo.data.service.TaskApi;
import com.openclassrooms.myrepo.model.Task;

import java.util.List;

/**
 * Cette classe agit en tant qu'intermédiaire entre le ViewModel et la source de données (TaskApi).
 * Elle permet d'obtenir la liste de tâches à partir de l'API.
 */
public class TaskRepository {

    private final TaskApi taskApi;

    /**
     * Initialise le repository en créant une instance de TaskApi.
     */
    public TaskRepository() {
        taskApi = new TaskApi();
    }

    /**
     * Récupère la liste de tâches à partir de l'API.
     *
     * @return Une liste de tâches obtenue depuis l'API.
     */
    public List<Task> getTasks() {
        return taskApi.getTasks();
    }
}
