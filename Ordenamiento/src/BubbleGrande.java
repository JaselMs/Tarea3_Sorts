import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class BubbleGrande {
public static void main(String[] args) {
	int data[] = {3,7,9,10,2,5,1,8,4};
	
	int Num[] = new int[1000000];
	
	int temp = 0;
	Random rd = new Random();
	//llenar con numeros aleatorios
	
	for (int i = 0; i < Num.length; i++) {
		Num[i] = rd.nextInt(100);
	}
	
	System.out.println(Arrays.toString(Num));
	
	//burbuja
	
	long start = System.nanoTime();
	
	
	
			
	for (int iteracion = 0; iteracion < Num.length; iteracion++) {
		for (int pivote = 0; pivote < Num.length - iteracion - 1; pivote++) {
			if (Num[pivote] > Num[pivote+1]) {
				temp = Num[pivote];
				Num[pivote] = Num[pivote + 1];
				Num[pivote + 1] = temp;
			} 
		}
		
	}System.out.println(Arrays.toString(Num)  );
	long end = System.nanoTime();
	long tiempo = end - start;
	System.out.println(tiempo);

	
	
	
	
	
	
}
}
