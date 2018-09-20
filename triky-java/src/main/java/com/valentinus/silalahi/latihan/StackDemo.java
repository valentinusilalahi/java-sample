package com.valentinus.silalahi.latihan;

public class StackDemo {

	private String[] stack;
	private int max;
	private int top;

	public StackDemo(int size) {
		max = size;
		stack = new String[max];
		top = -1;
	}

	// input data
	public void push(String value) {
		stack[++top] = value;
	}

	// mengeluarkan data terakhir(atas)
	public String pop() {
		return stack[top--];
	}
	
	//melihat data yang berada pada tumpukan data paling atas (data yang akan dikeluarkan)
	public String peek() {
		return stack[top];
	}

	// menguji apakah stackDemo masih kosong
	public boolean isEmpty() {
		return top == -1;
	}

	// menguji apakah stac sudah penuh
	public boolean isFull() {
		return top == max - 1;
	}

	public static void main(String[] args) {
		StackDemo s = new StackDemo(5);

		// push data
		s.push("SATU");
		s.push("DUA");
		s.push("TIGA");
		s.peek(); // TIGA
		s.push("EMPAT");
		s.push("LIMA");
		s.isEmpty(); // false
		s.isFull(); // true
		s.pop(); // remove LIMA
		s.isFull(); // false
	}

	
	  /*private int maxSize; 
	  private long[] stackArray; 
	  private int top;
	  
	  public StackDemo(int s) { 
		  maxSize = s; 
		  stackArray = new long[maxSize]; 
		  top = -1; 
	  }
	  
	  public void push(long j) { 
		  stackArray[++top] = j; 
	  }
	  
	  public long pop() { 
		  return stackArray[top--]; 
		  }
	  
	  public long peek() { return stackArray[top]; }
	  
	  public boolean isEmpty() { return (top == -1); }
	  
	  public boolean isFull() { return (top == maxSize - 1); }
	  
	  public static void main(String[] args) { 
		  StackDemo theStack = new StackDemo(10); 
		  
		  theStack.push(10); 
		  theStack.push(20); 
		  theStack.push(30);
		  theStack.push(40); 
		  theStack.push(50); 
		  
		  while (!theStack.isEmpty()) { 
			  long value = theStack.pop(); 
			  System.out.print(value); 
			  System.out.print("\n"); 
		  }
		  	  System.out.println(""); 
		  }*/
}
