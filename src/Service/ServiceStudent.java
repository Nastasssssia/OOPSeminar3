package Service;

import Domen.PersonComparator;
import Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class ServiceStudent implements iGenericInterface<Student>{

    private int count;

    private List<Student> students;


    public ServiceStudent(List<Student> students) {
        this.students = new ArrayList<>();
    }

    public void sortBySecondName() {
        PersonComparator<Student> perComp = new PersonComparator<>();
        this.students.sort(perComp);
    }
    @Override
    public List getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        students.add(new Student(name, age));
    }
}

