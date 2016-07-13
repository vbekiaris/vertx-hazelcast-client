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
import io.vertx.groovy.core.Vertx
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
/**
 *
*/
@CompileStatic
public class HazelcastClient {
  private final def io.vertx.hazelcast.HazelcastClient delegate;
  public HazelcastClient(Object delegate) {
    this.delegate = (io.vertx.hazelcast.HazelcastClient) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public static HazelcastClient create(Vertx vertx) {
    def ret = InternalHelper.safeCreate(io.vertx.hazelcast.HazelcastClient.create(vertx != null ? (io.vertx.core.Vertx)vertx.getDelegate() : null), io.vertx.groovy.hazelcast.HazelcastClient.class);
    return ret;
  }
  public HazelcastClient getDistributedObject(String serviceName, String distributedObjectName, Handler<AsyncResult<DistributedObject>> handler) {
    delegate.getDistributedObject(serviceName, distributedObjectName, handler != null ? new Handler<AsyncResult<io.vertx.hazelcast.DistributedObject>>() {
      public void handle(AsyncResult<io.vertx.hazelcast.DistributedObject> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(InternalHelper.safeCreate(ar.result(), io.vertx.groovy.hazelcast.DistributedObject.class)));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    } : null);
    return this;
  }
  public HazelcastClient getMap(String name, Handler<AsyncResult<IMap>> handler) {
    delegate.getMap(name, handler != null ? new Handler<AsyncResult<io.vertx.hazelcast.IMap>>() {
      public void handle(AsyncResult<io.vertx.hazelcast.IMap> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(InternalHelper.safeCreate(ar.result(), io.vertx.groovy.hazelcast.IMap.class)));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    } : null);
    return this;
  }
  public HazelcastClient getAtomicLong(String name, Handler<AsyncResult<IAtomicLong>> handler) {
    delegate.getAtomicLong(name, handler != null ? new Handler<AsyncResult<io.vertx.hazelcast.IAtomicLong>>() {
      public void handle(AsyncResult<io.vertx.hazelcast.IAtomicLong> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(InternalHelper.safeCreate(ar.result(), io.vertx.groovy.hazelcast.IAtomicLong.class)));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    } : null);
    return this;
  }
}
