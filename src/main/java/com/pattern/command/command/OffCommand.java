package com.pattern.command.command;

import com.pattern.command.receiver.Equipment;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-1
 */
public abstract class OffCommand implements Command {

    private final Equipment equipment;

    protected OffCommand(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void execute() {
        equipment.off();
    }

    @Override
    public void undo() {
        equipment.on();
    }
}
