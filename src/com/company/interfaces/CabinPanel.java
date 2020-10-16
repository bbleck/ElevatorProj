package com.company.interfaces;

public interface CabinPanel {
    int getFloorPressed();
    boolean openDoor();
    boolean closeDoor();
    boolean bell();
    Enum elevatorMode();
}
