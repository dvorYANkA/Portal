package students.portal.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import students.portal.demo.repository.StudentRepository;

@Controller
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping("/students")
    public  String getStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "/students/list";
    }
}
