/* Copyright (c) 2018 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/*
 * Place Trainerbot with back touching Wall and left wheels about 2" left of the Building
 * Site tile, with front and phone facing the other Alliance.
 */

@Autonomous(name = "AutoRedWall2Bridge", group = "Trainerbot")
//@Disabled
public class AutoRedBuildWall2Bridge extends LinearOpMode {
  Trainerbot robot = new Trainerbot(this);

  private static final double DRIVE_SPEED = 0.30;  // was 0.6
  private static final double TURN_SPEED =  0.30;  // was 0.2

  @Override
  public void runOpMode() {
    robot.initHardware(hardwareMap);
    telemetry.addData("Hardware", " mapped.");
    telemetry.update();

    /* Wait for Autonomous begin "3-2-1" */
    telemetry.addData(">", "Press Play to run Auto Blue Build Wall to Bridge.");
    telemetry.update();

    waitForStart();
    //Just turn CCW 90 degrees, radius a tile and a quarter, curving away from the Wall toward
    // the Bridge.
    robot.turnAngleRadiusDrive(TURN_SPEED, Math.PI / 2, 30.0);
}
}
