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

import java.util.concurrent.TimeUnit;

/**
 * Hazelcast Map API
 */
@VertxGen
public interface IMap<K, V> extends DistributedObject {

    /**
     * {@inheritDoc}
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
     *
     * @throws NullPointerException if the specified key is null.
     */
    @Fluent
    IMap get(K key, Handler<AsyncResult<V>> handler);

    /**
     * {@inheritDoc}
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
     *
     * @throws NullPointerException if the specified key or value is null.
     */
    @Fluent
    IMap put(K key, V value, Handler<AsyncResult<V>> handler);

    @Fluent
    IMap put(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<V>> handler);

    @Fluent
    IMap set(K key, V value, Handler<AsyncResult<Void>> handler);

    @Fluent
    IMap set(K key, V value, long ttl, TimeUnit timeunit, Handler<AsyncResult<Void>> handler);


    /**
     * {@inheritDoc}
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
     *
     * @throws NullPointerException if the specified key is null.
     */
    @Fluent
    IMap remove(K key, Handler<AsyncResult<V>> handler);

}
