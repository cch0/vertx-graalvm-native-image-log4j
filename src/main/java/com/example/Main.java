package com.example;

import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {

    Vertx.vertx()
        .deployVerticle(new MainVerticle())
        .onSuccess(id -> logger.info("✅ Started"))
        .onFailure(
            failure -> {
              logger.warn("🚨 Deployment failed", failure);
            });
  }

}
