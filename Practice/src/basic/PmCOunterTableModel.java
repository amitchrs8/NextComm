package basic;

public class PmCOunterTableModel {


	public void updateCounterNames(){
		
	}
	
	
	public static void main(String[] args) {

	CounterType obj1 = CounterType.byShadetreeName("ne-ses");
	CounterType obj2 = CounterType.byShadetreeName("igmp-rx-no-errors-packets");

		System.out.println("First  "+obj1.getStmsName());
		
		System.out.println("Two : "+ obj2.getStmsName() +obj2);
	}
	
	
	
}
