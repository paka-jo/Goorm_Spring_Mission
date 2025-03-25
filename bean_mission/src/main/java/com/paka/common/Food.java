package com.paka.common;

import java.util.Date;

public class Food extends Product{

    private java.util.Date ManufacturingDate;

    public Food() {super();}

    public Food(String name, int price, Date manufacturingDate) {
        super(name, price);
        this.ManufacturingDate = manufacturingDate;
    }

    public Date getManufacturingDate() {
        return ManufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        ManufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return super.toString() +" "+ ManufacturingDate;
    }
}
