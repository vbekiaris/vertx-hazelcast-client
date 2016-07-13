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

package io.vertx.hazelcast;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * A proxy for IAtomicLong
 */
@VertxGen
public interface IAtomicLong extends DistributedObject {

    @Fluent
    IAtomicLong addAndGet(long delta, Handler<AsyncResult<Long>> handler);

    @Fluent
    IAtomicLong compareAndSet(long expect, long update, Handler<AsyncResult<Boolean>> handler);

    @Fluent
    IAtomicLong decrementAndGet(Handler<AsyncResult<Long>> handler);

    @Fluent
    IAtomicLong get(Handler<AsyncResult<Long>> handler);

    @Fluent
    IAtomicLong getAndAdd(long delta, Handler<AsyncResult<Long>> handler);

    @Fluent
    IAtomicLong getAndSet(long newValue, Handler<AsyncResult<Long>> handler);

    @Fluent
    IAtomicLong incrementAndGet(Handler<AsyncResult<Long>> handler);

    @Fluent
    IAtomicLong getAndIncrement(Handler<AsyncResult<Long>> handler);

    @Fluent
    IAtomicLong set(long newValue, Handler<AsyncResult<Void>> handler);

}
