package ua.lesson4.www.Decorator;

/**
 * Created by nshkarupa on 29.07.2015.
 */
public class AbstractDriverDecorator extends AbstractDriver {

    protected AbstractDriver driver;

    public AbstractDriverDecorator(AbstractDriver driver){
        this.driver = driver;
    }

    @Override
    public void dodo() {
        driver.dodo();
    }
}
