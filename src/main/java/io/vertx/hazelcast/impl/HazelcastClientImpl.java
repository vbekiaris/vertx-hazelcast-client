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

import com.hazelcast.client.impl.HazelcastClientProxy;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.hazelcast.DistributedObject;
import io.vertx.hazelcast.HazelcastClient;
import io.vertx.hazelcast.IAtomicLong;
import io.vertx.hazelcast.IMap;

import static io.vertx.hazelcast.impl.ConversionUtils.convertReturn;

/**
 *
 */
public class HazelcastClientImpl extends AbstractVertxAsyncExecutor
        implements HazelcastClient {

    private final HazelcastClientProxy hzClient;

    public HazelcastClientImpl(Vertx vertx) {
        super(vertx);
        hzClient = (HazelcastClientProxy) com.hazelcast.client.HazelcastClient.newHazelcastClient();
    }

    @Override
    public HazelcastClient getDistributedObject(String serviceName, String distributedObjectName,
                                                Handler<AsyncResult<DistributedObject>> handler) {
        vertx.executeBlocking(
                fut -> fut.complete(convertReturn(hzClient.getDistributedObject(serviceName, distributedObjectName))),
                handler
        );

        return this;
    }

    @Override
    public HazelcastClient getMap(String name, Handler<AsyncResult<IMap>> handler) {
        vertx.executeBlocking(
                fut -> fut.complete(new IMapImpl(vertx, convertReturn(hzClient.getMap(name)))),
                handler
        );
        return this;
    }

    @Override
    public HazelcastClient getAtomicLong(String name, Handler<AsyncResult<IAtomicLong>> handler) {
        vertx.executeBlocking(
                fut -> fut.complete(new IAtomicLongImpl(vertx, convertReturn(hzClient.getAtomicLong(name)))),
                handler
        );
        return this;
    }


}

