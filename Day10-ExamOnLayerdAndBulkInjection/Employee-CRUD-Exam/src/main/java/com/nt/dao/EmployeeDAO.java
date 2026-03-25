package com.nt.dao;
import com.nt.model.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository
public class EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertEmployee(Employee employee) {
        String sql = "INSERT INTO Employee VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,
                employee.getEId(),
                employee.getEName(),
                employee.getEDepartment(),
                employee.getESalary());
    }

    public List<Employee> getAllEmployee() {
        String sql = "SELECT * FROM Employee";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Employee p = new Employee();
            p.setEId(rs.getInt("EID"));
            p.setEName(rs.getString("ENAME"));
            p.setEDepartment(rs.getString("EDEPARTMENT"));
            p.setESalary(rs.getDouble("ESALARY"));
            return p;
        });
    }

    public void deleteEmployee(int eId) {
        String sql = "DELETE FROM Employee WHERE eId=?";
        jdbcTemplate.update(sql, eId);
    }
}