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

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.hazelcast.IAtomicLong;

/**
 *
 */
public class IAtomicLongImpl extends AbstractVertxDistributedObject
        implements IAtomicLong {

    protected final com.hazelcast.core.IAtomicLong distributedObject;

    public IAtomicLongImpl(Vertx vertx, com.hazelcast.core.IAtomicLong delegate) {
        super(vertx, delegate);
        this.distributedObject = delegate;
    }

    @Override
    public IAtomicLong addAndGet(long delta, Handler<AsyncResult<Long>> handler) {
        executeAsync(distributedObject.addAndGetAsync(delta), handler);
        return this;
    }

    @Override
    public IAtomicLong compareAndSet(long expect, long update, Handler<AsyncResult<Boolean>> handler) {
        executeAsync(distributedObject.compareAndSetAsync(expect, update), handler);
        return this;
    }

    @Override
    public IAtomicLong decrementAndGet(Handler<AsyncResult<Long>> handler) {
        executeAsync(distributedObject.decrementAndGetAsync(), handler);
        return this;
    }

    @Override
    public IAtomicLong get(Handler<AsyncResult<Long>> handler) {
        executeAsync(distributedObject.getAsync(), handler);
        return this;
    }

    @Override
    public IAtomicLong getAndAdd(long delta, Handler<AsyncResult<Long>> handler) {
        executeAsync(distributedObject.getAndAddAsync(delta), handler);
        return this;
    }

    @Override
    public IAtomicLong getAndSet(long newValue, Handler<AsyncResult<Long>> handler) {
        executeAsync(distributedObject.getAndSetAsync(newValue), handler);
        return this;
    }

    @Override
    public IAtomicLong incrementAndGet(Handler<AsyncResult<Long>> handler) {
        executeAsync(distributedObject.incrementAndGetAsync(), handler);
        return this;
    }

    @Override
    public IAtomicLong getAndIncrement(Handler<AsyncResult<Long>> handler) {
        executeAsync(distributedObject.getAndIncrementAsync(), handler);
        return this;
    }

    @Override
    public IAtomicLong set(long newValue, Handler<AsyncResult<Void>> handler) {
        executeAsync(distributedObject.setAsync(newValue), handler);
        return this;
    }

}
