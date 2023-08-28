package JavaLabTestQuestion_2;

public class RobotSimulateRunner {
    public static void main(String[] args) {

        RobotSimulate robot = new RobotSimulate(1,0,"E");

        robot.turnLeft();
        robot.turnRight();
        robot.turnRight();
        robot.move(5,-4);

        System.out.println("final direction: " +robot.getDirection());
        System.out.println(robot.getLocation());
    }
}
