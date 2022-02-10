package com.company;

import com.company.tech.Tech;
import com.company.tech.appliances.Appliances;
import com.company.tech.appliances.Fridge;
import com.company.tech.appliances.Washing;
import com.company.tech.miltaryEquipment.Gun;
import com.company.tech.miltaryEquipment.Miltaryequipment;
import com.company.tech.miltaryEquipment.Tank;
import com.company.tech.vehicles.Car;
import com.company.tech.vehicles.Truck;
import com.company.tech.vehicles.Vehicles;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Tech tech = new Car();
        Vehicles tech2 = new Car("red","right","Honda",LocalDate.of(2000,2,2),(byte)2000,"red","left");
        Car tech3 =  new Car();
        System.out.println(tech2);

        Tech truck1 = new Truck("Daf","105","pricep",LocalDate.of(2019,2,3),(byte)20000,"black","dizel" );
        Vehicles truck2 = new Truck();
        Truck truck3 = new Truck();
        System.out.println(truck1);

        Tech tank = new Tank();
        Miltaryequipment tank1 = new Tank();
        Tank tank2 = new Tank("T20", "Fast tank","T12",LocalDate.of(1970,1,2),(byte)2800,"tire","strong tank");
        System.out.println(tank2);

        Tech gun = new Gun();
        Miltaryequipment gun1 = new Gun("Makarov","p12","its greatly gun",LocalDate.of(2018,9,16),(byte) 2000,"12","12ok");
        Gun gun2 = new Gun();
        System.out.println(gun1);

        Tech washing = new Washing();
        Appliances washing1 = new Washing();
        Washing washing2 = new Washing("LG","1200","very expencive",LocalDate.of(2019,9,8),(byte)15000,"A123" );
        System.out.println(washing2);

        Tech fridge = new Fridge();
        Appliances fridge1 = new Fridge();
        Fridge fridge2 = new Fridge("Samsung","s2020","cheap fridge",LocalDate.of(2020,2,3),(byte)2000,"1212","Fridge with freezer");
        System.out.println(fridge2);
    }
}
