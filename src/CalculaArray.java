
public class CalculaArray {
	
	public static void main(String[]args) {
		
		int soma = 0;
		int media = 0;
		int maximo = 0;
		int minimo = 100;
		int [] intArray = new int []{3,5,1,9};
		//System.out.println(intArray[0]);
		for(int i : intArray) {
			soma+= i;
			maximo = maximo < i ? i: maximo;
			minimo = minimo > i ? i: minimo;
			
			//System.out.println(i);
			
		}
		media = soma / intArray.length;
		System.out.println("Soma: "+ soma);
		System.out.println("media: "+ media);
		System.out.println("maximo: "+ maximo);
		System.out.println("minimo: "+ minimo);
	}
}
