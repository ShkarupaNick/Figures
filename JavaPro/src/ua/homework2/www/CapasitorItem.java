package ua.homework2.www;

import ua.homework1.www.EColors;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class CapasitorItem extends AbstractItem{
    String nominalCapacitance;
    String workingVoltage;

    public CapasitorItem(EItems name, String number, EColors color) {
        super(name, number, color);
    }

    public CapasitorItem(EItems name, String number, EColors color, String nominalCapacitance, String workingVoltage, String workingTemperature) {
        super(name, number, color);
        this.nominalCapacitance  = nominalCapacitance;
        this.workingVoltage      = workingVoltage;
        this.workingTemperature  = workingTemperature;
    }

    public String getNominalCapacitance() {
        return nominalCapacitance;
    }

    public void setNominalCapacitance(String nominalCapacitance) {
        this.nominalCapacitance = nominalCapacitance;
    }

    public String getWorkingVoltage() {
        return workingVoltage;
    }

    public void setWorkingVoltage(String workingVoltage) {
        this.workingVoltage = workingVoltage;
    }

    public String getWorkingTemperature() {
        return workingTemperature;
    }

    public void setWorkingTemperature(String workingTemperature) {
        this.workingTemperature = workingTemperature;
    }

    String workingTemperature;




    @Override
    public String toString() {
        return "{" + super.toString()+
                "nominalCapacitance='" + nominalCapacitance + '\'' +
                ", workingVoltage='" + workingVoltage + '\'' +
                ", workingTemperature='" + workingTemperature + '\'' +
                "} ";
    }
}
