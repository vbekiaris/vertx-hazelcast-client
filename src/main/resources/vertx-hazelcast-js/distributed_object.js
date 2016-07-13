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

/** @module vertx-hazelcast-js/distributed_object */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JDistributedObject = io.vertx.hazelcast.DistributedObject;

/**
 Base interface for all distributed objects.

 @class
*/
var DistributedObject = function(j_val) {

  var j_distributedObject = j_val;
  var that = this;

  /**
   Returns the key of the partition that this DistributedObject is assigned to. The returned value only has meaning
   for a non-partitioned data structure like an {@link IAtomicLong}. For a partitioned data structure like an {@link IMap},
   the returned value will not be null, but otherwise undefined.

   @public

   @return {string} the partition key.
   */
  this.getPartitionKey = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_distributedObject["getPartitionKey()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the unique name for this DistributedObject. The returned value will never be null.

   @public

   @return {string} the unique name for this object.
   */
  this.getName = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_distributedObject["getName()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the service name for this object.

   @public

   @return {string} the service name for this object.
   */
  this.getServiceName = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_distributedObject["getServiceName()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Destroys this object cluster-wide.
   Clears and releases all resources for this object.

   @public
   @param handler {function} 
   */
  this.destroy = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_distributedObject["destroy(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_distributedObject;
};

// We export the Constructor function
module.exports = DistributedObject;