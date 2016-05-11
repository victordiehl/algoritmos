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
				int pips = 0;
				int pops = 0;				
				for(int i = 0; i<parts.length; i++){
					if(parts[i].equals("(")) 
					pips++;
					if(!parts[i].equals(")"))  
						p.push(parts[i]);
					else {
						pops++;						
						Double val1 = Double.parseDouble(p.pop());
						String op = p.pop(); 
						Double val2 = Double.parseDouble(p.pop());
						p.pop();
						Double resposta = (double) 0;
						switch(op){
							case "+": resposta = val2 + val1;
							break;
							case "-": resposta = val2 - val1;
							break;
							case "*": resposta = val2 * val1;
							break;
							case "/": resposta = val2 / val1;
							break;
							case "^": resposta = Math.pow(val2, val1);
							break;
						}
						
						p.push(resposta.toString());					
					}
					
				}
				System.out.println(pips + " " + pops);
				System.out.println(p.top());				
				p.clear();
			}
			
		} catch(IOException e) {
			
		}
	}
}
