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
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 */
public class IAtomicLongTest
        extends AbstractHazelcastClientTest {

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

    @Test
    public void testDecrementAndGet() {
        hzClient.getAtomicLong("testDecrementAndGet", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.decrementAndGet(decAndGetResult -> {
                if (decAndGetResult.succeeded()) {
                    assertEquals(-1, (long)decAndGetResult.result());
                    testComplete();
                }
                else {
                    fail(decAndGetResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

    @Test
    public void testGet() {
        hzClient.getAtomicLong("testGet", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.get(getResult -> {
                if (getResult.succeeded()) {
                    assertEquals(0, (long)getResult.result());
                    testComplete();
                }
                else {
                    fail(getResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

    @Test
    public void testGetAndAdd() {
        hzClient.getAtomicLong("testGetAndAdd", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.getAndAdd(13, getAndAddResult -> {
                if (getAndAddResult.succeeded()) {
                    assertEquals(0, (long)getAndAddResult.result());
                    atomicLong.get(getResult -> {
                        if (getResult.succeeded()) {
                            assertEquals(13, (long) getResult.result());
                            testComplete();
                        }
                        else {
                            fail(getResult.cause());
                        }
                    });
                }
                else {
                    fail(getAndAddResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

    @Test
    public void testGetAndSet() {
        hzClient.getAtomicLong("testGetAndSet", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.getAndSet(27, getAndSetResult -> {
                if (getAndSetResult.succeeded()) {
                    assertEquals(0, (long)getAndSetResult.result());
                    atomicLong.get(getResult -> {
                        if (getResult.succeeded()) {
                            assertEquals(27, (long) getResult.result());
                            testComplete();
                        }
                        else {
                            fail(getResult.cause());
                        }
                    });
                }
                else {
                    fail(getAndSetResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

    @Test
    public void testGetAndIncrement() {
        hzClient.getAtomicLong("testGetAndIncrement", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.getAndIncrement(getAndIncResult -> {
                if (getAndIncResult.succeeded()) {
                    assertEquals(0, (long)getAndIncResult.result());
                    atomicLong.get(getResult -> {
                        if (getResult.succeeded()) {
                            assertEquals(1, (long) getResult.result());
                            testComplete();
                        }
                        else {
                            fail(getResult.cause());
                        }
                    });
                }
                else {
                    fail(getAndIncResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

    @Test
    public void testSet() {
        hzClient.getAtomicLong("testSet", atomicLongResult -> {
            final IAtomicLong atomicLong = atomicLongResult.result();
            atomicLong.set(33, setResult -> {
                if (setResult.succeeded()) {
                    atomicLong.get(getResult -> {
                        if (getResult.succeeded()) {
                            assertEquals(33, (long) getResult.result());
                            testComplete();
                        }
                        else {
                            fail(getResult.cause());
                        }
                    });
                }
                else {
                    fail(setResult.cause());
                }
            });
        });
        await(15, SECONDS);
    }

}

