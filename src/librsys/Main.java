package librsys;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Library taunton = new Library("Taunton");
        Customer simon = new Customer(taunton, "Simon");
        Author terry = new Author("Terry Pratchett");
        Book colour = new Book(taunton, 1617171, "Colour of Magic", terry, Genre.FANTASY);

       System.out.println(taunton.loanBook(simon, colour, 7)) ;
       System.out.println(taunton.getLoans().toString()) ;
       System.out.println(simon.getLoans().toString()) ;
    }
}
