package org.example.entities;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String temporaryName;

    @Column(nullable = false)
    private Integer estimatedAge;

    @Column(nullable = false)
    private String breed;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private Date entryDate;

    @Column
    private Date adoptionDate;

    @Column(nullable = false)
    private String arrivalConditions;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column
    private Date dateOfDeath;

    @Column(nullable = false)
    private String animalSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemporaryName() {
        return temporaryName;
    }

    public void setTemporaryName(String temporaryName) {
        this.temporaryName = temporaryName;
    }

    public Integer getEstimatedAge() {
        return estimatedAge;
    }

    public void setEstimatedAge(Integer estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(Date adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getArrivalConditions() {
        return arrivalConditions;
    }

    public void setArrivalConditions(String arrivalConditions) {
        this.arrivalConditions = arrivalConditions;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(String animalSize) {
        this.animalSize = animalSize;
    }
}
