package ua.lesson4.www.Strategy;


/**
 * Created by nshkarupa on 29.07.2015.
 */
public class Sorting {

    AbstractOperation operation = null;

    public Sorting (int operationId){
        switch (operationId){
            case 1: this.operation = new SortedByMax();
                break;
            case 2: this.operation = new SortedByMin();
                break;
            default: System.err.println("This operation is absent!");
        }

    }

    public void sorting(int[] ints){
        if(operation!=null){
            operation.sort(ints);
        }
        else return;
    }

}
