package tests.day_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import algorithms.day_9.Troll;

class TrollTest {

    @Test
    void disemvowel() {
        assertEquals("Ths wbst s fr lsrs LL!", Troll.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));
    }
}