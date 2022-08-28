import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stupid {
 public static void main(String[] args) {
	 int Stu[] = {3,9,2,4,8,1,5,12,7,11,6,10};
	 boolean ordenado = false;
	 Random rd = new Random();
	 
	 
		long start = System.nanoTime();
		
	 while(ordenado == false) {
		 for (int i = 0; i < Stu.length; i++) {
			int RandPos = rd.nextInt(Stu.length);
			int temp = Stu[i];
			Stu[i] = Stu[RandPos];
			Stu[RandPos] = temp; 
		}
		 
		 System.out.println(Arrays.toString(Stu));
		 
		 
			 for (int j = 0; j < Stu.length ; j++) {
				 	if(Stu[j] < Stu[j + 1]) {
				 		if(Stu[j + 1] > Stu.length) {
				 			 long end = System.nanoTime();
				 			long tiempo = end - start;
				 			System.out.println(tiempo);

				 		}
				 		}else {
				 		break;	
				 		}
			 }
		 }ordenado=true;
	 

		 
 }
}
	 
	 
	 
	 
