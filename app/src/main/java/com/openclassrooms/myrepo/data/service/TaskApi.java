package com.openclassrooms.myrepo.data.service;

import com.openclassrooms.myrepo.model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe simule la récupération de tâches depuis une API.
 * Les tâches générées sont utilisées à des fins de démonstration.
 */
public class TaskApi {
    /**
     * Récupère une liste de tâches simulées depuis l'API.
     *
     * @return Une liste de tâches simulées avec des descriptions pré-définies.
     */
    public List<Task> getTasks() {
        // Simule la récupération des tâches depuis une API
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Faire les courses pour le dîner"));
        tasks.add(new Task("Préparer le rapport pour la réunion"));
        tasks.add(new Task("Répondre aux e-mails en attente"));
        tasks.add(new Task("Faire de l'exercice pendant 30 minutes"));
        tasks.add(new Task("Planifier les vacances d'été"));
        tasks.add(new Task("Rendre le livre à la bibliothèque"));
        tasks.add(new Task("Réviser pour l'examen de mathématiques"));
        tasks.add(new Task("Appeler le plombier pour la fuite d'eau"));
        tasks.add(new Task("Nettoyer le garage"));
        tasks.add(new Task("Préparer une liste de courses"));
        return tasks;
    }
}
