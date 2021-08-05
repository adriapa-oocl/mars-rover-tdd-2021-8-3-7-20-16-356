package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }


    public void executeCommand(String command) {
        if (command.equals("M")){
            move();
        }

        if (command.equals("L")){
            turnLeft();
        }

        if (command.equals("R")){
            turnRight();
        }
    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = getRoverStatus().getDirection();
        String newDirection = direction;

        if (direction.equals("N")) {
            newDirection = "E";
        }else if (direction.equals("S")){
            newDirection = "W";
        }else if (direction.equals("E")){
            newDirection = "S";
        }

        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = getRoverStatus().getDirection();
        String newDirection = direction;

        if (direction.equals("N")) {
            newDirection = "W";
        }else if(direction.equals("S")) {
            newDirection = "E";
        }else if (direction.equals("E")){
            newDirection = "N";
        }

        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void move() {
        int locationX = roverStatus.getLocationX();
        int locationY = roverStatus.getLocationY();
        final String direction = getRoverStatus().getDirection();

        if (direction.equals("N")){
            locationY += 1;
        }else if (direction.equals("S")){
            locationY -= 1;
        }else if (direction.equals("E")){
            locationX += 1;
        }else if(direction.equals("W"))
            locationX -= 1;

        roverStatus = new RoverStatus(locationX, locationY, direction);
    }


    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
