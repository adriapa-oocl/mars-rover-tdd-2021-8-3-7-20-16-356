package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    void should_return_locationX_0_locationY_1_direction_N_when_execute_command_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 1, "N");
        //when
        marsRover.executeCommands("M");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "W");
        //when
        marsRover.executeCommands("L");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_0_0_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "E");
        //when
        marsRover.executeCommands("R");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_neg1_direction_S_when_execute_command_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, -1, "S");
        //when
        marsRover.executeCommands("M");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "E");
        //when
        marsRover.executeCommands("L");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "W");
        //when
        marsRover.executeCommands("R");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_1_locationY_0_direction_E_when_execute_command_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(1, 0, "E");
        //when
        marsRover.executeCommands("M");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_N_when_execute_command_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "N");
        //when
        marsRover.executeCommands("L");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_S_when_execute_command_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "S");
        //when
        marsRover.executeCommands("R");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_neg1_locationY_0_direction_W_when_execute_command_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1, 0, "W");
        //when
        marsRover.executeCommands("M");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_S_when_execute_command_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "S");
        //when
        marsRover.executeCommands("L");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_N_when_execute_command_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "N");
        //when
        marsRover.executeCommands("R");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_expected_location_when_execute_commands_given_multiple_commands() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(1, 4, "N");
        //when
        marsRover.executeCommands("MRMLMMM");
        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
}