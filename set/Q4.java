package set;
import java.util.Iterator;
import java.util.TreeSet;

class Countrii {
    public TreeSet<String> H1 = new TreeSet<>();

    public TreeSet<String> saveCountriiNames(String CountriiName) {
        this.H1.add(CountriiName);
        return H1;
    }

    public String getCountrii(String countryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String country = it.next();
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Countrii cnt = new Countrii();

        // Adding countries
        cnt.saveCountriiNames("India");
        cnt.saveCountriiNames("China");
        cnt.saveCountriiNames("USA");

        // Retrieving countries
        System.out.println(cnt.getCountrii("India")); // Output: India
        System.out.println(cnt.getCountrii("USA")); // Output: USA
        System.out.println(cnt.getCountrii("Pakistan")); // Output: null
    }
}
