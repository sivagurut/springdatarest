package com.thatsshare.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.thatsshare.entity.Employee;
@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	List<Employee> findByFirstname(String firstname);
	
	List<Employee> findByIdAndLastname(Integer id, String lastname);
}
