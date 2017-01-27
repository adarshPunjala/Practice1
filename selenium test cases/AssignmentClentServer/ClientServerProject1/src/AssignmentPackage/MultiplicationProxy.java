package AssignmentPackage;

public class MultiplicationProxy implements AssignmentPackage.Multiplication {
  private String _endpoint = null;
  private AssignmentPackage.Multiplication multiplication = null;
  
  public MultiplicationProxy() {
    _initMultiplicationProxy();
  }
  
  public MultiplicationProxy(String endpoint) {
    _endpoint = endpoint;
    _initMultiplicationProxy();
  }
  
  private void _initMultiplicationProxy() {
    try {
      multiplication = (new AssignmentPackage.MultiplicationServiceLocator()).getMultiplication();
      if (multiplication != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)multiplication)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)multiplication)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (multiplication != null)
      ((javax.xml.rpc.Stub)multiplication)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public AssignmentPackage.Multiplication getMultiplication() {
    if (multiplication == null)
      _initMultiplicationProxy();
    return multiplication;
  }
  
  public int mul(int i, int j) throws java.rmi.RemoteException{
    if (multiplication == null)
      _initMultiplicationProxy();
    return multiplication.mul(i, j);
  }
  
  
}