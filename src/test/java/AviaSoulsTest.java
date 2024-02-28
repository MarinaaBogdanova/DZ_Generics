

    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.Test;

    import java.util.Comparator;

    class AviaSoulsTest {

        @Test
        public void sortTickets() {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket ("Москва", "Ростов", 300, 5, 8);
            Ticket ticket2 = new Ticket ("Сочи", "Казань", 500, 2, 4);
            Ticket ticket3 = new Ticket ("Саратов", "Краснодар", 100, 4, 10);
            Ticket ticket4 = new Ticket ("Сочи", "Казань", 400, 1, 4);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);

            Ticket[] actual = manager.search("Сочи", "Казань");
            Ticket[] expected = {ticket4, ticket2};

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void sortTicketIfNotExist() {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket ("Москва", "Ростов", 300, 5, 8);
            Ticket ticket2 = new Ticket ("Сочи", "Казань", 500, 2, 4);
            Ticket ticket3 = new Ticket ("Саратов", "Краснодар", 100, 4, 10);
            Ticket ticket4 = new Ticket ("Сочи", "Казань", 400, 1, 4);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);

            Ticket[] actual = manager.search("Ереван", "Тбилиси");
            Ticket[] expected = {};

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void sortTicketWithOneTicket() {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket ("Москва", "Ростов", 300, 5, 8);
            Ticket ticket2 = new Ticket ("Сочи", "Казань", 500, 2, 4);
            Ticket ticket3 = new Ticket ("Саратов", "Краснодар", 100, 4, 10);
            Ticket ticket4 = new Ticket ("Сочи", "Казань", 400, 1, 4);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);

            Ticket[] actual = manager.search("Москва", "Ростов");
            Ticket[] expected = {ticket1};

            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void sortTicketsWithComparator() {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket ("Москва", "Ростов", 300, 5, 8);
            Ticket ticket2 = new Ticket ("Сочи", "Казань", 500, 2, 4);
            Ticket ticket3 = new Ticket ("Саратов", "Краснодар", 100, 4, 10);
            Ticket ticket4 = new Ticket ("Сочи", "Казань", 400, 1, 4);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            Ticket[] actual = manager.search("Сочи", "Казань");
            Ticket[] expected = {ticket4, ticket2};

            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void sortTicketIfNotExistWithComparator() {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket ("Москва", "Ростов", 300, 5, 8);
            Ticket ticket2 = new Ticket ("Сочи", "Казань", 500, 2, 4);
            Ticket ticket3 = new Ticket ("Саратов", "Краснодар", 100, 4, 10);
            Ticket ticket4 = new Ticket ("Сочи", "Казань", 400, 1, 4);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            Ticket[] actual = manager.search("Ереван", "Тбилиси");
            Ticket[] expected = {};

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void sortTicketWithOneTicketWithComparator() {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket ("Москва", "Ростов", 300, 5, 8);
            Ticket ticket2 = new Ticket ("Сочи", "Казань", 500, 2, 4);
            Ticket ticket3 = new Ticket ("Саратов", "Краснодар", 100, 4, 10);
            Ticket ticket4 = new Ticket ("Сочи", "Казань", 400, 1, 4);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            Ticket[] actual = manager.search("Москва", "Ростов");
            Ticket[] expected = {ticket1};

            Assertions.assertArrayEquals(expected, actual);
        }
    }

