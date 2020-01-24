package librsys;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        Library taunton = new Library("Taunton");
        CLI cli = new CLI(taunton);

    }
}
