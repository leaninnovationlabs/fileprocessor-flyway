package com.lil.fileprocessor.service;

import com.lil.fileprocessor.model.InputFile;
import com.lil.fileprocessor.repo.InputFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FileProcessorService {
    @Autowired
    InputFileRepository repository;

    public void add(InputFile dto) {
        repository.save(dto);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public List<InputFile> getFiles() {
        return (List<InputFile>) repository.findAll();
    }

    public List<InputFile> getByFileName(String fileName) {
        List<InputFile> files = repository.findByFileName(fileName);
        return files;
    }

    public InputFile getInputFileById(long id) {
        Optional<InputFile> optionalInputFile = repository.findById(id);
        return optionalInputFile.orElseThrow(() -> new FileNotFoundException("Couldn't find a File with id: " + id));
    }
}