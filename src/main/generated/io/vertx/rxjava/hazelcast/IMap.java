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
import java.util.concurrent.TimeUnit;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * Hazelcast Map API
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.hazelcast.IMap original} non RX-ified interface using Vert.x codegen.
 */

public class IMap<K,V> extends DistributedObject {

  final io.vertx.hazelcast.IMap delegate;

  public IMap(io.vertx.hazelcast.IMap delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * 
   * <p/>
   * <p><b>Warning:</b></p>
   * <p>
   * This method returns a clone of the original value, so modifying the returned value does not change
   * the actual value in the map. You should put the modified value back to make changes visible to all nodes.
   * <pre>
   *      V value = map.get(key);
   *      value.updateSomeProperty();
   *      map.put(key, value);
   * </pre>
   * </p>
   * <p/>
   * <p><b>Warning-2:</b></p>
   * This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   * the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   * defined in the <tt>key</tt>'s class.
   * <p/>
   * @param key 
   * @param handler 
   * @return 
   */
  public IMap get(K key, Handler<AsyncResult<V>> handler) { 
    delegate.get(key, new Handler<AsyncResult<V>>() {
      public void handle(AsyncResult<V> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((V) ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  /**
   * 
   * <p/>
   * <p><b>Warning:</b></p>
   * <p>
   * This method returns a clone of the original value, so modifying the returned value does not change
   * the actual value in the map. You should put the modified value back to make changes visible to all nodes.
   * <pre>
   *      V value = map.get(key);
   *      value.updateSomeProperty();
   *      map.put(key, value);
   * </pre>
   * </p>
   * <p/>
   * <p><b>Warning-2:</b></p>
   * This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   * the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   * defined in the <tt>key</tt>'s class.
   * <p/>
   * @param key 
   * @return 
   */
  public Observable<V> getObservable(K key) { 
    io.vertx.rx.java.ObservableFuture<V> handler = io.vertx.rx.java.RxHelper.observableFuture();
    get(key, handler.toHandler());
    return handler;
  }

  /**
   * 
   * <p/>
   * <p><b>Warning:</b></p>
   * <p>
   * This method returns a clone of the previous value, not the original (identically equal) value
   * previously put into the map.
   * </p>
   * <p/>
   * <p><b>Warning-2:</b></p>
   * This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   * the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   * defined in the <tt>key</tt>'s class.
   * @param key 
   * @param value 
   * @param handler 
   * @return 
   */
  public IMap put(K key, V value, Handler<AsyncResult<V>> handler) { 
    delegate.put(key, value, new Handler<AsyncResult<V>>() {
      public void handle(AsyncResult<V> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((V) ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  /**
   * 
   * <p/>
   * <p><b>Warning:</b></p>
   * <p>
   * This method returns a clone of the previous value, not the original (identically equal) value
   * previously put into the map.
   * </p>
   * <p/>
   * <p><b>Warning-2:</b></p>
   * This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   * the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   * defined in the <tt>key</tt>'s class.
   * @param key 
   * @param value 
   * @return 
   */
  public Observable<V> putObservable(K key, V value) { 
    io.vertx.rx.java.ObservableFuture<V> handler = io.vertx.rx.java.RxHelper.observableFuture();
    put(key, value, handler.toHandler());
    return handler;
  }

  public IMap put(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<V>> handler) { 
    delegate.put(key, value, ttl, timeunit, new Handler<AsyncResult<V>>() {
      public void handle(AsyncResult<V> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((V) ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  public Observable<V> putObservable(K key, V value, long ttl, TimeUnit timeunit) { 
    io.vertx.rx.java.ObservableFuture<V> handler = io.vertx.rx.java.RxHelper.observableFuture();
    put(key, value, ttl, timeunit, handler.toHandler());
    return handler;
  }

  public IMap set(K key, V value, Handler<AsyncResult<Void>> handler) { 
    delegate.set(key, value, new Handler<AsyncResult<java.lang.Void>>() {
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

  public Observable<Void> setObservable(K key, V value) { 
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    set(key, value, handler.toHandler());
    return handler;
  }

  public IMap set(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<Void>> handler) { 
    delegate.set(key, value, ttl, timeunit, new Handler<AsyncResult<java.lang.Void>>() {
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

  public Observable<Void> setObservable(K key, V value, long ttl, TimeUnit timeunit) { 
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    set(key, value, ttl, timeunit, handler.toHandler());
    return handler;
  }

  /**
   * 
   * <p/>
   * <p><b>Warning:</b></p>
   * <p>
   * This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   * the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   * defined in the <tt>key</tt>'s class.
   * </p>
   * <p/>
   * <p><b>Warning-2:</b></p>
   * <p>
   * This method returns a clone of the previous value, not the original (identically equal) value
   * previously put into the map.
   * </p>
   * @param key 
   * @param handler 
   * @return 
   */
  public IMap remove(K key, Handler<AsyncResult<V>> handler) { 
    delegate.remove(key, new Handler<AsyncResult<V>>() {
      public void handle(AsyncResult<V> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((V) ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
    return this;
  }

  /**
   * 
   * <p/>
   * <p><b>Warning:</b></p>
   * <p>
   * This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   * the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   * defined in the <tt>key</tt>'s class.
   * </p>
   * <p/>
   * <p><b>Warning-2:</b></p>
   * <p>
   * This method returns a clone of the previous value, not the original (identically equal) value
   * previously put into the map.
   * </p>
   * @param key 
   * @return 
   */
  public Observable<V> removeObservable(K key) { 
    io.vertx.rx.java.ObservableFuture<V> handler = io.vertx.rx.java.RxHelper.observableFuture();
    remove(key, handler.toHandler());
    return handler;
  }


  public static <K, V> IMap newInstance(io.vertx.hazelcast.IMap arg) {
    return arg != null ? new IMap<K, V> (arg) : null;
  }
}
