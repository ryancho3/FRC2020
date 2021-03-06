package frc.robot;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.ColorSensorV3;
import com.revrobotics.ColorMatch;

public class RobotMap {

	// Talon Speed Controller
	public static WPI_TalonSRX LeftMotor = new WPI_TalonSRX(1);
	public static WPI_TalonSRX RightMotor = new WPI_TalonSRX(2);
	public static WPI_TalonSRX Winch = new WPI_TalonSRX(3);
	public static WPI_TalonSRX Shooter = new WPI_TalonSRX(4);

	// Spark/Spike motors setup
	public static Spark Grabber = new Spark(0);
	public static Spark Conveyor = new Spark(1);
	public static Spark Spinner = new Spark(2);
	public static Spark LeftGatherer = new Spark(3);
	public static Spark RightGatherer = new Spark(4);

	// Joysticks/Controllers setup
	public static Joystick leftJoystick = new Joystick(1);
	public static Joystick rightJoystick = new Joystick(0);
	public static XboxController xboxController = new XboxController(2);

	// Sensors setup
	public static I2C.Port i2cPort = I2C.Port.kOnboard;
	public static ColorSensorV3 colorSensor = new ColorSensorV3(i2cPort);
	public static ColorMatch colorMatcher = new ColorMatch();

	// Relay
	public static Relay GreenLED = new Relay(3);

}
