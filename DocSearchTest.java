import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testEmpty() throws Exception {
        Handler h = new Handler("./technical/");
        URI uri = new URI("http://localhost:4000/");
        assertEquals("There are 1391 files to search!", h.handleRequest(uri));
    }

    @Test
    public void testSearch() throws Exception {
        Handler h = new Handler("./technical/");
        URI uri = new URI("http://localhost:4000/search?q=base%20pair");
        assertEquals("There were 76 files found", h.handleRequest(uri).substring(0, 25));
    }
}