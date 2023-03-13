public class Quote {

    Author name;
    private String quote;



    public Quote(Author name, String quote) {
        this.name = name;
        this.quote = quote;
    }

    public Author getName() {
        return name;
    }

    public void setName(Author name) {
        this.name = name;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
