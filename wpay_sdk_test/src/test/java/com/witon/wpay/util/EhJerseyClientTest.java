package com.witon.wpay.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URL;
import java.net.URLConnection;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;

/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.util.model.BaseRequest;
import com.witon.wpay.util.model.BaseResponse;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: EhJerseyClientTest.java, v 0.1 2017年4月6日 下午2:35:00 song.li@witontek.com Exp $
 */
public class EhJerseyClientTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(EhJerseyClientTest.class);

    @Test
    public void test_001() {
        logger.debug("xx");
    }

    @Test
    public void test_client_hello1() {
        try {
            Client client = EhJerseyClient.getJerseyClient();
            WebTarget target = client.target("http://localhost:8080/wpay/").path("success.json");
            String resp = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
            logger.info("{}", resp);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_post() {
        logger.info("");
        try {
            Client client = EhJerseyClient.getJerseyClient();
            WebTarget target = client.target("http://localhost:8090/wpay/rest").path("gateway.do");

            BaseRequest req = new BaseRequest();
            BaseResponse restResult = target.request(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.json(req), BaseResponse.class);

            logger.info("{}", restResult);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_proxy_NO() {
        logger.info("");
        try {

            Client client = EhJerseyClient.getJerseyClient();
            WebTarget target = client.target("https://www.google.com");

            String restResult = target.request().get(String.class);

            logger.info("{}", restResult);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_proxy_() {
        logger.info("");
        try {
            //            System.setProperty("http.proxyHost", "127.0.0.1");
            //            System.setProperty("http.proxyPort", "1080");

            System.setProperty("https.proxyHost", "127.0.0.1");
            System.setProperty("https.proxyPort", "1080");

            //            System.setProperty("socksProxyHost", "127.0.0.1");
            //            System.setProperty("socksProxyPort", "1080");

            Client client = EhJerseyClient.getJerseyClient();
            WebTarget target = client.target("https://www.google.com");

            String restResult = target.request().get(String.class);

            logger.info("{}", restResult);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_proxy_2() {
        logger.info("");
        try {
            SocketAddress addr = new InetSocketAddress("127.0.0.1", 1080);
            Proxy proxy;
            proxy = new Proxy(Proxy.Type.SOCKS, addr);
            proxy = new Proxy(Proxy.Type.HTTP, addr);
            URL url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection(proxy);

            InputStream in = conn.getInputStream();
            logger.info("{}", in);

            StringWriter sw = new StringWriter();
            IOUtils.copy(in, sw, "utf-8");
            logger.info("{}", sw.toString());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    // =============================================
    // =============================================
    // =============================================

    @Test
    public void test_proxy_socket() {

        logger.info("");
        try {
            SocketAddress addr = new InetSocketAddress("127.0.0.1", 1080);
            Proxy proxy = new Proxy(Proxy.Type.SOCKS, addr);
            Socket socket = new Socket(proxy);
            InetSocketAddress dest = new InetSocketAddress("www.google.com", 443);
            socket.connect(dest);

            logger.info("{}", socket);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), "utf-8"));
            BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

            logger.info("xxx");
            bw.write("GET https://www.google.com\n\n");
            bw.flush();

            for (;;) {
                String ss = br.readLine();
                if (ss == null) {
                    break;
                }
                System.out.println(ss);
            }

            IOUtils.closeQuietly(socket);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

}
