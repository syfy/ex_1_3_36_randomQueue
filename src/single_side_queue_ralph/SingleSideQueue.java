package single_side_queue_ralph;

public class SingleSideQueue {
	public static  int SIZE = 50;
	int[] queueContents= new int[SIZE];
	int headIndex = -1;
	int tailIndex = -1;
	SingleSideQueue(int firstContent){
		headIndex++;
		tailIndex++;
		queueContents[tailIndex] = firstContent;
	}
	
	public void enqueue(int content){
		tailIndex++;
		queueContents[tailIndex] = content;

	}
	public int peek(){
		int returnValue = 0;
		if(headIndex>=0){
			returnValue = queueContents[headIndex];
		}
		return returnValue;
		
	}
	
	public int dequeue() throws IllegalAccessException{
		int returnValue = queueContents[headIndex] ;

		if(headIndex<SIZE){
			headIndex++;
		}
		else{
			throw new IllegalAccessException();
		}
			return returnValue;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int x = headIndex;x<=tailIndex ;x++){
			sb.append(" "+queueContents[x]);
		}
		return sb.toString();
		
	}
}
