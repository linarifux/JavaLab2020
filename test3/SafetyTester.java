
class Person{
	private boolean isWearingMask = false;
	private String name = "";
	public Person(boolean isWearingMask, String name){
		this.isWearingMask = isWearingMask;
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public boolean hasMaskOn(){
		return isWearingMask;
	}
}

class Lee extends Person {
	Lee(){
		super(true, "Lee");
	}

	public String toString(){
		return "Lee may transmit Covid";
	}
	
}

class Park extends Person {
	Park(){
		super(false, "Park");
	}
	public String toString(){
		return "Park is unlikely to transmit Covid";
	}
}

public class SafetyTester{
	public static void outputPollenTest(Person f){
		System.out.println("Safety check: ");
		if(f.hasMaskOn()){
			System.out.println("Beware of "+f.getName());
			System.out.println(f);
		}else{
			System.out.println("You may be around "+f.getName());
			System.out.println(f);
		}
	}
	public static void main(String [] args){
		Lee m = new Lee();
		outputPollenTest(m);
		Park j = new Park();
		outputPollenTest(j);
	}
}