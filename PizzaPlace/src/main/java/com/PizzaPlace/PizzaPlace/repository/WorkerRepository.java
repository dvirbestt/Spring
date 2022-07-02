package com.PizzaPlace.PizzaPlace.repository;

import com.PizzaPlace.PizzaPlace.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Integer> {



}
