package com.dsi.tp1.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.tp1.entites.Stage;
import com.dsi.tp1.services.IStageService;

@RestController
public class StageController {

@Autowired
private IStageService stageService;
@CrossOrigin("http://localhost:4200")
@GetMapping("/stages")
public List<Stage> getAll(){
return stageService.allStage();
}

@GetMapping("/stages/{id}")
public Stage getStage(@PathVariable("id") int id){
return stageService.getStage(id);
}
@PutMapping("/stages/{id}")
public Stage updatStage(@PathVariable("id") int id, @RequestBody Stage stage) {
return stageService.UpdateStage(stage, id);
}

@DeleteMapping ("/stages/{id}")
public boolean deleteSoutenance(@PathVariable("id") int id) {
return stageService.DeleteStage(id);
}
@PostMapping("/stages")
    public boolean addStage(@RequestBody Stage s) {
        return stageService.addStage(s);
    }

}