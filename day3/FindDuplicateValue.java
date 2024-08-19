package week1.day3;

public class FindDuplicateValue {

	public static void main(String[] args) {
		int[] data = {2, 5, 7, 7, 5, 9, 2, 3};
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i]==data[j]) {
					System.out.println("duplicate value is:"+data[j]);
					
				}
				
			}
			
		}

	}

}
