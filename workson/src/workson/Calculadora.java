package workson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora {
		
	public static void main(String agrs[]) throws IOException{
		try{
			BufferedReader br = new BufferedReader(new FileReader("expressoes.txt"));
			String line;
			Pilha p = new Pilha();
			
			while ((line = br.readLine()) != null) {			
				String parts[]= line.split(" ");
				for(int i = 0; i<parts.length; i++){
					p.push(parts[i]);
					System.out.println(p.top());
					if(parts[i].equals(")")){
						break;
					}														
				}
				break;
			}
			
		} catch(IOException e) {
			
		}
	}
}
