import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImplt extends UnicastRemoteObject implements MyRemote {
    private final static long serialVersionUID = 1L;

    public MyRemoteImplt() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from Server!";
    }
    
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImplt();
            java.rmi.Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
