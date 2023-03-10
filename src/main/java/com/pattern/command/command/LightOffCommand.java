package com.pattern.command.command;

import com.pattern.command.receiver.LightReceiver;

/**
 * 具体命令
 *
 * @author fengh
 * @date 2023-3-1
 */
public class LightOffCommand extends OffCommand {

    public LightOffCommand(LightReceiver lightReceiver) {
        super(lightReceiver);
    }
}
