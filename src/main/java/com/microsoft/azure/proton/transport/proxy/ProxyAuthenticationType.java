package com.microsoft.azure.proton.transport.proxy;

/**
 * Supported methods of proxy authentication.
 */
public enum ProxyAuthenticationType {
    /**
     * Proxy requires no authentication. Service calls will fail if proxy demands authentication.
     */
    NONE,
    /**
     * Authenticates against proxy with basic authentication scheme.
     */
    BASIC,
    /**
     * Authenticates against proxy with digest access authentication.
     */
    DIGEST,
}
