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
		System.out.println(sq.toString());
		System.out.println("Dequeueing" +sq.dequeue());
		System.out.println(sq.toString());

	}

}
