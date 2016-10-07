
import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	//观察者列表
	private	List<Observer> observers =new ArrayList<Observer>();

	public void Attach(Observer observer)
	{
		observers.add(observer);
	}

	public void Detach(Observer observer)
	{
		observers.remove(observer);
	}
	//通知方法
	public void Notify()
	{
		for(Observer ob:observers)
		{
			ob.Update();
		}
			
	}
	
}
