package com.nt.respo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Model.Employee;

public interface StudentRespository extends JpaRepository<Employee, Integer>
{

}
