/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.ClimbCommands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.ClimbSystem;
import frc.robot.subsystems.LiftSystem;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * An example command.  You can replace me with your own command.
 */
public class HookOut extends Command {

    private ClimbSystem climb;
    private LiftSystem lift;

  public HookOut() {

    climb = ClimbSystem.getInstance();
    lift = LiftSystem.getInstance();
  
  
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  
    //nothing should be here
     
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    
    if (!lift.getBottomLimitSwitch()||lift.getOverride()){
      climb.hookOut();
    }

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
