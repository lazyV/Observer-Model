
public class ConcreteObserver extends Observer {
	private String ObserverName;
	private ConcreteSubject SubjectName;
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ�۲���Ϊ��"+this.getObserverName()+"��ǰ�۲�������ǣ�"+SubjectName.getClass().getName());
		System.out.println("��ǰ�仯Ϊ��"+SubjectName.GetCurrentState());
		
	}
	public ConcreteObserver(String ObserverName,ConcreteSubject SubjectName)
	{
		
		this.ObserverName=ObserverName;
		this.SubjectName=SubjectName;
	}

	
	public String getObserverName() {
		return ObserverName;
	}
	public void setObserverName(String observerName) {
		ObserverName = observerName;
	}

	
	public ConcreteSubject getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(ConcreteSubject subjectName) {
		SubjectName = subjectName;
	}
	

}
