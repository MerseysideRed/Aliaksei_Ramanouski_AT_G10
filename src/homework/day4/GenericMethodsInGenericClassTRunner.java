package homework.day4;

import homework.day3.playground.essence.Matter;
import homework.day3.playground.essence.craft.air.Aircraft;
import homework.day3.playground.essence.craft.air.Copter;
import homework.day3.playground.essence.craft.air.Plane;
import homework.day3.playground.essence.craft.air.Rocket;
import homework.day3.playground.essence.craft.field.Car;
import homework.day3.playground.essence.craft.field.Moped;
import homework.day3.playground.essence.craft.field.Motorbike;
import homework.day3.playground.essence.craft.field.Vehicle;
import homework.day3.playground.essence.craft.hand.Bottle;
import homework.day3.playground.essence.craft.hand.Can;
import homework.day3.playground.essence.craft.hand.Container;
import homework.day3.playground.essence.craft.hand.Mug;
import homework.day3.playground.essence.creatures.*;
import homework.day3.playground.essence.material.Diesel;
import homework.day3.playground.essence.material.Petrol;
import homework.day3.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> genericString = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> genericInteger = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> genericDouble = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Aircraft> aircraft = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copter = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> plane = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocket = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> car = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> moped = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbike = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> vehicle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> can = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> container = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mug = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Animal> animal = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrot = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flower> flower = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> fly = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Insect> insect = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylily = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquito = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeon = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plant> plant = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potato = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radish = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> raven = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> rose = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vegetable> vegetable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vertebrata> vertebrate = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Matter> matter = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> diesel = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrol = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> water = new GenericMethodsInGenericClassT<>();

        genericString.genericMethodHalfGenArgs("bugaga", "bugaga");
        System.out.println(genericString.genericMethodTwoGenArgs("bugaga", "bugaga"));
        genericString.genericMethodOneGenArg("bugaga");

        genericInteger.genericMethodHalfGenArgs(1, "bugaga");
        System.out.println(genericInteger.genericMethodTwoGenArgs(10, 20));
        genericInteger.genericMethodOneGenArg(1000);

        genericDouble.genericMethodHalfGenArgs(1.0, "bugaga");
        System.out.println(genericDouble.genericMethodTwoGenArgs(10.7, 20.6));
        genericDouble.genericMethodOneGenArg(1000.0);

        Copter originalCopter = new Copter(1, "K-52");
        Plane originalPlane = new Plane(1, "Boeing");
        aircraft.genericMethodOneGenArg(originalCopter);
        System.out.println(aircraft.genericMethodTwoGenArgs(originalCopter, originalPlane));
        aircraft.genericMethodHalfGenArgs(originalPlane, "bugagaaa");

        copter.genericMethodHalfGenArgs(originalCopter, "bugagag");
        System.out.println(copter.genericMethodTwoGenArgs(originalCopter, originalCopter));
        copter.genericMethodOneGenArg(originalCopter);

        plane.genericMethodHalfGenArgs(originalPlane, "bugagag");
        System.out.println(plane.genericMethodTwoGenArgs(originalPlane, originalPlane));
        plane.genericMethodOneGenArg(originalPlane);

        Rocket originalRocket = new Rocket(12000, "Star");
        rocket.genericMethodHalfGenArgs(originalRocket, "bugagag");
        System.out.println(rocket.genericMethodTwoGenArgs(originalRocket, originalRocket));
        rocket.genericMethodOneGenArg(originalRocket);

        Car originalCar = new Car(12000, "Star");
        Moped originalMoped = new Moped(60, "CX34556");
        vehicle.genericMethodHalfGenArgs(originalCar, "bugagag");
        System.out.println(vehicle.genericMethodTwoGenArgs(originalMoped, originalCar));
        vehicle.genericMethodOneGenArg(originalMoped);

        car.genericMethodHalfGenArgs(originalCar, "bugagag");
        System.out.println(car.genericMethodTwoGenArgs(originalCar, originalCar));
        car.genericMethodOneGenArg(originalCar);

        moped.genericMethodHalfGenArgs(originalMoped, "bugagag");
        System.out.println(moped.genericMethodTwoGenArgs(originalMoped, originalMoped));
        moped.genericMethodOneGenArg(originalMoped);

        Motorbike originalMotorbike = new Motorbike(20, "FG456783");
        motorbike.genericMethodHalfGenArgs(originalMotorbike, "bugagag");
        System.out.println(motorbike.genericMethodTwoGenArgs(originalMotorbike, originalMotorbike));
        motorbike.genericMethodOneGenArg(originalMotorbike);

        Beetle originalBeetle = new Beetle(1, "Crawler");
        Fly originalFly = new Fly(1, "Zekatuha");
        animal.genericMethodHalfGenArgs(originalBeetle, "bugagag");
        System.out.println(animal.genericMethodTwoGenArgs(originalBeetle, originalFly));
        animal.genericMethodOneGenArg(originalFly);

        beetle.genericMethodHalfGenArgs(originalBeetle, "bugagag");
        System.out.println(beetle.genericMethodTwoGenArgs(originalBeetle, originalBeetle));
        beetle.genericMethodOneGenArg(originalBeetle);

        Carrot originalCarrot = new Carrot(1);
        carrot.genericMethodHalfGenArgs(originalCarrot, "bugagag");
        System.out.println(carrot.genericMethodTwoGenArgs(originalCarrot, originalCarrot));
        carrot.genericMethodOneGenArg(originalCarrot);

        Chamomile originalChamomile = new Chamomile(1);
        chamomile.genericMethodHalfGenArgs(originalChamomile, "bugagag");
        System.out.println(chamomile.genericMethodTwoGenArgs(originalChamomile, originalChamomile));
        chamomile.genericMethodOneGenArg(originalChamomile);

        Crocodile originalCrocodile = new Crocodile(25, "Croc");
        crocodile.genericMethodHalfGenArgs(originalCrocodile, "bugagag");
        System.out.println(crocodile.genericMethodTwoGenArgs(originalCrocodile, originalCrocodile));
        crocodile.genericMethodOneGenArg(originalCrocodile);

        flower.genericMethodHalfGenArgs(originalChamomile, "bugagag");
        System.out.println(flower.genericMethodTwoGenArgs(originalChamomile, originalChamomile));
        flower.genericMethodOneGenArg(originalChamomile);

        fly.genericMethodHalfGenArgs(originalFly, "bugagag");
        System.out.println(fly.genericMethodTwoGenArgs(originalFly, originalFly));
        fly.genericMethodOneGenArg(originalFly);

        insect.genericMethodHalfGenArgs(originalBeetle, "bugagag");
        System.out.println(insect.genericMethodTwoGenArgs(originalBeetle, originalFly));
        insect.genericMethodOneGenArg(originalFly);

        Maylily originalMaylily = new Maylily(1);
        maylily.genericMethodHalfGenArgs(originalMaylily, "bugagag");
        System.out.println(maylily.genericMethodTwoGenArgs(originalMaylily, originalMaylily));
        maylily.genericMethodOneGenArg(originalMaylily);

        Mosquito originalMosquito = new Mosquito(1, "Blood Hunter");
        mosquito.genericMethodHalfGenArgs(originalMosquito, "bugagag");
        System.out.println(mosquito.genericMethodTwoGenArgs(originalMosquito, originalMosquito));
        mosquito.genericMethodOneGenArg(originalMosquito);

        Pigeon originalPigeon = new Pigeon(1, "Blood Hunter");
        pigeon.genericMethodHalfGenArgs(originalPigeon, "bugagag");
        System.out.println(pigeon.genericMethodTwoGenArgs(originalPigeon, originalPigeon));
        pigeon.genericMethodOneGenArg(originalPigeon);

        plant.genericMethodHalfGenArgs(originalMaylily, "bugagag");
        System.out.println(plant.genericMethodTwoGenArgs(originalChamomile, originalMaylily));
        plant.genericMethodOneGenArg(originalChamomile);

        Potato originalPotato = new Potato(1);
        potato.genericMethodHalfGenArgs(originalPotato, "bugagag");
        System.out.println(potato.genericMethodTwoGenArgs(originalPotato, originalPotato));
        potato.genericMethodOneGenArg(originalPotato);

        Radish originalRadish = new Radish(1);
        radish.genericMethodHalfGenArgs(originalRadish, "bugagag");
        System.out.println(radish.genericMethodTwoGenArgs(originalRadish, originalRadish));
        radish.genericMethodOneGenArg(originalRadish);

        Raven originalRaven = new Raven(1, "Kesha");
        raven.genericMethodHalfGenArgs(originalRaven, "bugagag");
        System.out.println(raven.genericMethodTwoGenArgs(originalRaven, originalRaven));
        raven.genericMethodOneGenArg(originalRaven);

        Rose originalRose = new Rose(1);
        rose.genericMethodHalfGenArgs(originalRose, "bugagag");
        System.out.println(rose.genericMethodTwoGenArgs(originalRose, originalRose));
        rose.genericMethodOneGenArg(originalRose);

        vegetable.genericMethodHalfGenArgs(originalRadish, "bugagag");
        System.out.println(vegetable.genericMethodTwoGenArgs(originalPotato, originalCarrot));
        vegetable.genericMethodOneGenArg(originalRadish);

        vertebrate.genericMethodHalfGenArgs(originalRaven, "bugagag");
        System.out.println(vertebrate.genericMethodTwoGenArgs(originalPigeon, originalCrocodile));
        vertebrate.genericMethodOneGenArg(originalPigeon);

        Diesel originalDiesel = new Diesel(1);
        diesel.genericMethodHalfGenArgs(originalDiesel, "bugagag");
        System.out.println(diesel.genericMethodTwoGenArgs(originalDiesel, originalDiesel));
        diesel.genericMethodOneGenArg(originalDiesel);

        Petrol originalPetrol = new Petrol(1);
        petrol.genericMethodHalfGenArgs(originalPetrol, "bugagag");
        System.out.println(petrol.genericMethodTwoGenArgs(originalPetrol, originalPetrol));
        petrol.genericMethodOneGenArg(originalPetrol);

        Water originalWater = new Water(1);
        water.genericMethodHalfGenArgs(originalWater, "bugagag");
        System.out.println(water.genericMethodTwoGenArgs(originalWater, originalWater));
        water.genericMethodOneGenArg(originalWater);

        matter.genericMethodHalfGenArgs(originalWater, "bugagag");
        System.out.println(matter.genericMethodTwoGenArgs(originalPetrol, originalDiesel));
        matter.genericMethodOneGenArg(originalRaven);

        Bottle originalBottle = new Bottle(1, "bottle");
        bottle.genericMethodHalfGenArgs(originalBottle, "bugagag");
        System.out.println(bottle.genericMethodTwoGenArgs(originalBottle, originalBottle));
        bottle.genericMethodOneGenArg(originalBottle);

        Can originalCan = new Can(1, "Can");
        can.genericMethodHalfGenArgs(originalCan, "bugagag");
        System.out.println(can.genericMethodTwoGenArgs(originalCan, originalCan));
        can.genericMethodOneGenArg(originalCan);

        Mug originalMug = new Mug(1, "Mug");
        mug.genericMethodHalfGenArgs(originalMug, "bugagag");
        System.out.println(mug.genericMethodTwoGenArgs(originalMug, originalMug));
        mug.genericMethodOneGenArg(originalMug);

        container.genericMethodHalfGenArgs(originalMug, "bugagag");
        System.out.println(container.genericMethodTwoGenArgs(originalCan, originalBottle));
        container.genericMethodOneGenArg(originalMug);
    }
}
