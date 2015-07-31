package ua.lesson4.www.Strategy;

/**
 * Created by nshkarupa on 29.07.2015.
 */
public class Main {

    public static void main(String [] args){

        int[] i = {5,4,6,1,8,7,9,2,0};

        Sorting sort1 = new Sorting(1);
        Sorting sort2 = new Sorting(2);
        sort1.sorting(i);
        sort2.sorting(i);

    }
}
