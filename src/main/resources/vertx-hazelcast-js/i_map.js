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

/** @module vertx-hazelcast-js/i_map */
var utils = require('vertx-js/util/utils');
var DistributedObject = require('vertx-hazelcast-js/distributed_object');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JIMap = io.vertx.hazelcast.IMap;

/**
 Hazelcast Map API

 @class
*/
var IMap = function(j_val) {

  var j_iMap = j_val;
  var that = this;
  DistributedObject.call(this, j_val);

  /**
   
   <p/>
   <p><b>Warning:</b></p>
   <p>
   This method returns a clone of the original value, so modifying the returned value does not change
   the actual value in the map. You should put the modified value back to make changes visible to all nodes.
   <pre>
        V value = map.get(key);
        value.updateSomeProperty();
        map.put(key, value);
   </pre>
   </p>
   <p/>
   <p><b>Warning-2:</b></p>
   This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   defined in the <tt>key</tt>'s class.
   <p/>

   @public
   @param key {Object} 
   @param handler {function} 
   @return {IMap}
   */
  this.get = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_iMap["get(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(key), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnTypeUnknown(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param key {Object} 
   @param value {Object} 
   @param ttl {number} 
   @param timeunit {Object} 
   @param handler {function} 
   @return {IMap}
   */
  this.put = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function' && typeof __args[2] === 'function') {
      j_iMap["put(java.lang.Object,java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](utils.convReturnTypeUnknown(ar.result()), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 5 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function' && typeof __args[2] ==='number' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_iMap["put(java.lang.Object,java.lang.Object,long,java.util.concurrent.TimeUnit,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]), __args[2], java.util.concurrent.TimeUnit.valueOf(__args[3]), function(ar) {
      if (ar.succeeded()) {
        __args[4](utils.convReturnTypeUnknown(ar.result()), null);
      } else {
        __args[4](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param key {Object} 
   @param value {Object} 
   @param ttl {number} 
   @param timeunit {Object} 
   @param handler {function} 
   @return {IMap}
   */
  this.set = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function' && typeof __args[2] === 'function') {
      j_iMap["set(java.lang.Object,java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 5 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function' && typeof __args[2] ==='number' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_iMap["set(java.lang.Object,java.lang.Object,long,java.util.concurrent.TimeUnit,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]), __args[2], java.util.concurrent.TimeUnit.valueOf(__args[3]), function(ar) {
      if (ar.succeeded()) {
        __args[4](null, null);
      } else {
        __args[4](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   
   <p/>
   <p><b>Warning:</b></p>
   <p>
   This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
   the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
   defined in the <tt>key</tt>'s class.
   </p>
   <p/>
   <p><b>Warning-2:</b></p>
   <p>
   This method returns a clone of the previous value, not the original (identically equal) value
   previously put into the map.
   </p>

   @public
   @param key {Object} 
   @param handler {function} 
   @return {IMap}
   */
  this.remove = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_iMap["remove(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(key), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnTypeUnknown(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_iMap;
};

// We export the Constructor function
module.exports = IMap;