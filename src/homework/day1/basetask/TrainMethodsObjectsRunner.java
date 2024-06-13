package homework.day1.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        Mouse stewartLittle = new Mouse("Стюарт", 5);
        Souce salsa = new Souce("Сальса", "красного");
        Bee regularBee = new Bee("Женский", 1);
        Obstacle crashOfCar = new Obstacle("поломка машины", "критический");
        Pineapple regularPineapple = new Pineapple("южный", 2139);

        trainMethodsObjects.processMouse(stewartLittle);
        trainMethodsObjects.processSouce(salsa);
        trainMethodsObjects.processBee(regularBee);
        trainMethodsObjects.processObstacle(crashOfCar);
        trainMethodsObjects.processPineapple(regularPineapple);
    }
}
