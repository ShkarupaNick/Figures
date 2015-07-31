package ua.homework2.www;

import ua.homework1.www.EColors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class OperationController {
    EOperation otype;
    List<ArrayList<String>> reqItems;
    List<AbstractItem> items = new ArrayList<AbstractItem>();

    public OperationController(List<ArrayList<String>> reqItems, EOperation otype) {
        this.reqItems = reqItems;
        this.otype = otype;
        createItems();
    }

  /*  public void makeOperation(Cart<AbstractItem> cart){

            switch(otype){
                case ADD:
                    break;
                case REM:
                    break;
        }*/

    private void createItems() {
        ItemFactory f = new ItemFactory();
        for (ArrayList<String> l : reqItems) {
            for (int i = 0; i < Integer.parseInt(l.get(3)); i++) {
                items.add(f.getInstatnce(EItems.valueOf(l.get(0)), l.get(1), EColors.valueOf(l.get(2))));
            }
        }
    }
}

