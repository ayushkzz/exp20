package com.devops;

import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {
    public String greet() {
        return "CI/CD Pipeline Successful";
    }
    // public static void main(String[] args) {
    //     App app = new App();
    //     System.out.println(app.greet());
    // }
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // ✅ Frontend (HTML page)
        server.createContext("/", exchange -> {
            String html = "<html><body><h1>CI/CD Pipeline Demo</h1></body></html>";

            exchange.getResponseHeaders().add("Content-Type", "text/html");
            exchange.sendResponseHeaders(200, html.length());

            OutputStream os = exchange.getResponseBody();
            os.write(html.getBytes());
            os.close();
        });

        server.start();
    }
}