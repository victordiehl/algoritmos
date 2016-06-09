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
				int contaParenteses = 0;
				String parts[]= line.split(" ");	
				
				//Verificação da expressão
				for(int i = 0; i<parts.length; i++){
					if(parts[i].equals("("))
						contaParenteses++;
					if(parts[i].equals(")"))
						contaParenteses--;
				}
				if(contaParenteses != 0) {
					System.out.println("Erro de Sintaxe!");
					System.out.println(" ");
					continue;
				}
					
					//cálculos.
				for(int j = 0; j<parts.length; j++){					
					if(!parts[j].equals(")"))  
						p.push(parts[j]);
					else {											
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
				System.out.println("Resultado: " + p.top());
				System.out.println("Tamanho máximo: " + p.max());
				System.out.println(" ");
				p.clear();
			}
			
		} catch(IOException e) {
			
		}
	}
}
