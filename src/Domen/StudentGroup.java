package Domen;

import Domen.Student;
import Service.StudentIterator;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int idGroup;

    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "idGroup=" + idGroup +
                ", studentCount=" + group.size() +
                ", students=" + group +
                '}';
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }


    @Override
    public int compareTo(StudentGroup o) {
        int result = Integer.compare(this.getGroup().size(), o.getGroup().size());
        if(result == 0) result = Integer.compare(this.getIdGroup(), o.getIdGroup());
        return result;
    }
}