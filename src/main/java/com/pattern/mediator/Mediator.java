package com.pattern.mediator;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 中介者
 *
 * @author fengh
 * @date 2023-3-8
 */
public abstract class Mediator {

    private ConcurrentHashMap<String, Equipment> equipmentMap = new ConcurrentHashMap<>();

    public void register(Equipment equipment) {
        equipmentMap.putIfAbsent(equipment.getName(), equipment);
    }

    public void unregister(Equipment equipment) {
        equipmentMap.remove(equipment.getName());
    }

    public abstract void equipmentStatusChanged(Equipment equipment);

    protected Equipment getEquipment(String name) {
        return equipmentMap.get(name);
    }
}
