package com.pilz.springbootreact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeStub {
    private static Map<Long, Employee> employees = new HashMap<Long, Employee>();
    private static Long idIndex = 3L;

    //populate initial employees
    static {

        Employee a = new Employee("Sarah", "Phelan", "code monkey");
        employees.put(1L, a);
        Employee b = new Employee("S", "Phelan", "tea maker");
        employees.put(2L, b);
        Employee c = new Employee("Sarah", "P", "confused");
        employees.put(3L, c);
    }

    public static List<Employee> list() {
        return new ArrayList<Employee>(employees.values());
    }

    public static Employee create(Employee employee) {
        idIndex += idIndex;
        employee.setId(idIndex);
        employees.put(idIndex, employee);
        return employee;
    }

    public static Employee get(Long id) {
        return employees.get(id);
    }

    public static Employee update(Long id, Employee employee) {
        employees.put(id, employee);
        return employee;
    }

    public static Employee delete(Long id) {
        return employees.remove(id);
    }
}
