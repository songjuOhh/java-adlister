import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album("Beenzino","Dali Van Picasso","hip-hop");
        Album album2 = new Album("NewJeans","Hype Boy","k-pop");

        ArrayList<Album> albums = new ArrayList<>(List.of(album1, album2));

        for(Album album : albums){
            System.out.println("\nArtist: "+album.getArtist()+"\nName:"+album.getName()+"\nGenre: "+album.getGenre());
        }


        Author author1 = new Author("Les", "Paul");
        Author author2 = new Author("Booker T.", "Washington");

        Quote quote1 = new Quote(author1, "Don't say you can't until you prove you can't.");
        Quote quote2 = new Quote(author2, "If you want to lift yourself up, lift up someone else.");

        ArrayList<Quote> quotes = new ArrayList<>(List.of(quote1, quote2));




        System.out.println(album1.getName());
        System.out.println(author1.getFirstName());
        System.out.println(quote1.getQuote() +" by "+author1.getFirstName() + author1.getLastName());
        System.out.println(quote2.getQuote() +" by "+author2.getFirstName() + author2.getLastName());



        for(Quote quote : quotes){
            System.out.println("\n"+quote.getQuote() +"\n by "+ quote.getName().getFullName()+"\n");
        }
    }
}
