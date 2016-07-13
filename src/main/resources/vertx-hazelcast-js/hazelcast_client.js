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

/** @module vertx-hazelcast-js/hazelcast_client */
var utils = require('vertx-js/util/utils');
var IMap = require('vertx-hazelcast-js/i_map');
var Vertx = require('vertx-js/vertx');
var DistributedObject = require('vertx-hazelcast-js/distributed_object');
var IAtomicLong = require('vertx-hazelcast-js/i_atomic_long');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JHazelcastClient = io.vertx.hazelcast.HazelcastClient;

/**


 @class
*/
var HazelcastClient = function(j_val) {

  var j_hazelcastClient = j_val;
  var that = this;

  /**

   @public
   @param serviceName {string} 
   @param distributedObjectName {string} 
   @param handler {function} 
   @return {HazelcastClient}
   */
  this.getDistributedObject = function(serviceName, distributedObjectName, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_hazelcastClient["getDistributedObject(java.lang.String,java.lang.String,io.vertx.core.Handler)"](serviceName, distributedObjectName, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(ar.result(), DistributedObject), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param name {string} 
   @param handler {function} 
   @return {HazelcastClient}
   */
  this.getMap = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_hazelcastClient["getMap(java.lang.String,io.vertx.core.Handler)"](name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(ar.result(), IMap), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param name {string} 
   @param handler {function} 
   @return {HazelcastClient}
   */
  this.getAtomicLong = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_hazelcastClient["getAtomicLong(java.lang.String,io.vertx.core.Handler)"](name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(ar.result(), IAtomicLong), null);
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
  this._jdel = j_hazelcastClient;
};

/**

 @memberof module:vertx-hazelcast-js/hazelcast_client
 @param vertx {Vertx} 
 @return {HazelcastClient}
 */
HazelcastClient.create = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(JHazelcastClient["create(io.vertx.core.Vertx)"](vertx._jdel), HazelcastClient);
  } else throw new TypeError('function invoked with invalid arguments');
};

// We export the Constructor function
module.exports = HazelcastClient;