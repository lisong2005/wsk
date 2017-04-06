/**
 * Witontek.com.
 * Copyright (c) 2012-2016 All Rights Reserved.
 */
package com.witon.wpay.util;

import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.logging.Level;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Feature;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.logging.LoggingFeature.Verbosity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: JerseyClient.java, v 0.1 2016年6月21日 上午11:14:44 song.li@witontek.com Exp $
 */
public class EhJerseyClient {

    /**  */
    private static final String       COM_WITON_JERSEY_CLIENT = "com.witon.jersey.CLIENT";

    /**
    * Logger for this class
    */
    private static final Logger       logger                  = LoggerFactory
        .getLogger(COM_WITON_JERSEY_CLIENT);

    private static final ClientConfig CLIENT_CONFIG;

    private static final Client       CLIENT;

    public static final String        PROTOCOL                = "TLS";

    static {
        CLIENT_CONFIG = new ClientConfig();

        CLIENT_CONFIG.property(LoggingFeature.LOGGING_FEATURE_VERBOSITY_CLIENT,
            LoggingFeature.Verbosity.PAYLOAD_ANY);
        CLIENT_CONFIG.property(LoggingFeature.LOGGING_FEATURE_VERBOSITY_SERVER,
            LoggingFeature.Verbosity.PAYLOAD_ANY);

        CLIENT_CONFIG.property(ClientProperties.CONNECT_TIMEOUT, 10 * 1000);
        CLIENT_CONFIG.property(ClientProperties.READ_TIMEOUT, 100 * 1000);

        Level logLevel = Level.FINE;
        if (logger.isTraceEnabled() || logger.isDebugEnabled()) {
            logLevel = Level.INFO;
        }
        logger.warn("客户端调试日志级别 {}", logLevel);
        // 1 
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(COM_WITON_JERSEY_CLIENT);
        Feature feature = new LoggingFeature(log, logLevel, Verbosity.PAYLOAD_ANY, null);
        CLIENT_CONFIG.register(feature);

        CLIENT = ClientBuilder.newClient(CLIENT_CONFIG);
    }

    /**
     * 
     * @return
     */
    public static Client getJerseyClient() {
        return CLIENT;
    }

    public static Client getNewJerseyClient() {
        return ClientBuilder.newClient(CLIENT_CONFIG);
    }

    /**
     * 
     * @return
     */
    public static Client getSSLTrustJerseyClient() {
        try {

            HostnameVerifier verifier = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            TrustManager[] tm = new TrustManager[] { new X509TrustManager() {

                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkServerTrusted(X509Certificate[] chain,
                                               String authType) throws CertificateException {
                }

                public void checkClientTrusted(X509Certificate[] chain,
                                               String authType) throws CertificateException {
                }
            } };
            SSLContext sslContext = SSLContext.getInstance(PROTOCOL);
            sslContext.init(null, tm, new SecureRandom());

            return ClientBuilder.newBuilder().hostnameVerifier(verifier).sslContext(sslContext)
                .withConfig(CLIENT_CONFIG).build();
        } catch (Exception e) {
            logger.error("", e);
            return null;
        }
    }

}
