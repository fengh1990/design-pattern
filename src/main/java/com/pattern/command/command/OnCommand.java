package com.pattern.command.command;

import com.pattern.command.receiver.Equipment;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-1
 */
public abstract class OnCommand implements Command {

    private final Equipment equipment;

    protected OnCommand(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void execute() {
        equipment.on();
    }

    @Override
    public void undo() {
        equipment.off();
    }
}
