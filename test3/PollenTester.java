
public class PollenTester{
	public static void outputPollenTest(Fruit f){
		if(f.hasPollen()){
			System.out.println("Beware of the "+f.getName());
			System.out.println(f);
		}else{
			System.out.println("You may eat the "+f.getName());
			System.out.println(f);
		}
	}
	public static void main(String [] args){
		Melon m = new Melon();
		outputPollenTest(m);
		Guava j = new Guava();
		outputPollenTest(j);
	}
}

class Fruit{
	private boolean allergicTo = false;
	private String name = "";
	public Fruit(boolean allergicTo, String name){
		this.allergicTo = allergicTo;
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public boolean hasPollen(){
		return allergicTo;
	}
}

class Melon extends Fruit {
	Melon(){
		super(true, "Melon");
	}
	public String toString(){
		return "Melons may cause an allergic reaction";
	}
}

class Guava extends Fruit {
	Guava(){
		super(false, "Guava");
	}
	public String toString(){
		return "Guavas are unlikely to cause allergies";
	}
}