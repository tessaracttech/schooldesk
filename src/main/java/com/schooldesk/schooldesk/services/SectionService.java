package com.schooldesk.schooldesk.services;


import com.schooldesk.schooldesk.DTOs.StudentDTO;
import com.schooldesk.schooldesk.Repository.StudentRepository;
import com.schooldesk.schooldesk.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SectionService {



    StudentRepository studentRepository;

    public SectionService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

   public List<StudentDTO> getStudentsFromASection(String section){
       List<Student> student = studentRepository.findBySection(section);
       List<StudentDTO> allStudentsInThisSection = new ArrayList<>();
       for(Student s : student){
           StudentDTO sDTO = new StudentDTO();
           sDTO.setName(s.getName());
           sDTO.setEmail(s.getEmail());
           sDTO.setStandard(s.getStandard());
           sDTO.setSection(section);
           sDTO.setNumber(s.getNumber());

           allStudentsInThisSection.add(sDTO);
       }
       return allStudentsInThisSection;
   }



}
