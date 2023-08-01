package set;
import java.util.*;

class Country{
	public HashSet<String> H1=new HashSet<>();
	String CountryName;
	 public HashSet<String> saveCountryNames(String CountryName) {
		 this.CountryName=CountryName;
		 H1.add(CountryName);
		 return H1;
	 }
	public String getCountry(String countryName) {
		// TODO Auto-generated method stub
		Iterator<String> it=H1.iterator();
		while(it.hasNext()) {
			String country=it.next();
			if(country.equalsIgnoreCase(countryName)) {
				return country;
				}
			}return null;
	}
}

public class Q1 {
	public static void main(String[] args) {
		Country cnt=new Country();
		
		//adding country
		cnt.saveCountryNames("India");
		cnt.saveCountryNames("China");
		cnt.saveCountryNames("Usa");
		
//		Retrieving country
		
		System.out.println(cnt.getCountry("India"));
		System.out.println(cnt.getCountry("usa"));
		System.out.print(cnt.getCountry("pakistan"));
	}
}
