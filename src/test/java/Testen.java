import org.example.EchoClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testen {
    EchoClient client1;
    EchoClient client2;
    EchoClient client3;

    @Before
    public void setup() throws IOException {
        client1 = new EchoClient();
        client1.startConnection("127.0.0.1", 4444);
        client2 = new EchoClient();
        client2.startConnection("127.0.0.1", 4444);
//        client3 = new EchoClient();
//        client3.startConnection("127.0.0.1", 4446);

    }

    @After
    public void tearDown() throws IOException {
        client1.stopConnection();
        client2.stopConnection();
//        client3.stopConnection();
    }

    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
        String resp1 = client1.sendMessage("hello");
        String resp2 = client2.sendMessage("world");
//        String resp3 = client3.sendMessage("!");
//        String resp4 = client1.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
//        assertEquals("!", resp3);
//        assertEquals("good bye", resp4);
    }
}
