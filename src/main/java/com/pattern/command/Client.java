package com.pattern.command;

import com.pattern.command.Invoker.RemoteInvoker;
import com.pattern.command.command.LightOffCommand;
import com.pattern.command.command.LightOnCommand;
import com.pattern.command.command.TVOffCommand;
import com.pattern.command.command.TVOnCommand;
import com.pattern.command.receiver.LightReceiver;
import com.pattern.command.receiver.TVReceiver;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-1
 */
public class Client {

    public static void main(String[] args) {
        RemoteInvoker remoteInvoker = new RemoteInvoker(5);
        LightReceiver lightReceiver = new LightReceiver();
        TVReceiver tvReceiver = new TVReceiver();
        remoteInvoker.setCommand(0, new LightOnCommand(lightReceiver), new LightOffCommand(lightReceiver));
        remoteInvoker.setCommand(1, new TVOnCommand(tvReceiver), new TVOffCommand(tvReceiver));

        remoteInvoker.executeOn(0);
        remoteInvoker.unDo();
        remoteInvoker.executeOn(1);
        remoteInvoker.unDo();
        remoteInvoker.executeOff(1);
    }
}
