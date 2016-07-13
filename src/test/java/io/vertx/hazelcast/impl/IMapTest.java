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

import com.hazelcast.map.impl.MapService;
import io.vertx.hazelcast.IMap;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 */
public class IMapTest extends AbstractHazelcastClientBaseTest {

    @Test
    public void getMap() {
        hzClient.getMap("test-map", mapResult -> {
            if (mapResult.succeeded()) {
                assertNotNull(mapResult.result());
                testComplete();
            }
            else {
                fail(mapResult.cause());
            }
        });
        await(15, SECONDS);
    }

    @Test
    public void when_putValue_then_getValueIsEqual() {
        hzClient.getMap("test-map", mapResult -> {
            if (mapResult.succeeded()) {
                final IMap<String, String> map = mapResult.result();
                map.put("x", "y", putResult -> {
                    if (mapResult.succeeded()) {
                        map.get("x", getResult -> {
                           if (getResult.succeeded()) {
                               assertEquals("y", getResult.result());
                               testComplete();
                           }
                           else {
                               fail(getResult.cause());
                           }
                        });
                    }
                    else {
                        fail(putResult.cause());
                    }
                });
            }
            else {
                fail(mapResult.cause());
            }
        });
        await(15, SECONDS);
    }

    @Test
    public void when_removeValue_then_getValueIsNull() {
        hzClient.getMap("test-map", mapResult -> {
            if (mapResult.succeeded()) {
                final IMap<String, String> map = mapResult.result();
                map.put("x", "y", putResult -> {
                    if (mapResult.succeeded()) {
                        map.remove("x", removeResult -> {
                           if (removeResult.succeeded()) {
                               map.get("x", getResult -> {
                                   if (getResult.succeeded()) {
                                       assertNull(getResult.result());
                                       testComplete();
                                   }
                                   else {
                                       fail(getResult.cause());
                                   }
                               });
                           }
                           else {
                               fail(removeResult.cause());
                           }
                        });
                    }
                    else {
                        fail(putResult.cause());
                    }
                });
            }
            else {
                fail(mapResult.cause());
            }
        });
        await(15, SECONDS);
    }

    @Test
    public void mapAsDistributedObject_testServiceName() {
        hzClient.getMap("test-map", mapResult -> {
            if (mapResult.succeeded()) {
                final IMap<String, String> map = mapResult.result();
                assertEquals(MapService.SERVICE_NAME, map.getServiceName());
                testComplete();
            }
            else {
                fail(mapResult.cause());
            }
        });
        await(15, SECONDS);
    }
}

