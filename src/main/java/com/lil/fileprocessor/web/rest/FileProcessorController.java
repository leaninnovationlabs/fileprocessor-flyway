package com.lil.fileprocessor.web.rest;

import com.lil.fileprocessor.model.InputFile;
import com.lil.fileprocessor.service.FileProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fileprocessor")
public class FileProcessorController {

    @Autowired
    FileProcessorService service;

    @GetMapping
    public List<InputFile> getFiles() {
        return service.getFiles();
    }

    @PostMapping
    public void postInputFile(@RequestBody InputFile dto) {
        service.add(dto);
    }

    @GetMapping("/{id}")
    public InputFile getById(@PathVariable(required = true) long id) {
        return service.getInputFileById(id);
    }

    @GetMapping("/getByName/{fileName}")
    public List<InputFile> getById(@PathVariable(required = true) String fileName) {
        return service.getByFileName(fileName);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}