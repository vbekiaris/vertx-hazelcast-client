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
import io.vertx.hazelcast.IMap;

import java.util.concurrent.TimeUnit;

/**
 * Hazelcast IMap proxy for Vertx
 */
public class IMapImpl<K, V> extends AbstractVertxDistributedObject
        implements IMap<K, V> {

    private final com.hazelcast.core.IMap<K, V> delegate;

    public IMapImpl(Vertx vertx,
                    com.hazelcast.core.IMap<K, V> delegate) {
        super(vertx, delegate);
        this.delegate = delegate;
    }

    @Override
    public IMap get(K key, Handler<AsyncResult<V>> handler) {
        executeAsync(delegate.getAsync(key), handler);
        return this;
    }

    @Override
    public IMap put(K key, V value, Handler<AsyncResult<V>> handler) {
        executeAsync(delegate.putAsync(key, value), handler);
        return this;
    }

    @Override
    public IMap putAsync(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<V>> handler) {
        executeAsync(delegate.putAsync(key, value, ttl, timeunit), handler);
        return this;
    }

    @Override
    public IMap setAsync(K key, V value, Handler<AsyncResult<Void>> handler) {
        executeAsync(delegate.setAsync(key, value), handler);
        return this;
    }

    @Override
    public IMap setAsync(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<Void>> handler) {
        executeAsync(delegate.setAsync(key, value, ttl, timeunit), handler);
        return this;
    }

    @Override
    public IMap remove(K key, Handler<AsyncResult<V>> handler) {
        executeAsync(delegate.removeAsync(key), handler);
        return this;
    }
}
