package workers;

public class Workersmain {
public static void main(String[] args) {
    HumanWorker person1 = new HumanWorker();
    person1.eat();
    person1.work();

    RobotWorker machine1 = new RobotWorker();
    machine1.work();
}
}
