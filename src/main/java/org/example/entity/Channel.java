package org.example.entity;

import lombok.Data;

import java.util.Random;
@Data
public class Channel {

    public Channel(String channelName, Program[] programs) {
        this.channelName = channelName;
        this.programs = programs;
    }

    private String channelName;
    private Program[] programs;

    public void addProgramInChannel(Program program) {
        for (int i = 0; i < programs.length; i++) {
            if (programs[i] == null) {
                programs[i] = program;
                break;
            }
        }

    }

    public void showProgram() {
        Random random = new Random();
        Program program = programs[random.nextInt(programs.length)];
        System.out.println("Показана программа: " + program.getName());
    }



}
