package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommands(String commands) {
        executeCommand(commands);
    }

    private void executeCommand(String commands) {
        String[] command = commands.split("");
        for (int i = 0; i < command.length; i++) {
            if (command[i].equals("M")){
                move();
            }
            if (command[i].equals("L")){
                turnLeft();
            }
            if (command[i].equals("R")){
                turnRight();
            }
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
        }else if (direction.equals("W")){
            newDirection = "N";
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
        }else if (direction.equals("W")){
            newDirection = "S";
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
