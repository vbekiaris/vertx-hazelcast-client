/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vertx.hazelcast.impl;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import io.vertx.hazelcast.HazelcastClient;
import io.vertx.test.core.VertxTestBase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.util.UUID;

/**
 *
 */
public class AbstractHazelcastClientBaseTest extends VertxTestBase {

    protected static HazelcastInstance hazelcastInstance;
    protected HazelcastClient hzClient;

    @BeforeClass
    static public void startHZ() throws Exception {
        hazelcastInstance = Hazelcast.newHazelcastInstance(getMemberConfig());
    }

    @AfterClass
    static public void stopHZ() throws Exception {
        hazelcastInstance.shutdown();
    }


    @Before
    public void setup() {
        hzClient = HazelcastClient.create(vertx);
    }

    static protected Config getMemberConfig() {
        // a uniquely named instance for each test class
        Config config = new Config(UUID.randomUUID().toString());
        // disable all membership methods to disallow instances from joining another across tests
        config.getNetworkConfig().getJoin().getAwsConfig().setEnabled(false);
        config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(false);
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
        return config;
    }

}
