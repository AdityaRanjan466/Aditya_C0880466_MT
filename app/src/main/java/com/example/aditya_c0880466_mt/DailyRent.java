package com.example.aditya_c0880466_mt;

import java.util.ArrayList;

public class DailyRent {
    public static class Data {
        public String _Name;
        public double _Rent;
        Data(String name, double rent) {
            _Name = name;
            _Rent = rent;
        }
    }
    public static ArrayList<Data> CarList = new ArrayList<>();
    public static void initList() {
        Data ChooseACar = new Data("Select", 00.00);
        Data BMW = new Data("BMW", 200.00);
        Data Audi = new Data("Audi", 190.00);
        Data Cadillac = new Data("Cadillac", 180.00);
        Data VolksWagon = new Data("Volks Wagon", 150.00);
        Data Mercedes = new Data("Mercedes", 220.00);
        Data Peugeot = new Data("Peugeot", 175.00);
        Data Ford = new Data("Ford", 150.00);
        CarList.add(ChooseACar);
        CarList.add(BMW);
        CarList.add(Audi);
        CarList.add(Cadillac);
        CarList.add(VolksWagon);
        CarList.add(Mercedes);
        CarList.add(Peugeot);
        CarList.add(Ford);
    }
    public static int getIndex(String itemName) {
        int i = 0;
        for(Data data : CarList) {
            if(data._Name.equals(itemName)) {
                return i;
            } i++;
        }
        return -1;
    }

    public static double getPrice(int index) {
        return CarList.get(index)._Rent;
    }
}
