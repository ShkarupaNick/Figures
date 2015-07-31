package ua.lesson4.www.Decorator;

/**
 * Created by nshkarupa on 29.07.2015.
 */
public class CarDriverAndAgent extends  AbstractDriverDecorator
{

    public CarDriverAndAgent(AbstractDriver driver){
        super(driver);
    }

    public void dodo(){
        driver.dodo();
        addedBehaviorTwo();
    }

    public void addedBehaviorTwo(){
        System.out.println("I am a CarDriverAndAgent!!!");
    }


}
