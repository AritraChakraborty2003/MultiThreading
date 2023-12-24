class MyThread implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<=10;i++){
		    System.out.println("The value is "+i);
		     try{
		 		Thread.sleep(1000);
		 	 }
			 catch(Exception e){
		 	//Interupted Exception may come
			 }
		 }
}
}



class MyThread1 extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=6;i++){
			System.out.println("File is Loading");
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){

			}
		}
	}
}


public class Threads{
	 public static void main(String[] args){
	 	MyThread t=new MyThread();
	 	Thread thread=new Thread(t);
	 	


	 	MyThread1 thread1=new MyThread1();
	 	//midThread md1=new midThread();
	 	thread1.start();
	 	thread.start();
	 	//md1.start();
	 	
	}

}
