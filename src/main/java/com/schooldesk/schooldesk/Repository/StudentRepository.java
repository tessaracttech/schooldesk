package com.schooldesk.schooldesk.Repository;


import com.schooldesk.schooldesk.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findBySection(String section);
    List<Student> findByStandard(int standard);
    List<Student> findByStandardAndSection(int standard, String section);
}
