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

/** @module vertx-hazelcast-js/i_atomic_long */
var utils = require('vertx-js/util/utils');
var DistributedObject = require('vertx-hazelcast-js/distributed_object');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JIAtomicLong = io.vertx.hazelcast.IAtomicLong;

/**
 A proxy for IAtomicLong

 @class
*/
var IAtomicLong = function(j_val) {

  var j_iAtomicLong = j_val;
  var that = this;
  DistributedObject.call(this, j_val);

  /**

   @public
   @param delta {number} 
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.addAndGet = function(delta, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_iAtomicLong["addAndGet(long,io.vertx.core.Handler)"](delta, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param expect {number} 
   @param update {number} 
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.compareAndSet = function(expect, update, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_iAtomicLong["compareAndSet(long,long,io.vertx.core.Handler)"](expect, update, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.decrementAndGet = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_iAtomicLong["decrementAndGet(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.get = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_iAtomicLong["get(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param delta {number} 
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.getAndAdd = function(delta, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_iAtomicLong["getAndAdd(long,io.vertx.core.Handler)"](delta, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param newValue {number} 
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.getAndSet = function(newValue, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_iAtomicLong["getAndSet(long,io.vertx.core.Handler)"](newValue, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.incrementAndGet = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_iAtomicLong["incrementAndGet(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.getAndIncrement = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_iAtomicLong["getAndIncrement(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param newValue {number} 
   @param handler {function} 
   @return {IAtomicLong}
   */
  this.set = function(newValue, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_iAtomicLong["set(long,io.vertx.core.Handler)"](newValue, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
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
  this._jdel = j_iAtomicLong;
};

// We export the Constructor function
module.exports = IAtomicLong;