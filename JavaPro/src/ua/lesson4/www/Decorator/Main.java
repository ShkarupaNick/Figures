package ua.lesson4.www.Decorator;

/**
 * Created by nshkarupa on 29.07.2015.
 */
public class Main {

    public static void main(String ... args){
        AbstractDriver carDriver = new CarDriver();
        Main runner = new Main();
        runner.dodoDrive(new BusDriver(carDriver));
        runner.dodoDrive(new CarDriverAndAgent(carDriver));
    }

    public void dodoDrive(AbstractDriver driver){
        driver.dodo();
    }
}
