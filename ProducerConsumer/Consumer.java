public class Consumer extends Thread{
	Company c;
	Consumer(Company c){
		this.c=c;
	}
	@Override
	public void run(){
		int count=1;
		while(count<=15){
			try{ 
			this.c.consume_item();
			
				Thread.sleep(2000);
			}
			catch(Exception e){

			}
		}
	}
}