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

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, Integer> genericStringInteger = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, String> genericIntegerString = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Double, Integer> genericDoubleInteger = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Aircraft, Copter> aircraftCopter = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Plane> copterPlane = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Rocket> planeRocket = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Car> rocketCar = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Moped> carMoped = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> mopedMotorbike = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Vehicle> motorbikeVehicle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vehicle, Bottle> vehicleBottle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> bottleCan = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Can, Container> canContainer = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Container, Mug> containerMug = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Animal> mugAnimal = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Animal, Beetle> animalBeetle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Carrot> beetleCarrot = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> carrotChamomile = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Chamomile, Crocodile> chamomileCrocodile = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Flower> crocodileFlower = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Flower, Fly> flowerFly = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Insect> flyInsect = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Insect, Maylily> insectMaylily = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> maylilyMosquito = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mosquito, Pigeon> mosquitoPigeon = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Plant> pigeonPlant = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plant, Potato> plantPotato = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Potato, Radish> potatoRadish = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> radishRaven = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Raven, Rose> ravenRose = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Vegetable> roseVegetable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vegetable, Vertebrata> vegetableVertebrata = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vertebrata, Matter> vertebrateMatter = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Matter, Diesel> matterDiesel = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Diesel, Petrol> dieselPetrol = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Petrol, Water> petrolWater = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Water, Petrol> waterPetrol = new GenericMethodsInGenericClassTwoParams<>();

        Copter originalCopter = new Copter(1, "K-52");
        Plane originalPlane = new Plane(1, "Boeing");
        Rocket originalRocket = new Rocket(12000, "Star");
        Car originalCar = new Car(12000, "Star");
        Moped originalMoped = new Moped(60, "CX34556");
        Motorbike originalMotorbike = new Motorbike(20, "FG456783");
        Beetle originalBeetle = new Beetle(1, "Crawler");
        Fly originalFly = new Fly(1, "Zekatuha");
        Carrot originalCarrot = new Carrot(1);
        Chamomile originalChamomile = new Chamomile(1);
        Crocodile originalCrocodile = new Crocodile(25, "Croc");
        Maylily originalMaylily = new Maylily(1);
        Mosquito originalMosquito = new Mosquito(1, "Blood Hunter");
        Pigeon originalPigeon = new Pigeon(1, "Blood Hunter");
        Potato originalPotato = new Potato(1);
        Radish originalRadish = new Radish(1);
        Raven originalRaven = new Raven(1, "Kesha");
        Rose originalRose = new Rose(1);
        Diesel originalDiesel = new Diesel(1);
        Petrol originalPetrol = new Petrol(1);
        Water originalWater = new Water(1);
        Bottle originalBottle = new Bottle(1, "bottleCan");
        Can originalCan = new Can(1, "Can");
        Mug originalMug = new Mug(1, "Mug");

        genericStringInteger.genericMethodHalfGenArgs("bugaga", "bugaga");
        genericStringInteger.genericMethodHalfGenArgs("bugaga", 12, "string");
        System.out.println(genericStringInteger.genericMethodGenArgs("bugaga", 12));
        System.out.println(genericStringInteger.genericMethodGenArgs("bugaga"));

        genericIntegerString.genericMethodHalfGenArgs(12, "bugaga");
        genericIntegerString.genericMethodHalfGenArgs(1, "bugaga", "bugaga");
        System.out.println(genericIntegerString.genericMethodGenArgs(10));
        System.out.println(genericIntegerString.genericMethodGenArgs(1000, "String"));

        genericDoubleInteger.genericMethodHalfGenArgs(1.0, "bugaga");
        genericDoubleInteger.genericMethodHalfGenArgs(1.0, 12, "bugaga");
        System.out.println(genericDoubleInteger.genericMethodGenArgs(10.7));
        System.out.println(genericDoubleInteger.genericMethodGenArgs(1000.0, 12));

        aircraftCopter.genericMethodHalfGenArgs(originalCopter, "bugaga");
        aircraftCopter.genericMethodHalfGenArgs(originalPlane, originalCopter, "bugaga");
        System.out.println(aircraftCopter.genericMethodGenArgs(originalRocket));
        System.out.println(aircraftCopter.genericMethodGenArgs(originalPlane, originalCopter));

        copterPlane.genericMethodGenArgs(originalCopter);
        copterPlane.genericMethodHalfGenArgs(originalCopter, "bugagag");
        System.out.println(copterPlane.genericMethodGenArgs(originalCopter));
        System.out.println(copterPlane.genericMethodGenArgs(originalCopter, originalPlane));

        planeRocket.genericMethodHalfGenArgs(originalPlane, "bugagag");
        planeRocket.genericMethodHalfGenArgs(originalPlane, originalRocket, "bugagag");
        System.out.println(planeRocket.genericMethodGenArgs(originalPlane));
        System.out.println(planeRocket.genericMethodGenArgs(originalPlane, originalRocket));

        rocketCar.genericMethodHalfGenArgs(originalRocket, "bugagag");
        rocketCar.genericMethodHalfGenArgs(originalRocket, originalCar, "bugagag");
        System.out.println(rocketCar.genericMethodGenArgs(originalRocket));
        System.out.println(rocketCar.genericMethodGenArgs(originalRocket, originalCar));

        vehicleBottle.genericMethodHalfGenArgs(originalCar, "bugaga");
        vehicleBottle.genericMethodHalfGenArgs(originalCar, originalBottle, "bugagag");
        System.out.println(vehicleBottle.genericMethodGenArgs(originalMoped));
        System.out.println(vehicleBottle.genericMethodGenArgs(originalMoped, originalBottle));

        carMoped.genericMethodHalfGenArgs(originalCar, "bugagag");
        carMoped.genericMethodHalfGenArgs(originalCar, originalMoped, "bugagag");
        System.out.println(carMoped.genericMethodGenArgs(originalCar));
        System.out.println(carMoped.genericMethodGenArgs(originalCar, originalMoped));

        mopedMotorbike.genericMethodHalfGenArgs(originalMoped, "bugagag");
        mopedMotorbike.genericMethodHalfGenArgs(originalMoped, originalMotorbike, "bugagag");
        System.out.println(mopedMotorbike.genericMethodGenArgs(originalMoped));
        System.out.println(mopedMotorbike.genericMethodGenArgs(originalMoped, originalMotorbike));

        motorbikeVehicle.genericMethodHalfGenArgs(originalMotorbike, "bugagag");
        motorbikeVehicle.genericMethodHalfGenArgs(originalMotorbike, originalCar, "bugagag");
        System.out.println(motorbikeVehicle.genericMethodGenArgs(originalMotorbike));
        System.out.println(motorbikeVehicle.genericMethodGenArgs(originalMotorbike, originalMoped));

        animalBeetle.genericMethodHalfGenArgs(originalBeetle, "bugagag");
        animalBeetle.genericMethodHalfGenArgs(originalRaven, originalBeetle, "bugagag");
        System.out.println(animalBeetle.genericMethodGenArgs(originalBeetle));
        System.out.println(animalBeetle.genericMethodGenArgs(originalCrocodile, originalBeetle));

        beetleCarrot.genericMethodHalfGenArgs(originalBeetle, "bugagag");
        beetleCarrot.genericMethodHalfGenArgs(originalBeetle, originalCarrot, "bugagag");
        System.out.println(beetleCarrot.genericMethodGenArgs(originalBeetle));
        System.out.println(beetleCarrot.genericMethodGenArgs(originalBeetle, originalCarrot));

        carrotChamomile.genericMethodHalfGenArgs(originalCarrot, "bugagag");
        carrotChamomile.genericMethodHalfGenArgs(originalCarrot, originalChamomile, "bugagag");
        System.out.println(carrotChamomile.genericMethodGenArgs(originalCarrot));
        System.out.println(carrotChamomile.genericMethodGenArgs(originalCarrot, originalChamomile));

        chamomileCrocodile.genericMethodHalfGenArgs(originalChamomile, "bugagag");
        chamomileCrocodile.genericMethodHalfGenArgs(originalChamomile, originalCrocodile, "bugagag");
        System.out.println(chamomileCrocodile.genericMethodGenArgs(originalChamomile));
        System.out.println(chamomileCrocodile.genericMethodGenArgs(originalChamomile, originalCrocodile));

        crocodileFlower.genericMethodHalfGenArgs(originalCrocodile, "bugagag");
        crocodileFlower.genericMethodHalfGenArgs(originalCrocodile, originalRose, "bugagag");
        System.out.println(crocodileFlower.genericMethodGenArgs(originalCrocodile, originalChamomile));
        System.out.println(crocodileFlower.genericMethodGenArgs(originalCrocodile, originalMaylily));

        flowerFly.genericMethodHalfGenArgs(originalChamomile, "bugagag");
        flowerFly.genericMethodHalfGenArgs(originalChamomile, originalFly, "bugagag");
        System.out.println(flowerFly.genericMethodGenArgs(originalChamomile));
        System.out.println(flowerFly.genericMethodGenArgs(originalChamomile, originalFly));

        flyInsect.genericMethodHalfGenArgs(originalFly, "bugagag");
        flyInsect.genericMethodHalfGenArgs(originalFly, originalMosquito, "bugagag");
        System.out.println(flyInsect.genericMethodGenArgs(originalFly));
        System.out.println(flyInsect.genericMethodGenArgs(originalFly, originalBeetle));

        insectMaylily.genericMethodHalfGenArgs(originalBeetle, "bugagag");
        insectMaylily.genericMethodHalfGenArgs(originalFly, originalMaylily, "bugagag");
        System.out.println(insectMaylily.genericMethodGenArgs(originalMosquito));
        System.out.println(insectMaylily.genericMethodGenArgs(originalBeetle, originalMaylily));

        maylilyMosquito.genericMethodHalfGenArgs(originalMaylily, "bugagag");
        maylilyMosquito.genericMethodHalfGenArgs(originalMaylily, originalMosquito, "bugagag");
        System.out.println(maylilyMosquito.genericMethodGenArgs(originalMaylily));
        System.out.println(maylilyMosquito.genericMethodGenArgs(originalMaylily, originalMosquito));

        mosquitoPigeon.genericMethodHalfGenArgs(originalMosquito, "bugagag");
        mosquitoPigeon.genericMethodHalfGenArgs(originalMosquito, originalPigeon, "bugagag");
        System.out.println(mosquitoPigeon.genericMethodGenArgs(originalMosquito));
        System.out.println(mosquitoPigeon.genericMethodGenArgs(originalMosquito, originalPigeon));

        pigeonPlant.genericMethodHalfGenArgs(originalPigeon, "bugagag");
        pigeonPlant.genericMethodHalfGenArgs(originalPigeon, originalCarrot, "bugagag");
        System.out.println(pigeonPlant.genericMethodGenArgs(originalPigeon));
        System.out.println(pigeonPlant.genericMethodGenArgs(originalPigeon, originalRadish));

        plantPotato.genericMethodHalfGenArgs(originalRadish, "bugagag");
        plantPotato.genericMethodHalfGenArgs(originalMaylily, originalPotato, "bugagag");
        System.out.println(plantPotato.genericMethodGenArgs(originalChamomile));
        System.out.println(plantPotato.genericMethodGenArgs(originalChamomile, originalPotato));

        potatoRadish.genericMethodHalfGenArgs(originalPotato, "bugagag");
        potatoRadish.genericMethodHalfGenArgs(originalPotato, originalRadish, "bugagag");
        System.out.println(potatoRadish.genericMethodGenArgs(originalPotato));
        System.out.println(potatoRadish.genericMethodGenArgs(originalPotato, originalRadish));

        radishRaven.genericMethodHalfGenArgs(originalRadish, "bugagag");
        radishRaven.genericMethodHalfGenArgs(originalRadish, originalRaven, "bugagag");
        System.out.println(radishRaven.genericMethodGenArgs(originalRadish));
        System.out.println(radishRaven.genericMethodGenArgs(originalRadish, originalRaven));

        ravenRose.genericMethodHalfGenArgs(originalRaven, "bugagag");
        ravenRose.genericMethodHalfGenArgs(originalRaven, originalRose, "bugagag");
        System.out.println(ravenRose.genericMethodGenArgs(originalRaven));
        System.out.println(ravenRose.genericMethodGenArgs(originalRaven, originalRose));

        roseVegetable.genericMethodHalfGenArgs(originalRose, "bugagag");
        roseVegetable.genericMethodHalfGenArgs(originalRose, originalPotato, "bugagag");
        System.out.println(roseVegetable.genericMethodGenArgs(originalRose));
        System.out.println(roseVegetable.genericMethodGenArgs(originalRose, originalCarrot));

        vegetableVertebrata.genericMethodHalfGenArgs(originalRadish, "bugagag");
        vegetableVertebrata.genericMethodHalfGenArgs(originalCarrot, originalPigeon, "bugagag");
        System.out.println(vegetableVertebrata.genericMethodGenArgs(originalPotato));
        System.out.println(vegetableVertebrata.genericMethodGenArgs(originalPotato, originalCrocodile));

        vertebrateMatter.genericMethodHalfGenArgs(originalRaven, "bugagag");
        vertebrateMatter.genericMethodHalfGenArgs(originalRaven, "bugagag");
        System.out.println(vertebrateMatter.genericMethodGenArgs(originalPigeon, originalCrocodile));
        System.out.println(vertebrateMatter.genericMethodGenArgs(originalPigeon, originalCrocodile));

        dieselPetrol.genericMethodHalfGenArgs(originalDiesel, "bugagag");
        dieselPetrol.genericMethodHalfGenArgs(originalDiesel, originalPetrol, "bugagag");
        System.out.println(dieselPetrol.genericMethodGenArgs(originalDiesel));
        System.out.println(dieselPetrol.genericMethodGenArgs(originalDiesel, originalPetrol));

        petrolWater.genericMethodHalfGenArgs(originalPetrol, "bugagag");
        petrolWater.genericMethodHalfGenArgs(originalPetrol, originalWater, "bugagag");
        System.out.println(petrolWater.genericMethodGenArgs(originalPetrol));
        System.out.println(petrolWater.genericMethodGenArgs(originalPetrol, originalWater));

        waterPetrol.genericMethodHalfGenArgs(originalWater, "bugagag");
        waterPetrol.genericMethodHalfGenArgs(originalWater, originalPetrol, "bugagag");
        System.out.println(waterPetrol.genericMethodGenArgs(originalWater));
        System.out.println(waterPetrol.genericMethodGenArgs(originalWater, originalPetrol));

        matterDiesel.genericMethodHalfGenArgs(originalWater, "bugagag");
        matterDiesel.genericMethodHalfGenArgs(originalRaven, originalDiesel, "bugagag");
        System.out.println(matterDiesel.genericMethodGenArgs(originalCarrot));
        System.out.println(matterDiesel.genericMethodGenArgs(originalRaven, originalDiesel));

        bottleCan.genericMethodHalfGenArgs(originalBottle, "bugagag");
        bottleCan.genericMethodHalfGenArgs(originalBottle, originalCan, "bugagag");
        System.out.println(bottleCan.genericMethodGenArgs(originalBottle));
        System.out.println(bottleCan.genericMethodGenArgs(originalBottle, originalCan));

        canContainer.genericMethodHalfGenArgs(originalCan, "bugagag");
        canContainer.genericMethodHalfGenArgs(originalCan, originalBottle, "bugagag");
        System.out.println(canContainer.genericMethodGenArgs(originalCan));
        System.out.println(canContainer.genericMethodGenArgs(originalCan, originalMug));

        mugAnimal.genericMethodHalfGenArgs(originalMug, "bugagag");
        mugAnimal.genericMethodHalfGenArgs(originalMug, originalPigeon, "bugagag");
        System.out.println(mugAnimal.genericMethodGenArgs(originalMug));
        System.out.println(mugAnimal.genericMethodGenArgs(originalMug, originalFly));

        containerMug.genericMethodHalfGenArgs(originalBottle, "bugagag");
        containerMug.genericMethodHalfGenArgs(originalMug, originalMug, "bugagag");
        System.out.println(containerMug.genericMethodGenArgs(originalBottle));
        System.out.println(containerMug.genericMethodGenArgs(originalCan, originalMug));
    }
}
