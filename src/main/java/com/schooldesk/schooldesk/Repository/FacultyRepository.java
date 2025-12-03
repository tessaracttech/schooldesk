package com.schooldesk.schooldesk.Repository;


import com.schooldesk.schooldesk.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
    Faculty findByStandardAndSection(int standard,String Section);
}

