package com.iohao.wangguan;


import com.iohao.game.bolt.broker.core.common.IoGameGlobalConfig;
import com.iohao.game.bolt.broker.server.BrokerServer;
import com.iohao.game.bolt.broker.server.BrokerServerBuilder;

public class WangGuanServer {
    public static void main(String[] args) {
        BrokerServer.newBuilder()
                .port(IoGameGlobalConfig.brokerPort)
                .build()
                .startup();
    }
}
