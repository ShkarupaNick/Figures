package ua.homework2.www;

import ua.homework1.www.EColors;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class ItemFactory {
    public AbstractItem getInstatnce(EItems i, String num, EColors color ) {
        switch (i) {
            case CAPASITOR:
                return new CapasitorItem(i, num, color);
            case RESISTOR:
                return new ResistorItem(i, num,  color);
            case TRANSISTOR:
                return new TransistorItem(i, num, color);
            default:
                return new AbstractItem(i, num,  color);
        }
    }
}
