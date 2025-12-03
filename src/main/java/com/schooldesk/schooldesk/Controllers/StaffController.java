package com.schooldesk.schooldesk.Controllers;


import com.schooldesk.schooldesk.DTOs.StaffDTO;
import com.schooldesk.schooldesk.Mappers.StaffMapper;
import com.schooldesk.schooldesk.models.Staff;
import com.schooldesk.schooldesk.services.StaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {
    StaffService staffService;
    StaffMapper staffMapper;

    public StaffController(StaffService staffService, StaffMapper staffMapper) {
        this.staffService = staffService;
        this.staffMapper = staffMapper;
    }

    @GetMapping("/staff/{id}")
    public StaffDTO getById(@PathVariable("id") long id ) {
        Staff sf = staffService.GetSingleStaff(id);
        StaffDTO sfDto = staffMapper.toStaffDto(sf);
        return sfDto;
    }

    @GetMapping("/staff")
    public List<StaffDTO> getAllStaff() {
        List<StaffDTO> allStaff = staffService.GetAllStaff();
        return allStaff;
    }

    @PostMapping("/staff")
    public Staff saveStaff(@RequestBody Staff staff) {
        Staff newStaff = staffService.SaveStaff(staff);

        return newStaff;
    }

    @PutMapping("/staff/{id}")
    public Staff updateStaff(@PathVariable("id") long id,
                             @RequestBody Staff staff) {
        Staff updateStaff = staffService.UpdateStaff(id,
                staff.getName(),
                staff.getRole(),
                staff.getNumber());

        return updateStaff;
    }

    @DeleteMapping("staff/{id}")
    public String deleteStaff(@PathVariable("id")long id) {

        return staffService.DeleteSingleStaff(id);
    }

}
