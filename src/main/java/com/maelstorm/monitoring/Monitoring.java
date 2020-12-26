package com.maelstorm.monitoring;

public interface Monitoring {
    void defaultPing();
    void ping(String resourceName);
    void ping(String resourceName,int packageAmount);
}
