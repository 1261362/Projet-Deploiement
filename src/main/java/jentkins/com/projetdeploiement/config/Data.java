package jentkins.com.projetdeploiement.config;

import jentkins.com.projetdeploiement.model.Student;
import jentkins.com.projetdeploiement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Data implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) {
        // Initialisation des données
        studentRepository.save(new Student("Dupont", "Jean", "Informatique"));
        studentRepository.save(new Student("Martin", "Marie", "Mathématiques"));
        studentRepository.save(new Student("Bernard", "Paul", "Physique"));
        studentRepository.save(new Student("Petit", "Sophie", "Chimie"));
        studentRepository.save(new Student("Robert", "Pierre", "Biologie"));

        System.out.println("Base de données initialisée avec succès!");
    }
}