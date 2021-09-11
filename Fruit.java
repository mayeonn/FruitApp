import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Fruit implements Comparable<Fruit>{
	int no;
	String name;
	int price;
	
	public static void main(String args[]) {
		List<Fruit> al = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(1,"김하연",25);
		al.add(s1);
		Fruit s2 = new Fruit(2,"기마연",22);
		al.add(s2);
		Fruit s3 = new Fruit(3,"김이름",99);
		al.add(s3);
		Fruit s4 = new Fruit(4,"나천재",17);
		al.add(s4);
		Fruit s5 = new Fruit(5,"바나나",5);
		al.add(s5);
		Fruit s6 = new Fruit(6,"아이유",32);
		al.add(s6);
		Fruit s7 = new Fruit(7,"마싫어",9);
		al.add(s7);
		Fruit s8 = new Fruit(8,"다롱이",3);
		al.add(s8);
		Fruit s9 = new Fruit(9,"사비나",28);
		al.add(s9);
		Fruit s10 = new Fruit(10,"라디옹",29);
		al.add(s10);
		
		 
		Collections.sort(al);
		for(Fruit s : al) {
			System.out.println(s.toString());
		}
		
	}
	
	public Fruit(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.no = i;
		this.name = string;
		this.price = j;
	}

	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
