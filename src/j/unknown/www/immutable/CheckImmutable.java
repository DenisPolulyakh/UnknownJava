package j.unknown.www.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckImmutable {
    public static void main(String[] args) throws ParseException {
        Person person = new Person("Иван", new Date());
        Person1 person1 = new Person1("Игорь", new Date());
        //Если getBirthDate просто берется через геттер
        Date bd = person.getBirthDate();
        person.getBirthDate().setTime(123L);
        System.out.println(bd);
        System.out.println(person.getBirthDate());

        //Если getBirthDate создается новый объект на основе поля person1, тогда его нельзя изменить
        Date bd1 = person1.getBirthDate();
        person1.getBirthDate().setTime(123L);
        System.out.println(bd1);
        System.out.println(person1.getBirthDate());


    }

}
