package ua.homework2.www;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class Cart<T> {
    private static Cart c;

    private Cart(){

    }

    public static Cart getInstatce(){
        if (c==null){
            return new Cart();
        } else return c;
    }

    private List<T> cart = new ArrayList<T>();


    @Override
    public String toString() {
        return "Cart" +  cart;
    }

    public List<T> getCart() {
        return cart;
    }

    public void setCart(List<T> cart) {
        this.cart = cart;
    }


    public int getCount(){
        return cart.size();
    }
    public double getTotalPrice(){
     return 0.0;
    }

    public Cart<T> addItem(T t){
        cart.add(t);
        return this;
    }


}
