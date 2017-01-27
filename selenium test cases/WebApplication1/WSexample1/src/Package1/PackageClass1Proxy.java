package Package1;

public class PackageClass1Proxy implements Package1.PackageClass1 {
  private String _endpoint = null;
  private Package1.PackageClass1 packageClass1 = null;
  
  public PackageClass1Proxy() {
    _initPackageClass1Proxy();
  }
  
  public PackageClass1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initPackageClass1Proxy();
  }
  
  private void _initPackageClass1Proxy() {
    try {
      packageClass1 = (new Package1.PackageClass1ServiceLocator()).getpackageClass1();
      if (packageClass1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)packageClass1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)packageClass1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (packageClass1 != null)
      ((javax.xml.rpc.Stub)packageClass1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Package1.PackageClass1 getPackageClass1() {
    if (packageClass1 == null)
      _initPackageClass1Proxy();
    return packageClass1;
  }
  
  
}