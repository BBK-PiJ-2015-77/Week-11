public class ComparatorTest{
	public static void main(String[] args){
		Comparator intCom = new Comparator();
		System.out.println(intCom.getMax(5,6));
		System.out.println(intCom.getMax(5.0,6.0));
		System.out.println(intCom.getMax("5","6"));
	}
}

