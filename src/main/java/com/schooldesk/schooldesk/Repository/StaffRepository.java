package com.schooldesk.schooldesk.Repository;


import com.schooldesk.schooldesk.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Long> {
}
