package com.javamaster.springswagger.controller;

import com.javamaster.springswagger.dto.ExampleDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("v1/examples")
@Api(produces = "Controller to illustrate how the swagger works")
public class ExampleController {

    @GetMapping
    @ApiOperation("read all ExampleDto's")
    public List<ExampleDto> readAll() {
        return Collections.emptyList();
    }

    @PostMapping
    @ApiOperation("create ExampleDto")
    public void createExampleDto(@RequestBody ExampleDto exampleDto) {}

    @PutMapping("/{id}")
    @ApiOperation("update ExampleDto")
    public void updateExampleDto(@PathVariable Integer id, @RequestBody ExampleDto exampleDto) {}

    @DeleteMapping("/{id}")
    @ApiOperation("delete ExampleDto")
    public void deleteExampleDtoById(@PathVariable Integer id) {}
}
