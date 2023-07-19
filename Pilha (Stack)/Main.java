import java.util.Stack;

public class Main {
	
	public static void main(String[]args) {
		
		Stack<String> stack = new Stack<String>();

		//System.out.println(stack.empty()); //para verificar se a lista esta vazia - ira retornar FALSE se a listanao estiver mais vazia
		
		
		stack.push("minecraft");//Adicionando objetos na lista
		stack.push("CS");
		stack.push("Valorant");
		stack.push("FFVII");
		
		//String MyFavGame = stack.pop();
		//System.out.println(stack.peek()); //printa o topo da pilha sem remover
		
		//stack.pop();//adiciona no lugar mais alto da lista 
		
		System.out.println(stack.search("fallout76"));
		//System.out.println(MyFavGame);
		
	}
}
