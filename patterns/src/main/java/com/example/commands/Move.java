package com.example.commands;

import com.example.FileExecutor;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Move implements FileExecutor {
    @Override
    public void execute() {
        System.out.println("Move detected and moving");
    }
}