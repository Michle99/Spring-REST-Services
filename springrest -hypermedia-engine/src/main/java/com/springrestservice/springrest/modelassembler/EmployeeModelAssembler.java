package com.springrestservice.springrest.modelassembler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import com.springrestservice.springrest.Beans.Employee;
import com.springrestservice.springrest.controller.EmployeeController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>>  {
    
    @Override
    public EntityModel<Employee> toModel(Employee employee) {
  
      return EntityModel.of(employee, //
          linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
          linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }

}
