package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void nodeShouldStoreSquirrel() {
        Squirrel testSquirrel = new Squirrel("Testy");
        Node node = new Node(testSquirrel);
        assertEquals("Testy", node.getData().getName());
    }
}
