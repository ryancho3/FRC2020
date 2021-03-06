package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI {

	Joystick leftStick = RobotMap.leftJoystick;
	Joystick rightStick = RobotMap.rightJoystick;
	XboxController xbox = RobotMap.xboxController;

	boolean grabberState = true;

	Button leftbutton1 = new JoystickButton(leftStick, 1), leftbutton2 = new JoystickButton(leftStick, 2);
	Button leftbutton3 = new JoystickButton(leftStick, 3), leftbutton4 = new JoystickButton(leftStick, 4);
	Button leftbutton5 = new JoystickButton(leftStick, 5), leftbutton6 = new JoystickButton(leftStick, 6);
	Button rightbutton1 = new JoystickButton(rightStick, 1), rightbutton2 = new JoystickButton(rightStick, 2);
	Button rightbutton3 = new JoystickButton(rightStick, 3), rightbutton4 = new JoystickButton(rightStick, 4);
	Button rightbutton5 = new JoystickButton(rightStick, 5), rightbutton6 = new JoystickButton(rightStick, 6);

	// kA = 1, kB = 2, kX = 3, kY = 4,
	// A-Button to increase, Y-Button to decrease shooter speed
	Button decreaseShooterSpeed = new JoystickButton(xbox, 1);
	Button increaseShooterSpeed = new JoystickButton(xbox, 4);

	// X and B for control panel spin (counterclockwise/clockwise)

	Button controlPanelClockwise = new JoystickButton(xbox, 3);
	Button controlPanelCounterclockwise = new JoystickButton(xbox, 4);

	// Gets the pressed xbox bumper (Used in MoveShoulder command)
	// 0 no bumper; 1 left bumper; 2 right bumper

	public double getLeftSpeed() {
		if (leftStick.getY() > 0.1 || leftStick.getY() < -0.1) {
			return leftStick.getY();
		} else {
			return 0.0;
		}
	}

	public double getRightSpeed() {
		if (rightStick.getY() > 0.1 || rightStick.getY() < -0.1) {
			return -1.0 * rightStick.getY();
		} else {
			return 0.0;
		}
	}

	public boolean grabberState() {
		if (grabberState == false) {
			grabberState = true;
			return true;
		} else {
			grabberState = false;
			return false;
		}
	}
}

// extra example code if needed
/*
 * 
 * //Gets the pressed xbox bumper (Used in MoveShoulder command) //0 no bumper;
 * 1 left bumper; 2 right bumper public int getBumpers(){ if (leftBumper.get()){
 * return 1; } else if (rightBumper.get()){ return 2; } else{ return 0; } }
 * 
 * //Not the actual speed of the elevator //Gets inputs from the xbox sticks
 * public double getElevatorSpeed() { if (xbox.getRawAxis(5) > 0.1 ||
 * xbox.getRawAxis(5) < -0.1) { return xbox.getRawAxis(5); } else { return 0.0;
 * } }
 * 
 * public double getGrabberSpeed() { if (xbox.getRawAxis(1) > 0.1 ||
 * xbox.getRawAxis(1) < -0.1) { return xbox.getRawAxis(1); } else { return 0.0;
 * } }

 */