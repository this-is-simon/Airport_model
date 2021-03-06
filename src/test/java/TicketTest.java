import Airport.Destination;
import Airport.Ticket;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TicketTest {

    Ticket ticket1;
    Ticket ticket2;

    @Before
    public void before() {
        ticket1 = new Ticket(Destination.MAGALUF, 90.0);
        ticket2 = new Ticket(Destination.IBIZA, 85.0);
    }

    @Test
    public void ticketHasDestination() {
        assertEquals("Ibiza", ticket2.getDestination().getDestination());
    }

}
