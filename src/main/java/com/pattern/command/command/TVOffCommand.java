package com.pattern.command.command;

import com.pattern.command.receiver.TVReceiver;

/**
 * 具体命令
 *
 * @author fengh
 * @date 2023-3-1
 */
public class TVOffCommand extends OffCommand {

    public TVOffCommand(TVReceiver tvReceiver) {
        super(tvReceiver);
    }
}
