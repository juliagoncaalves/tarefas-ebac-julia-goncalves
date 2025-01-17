package org.example.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "employee_id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String telephone;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Date dateHiring;
    @Column
    private Date dateExit;

    @OneToMany(mappedBy = "employee")
    private List<Animal> animals;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDateHiring() {
        return dateHiring;
    }

    public void setDateHiring(Date dateHiring) {
        this.dateHiring = dateHiring;
    }

    public Date getDateExit() {
        return dateExit;
    }

    public void setDateExit(Date dateExit) {
        this.dateExit = dateExit;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
