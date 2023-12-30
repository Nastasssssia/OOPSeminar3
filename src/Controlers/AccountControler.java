package Controlers;

import Domen.Person;
import Domen.Teacher;

/**
 * Контроллер учетной системы, отвечающий за управление учителями и другими персонами.
 */
public class AccountControler {

    /**
     * Выплачивает зарплату учителю.
     *
     * @param person Учитель, которому выплачивается зарплата.
     * @param salary Сумма зарплаты.
     * @param <T>    Тип учителя (должен быть Teacher или его подклассом).
     */

    public <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " получил(-а)" + salary + " рублей");
    }

    /**
     * Вычисляет средний возраст для массива персон.
     *
     * @param persons Массив персон для вычисления среднего возраста.
     * @param <T>     Тип персоны (должен быть Person или его подклассом).
     * @return Средний возраст персон в массиве.
     * @throws IllegalArgumentException Если массив пуст или равен null.
     */
    public static <T extends Person> double averageAge(T[] persons) {
        if (persons == null || persons.length == 0) {
            throw new IllegalArgumentException("Массив равен null или пуст");
        }

        double sumAge = 0;

        for (T person : persons) {
            sumAge += person.getAge();
        }
        return sumAge / persons.length;
    }
}

