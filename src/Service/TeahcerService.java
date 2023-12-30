package Service;


import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для управления учителями.
 * Реализует обобщенный интерфейс iGenericInterface с параметром Teacher.
 */
public class TeahcerService implements iGenericInterface<Teacher>{
    private int count;

    private List<Teacher> teacherList;

    /**
     * Конструктор класса TeacherService.
     *
     * @param teacherList Список учителей, который будет использоваться в сервисе.
     */
    public TeahcerService(List<Teacher> teacherList) {
        this.teacherList = new ArrayList<>(teacherList);
    }

    /**
     * Сортирует список учителей по фамилии.
     */
    public void sortBySecondName() {
        if (!this.teacherList.isEmpty()) {
            PersonComparator<Teacher> perComp = new PersonComparator<>();
            this.teacherList.sort(perComp);
        }
    }

    /**
     * Получает список всех учителей.
     *
     * @return Список учителей.
     */
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    /**
     * Создает нового учителя и добавляет его в список учителей.
     *
     * @param name Фамилия нового учителя.
     * @param age  Возраст нового учителя.
     */
    @Override
    public void create(String name, int age) {
        teacherList.add(new Teacher(name,age, "Basic"));
    }
}
