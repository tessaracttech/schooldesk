package com.schooldesk.schooldesk.Controllers;


import com.schooldesk.schooldesk.DTOs.FacultyDTO;
import com.schooldesk.schooldesk.Mappers.FacultyMapper;
import com.schooldesk.schooldesk.models.Faculty;
import com.schooldesk.schooldesk.services.FacultyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {

    FacultyService facultyService;
    FacultyMapper facultyMapper;

    public FacultyController(FacultyService facultyService,FacultyMapper facultyMapper) {
        this.facultyService = facultyService;
        this.facultyMapper = facultyMapper;
    }

    @GetMapping("/faculty/{id}")
    public FacultyDTO getSingleFacultyById(@PathVariable("id") long id){
        Faculty faculty = facultyService.getSingleFaculty(id);
        FacultyDTO fDTO = facultyMapper.toFacultyDTO(faculty);
        return fDTO;
    }

    @GetMapping("/faculty")
    public List<Faculty> getAllFaculty(){
        List<Faculty> allFaculty = facultyService.getAllFaculty();
        return allFaculty;
    }

    @PostMapping("/faculty")
    public Faculty postFaculty(@RequestBody Faculty faculty){
        Faculty postFaculty = facultyService.saveFaculty(faculty);
        return postFaculty;
    }

    @PutMapping("/faculty/{id}")
    public FacultyDTO UpdateFaculty(@PathVariable("id") long id ,@RequestBody FacultyDTO facultyDTO){
        FacultyDTO updateFaculty = facultyService.UpdateFaculty(id,
                facultyDTO.getName(),
                facultyDTO.getEmail(),
                facultyDTO.getSection(),
                facultyDTO.getNumber());
        return updateFaculty;

    }

    @DeleteMapping("/faculty/{id}")
    public String DeleteFaculty(@PathVariable("id") long id){

        return facultyService.deleteFaculty(id);
    }
}
