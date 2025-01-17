package org.example.repositories;

import org.example.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NULL ORDER BY a.entryDate DESC")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NOT NULL ")
    List<Animal> findAdopted();

    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NULL AND a.species = 'dog'")
    List<Animal> findNotAdoptedDog();

    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NOT NULL AND a.species = 'dog'")
    List<Animal> findAdoptedDog();

    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NULL AND a.species = 'cat'")
    List<Animal> findNotAdoptedCat();


    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NOT NULL AND a.species = 'cat'")
    List<Animal> findAdoptedCat();

    @Query("SELECT a.employee, COUNT(*) as quantidadeAnimais FROM Animal a WHERE a.entryDate >= :startDate AND a.entryDate <= :endDate " +
            "GROUP BY a.employee")
    List<String> findEmployees(
            @Param("startDate") Date startDate,
            @Param("endDate") Date endDate
    );

    @Query("SELECT a FROM Animal a WHERE a.entryDate >= :startDate AND a.entryDate <= :endDate")
    List<Animal> findMonthAnimals(LocalDate startDate, LocalDate endDate);
}
