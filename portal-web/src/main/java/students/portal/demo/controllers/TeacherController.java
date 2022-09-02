package students.portal.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import students.portal.demo.repository.TeacherRepository;

@RequestMapping("/teachers")
@Controller
public class TeacherController {
    private final TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository){this.teacherRepository = teacherRepository;}

    @RequestMapping("/list")
    public String getTeachers(Model model){
        model.addAttribute("teachers", teacherRepository.findAll());
        return "teachers/list";
    }
}
