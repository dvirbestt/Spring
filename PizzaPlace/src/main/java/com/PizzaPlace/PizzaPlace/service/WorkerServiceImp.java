package com.PizzaPlace.PizzaPlace.service;

import com.PizzaPlace.PizzaPlace.model.Worker;
import com.PizzaPlace.PizzaPlace.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImp implements WorkerService{
    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public Worker saveWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }
}
