package PractiseClient;

import javax.xml.rpc.ServiceException;

import Practise.ASMDClassServiceLocator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ASMDClassServiceLocator locator = new ASMDClassServiceLocator();
		try {
			locator.getASMDClass();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
