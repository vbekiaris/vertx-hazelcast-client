/**
 * = Vert.x-hazelcast-client
 * :toc: left
 *
 * Vert.x-hazelcast-client allows Vert.x applications to interact with a [Hazelcast](http://hazelcast.org) cluster.
 *
 * This module currently supports a few Hazelcast features, implemented with respect to Vert.x threading model and async
 * invocation style:
 * * ``IMap`` data access
 * * ``IAtomicLong``
 *
 * = Development & testing
 * TODOs:
 * * Introduce ``HazelcastOptions`` data object for JSON config of Hazelcast client (look into existing hazelcast node.js
 * client for consistency)
 * * Support ``AsyncAtomicReference``
 * * Support for generic ``DistributedObject`` proxies
 * * Listeners support
 *
 * Tests should extend ``AbstractHazelcastClientTest`` which starts and shuts down an embedded Hazelcast member before / after
 * test class' tests.
 *
 */
@ModuleGen(name = "vertx-hazelcast", groupPackage = "io.vertx")
@Document(fileName = "index.adoc")
package io.vertx.hazelcast;

import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.docgen.Document;
