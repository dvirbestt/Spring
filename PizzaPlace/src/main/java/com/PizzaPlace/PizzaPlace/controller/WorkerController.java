package com.PizzaPlace.PizzaPlace.controller;

import com.PizzaPlace.PizzaPlace.model.MyErrors;
import com.PizzaPlace.PizzaPlace.model.Worker;
import com.PizzaPlace.PizzaPlace.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/worker")
@CrossOrigin
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @ResponseBody
    @PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<String> add(@Valid @RequestBody
            Worker worker, Errors errors) {
        if (errors.hasErrors()){
            return MyErrors.getAllWorkerErrors(errors);
            };
        System.out.println("got it");
        workerService.saveWorker(worker);
        return new ArrayList<String>(Collections.singleton("Added Successfully"));
    }

    @GetMapping("/getAll")
    public List<Worker> getAll(){

        return workerService.getAllWorkers();
    }

}
