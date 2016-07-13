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

import io.vertx.hazelcast.IAtomicLong;
import io.vertx.hazelcast.IMap;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 */
public class IAtomicLongTest
        extends AbstractHazelcastClientBaseTest {

    @Test
    public void getAtomicLong() {
        hzClient.getAtomicLong("getAtomicLong", longResult -> {
            if (longResult.succeeded()) {
                assertNotNull(longResult.result());
                testComplete();
            }
            else {
                fail(longResult.cause());
            }
        });
        await(15, SECONDS);
    }

    @Test
    public void testAddAndGet() {
        hzClient.getAtomicLong("testAddAnd", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.addAndGet(1, addAndGetResult -> {
                if (addAndGetResult.succeeded()) {
                    assertEquals(1, (long)addAndGetResult.result());
                    testComplete();
                }
                else {
                    fail(addAndGetResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

    @Test
    public void testCompareAndSet() {
        hzClient.getAtomicLong("testCompareAndSet", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            // test CAS when value matches
            atomicLong.compareAndSet(0, 1, compareAndSetResult -> {
                if (compareAndSetResult.succeeded()) {
                    assertTrue(compareAndSetResult.result());
                    // test CAS when value does not match
                    atomicLong.compareAndSet(15, 1, noMatchCASResult -> {
                       if (noMatchCASResult.succeeded()) {
                           assertFalse(noMatchCASResult.result());
                           testComplete();
                       }
                       else {
                           fail(noMatchCASResult.cause());
                       }
                    });
                }
                else {
                    fail(compareAndSetResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

    @Test
    public void testIncrementAndGet() {
        hzClient.getAtomicLong("testIncrementAndGet", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.incrementAndGet(incAndGetResult -> {
                if (incAndGetResult.succeeded()) {
                    assertEquals(1, (long)incAndGetResult.result());
                    testComplete();
                }
                else {
                    fail(incAndGetResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

}

