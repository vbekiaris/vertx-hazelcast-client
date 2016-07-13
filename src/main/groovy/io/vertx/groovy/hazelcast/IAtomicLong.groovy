/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.hazelcast;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
/**
 * A proxy for IAtomicLong
*/
@CompileStatic
public class IAtomicLong extends DistributedObject {
  private final def io.vertx.hazelcast.IAtomicLong delegate;
  public IAtomicLong(Object delegate) {
    super((io.vertx.hazelcast.IAtomicLong) delegate);
    this.delegate = (io.vertx.hazelcast.IAtomicLong) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public IAtomicLong addAndGet(long delta, Handler<AsyncResult<Long>> handler) {
    delegate.addAndGet(delta, handler);
    return this;
  }
  public IAtomicLong compareAndSet(long expect, long update, Handler<AsyncResult<Boolean>> handler) {
    delegate.compareAndSet(expect, update, handler);
    return this;
  }
  public IAtomicLong decrementAndGet(Handler<AsyncResult<Long>> handler) {
    delegate.decrementAndGet(handler);
    return this;
  }
  public IAtomicLong get(Handler<AsyncResult<Long>> handler) {
    delegate.get(handler);
    return this;
  }
  public IAtomicLong getAndAdd(long delta, Handler<AsyncResult<Long>> handler) {
    delegate.getAndAdd(delta, handler);
    return this;
  }
  public IAtomicLong getAndSet(long newValue, Handler<AsyncResult<Long>> handler) {
    delegate.getAndSet(newValue, handler);
    return this;
  }
  public IAtomicLong incrementAndGet(Handler<AsyncResult<Long>> handler) {
    delegate.incrementAndGet(handler);
    return this;
  }
  public IAtomicLong getAndIncrement(Handler<AsyncResult<Long>> handler) {
    delegate.getAndIncrement(handler);
    return this;
  }
  public IAtomicLong set(long newValue, Handler<AsyncResult<Void>> handler) {
    delegate.set(newValue, handler);
    return this;
  }
}
