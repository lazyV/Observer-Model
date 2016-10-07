
import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	//�۲����б�
	private	List<Observer> observers =new ArrayList<Observer>();

	public void Attach(Observer observer)
	{
		observers.add(observer);
	}

	public void Detach(Observer observer)
	{
		observers.remove(observer);
	}
	//֪ͨ����
	public void Notify()
	{
		for(Observer ob:observers)
		{
			ob.Update();
		}
			
	}
	
}
