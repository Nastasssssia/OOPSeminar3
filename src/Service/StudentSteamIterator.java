package Service;

import Domen.StudentGroup;


import java.util.Iterator;
import java.util.List;

/**
 * Итератор для итерации по группам студентов в потоке студентов.
 */
public class StudentSteamIterator implements Iterator<StudentGroup> {

    /** Счетчик текущей позиции в списке групп. */
    private int count;

    /** Список групп студентов в потоке. */
    private final List<StudentGroup> listSteam;

    /**
     * Конструктор класса StudentSteamIterator.
     *
     * @param listSteam список групп студентов в потоке.
     */
    public StudentSteamIterator(List<StudentGroup> listSteam) {
        this.listSteam = listSteam;
        this.count = 0;
    }

    /**
     * Проверяет наличие следующей группы студентов в потоке.
     *
     * @return true, если следующая группа студентов существует; в противном случае - false.
     */

    @Override
    public boolean hasNext() {
        return count < listSteam.size();
    }

    /**
     * Получает следующую группу студентов в потоке.
     *
     * @return следующая группа студентов.
     */
    @Override
    public StudentGroup next() {
        return this.listSteam.get(count++);
    }
}
