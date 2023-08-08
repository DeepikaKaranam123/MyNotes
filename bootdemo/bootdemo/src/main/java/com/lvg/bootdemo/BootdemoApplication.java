package com.lvg.bootdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



import com.lvg.bootdemo.entity.Department;
import com.lvg.bootdemo.entity.Employee;
import com.lvg.bootdemo.repository.BookRepository;
import com.lvg.bootdemo.repository.DepartmentRepository;
import com.lvg.bootdemo.service.DepartmentService;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext container= SpringApplication.run(BootdemoApplication.class, args);
		DepartmentService ds=container.getBean(DepartmentService.class);
		Department d=ds.getDepartmentByDepartmentId(20);
		
			System.out.println(d.getDepartmentNo()+" "+d.getDepartmentName()+" "+d.getLocation());
			for(Employee e:d.getEmployees())
				System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
		}
		
}

