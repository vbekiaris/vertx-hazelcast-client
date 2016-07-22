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
import io.vertx.rxjava.core.Vertx;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 *
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.hazelcast.HazelcastClient original} non RX-ified interface using Vert.x codegen.
 */

public class HazelcastClient {

  final io.vertx.hazelcast.HazelcastClient delegate;

  public HazelcastClient(io.vertx.hazelcast.HazelcastClient delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public static HazelcastClient create(Vertx vertx) { 
    HazelcastClient ret = HazelcastClient.newInstance(io.vertx.hazelcast.HazelcastClient.create((io.vertx.core.Vertx)vertx.getDelegate()));
    return ret;
  }

  public HazelcastClient getDistributedObject(String serviceName, String distributedObjectName, Handler<AsyncResult<DistributedObject>> handler) { 
    delegate.getDistributedObject(serviceName, distributedObjectName, new Handler<AsyncResult<io.vertx.hazelcast.DistributedObject>>() {
      public void handle(AsyncResult<io.vertx.hazelcast.DistributedObject> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(DistributedObject.newInstance(ar.result())));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<DistributedObject> getDistributedObjectObservable(String serviceName, String distributedObjectName) { 
    io.vertx.rx.java.ObservableFuture<DistributedObject> handler = io.vertx.rx.java.RxHelper.observableFuture();
    getDistributedObject(serviceName, distributedObjectName, handler.toHandler());
    return handler;
  }

  public HazelcastClient getMap(String name, Handler<AsyncResult<IMap>> handler) { 
    delegate.getMap(name, new Handler<AsyncResult<io.vertx.hazelcast.IMap>>() {
      public void handle(AsyncResult<io.vertx.hazelcast.IMap> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(IMap.newInstance(ar.result())));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<IMap> getMapObservable(String name) { 
    io.vertx.rx.java.ObservableFuture<IMap> handler = io.vertx.rx.java.RxHelper.observableFuture();
    getMap(name, handler.toHandler());
    return handler;
  }

  public HazelcastClient getAtomicLong(String name, Handler<AsyncResult<IAtomicLong>> handler) { 
    delegate.getAtomicLong(name, new Handler<AsyncResult<io.vertx.hazelcast.IAtomicLong>>() {
      public void handle(AsyncResult<io.vertx.hazelcast.IAtomicLong> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(IAtomicLong.newInstance(ar.result())));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<IAtomicLong> getAtomicLongObservable(String name) { 
    io.vertx.rx.java.ObservableFuture<IAtomicLong> handler = io.vertx.rx.java.RxHelper.observableFuture();
    getAtomicLong(name, handler.toHandler());
    return handler;
  }


  public static HazelcastClient newInstance(io.vertx.hazelcast.HazelcastClient arg) {
    return arg != null ? new HazelcastClient(arg) : null;
  }
}
