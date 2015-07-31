package ua.lesson3.www;

/**
 * Created by nshkarupa on 22.07.2015.
 */
public class Main {


    public static void info(int i){
        System.out.println("int");
    }

    public static  void info(short i){
        System.out.println("short");
    }
    public static  void info(long i){
        System.out.println("long");
    }

    public static  void info(Number i){
        System.out.println("Number");
    }


    public static void info(double i){
        System.out.println("double");
    }

    public static  void info(float i){
        System.out.println("float");
    }

    public static void main (String ... args){
            info(0.0);
    }


}
// транзитивность рефликтивность семитричность equals
// перегрузка методов екель
// sequences
//equls hashcode
//десереализация
//рефакторинг