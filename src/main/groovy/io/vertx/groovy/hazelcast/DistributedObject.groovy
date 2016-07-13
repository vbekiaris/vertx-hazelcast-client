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
 * Base interface for all distributed objects.
 *
 * All distributed objects are not garbage collectable unless  is called first.
 * Note: Failure to destroy after you are done using a distributed object will lead to memory leaks.
*/
@CompileStatic
public class DistributedObject {
  private final def io.vertx.hazelcast.DistributedObject delegate;
  public DistributedObject(Object delegate) {
    this.delegate = (io.vertx.hazelcast.DistributedObject) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Returns the key of the partition that this DistributedObject is assigned to. The returned value only has meaning
   * for a non-partitioned data structure like an {@link io.vertx.groovy.hazelcast.IAtomicLong}. For a partitioned data structure like an {@link io.vertx.groovy.hazelcast.IMap},
   * the returned value will not be null, but otherwise undefined.
   * @return the partition key.
   */
  public String getPartitionKey() {
    def ret = delegate.getPartitionKey();
    return ret;
  }
  /**
   * Returns the unique name for this DistributedObject. The returned value will never be null.
   * @return the unique name for this object.
   */
  public String getName() {
    def ret = delegate.getName();
    return ret;
  }
  /**
   * Returns the service name for this object.
   * @return the service name for this object.
   */
  public String getServiceName() {
    def ret = delegate.getServiceName();
    return ret;
  }
  /**
   * Destroys this object cluster-wide.
   * Clears and releases all resources for this object.
   * @param handler 
   */
  public void destroy(Handler<AsyncResult<Void>> handler) {
    delegate.destroy(handler);
  }
}
