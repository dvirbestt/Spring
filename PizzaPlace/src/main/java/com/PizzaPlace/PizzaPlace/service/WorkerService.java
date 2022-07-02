package com.PizzaPlace.PizzaPlace.service;

import com.PizzaPlace.PizzaPlace.model.Worker;

import java.util.List;

public interface WorkerService {
    public Worker saveWorker(Worker worker);
    public List<Worker> getAllWorkers();

}
