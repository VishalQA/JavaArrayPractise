package arrays;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// datatype arrayname = new datatype[arraysize]
		//int [] age = new int[5];
		int[] age = {1,2,3,4,5,6,7};
//		double[] salary = new double[5];
		
		for(int i=0; i< age.length; i++)
		{
			System.out.println(" Element at " + i + " is --->"  + age[i]);
			
		}
		
		age[0] = 50;
		age[5] = 60;
		
		for(int i = 0; i < age.length ; i++) {
			System.out.println("Elemets at "  +  i + " is --->  "  + age[i]);
		}
//		System.out.println(age[0]);
//		System.out.println(age[1]);
//		System.out.println(age[2]);
//		System.out.println(age[3]);
//		System.out.println(age[4]);
//		System.out.println(age[5]);
	}

}
