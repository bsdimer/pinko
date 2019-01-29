package com.dimomass.pinko.dir.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dimomass on 24.10.18.
 */

@Component
public class Directory {

    @Value("${directory.hostname:localhost}")
    String hostname;

    @Value("${server.port:8082}")
    String port;

    @Value("${directory.proto:http}")
    String proto;

    @Value("${directory.instance:default}")
    String instance;

    @Value("${directory.base}")
    String base;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
