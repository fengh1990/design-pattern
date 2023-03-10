package com.pattern.command.command;

/**
 * 空命令，不执行任何操作
 *
 * @author fengh
 * @date 2023-3-1
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
