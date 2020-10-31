package com.nc.autumn2020.lesson6;

public class UrlHolder {
    private String protocol;
    private String domain;
    private int port;
    private KeyValueParameter[] keyValueParameters;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public KeyValueParameter[] getKeyValueParameters() {
        return keyValueParameters;
    }

    public void setKeyValueParameters(KeyValueParameter[] keyValueParameters) {
        this.keyValueParameters = keyValueParameters;
    }

    @Override
    public String toString() {
        //return native full url without Decoding
        return "UrlHolder{}";
    }
}
