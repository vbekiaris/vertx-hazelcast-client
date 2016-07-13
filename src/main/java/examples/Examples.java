package examples;

import io.vertx.core.Vertx;
import io.vertx.hazelcast.HazelcastClient;

/**
 *
 * Examples used in the documentation.
 *
 */
public class Examples {

  public void example1(Vertx vertx) {
    HazelcastClient hz = HazelcastClient.create(vertx);
  }

}
