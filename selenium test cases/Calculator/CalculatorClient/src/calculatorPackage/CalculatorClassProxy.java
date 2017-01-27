package calculatorPackage;

public class CalculatorClassProxy implements calculatorPackage.CalculatorClass {
  private String _endpoint = null;
  private calculatorPackage.CalculatorClass calculatorClass = null;
  
  public CalculatorClassProxy() {
    _initCalculatorClassProxy();
  }
  
  public CalculatorClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorClassProxy();
  }
  
  private void _initCalculatorClassProxy() {
    try {
      calculatorClass = (new calculatorPackage.CalculatorClassServiceLocator()).getcalculatorClass();
      if (calculatorClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorClass != null)
      ((javax.xml.rpc.Stub)calculatorClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public calculatorPackage.CalculatorClass getCalculatorClass() {
    if (calculatorClass == null)
      _initCalculatorClassProxy();
    return calculatorClass;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calculatorClass == null)
      _initCalculatorClassProxy();
    return calculatorClass.add(a, b);
  }
  
  public int multiply(int a, int b) throws java.rmi.RemoteException{
    if (calculatorClass == null)
      _initCalculatorClassProxy();
    return calculatorClass.multiply(a, b);
  }
  
  public int sub(int a, int b) throws java.rmi.RemoteException{
    if (calculatorClass == null)
      _initCalculatorClassProxy();
    return calculatorClass.sub(a, b);
  }
  
  
}