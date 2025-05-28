package com.iohao.duiwai;


import com.iohao.game.bolt.broker.core.client.BrokerAddress;
import com.iohao.game.bolt.broker.core.common.IoGameGlobalConfig;
import com.iohao.game.external.core.config.ExternalJoinEnum;
import com.iohao.game.external.core.netty.DefaultExternalServer;

public class DuiWaiServer {
    public static void main(String[] args) {
        int externalPort = 10100;
        DefaultExternalServer
                .newBuilder(externalPort)
                .externalJoinEnum(ExternalJoinEnum.WEBSOCKET)
                .brokerAddress(new BrokerAddress("127.0.0.1", IoGameGlobalConfig.brokerPort))
                .build()
                .startup();
    }
}
