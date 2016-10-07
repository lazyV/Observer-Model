import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class ConcreteSubject extends Subject {
	private String CurrentState;
	//�����������Ϣ ������ǰ��״̬��CurrentState��������
	public String GetCurrentState()
	{
	
	 
		return "��ǰ�仯Ϊ��"+CurrentState;
	
	
	}
	//���������Ϣ�ķ���
	public void GetInterfaceInformation() throws SocketException
	{
		
		 Enumeration<NetworkInterface> nets = NetworkInterface
	                .getNetworkInterfaces();
		   for (NetworkInterface netint : Collections.list(nets))
	            displayInterfaceInformation(netint);
	}
	private void displayInterfaceInformation(NetworkInterface netint)
            throws SocketException {
		CurrentState+=("Display name: %s\n"+netint.getDisplayName());
		CurrentState+=("Name: %s\n"+ netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
        	CurrentState+=("InetAddress: %s\n"+ inetAddress);
        }
        CurrentState+=("\n");
    }
	
}