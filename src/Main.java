import com.design.pattern1.Print;
import com.design.pattern1.PrintBanner;

public class Main {

    public static void main(String[] args) {

        Print print = new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();

    }
}
