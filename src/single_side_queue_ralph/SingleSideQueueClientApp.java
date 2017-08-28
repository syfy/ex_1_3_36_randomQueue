package single_side_queue_ralph;

public class SingleSideQueueClientApp {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		SingleSideQueue sq = new SingleSideQueue(1);
		sq.enqueue(2);
		sq.enqueue(3);
		System.out.println(sq.toString());
		System.out.println("Dequeueing" +sq.dequeue());
		System.out.println(sq.toString());
		sq.enqueue(4);
		sq.enqueue(8);
		System.out.println(sq.toString());
		System.out.println("Dequeueing" +sq.dequeue());
		System.out.println(sq.toString());
		System.out.println("Random Element " +sq.sample());
		System.out.println("Random Dequeue " +sq.randomDeuque());
		sq.enqueue(9);
		System.out.println(sq.toString());
		System.out.println("Random Dequeue " +sq.randomDeuque());
		System.out.println(sq.toString());


		
	}

}
