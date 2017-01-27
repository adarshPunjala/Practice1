package Bottom.Up.Package;

public class SummasionProxy implements Bottom.Up.Package.Summasion {
  private String _endpoint = null;
  private Bottom.Up.Package.Summasion summasion = null;
  
  public SummasionProxy() {
    _initSummasionProxy();
  }
  
  public SummasionProxy(String endpoint) {
    _endpoint = endpoint;
    _initSummasionProxy();
  }
  
  private void _initSummasionProxy() {
    try {
      summasion = (new Bottom.Up.Package.SummasionServiceLocator()).getSummasion();
      if (summasion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)summasion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)summasion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (summasion != null)
      ((javax.xml.rpc.Stub)summasion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Bottom.Up.Package.Summasion getSummasion() {
    if (summasion == null)
      _initSummasionProxy();
    return summasion;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (summasion == null)
      _initSummasionProxy();
    summasion.main(args);
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (summasion == null)
      _initSummasionProxy();
    return summasion.add(i, j);
  }
  
  public int mul(int i, int j) throws java.rmi.RemoteException{
    if (summasion == null)
      _initSummasionProxy();
    return summasion.mul(i, j);
  }
  
  
}