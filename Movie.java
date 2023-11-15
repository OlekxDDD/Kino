import java.util.ArrayList;
import java.util.List;

public class Movie {
    String data;
    String title;
    List<Ticket> tickets = new ArrayList<>();
    Movie(String data,String title){
        this.data = data;
        this.title = title;
    }
    void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
}
