/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package com.siyueli.platfrom.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.internal.EnableZipkinServer;

/**
 * 服务跟踪--记录日志
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplication {
  public static void main(String[] args){
    SpringApplication.run(ZipkinServerApplication.class, args);

  }
}
