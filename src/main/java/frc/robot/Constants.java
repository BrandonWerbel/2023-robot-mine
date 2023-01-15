// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final static class DrivetrainSubsystem {

        public static final double DEADBAND = 0.05;

        public static final double WIDTH = 22.5;
        public static final double LENGTH = 22.5;


        public final static int BACK_RIGHT_SPEED_ID = 4;
        public final static int BACK_RIGHT_ANGLE_ID = 3;
        public final static int BACK_RIGHT_ENCODER = 0;
        public final static double BACK_RIGHT_ENCODER_OFFSET = 0.208;

        public final static int BACK_LEFT_SPEED_ID = 2;
        public final static int BACK_LEFT_ANGLE_ID = 1;
        public final static int BACK_LEFT_ENCODER = 1;
        public final static double BACK_LEFT_ENCODER_OFFSET = 0.050;

        public final static int FRONT_RIGHT_SPEED_ID = 6;
        public final static int FRONT_RIGHT_ANGLE_ID = 5;
        public final static int FRONT_RIGHT_ENCODER = 2;
        public final static double FRONT_RIGHT_ENCODER_OFFSET = 0.977;

        public final static int FRONT_LEFT_SPEED_ID = 8;
        public final static int FRONT_LEFT_ANGLE_ID = 7;
        public final static int FRONT_LEFT_ENCODER = 3;
        public final static double FRONT_LEFT_ENCODER_OFFSET = 0.811;

        public final static Translation2d m_frontLeftLocation = new Translation2d(21.625/2, 21.625/2);
        public final static Translation2d m_frontRightLocation = new Translation2d(21.625/2, -21.625/2);
        public final static Translation2d m_backLeftLocation = new Translation2d(-21.625/2, 21.625/2);
        public final static Translation2d m_backRightLocation = new Translation2d(-21.625/2, -21.625/2);

    }
}
