package com.schooldesk.schooldesk.Mappers;

import com.schooldesk.schooldesk.DTOs.StaffDTO;
import com.schooldesk.schooldesk.models.Staff;
import org.springframework.stereotype.Component;

@Component
public class StaffMapper {
    public Staff toStaff(StaffDTO staffDTO) {
        Staff staff = new Staff();
        staff.setName(staffDTO.getName());
        staff.setRole(staffDTO.getRole());
        staff.setNumber(staffDTO.getNumber());
        staff.setRole(staffDTO.getRole());
        return staff;
    }
    public StaffDTO toStaffDto(Staff staff){
        StaffDTO staffDTO = new StaffDTO();
        staffDTO.setName(staff.getName());
        staffDTO.setRole(staff.getRole());
        staffDTO.setNumber(staff.getNumber());
        staffDTO.setGender(staff.getGender());

        return staffDTO;
    }
}
