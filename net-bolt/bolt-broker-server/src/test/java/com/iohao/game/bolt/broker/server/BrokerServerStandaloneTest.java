package com.iohao.game.bolt.broker.server;

import com.iohao.game.bolt.broker.cluster.BrokerRunModeEnum;
import com.iohao.game.bolt.broker.core.common.IoGameGlobalConfig;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * 单机网关服
 * <pre>
 *     {@link BrokerRunModeEnum#STANDALONE}
 * </pre>
 *
 * @author 渔民小镇
 * @date 2022-05-16
 */
public class BrokerServerStandaloneTest {
    @Test
    public void test() throws Exception {
        BrokerServer
                .newBuilder()
                .port(IoGameGlobalConfig.brokerPort)
                .build()
                .startup();

    }
}