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

package io.vertx.rxjava.hazelcast;

import java.util.Map;
import rx.Observable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * Base interface for all distributed objects.
 *
 * All distributed objects are not garbage collectable unless  is called first.
 * Note: Failure to destroy after you are done using a distributed object will lead to memory leaks.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.hazelcast.DistributedObject original} non RX-ified interface using Vert.x codegen.
 */

public class DistributedObject {

  final io.vertx.hazelcast.DistributedObject delegate;

  public DistributedObject(io.vertx.hazelcast.DistributedObject delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Returns the key of the partition that this DistributedObject is assigned to. The returned value only has meaning
   * for a non-partitioned data structure like an {@link io.vertx.rxjava.hazelcast.IAtomicLong}. For a partitioned data structure like an {@link io.vertx.rxjava.hazelcast.IMap},
   * the returned value will not be null, but otherwise undefined.
   * @return the partition key.
   */
  public String getPartitionKey() { 
    String ret = delegate.getPartitionKey();
    return ret;
  }

  /**
   * Returns the unique name for this DistributedObject. The returned value will never be null.
   * @return the unique name for this object.
   */
  public String getName() { 
    String ret = delegate.getName();
    return ret;
  }

  /**
   * Returns the service name for this object.
   * @return the service name for this object.
   */
  public String getServiceName() { 
    String ret = delegate.getServiceName();
    return ret;
  }

  /**
   * Destroys this object cluster-wide.
   * Clears and releases all resources for this object.
   * @param handler 
   */
  public void destroy(Handler<AsyncResult<Void>> handler) { 
    delegate.destroy(new Handler<AsyncResult<java.lang.Void>>() {
      public void handle(AsyncResult<java.lang.Void> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
  }

  /**
   * Destroys this object cluster-wide.
   * Clears and releases all resources for this object.
   * @return 
   */
  public Observable<Void> destroyObservable() { 
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    destroy(handler.toHandler());
    return handler;
  }


  public static DistributedObject newInstance(io.vertx.hazelcast.DistributedObject arg) {
    return arg != null ? new DistributedObject(arg) : null;
  }
}
