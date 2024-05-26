import java.rmi.Remote;
import java.rmi.RemoteException;

interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}