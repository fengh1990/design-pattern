package com.pattern.command.command;

import com.pattern.command.receiver.TVReceiver;

/**
 * 具体命令
 *
 * @author fengh
 * @date 2023-3-1
 */
public class TVOnCommand extends OnCommand {

    public TVOnCommand(TVReceiver tvReceiver) {
        super(tvReceiver);
    }
}
