package repository;

import entity.StudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInformationRepository extends JpaRepository<StudentInformation, Long> {
}

