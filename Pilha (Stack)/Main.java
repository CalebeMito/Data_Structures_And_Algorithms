import java.util.Stack;

public class Main {
	
	public static void main(String[]args) {
		
		Stack<String> stack = new Stack<String>();

		// *******************************************************
		  
		  // stack = LIFO data structure. Last-In First-Out
		  //               stores objects into a sort of "vertical tower"
		  //               push() to add objects to the top
		  //               pop() to remove objects from the top
		  
		  // uses of stacks?
		  // 1. undo/redo features in text editors
		  // 2. moving back/forward through browser history
		  // 3. backtracking algorithms (maze, file directories)
		  // 4. calling functions (call stack)
		  
		  // *******************************************************

		
		//System.out.println(stack.empty()); //para verificar se a lista esta vazia - ira retornar FALSE se a listanao estiver mais vazia
		
		stack.push("minecraft");//Adicionando objetos na lista
		stack.push("CS");
		stack.push("Valorant");
		stack.push("FFVII");
		
		//String MyFavGame = stack.pop();
		//System.out.println(stack.peek()); //printa o topo da pilha sem remover
		
		//stack.pop();//adiciona no lugar mais alto da lista 
		
		//System.out.println(stack.search("fallout76")); //ele procura na lista mas como nao existe ele retorna negativo
		//System.out.println(MyFavGame);
		
		for(int i=0; i < 1000000; i++) {
			stack.push("Fallout76");
		}
		
	}
}
