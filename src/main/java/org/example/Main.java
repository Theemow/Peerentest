package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EchoServer server1 = new EchoServer();
        server1.start(4444);
        EchoServer server2 = new EchoServer();
        server2.start(5555);
//        EchoServer server3 = new EchoServer();
//        server3.start(4446);
    }
}