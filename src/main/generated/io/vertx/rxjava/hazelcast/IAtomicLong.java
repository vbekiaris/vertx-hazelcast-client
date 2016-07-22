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
 * A proxy for IAtomicLong
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.hazelcast.IAtomicLong original} non RX-ified interface using Vert.x codegen.
 */

public class IAtomicLong extends DistributedObject {

  final io.vertx.hazelcast.IAtomicLong delegate;

  public IAtomicLong(io.vertx.hazelcast.IAtomicLong delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public IAtomicLong addAndGet(long delta, Handler<AsyncResult<Long>> handler) { 
    delegate.addAndGet(delta, new Handler<AsyncResult<java.lang.Long>>() {
      public void handle(AsyncResult<java.lang.Long> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Long> addAndGetObservable(long delta) { 
    io.vertx.rx.java.ObservableFuture<Long> handler = io.vertx.rx.java.RxHelper.observableFuture();
    addAndGet(delta, handler.toHandler());
    return handler;
  }

  public IAtomicLong compareAndSet(long expect, long update, Handler<AsyncResult<Boolean>> handler) { 
    delegate.compareAndSet(expect, update, new Handler<AsyncResult<java.lang.Boolean>>() {
      public void handle(AsyncResult<java.lang.Boolean> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Boolean> compareAndSetObservable(long expect, long update) { 
    io.vertx.rx.java.ObservableFuture<Boolean> handler = io.vertx.rx.java.RxHelper.observableFuture();
    compareAndSet(expect, update, handler.toHandler());
    return handler;
  }

  public IAtomicLong decrementAndGet(Handler<AsyncResult<Long>> handler) { 
    delegate.decrementAndGet(new Handler<AsyncResult<java.lang.Long>>() {
      public void handle(AsyncResult<java.lang.Long> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Long> decrementAndGetObservable() { 
    io.vertx.rx.java.ObservableFuture<Long> handler = io.vertx.rx.java.RxHelper.observableFuture();
    decrementAndGet(handler.toHandler());
    return handler;
  }

  public IAtomicLong get(Handler<AsyncResult<Long>> handler) { 
    delegate.get(new Handler<AsyncResult<java.lang.Long>>() {
      public void handle(AsyncResult<java.lang.Long> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Long> getObservable() { 
    io.vertx.rx.java.ObservableFuture<Long> handler = io.vertx.rx.java.RxHelper.observableFuture();
    get(handler.toHandler());
    return handler;
  }

  public IAtomicLong getAndAdd(long delta, Handler<AsyncResult<Long>> handler) { 
    delegate.getAndAdd(delta, new Handler<AsyncResult<java.lang.Long>>() {
      public void handle(AsyncResult<java.lang.Long> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Long> getAndAddObservable(long delta) { 
    io.vertx.rx.java.ObservableFuture<Long> handler = io.vertx.rx.java.RxHelper.observableFuture();
    getAndAdd(delta, handler.toHandler());
    return handler;
  }

  public IAtomicLong getAndSet(long newValue, Handler<AsyncResult<Long>> handler) { 
    delegate.getAndSet(newValue, new Handler<AsyncResult<java.lang.Long>>() {
      public void handle(AsyncResult<java.lang.Long> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Long> getAndSetObservable(long newValue) { 
    io.vertx.rx.java.ObservableFuture<Long> handler = io.vertx.rx.java.RxHelper.observableFuture();
    getAndSet(newValue, handler.toHandler());
    return handler;
  }

  public IAtomicLong incrementAndGet(Handler<AsyncResult<Long>> handler) { 
    delegate.incrementAndGet(new Handler<AsyncResult<java.lang.Long>>() {
      public void handle(AsyncResult<java.lang.Long> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Long> incrementAndGetObservable() { 
    io.vertx.rx.java.ObservableFuture<Long> handler = io.vertx.rx.java.RxHelper.observableFuture();
    incrementAndGet(handler.toHandler());
    return handler;
  }

  public IAtomicLong getAndIncrement(Handler<AsyncResult<Long>> handler) { 
    delegate.getAndIncrement(new Handler<AsyncResult<java.lang.Long>>() {
      public void handle(AsyncResult<java.lang.Long> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Long> getAndIncrementObservable() { 
    io.vertx.rx.java.ObservableFuture<Long> handler = io.vertx.rx.java.RxHelper.observableFuture();
    getAndIncrement(handler.toHandler());
    return handler;
  }

  public IAtomicLong set(long newValue, Handler<AsyncResult<Void>> handler) { 
    delegate.set(newValue, new Handler<AsyncResult<java.lang.Void>>() {
      public void handle(AsyncResult<java.lang.Void> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<Void> setObservable(long newValue) { 
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    set(newValue, handler.toHandler());
    return handler;
  }


  public static IAtomicLong newInstance(io.vertx.hazelcast.IAtomicLong arg) {
    return arg != null ? new IAtomicLong(arg) : null;
  }
}
