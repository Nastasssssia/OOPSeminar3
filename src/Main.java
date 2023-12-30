import Controlers.AccountControler;
import Domen.*;
import Service.TeahcerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Главный класс приложения для демонстрации работы с классами Student, StudentGroup и StudentSteam.
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);

        //Student student5 = new Student("Vasilisa", 26);
        //Student student6 = new Student("Karina", 25);
        //Student student7 = new Student("Andrey", 22);
        //Student student8 = new Student("Masha", 27);
        //Student student9 = new Student("Irina", 28);
        //Student student10 = new Student("Nikolay", 30);

       //List<StudentGroup> groups = List.of(
               //new StudentGroup(List.of(student1, student2, student5), 1),
             //  new StudentGroup(List.of(student3, student4, student6, student7), 2),
           //    new StudentGroup(List.of(student8, student9), 3),
         //      new StudentGroup(List.of(student10), 4)
       //);

        // Создаем объект StudentSteam, представляющий поток студентов
        //StudentSteam studentSteam = new StudentSteam(1, groups);

        // Используем цикл for-each для итерации по группам и их студентам
        //for (StudentGroup group : studentSteam) {
            //System.out.println("Group ID: " + group.getIdGroup());
           // System.out.println("Students: " + group.getGroup());
          //  System.out.println("--------------");

        //}
        // Создаем изменяемый список из объектов StudentGroup для сортировки
        //List<StudentGroup> groupList = new ArrayList<>(studentSteam.getListSteam());

        // Сортируем изменяемый список с использованием Collections.sort()
       // Collections.sort(groupList);

        // Выводим отсортированные группы в консоль
       // System.out.println("Отсортированные группы по количеству студентов:");
       // for (StudentGroup group : groupList) {
       //     System.out.println("Group ID: " + group.getIdGroup() + ", Students: " + group.getGroup());
       // }

        Teacher teacher1 = new Teacher("Anna",35,"docent");
        Teacher teacher2 = new Teacher("Pasha",30,"docent");
        Teacher teacher3 = new Teacher("Anton",38,"docent");
        Teacher teacher4 = new Teacher("Boris",36,"docent");
        //System.out.println(new PersonComparator<Teacher>().
              //  compare(teacher1,teacher2));
       // System.out.println(new PersonComparator<Student>().
             //   compare(student1,student2));

        //new AccountControler().paySalary(teacher1,50000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);

        System.out.println("Исходный список:");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        // Создаем объект TeahcerService
        TeahcerService teacherService = new TeahcerService(teacherList);

        // Вызываем метод сортировки по фамилии
        teacherService.sortBySecondName();

        System.out.println("Отсортированный список:");
        for (Teacher teacher : teacherService.getAll()) {
            System.out.println(teacher);
        }

        Teacher [] teachers = teacherList.toArray(new Teacher[0]);
        System.out.println( "Средний возраст учителей = "+ AccountControler.averageAge(teachers));

        Student[] students = {student1,student2,student3,student4};
        System.out.println("Средний возраст студентов = " + AccountControler.averageAge(students));

    }
}