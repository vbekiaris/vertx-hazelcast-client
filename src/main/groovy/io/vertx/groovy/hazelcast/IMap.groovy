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
import java.util.concurrent.TimeUnit
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
/**
 * Hazelcast Map API
*/
@CompileStatic
public class IMap<K,V> extends DistributedObject {
  private final def io.vertx.hazelcast.IMap delegate;
  public IMap(Object delegate) {
    super((io.vertx.hazelcast.IMap) delegate);
    this.delegate = (io.vertx.hazelcast.IMap) delegate;
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
    delegate.get(key != null ? InternalHelper.unwrapObject(key) : null, handler != null ? new Handler<AsyncResult<java.lang.Object>>() {
      public void handle(AsyncResult<java.lang.Object> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((Object) InternalHelper.wrapObject(ar.result())));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    } : null);
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
   * @param handler 
   * @return 
   */
  public IMap put(K key, V value, Handler<AsyncResult<V>> handler) {
    delegate.put(key != null ? InternalHelper.unwrapObject(key) : null, value != null ? InternalHelper.unwrapObject(value) : null, handler != null ? new Handler<AsyncResult<java.lang.Object>>() {
      public void handle(AsyncResult<java.lang.Object> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((Object) InternalHelper.wrapObject(ar.result())));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    } : null);
    return this;
  }
  public IMap putAsync(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<V>> handler) {
    delegate.putAsync(key != null ? InternalHelper.unwrapObject(key) : null, value != null ? InternalHelper.unwrapObject(value) : null, ttl, timeunit, handler != null ? new Handler<AsyncResult<java.lang.Object>>() {
      public void handle(AsyncResult<java.lang.Object> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((Object) InternalHelper.wrapObject(ar.result())));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    } : null);
    return this;
  }
  public IMap setAsync(K key, V value, Handler<AsyncResult<Void>> handler) {
    delegate.setAsync(key != null ? InternalHelper.unwrapObject(key) : null, value != null ? InternalHelper.unwrapObject(value) : null, handler);
    return this;
  }
  public IMap setAsync(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<Void>> handler) {
    delegate.setAsync(key != null ? InternalHelper.unwrapObject(key) : null, value != null ? InternalHelper.unwrapObject(value) : null, ttl, timeunit, handler);
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
   * @param handler 
   * @return 
   */
  public IMap remove(K key, Handler<AsyncResult<V>> handler) {
    delegate.remove(key != null ? InternalHelper.unwrapObject(key) : null, handler != null ? new Handler<AsyncResult<java.lang.Object>>() {
      public void handle(AsyncResult<java.lang.Object> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture((Object) InternalHelper.wrapObject(ar.result())));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    } : null);
    return this;
  }
}
