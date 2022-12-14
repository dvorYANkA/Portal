package students.portal.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import students.portal.demo.repository.TaskRepository;


@RequestMapping("/tasks")
@Controller
public class TaskController{
    private  final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @RequestMapping("/list")
    public String getTasks(Model model){
       model.addAttribute("tasks", taskRepository.findAll());
        return "/tasks/list";
    }
}