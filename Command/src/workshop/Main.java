package workshop;

import workshop.Robot;
import workshop.WorkshopApp;
import workshop.command.RobotCutCommand;
import workshop.command.RobotDrillCommand;
import workshop.command.RobotTurnOffCommand;
import workshop.command.RobotTurnOnCommand;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();

        workshopApp.AddToQueue(new RobotTurnOnCommand(robot));
        workshopApp.AddToQueue(new RobotCutCommand(robot));
        workshopApp.AddToQueue(new RobotDrillCommand(robot));
        workshopApp.AddToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();

        workshopApp.undoLastCommand();

    }
}
