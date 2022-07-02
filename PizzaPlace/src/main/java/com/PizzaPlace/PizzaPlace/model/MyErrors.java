package com.PizzaPlace.PizzaPlace.model;

import org.springframework.validation.Errors;

import java.util.ArrayList;
import java.util.List;

public class MyErrors {

    public static List<String> getAllWorkerErrors(Errors errors){

        List<String> placeholder = new ArrayList<>();

        if (errors.toString().contains("branch")){
            placeholder.add("Add Branch");
        }

        if (errors.toString().contains("address")){
            placeholder.add("Add Address");
        }

        if (errors.toString().contains("name")){
            placeholder.add("Add Name");
        }
        System.out.println(placeholder);
        return placeholder;
    }
}
