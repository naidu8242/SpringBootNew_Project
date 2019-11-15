package in.bushansirgur.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import in.bushansirgur.springbootcrud.springbootcrudapi.dto.ToysLoginFormsDTO;
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
	Boolean loginCredentials(ToysLoginFormsDTO toysLoginFormsDTO);
	
	Employee employeeDetailsByEmail(String email)throws Exception;
}
