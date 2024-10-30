package jentkins.com.projetdeploiement.repository;

import jentkins.com.projetdeploiement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
