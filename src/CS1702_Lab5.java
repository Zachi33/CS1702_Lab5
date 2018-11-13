import java.util.ArrayList;
public class CS1702_Lab5 {
	
	
	public static void main(String args[])
	{
//		five_three_normalArray();//this is just for me
//		five_three_ArrayList();
//		casting();
		Arraylist_cons();
		
	}
	
	
	
	
	public static void five_three_normalArray() {
		Data[] w = new Data[3];
		w[0]=new Data("Fred",21);
		w[1]=new Data("Jo",43);
		w[2]=new Data("Zoe",37);
		
		for(int i=0;i<w.length;i++) {
			w[i].Print();
			//it'd be hard to modify this array
	}}
	public static void five_three_ArrayList() {
		ArrayList<Data> data = new ArrayList<Data>();
		data.add(new Data("Fred",21));
		data.add(new Data("Jo",43));
		data.add(new Data("Zoe",37));
		for(int i=0;i<data.size();i++) {
			data.get(i).Print();
			
	}
		
		//modifying array
		data.add(2, new Data("Harry",78));//this is how I'd do it!
		for(int i=0;i<data.size();i++) {
			data.get(i).Print();
	}
	}
	public static void casting() {

				double x = 10.3;
				int y = (int)x;
				System.out.println(y);
				Byte by = new Byte((byte)256);
				/*/conversion process that outputs byte variable type has 
				* to deal with its very limited capacity 
				* (-128 to 127)If the converted Integer value doesn't fit within 
				* that range, program will either subtract or add multiples of 
				* 255 to make the number appear in said range./*/
				System.out.println(by);
				System.out.println(by);
				Long v1 = (long)10;
				Float v2 = (float)10.3;
				System.out.println(v1);
				System.out.println(v2);

				
		
	}
	public static void Arraylist_cons() {
		ArrayList<Data> ArrayA =new ArrayList<Data>();
		ArrayA.add(new Data("Fred",21));
		ArrayA.add(new Data("Jo",43));
		ArrayA.add(new Data("Zoe",37));
		ArrayList<Data> ArrayB =new ArrayList<Data>();
		ArrayList<Data> ArrayC =new ArrayList<Data>();
		ArrayList<Data> ArrayD =new ArrayList<Data>();
		
		PrintDataArray(ArrayA);
		System.out.println();
		
		ArrayB = ArrayA;
		ArrayC= ArrayA;
		/*/
		 * Assigning one Arraylist to another doesn't literally copy all the data but
		 * only makes a reference point (so both variables use the same Data). To effectively
		 * copy all data points clone function has to be used
		 */
		ArrayD = (ArrayList<Data>)ArrayC.clone();	
		
		PrintDataArray(ArrayB);
		System.out.println();
		ArrayA.remove(1);
		PrintDataArray(ArrayB);
		System.out.println();
		PrintDataArray(ArrayC);
		System.out.println();
		PrintDataArray(ArrayD);		
		
		

		
	}
	private static void PrintDataArray(ArrayList<Data> arrayA) {
		for(int i=0;i<arrayA.size();i++) {
			arrayA.get(i).Print();
		}
		
	}
 }
