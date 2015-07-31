package ua.homework2.www;

import ua.homework1.www.EColors;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class AbstractItem {
    protected String number;
    protected EItems name;
    protected EColors color;

    public AbstractItem(EItems name, String number, EColors color) {
        this.name = name;
        this.number = number;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public EItems getName() {
        return name;
    }

    public void setName(EItems name) {
        this.name = name;
    }


    public EColors getColor() {
        return color;
    }

    public void setColor(EColors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "number='" + number + '\'' +
                ", name=" + name +
                ", color=" + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractItem that = (AbstractItem) o;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (name != that.name) return false;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
