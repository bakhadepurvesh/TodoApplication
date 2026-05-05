package com.soft.Controller;


import com.soft.entity.Todo_Entity;
import com.soft.repository.Todo_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class Todo_Controller {

    private final Todo_Repository todoRepository;

    @GetMapping({"","/","/home"})
    public String showHome(Model model){
        model.addAttribute("todos",todoRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@RequestParam String title){

        Todo_Entity newTodo = Todo_Entity.builder()
                .title(title)
                .completed(false)
                .build();

        todoRepository.save(newTodo);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id){

        Todo_Entity existingTodo = todoRepository.findById(id).orElseThrow(()->new RuntimeException("Todo not found : "+id));
        existingTodo.setCompleted(true);
        todoRepository.save(existingTodo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){

        Todo_Entity existingTodo = todoRepository.findById(id).orElseThrow(()->new RuntimeException("Todo not found : "+id));
        todoRepository.delete(existingTodo);
        return "redirect:/";
    }

}
