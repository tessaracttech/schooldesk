package com.schooldesk.schooldesk.Controllers;


import com.schooldesk.schooldesk.DTOs.StudentDTO;
import com.schooldesk.schooldesk.services.SectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SectionController {

    SectionService sectionService ;

    public SectionController(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @GetMapping("allstudents/section/{section}")
    public List<StudentDTO> getStudentsFromASection(@PathVariable String section){
        List<StudentDTO> sdto = sectionService.getStudentsFromASection(section);
        return sdto;
    }


}
