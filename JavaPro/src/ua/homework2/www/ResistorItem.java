package ua.homework2.www;

import ua.homework1.www.EColors;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class ResistorItem extends AbstractItem {
    String squareChipType;
    String leadlessType;
    String radialType;
    String axialType;

    public ResistorItem(EItems name, String number, EColors color) {
        super(name, number, color);
    }

    public ResistorItem(EItems name, String number, EColors color, String squareChipType, String leadlessType, String radialType, String axialType) {
        super(name, number, color);
        this.squareChipType = squareChipType;
        this.leadlessType = leadlessType;
        this.radialType = radialType;
        this.axialType = axialType;
    }

    public String getSquareChipType() {
        return squareChipType;
    }

    public void setSquareChipType(String squareChipType) {
        this.squareChipType = squareChipType;
    }

    public String getLeadlessType() {
        return leadlessType;
    }

    public void setLeadlessType(String leadlessType) {
        this.leadlessType = leadlessType;
    }

    public String getRadialType() {
        return radialType;
    }

    public void setRadialType(String radialType) {
        this.radialType = radialType;
    }

    public String getAxialType() {
        return axialType;
    }

    public void setAxialType(String axialType) {
        this.axialType = axialType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "squareChipType='" + squareChipType + '\'' +
                ", leadlessType='" + leadlessType + '\'' +
                ", radialType='" + radialType + '\'' +
                ", axialType='" + axialType + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ResistorItem that = (ResistorItem) o;
        if (squareChipType != null ? !squareChipType.equals(that.squareChipType) : that.squareChipType != null)
            return false;
        if (leadlessType != null ? !leadlessType.equals(that.leadlessType) : that.leadlessType != null) return false;
        if (radialType != null ? !radialType.equals(that.radialType) : that.radialType != null) return false;
        return !(axialType != null ? !axialType.equals(that.axialType) : that.axialType != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (squareChipType != null ? squareChipType.hashCode() : 0);
        result = 31 * result + (leadlessType != null ? leadlessType.hashCode() : 0);
        result = 31 * result + (radialType != null ? radialType.hashCode() : 0);
        result = 31 * result + (axialType != null ? axialType.hashCode() : 0);
        return result;
    }
}
