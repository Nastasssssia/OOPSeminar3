package Service;

import Domen.Employee;
import Domen.PersonComparator;
import Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class ServiseEmployee implements iGenericInterface<Employee> {

    private int count;

    private List<Employee> employees;


    public ServiseEmployee(List<Employee> employees) {
        this.employees = new ArrayList<>();
    }

    public void sortBySecondName() {
        PersonComparator<Employee> perComp = new PersonComparator<>();
        this.employees.sort(perComp);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        employees.add(new Employee(name, age, "Basic"));
        count++;
    }
}
