package ua.lesson2.www;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by nshkarupa on 14.07.2015.
 */
public class User implements Cloneable {

    private String name;
    private int age;
    private GregorianCalendar birthday;

    public String getBirthday() {
        birthday = new GregorianCalendar();
        return birthday.get(Calendar.DAY_OF_MONTH) + "." + birthday.get(Calendar.MONTH) + "." + birthday.get(Calendar.YEAR);
    }

    public void setBirthday(int day, int month, int year) {
        birthday = new GregorianCalendar();
        birthday.set(Calendar.DAY_OF_MONTH, day);
        birthday.set(Calendar.MONTH, month);
        birthday.set(Calendar.DAY_OF_MONTH, year);


        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User clone() throws CloneNotSupportedException {
        User clone = (User) User.super.clone();
        clone.birthday = (GregorianCalendar) birthday.clone();
        return clone;

    }


}
