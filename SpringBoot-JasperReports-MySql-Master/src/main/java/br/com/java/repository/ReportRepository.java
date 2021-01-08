package br.com.java.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java.entity.Employee;

@Repository
public interface ReportRepository extends JpaRepository<Employee, Long> {

}
