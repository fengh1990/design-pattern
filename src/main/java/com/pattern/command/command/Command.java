package com.pattern.command.command;

/**
 * 命令接口
 *
 * @author fengh
 * @date 2023-3-1
 */
public interface Command {

    /**
     * 执行操作
     */
    void execute();

    /**
     * 撤销操作
     */
    void undo();
}
