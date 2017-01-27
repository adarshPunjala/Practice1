package Practise;

public class ASMDClassProxy implements Practise.ASMDClass {
  private String _endpoint = null;
  private Practise.ASMDClass aSMDClass = null;
  
  public ASMDClassProxy() {
    _initASMDClassProxy();
  }
  
  public ASMDClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initASMDClassProxy();
  }
  
  private void _initASMDClassProxy() {
    try {
      aSMDClass = (new Practise.ASMDClassServiceLocator()).getASMDClass();
      if (aSMDClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aSMDClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aSMDClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aSMDClass != null)
      ((javax.xml.rpc.Stub)aSMDClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Practise.ASMDClass getASMDClass() {
    if (aSMDClass == null)
      _initASMDClassProxy();
    return aSMDClass;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (aSMDClass == null)
      _initASMDClassProxy();
    return aSMDClass.add(i, j);
  }
  
  public int mul(int i, int j) throws java.rmi.RemoteException{
    if (aSMDClass == null)
      _initASMDClassProxy();
    return aSMDClass.mul(i, j);
  }
  
  public int sub(int i, int j) throws java.rmi.RemoteException{
    if (aSMDClass == null)
      _initASMDClassProxy();
    return aSMDClass.sub(i, j);
  }
  
  public int div(int i, int j) throws java.rmi.RemoteException{
    if (aSMDClass == null)
      _initASMDClassProxy();
    return aSMDClass.div(i, j);
  }
  
  
}