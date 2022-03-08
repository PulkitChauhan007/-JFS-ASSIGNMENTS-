import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class Details implements Comparable<Details>{
	private String name;
	private String email;
	private String gender;
	
	public Details(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Name:"+name+" Email:"+email+" Gender:"+gender;
	}
	@Override
	public int compareTo(Details o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
}

class phoneNumber implements Comparable<phoneNumber>{
	private long number;

	public phoneNumber(long number) {
		super();
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}

	public String toString() {
		return String.valueOf(number);
		
	}
	

	@Override
	public int compareTo(phoneNumber o) {
		// TODO Auto-generated method stub
		return this.toString().compareTo(o.toString());
	}
	
	
}
public class collectionQ1 {

	public static void main(String[] args) {
		Details D1 = new Details("Ayushman", "Ay@gmail.com", "Male");
		Details D2 = new Details("pulkit", "pu@gmail.com", "Male");
		Details D3 = new Details("mujhaid", "mu@gmail.com", "Male");
		Details D4 = new Details("jha", "jh@gmail.com", "Male");
		Details D5 = new Details("pulkkit", "pu@gmail.com", "Male");
		
		phoneNumber P1 = new phoneNumber(9515962633l);
		phoneNumber P2 = new phoneNumber(9525962633l);
		phoneNumber P3 = new phoneNumber(9535962633l);
		phoneNumber P4 = new phoneNumber(9545962633l);
		phoneNumber P5 = new phoneNumber(9555962633l);
		
		SortedMap<phoneNumber, Details> map = new TreeMap<>(Comparator.reverseOrder());
		
		map.put(P1,D1);
		map.put(P2,D2);
		map.put(P3,D3);
		map.put(P4,D4);
		map.put(P5,D5);
		
	
		Set<Entry<phoneNumber, Details>> entrySet = map.entrySet();

	    int index = 0;
	    for (Entry<phoneNumber, Details> currentEntry :entrySet) {
	        System.out.println("Key at " + index + ":"+ currentEntry.getKey());
			index++;
			}
	    int index2=0;
	    for (Entry<phoneNumber, Details> currentEntry :entrySet) {
	        System.out.println("Value at " + index2 + ":"+ currentEntry.getValue());
			index2++;
			}
	    
        
        for (Entry<phoneNumber, Details> entry : map.entrySet()) {     
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	    	
	    }
	}

}