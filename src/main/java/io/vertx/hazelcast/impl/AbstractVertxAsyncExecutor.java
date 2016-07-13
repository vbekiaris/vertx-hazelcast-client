package io.vertx.hazelcast.impl;

import com.hazelcast.core.ICompletableFuture;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

/**
 *
 */
public class AbstractVertxAsyncExecutor {
    protected final Vertx vertx;

    public AbstractVertxAsyncExecutor(Vertx vertx) {
        this.vertx = vertx;
    }

    public <T> void executeAsync(ICompletableFuture<T> future,
                                 Handler<AsyncResult<T>> resultHandler) {
        future.andThen(
                new HandlerCallBackAdapter(resultHandler),
                VertxExecutorAdapter.getOrCreate(vertx.getOrCreateContext())
        );
    }
}
