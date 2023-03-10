package com.pattern.command.command;

import com.pattern.command.receiver.LightReceiver;

/**
 * 具体命令
 *
 * @author fengh
 * @date 2023-3-1
 */
public class LightOnCommand extends OnCommand {
    public LightOnCommand(LightReceiver lightReceiver) {
        super(lightReceiver);
    }
}
