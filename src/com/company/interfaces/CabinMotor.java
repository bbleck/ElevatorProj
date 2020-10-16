package com.company.interfaces;

public interface CabinMotor {
    void turn_on();
    void turn_off();
    void set_direction(Enum direction);
    void start();
    void stop();
    void set_acceleration(double acceleration);
//    Status get_motor_status();
    double get_Speed();
}
