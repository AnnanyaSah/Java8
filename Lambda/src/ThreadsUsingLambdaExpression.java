

public class ThreadsUsingLambdaExpression {

	public static void main(String args[]){
//threads using lambda expression	when single statement has to be inside run()
		new Thread(()->System.out.println("B")).start();	

//new thread that has multiple lines inside run()
		new Thread(()->{
			for(int i=0;i<3;i++)
				System.out.println("Hello"+i);
		}).start();;
		
	}
}

//normal Threads are made using following two ways:
//1.  extending threads
class Thread1 extends Thread{
	public void run(){}
}
//2. implementing runnable
class Thread2 implements Runnable{
public void run() {}
	
}
