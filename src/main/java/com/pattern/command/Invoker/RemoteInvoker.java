package com.pattern.command.Invoker;

import com.pattern.command.command.Command;
import com.pattern.command.command.NoCommand;

/**
 * 命令调用者
 *
 * @author fengh
 * @date 2023-3-1
 */
public class RemoteInvoker {

    private final Integer maxCommandRows;

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command unDoCommand = new NoCommand();

    public RemoteInvoker(Integer maxCommandRows) {
        this.maxCommandRows = maxCommandRows;
        onCommands = new Command[maxCommandRows];
        offCommands = new Command[maxCommandRows];

        for (int i = 0; i < maxCommandRows; i++) {
            onCommands[i] = unDoCommand;
            offCommands[i] = unDoCommand;
        }
    }

    public void setCommand(int num, Command on, Command off) {
        checkCommandRowNum(num);
        onCommands[num] = on;
        offCommands[num] = off;
    }

    private void checkCommandRowNum(int num) {
        if (num > maxCommandRows || num < 0) {
            throw new RuntimeException("行数不能大于" + maxCommandRows + "或者小于0");
        }
    }

    public void executeOn(int num) {
        checkCommandRowNum(num);
        onCommands[num].execute();
        unDoCommand = onCommands[num];
    }

    public void executeOff(int num) {
        checkCommandRowNum(num);
        offCommands[num].execute();
        unDoCommand = offCommands[num];
    }

    public void unDo() {
        unDoCommand.undo();
        unDoCommand = new NoCommand();
    }
}
