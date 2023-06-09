package com.gradle.develocity.assignment;

import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;

import java.util.concurrent.CompletableFuture;

public final class MyServer {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ServerBuilder sb = Server.builder();
        sb.http(5555);
        sb.service("/", (ctx, req) -> HttpResponse.of("Develocity Backend Code Project"));
        Server server = sb.build();
        CompletableFuture<Void> future = server.start();
        future.join();
    }

}
