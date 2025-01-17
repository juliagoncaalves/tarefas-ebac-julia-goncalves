package org.example.controllers;

import org.example.entities.Animal;
import org.example.repositories.AnimalRepository;
import org.example.repositories.EmployeeRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping
    private List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return animalRepository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return animalRepository.findAdopted();
    }

    @GetMapping("/not-adopted-dog")
    private List<Animal> findNotAdoptedDog() {
        return animalRepository.findNotAdoptedDog();
    }

    @GetMapping("/adopted-dog")
    private List<Animal> findAdoptedDog() {
        return animalRepository.findAdoptedDog();
    }

    @GetMapping("/not-adopted-cat")
    private List<Animal> findNotAdoptedCat() {
        return animalRepository.findNotAdoptedCat();
    }

    @GetMapping("/adopted-cat")
    private List<Animal> findAdoptedCat() {
        return animalRepository.findAdoptedCat();
    }

    @GetMapping("/employee-gap")
    private List<String> findEmployees() {
        Date startDate = Date.valueOf("2024-01-01");
        Date endDate = Date.valueOf("2024-12-31");
        return animalRepository.findEmployees(startDate, endDate);
    }

    @GetMapping("/month")
    private List<Animal> findMonthAnimals(
            @RequestParam(name = "startDate", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy")
            LocalDate startDate,
            @RequestParam(name = "endDate", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy")
            LocalDate endDate
    ) {
        return animalRepository.findMonthAnimals(startDate, endDate);
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }
}
