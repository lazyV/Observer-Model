import java.net.SocketException;


public class Program implements Runnable {
	static ConcreteSubject subject=new ConcreteSubject();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����۲���
		for(int i=1;i<=100;i++)
		{
			ConcreteObserver observer=new ConcreteObserver("�۲���"+i, subject);
			subject.Attach(observer);
			
		}
		//�����߳�
		Program program=new Program();
		Thread thread=new Thread(program);
		thread.start();
		

	}
	//��д��run����
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
			Thread.sleep(60000);//����60��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}