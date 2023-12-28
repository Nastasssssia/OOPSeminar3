package Domen;


import Service.StudentSteamIterator;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий поток студентов.
 * Реализует интерфейс Iterable, что позволяет использовать цикл for-each для итерации по группам студентов.
 */
public class StudentSteam implements Iterable<StudentGroup>{

    /** Номер потока студентов. */
    private int numSteam;

    /** Список групп студентов в потоке. */
    private List<StudentGroup> listSteam;

    /**
     * Конструктор класса StudentSteam.
     *
     * @param numSteam  номер потока студентов.
     * @param listSteam список групп студентов в потоке.
     */

    public StudentSteam(int numSteam, List<StudentGroup> listSteam) {
        this.numSteam = numSteam;
        this.listSteam = listSteam;
    }

    /**
     * Получает номер потока студентов.
     *
     * @return номер потока студентов.
     */
    public int getNumSteam() {
        return numSteam;
    }

    /**
     * Устанавливает номер потока студентов.
     *
     * @param numSteam номер потока студентов.
     */
    public void setNumSteam(int numSteam) {
        this.numSteam = numSteam;
    }

    /**
     * Получает список групп студентов в потоке.
     *
     * @return список групп студентов в потоке.
     */
    public List<StudentGroup> getListSteam() {
        return listSteam;
    }

    /**
     * Устанавливает список групп студентов в потоке.
     *
     * @param listSteam список групп студентов в потоке.
     */
    public void setListSteam(List<StudentGroup> listSteam) {
        this.listSteam = listSteam;
    }

    /**
     * Возвращает строковое представление объекта StudentSteam.
     *
     * @return строковое представление объекта StudentSteam.
     */
    @Override
    public String toString() {
        return "StudentSteam{" +
                "numSteam=" + numSteam +
                ", numGroups=" + listSteam.size() +
                ", groups=" + listSteam +
                '}';
    }

    /**
     * Получает итератор для итерации по группам студентов в потоке.
     *
     * @return итератор по группам студентов.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(listSteam);
    }
}
