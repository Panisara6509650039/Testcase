package panisara_6509650039;

public interface Istack {
	int getSize() ;
	boolean isEmpty() ;
	boolean isFull(); 
	void push(Object elm) throws Exception;
	Object top();
	Object pop() throws Exception;
}
