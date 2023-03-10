package com.pattern.mediator;

import org.springframework.util.ObjectUtils;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public class LiveHouse extends Mediator {
    @Override
    public void equipmentStatusChanged(Equipment equipment) {
        if (equipment instanceof RemoteController) {
            remoteControllerChanged(equipment);
        } else if (equipment instanceof CoffeeMachine) {
            if (!equipment.isOpen()) {
                startWatchTV();
            }
        } else {
            throw new UnsupportedOperationException("未注册的组件");
        }
    }

    private void remoteControllerChanged(Equipment equipment) {
        if (equipment.isOpen()) {
            Equipment coffeeMachine = getEquipment(CoffeeMachine.NAME);
            if (ObjectUtils.isEmpty(coffeeMachine)) {
                startWatchTV();
            } else {
                coffeeMachine.open();
            }
            return;
        }
        endWatchTV();
    }

    private void startWatchTV() {
        getEquipment(TV.NAME).open();
        getEquipment(Light.NAME).close();
    }

    private void endWatchTV() {
        getEquipment(Light.NAME).open();
        getEquipment(TV.NAME).close();
    }

    public void openRemoteController() {
        getEquipment(RemoteController.NAME).open();
    }

    public void closeRemoteController() {
        getEquipment(RemoteController.NAME).close();
    }

}
