/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Chassis extends SubsystemBase {
  TalonSRX left = new TalonSRX(0);
  TalonSRX right = new TalonSRX(1);
  /**
   * Creates a new ExampleSubsystem.
   */
  public Chassis() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void SetPower(double left, double right){
    this.left.set(ControlMode.PercentOutput, left);
    this.right.set(ControlMode.PercentOutput, right);
  }

  public void DisplayPower(double left, double right){
    SmartDashboard.putNumber("Left Power", left);
    SmartDashboard.putNumber("Right Power", right);
  }
}
