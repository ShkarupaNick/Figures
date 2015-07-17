package ua.lesson2.www;

import java.io.Serializable;

/**
 * Created by nshkarupa on 14.07.2015.
 */
public class Student implements Serializable {

    protected static String faculty;
    private String name;
    private int id;
    private String password;
    private static final long serialVersionUID = 1L;

    public  Student( String faculty,String name,int id,String password) {
        Student.faculty = faculty;
        this.id = id;
        this.name = name;
        this.password = password;
                   }


    @Override
    public String toString() {
        return "\nfaculty:" + faculty + "\nname: "+ faculty;
    }
}
