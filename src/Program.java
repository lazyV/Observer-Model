import java.net.SocketException;


public class Program implements Runnable {
	static ConcreteSubject subject=new ConcreteSubject();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建观察者
		for(int i=1;i<=100;i++)
		{
			ConcreteObserver observer=new ConcreteObserver("观察者"+i, subject);
			subject.Attach(observer);
			
		}
		//调用线程
		Program program=new Program();
		Thread thread=new Thread(program);
		thread.start();
		

	}
	//重写的run方法
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
		try {
			subject.GetInterfaceInformation();
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		subject.Notify();
		try {
			Thread.sleep(60000);//休眠60秒
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}