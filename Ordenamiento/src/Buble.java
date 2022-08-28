import java.util.Arrays;

public class Buble {
public static void main(String[] args) {
	int data[] = {3,7,9,10,2,5,1,8,4};
	
	int temp = 0;
	
	//burbuja
	
	long start = System.nanoTime();
			
	for (int iteracion = 0; iteracion < data.length; iteracion++) {
		for (int pivote = 0; pivote < data.length - iteracion - 1; pivote++) {
			if (data[pivote] > data[pivote+1]) {
				temp = data[pivote];
				data[pivote] = data[pivote + 1];
				data[pivote + 1] = temp;
			} 
		}System.out.println(Arrays.toString(data)  );
		
	}
	long end = System.nanoTime();
	long tiempo = end - start;
	System.out.println(tiempo);

	
	
	
	
	
	
}
}
