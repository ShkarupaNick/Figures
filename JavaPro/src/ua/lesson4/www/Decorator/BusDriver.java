package ua.lesson4.www.Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nshkarupa on 29.07.2015.
 */
public class BusDriver extends  AbstractDriverDecorator{

    public BusDriver(AbstractDriver driver){
        super(driver);
    }

    public void dodo(){
        driver.dodo();
        addedBehaviorOne();
    }

    public void addedBehaviorOne(){
        System.out.println("I am a BusDriver!!!");
        List<ArrayList<String>> list= new ArrayList<ArrayList<String>>();
    }
}
