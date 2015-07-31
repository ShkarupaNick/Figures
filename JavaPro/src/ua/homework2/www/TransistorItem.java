package ua.homework2.www;

import ua.homework1.www.EColors;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class TransistorItem extends AbstractItem{

    String currentGain;
    String voltageGain;
    String signalPowerGain;

    public TransistorItem(EItems name, String number, EColors color){
        super(name, number, color);
    }

    public TransistorItem(EItems name, String number, EColors color, String currentGain, String voltageGain, String signalPowerGain) {
        super(name, number, color);
        this.currentGain = currentGain;
        this.voltageGain = voltageGain;
        this.signalPowerGain = signalPowerGain;
    }

    public String getCurrentGain() {
        return currentGain;
    }

    public void setCurrentGain(String currentGain) {
        this.currentGain = currentGain;
    }

    public String getVoltageGain() {
        return voltageGain;
    }

    public void setVoltageGain(String voltageGain) {
        this.voltageGain = voltageGain;
    }

    public String getSignalPowerGain() {
        return signalPowerGain;
    }

    public void setSignalPowerGain(String signalPowerGain) {
        this.signalPowerGain = signalPowerGain;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "currentGain='" + currentGain + '\'' +
                ", voltageGain='" + voltageGain + '\'' +
                ", signalPowerGain='" + signalPowerGain + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TransistorItem that = (TransistorItem) o;
        if (currentGain != null ? !currentGain.equals(that.currentGain) : that.currentGain != null) return false;
        if (voltageGain != null ? !voltageGain.equals(that.voltageGain) : that.voltageGain != null) return false;
        return !(signalPowerGain != null ? !signalPowerGain.equals(that.signalPowerGain) : that.signalPowerGain != null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (currentGain != null ? currentGain.hashCode() : 0);
        result = 31 * result + (voltageGain != null ? voltageGain.hashCode() : 0);
        result = 31 * result + (signalPowerGain != null ? signalPowerGain.hashCode() : 0);
        return result;
    }
}
