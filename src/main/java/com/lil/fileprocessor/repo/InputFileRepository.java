package com.lil.fileprocessor.repo;

import com.lil.fileprocessor.model.InputFile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InputFileRepository extends CrudRepository<InputFile, Long> {
    @Query("select u from InputFile u where u.fileName = :fileName")
    List<InputFile> findByFileName(@Param("fileName")String fileName);
}