package eu.ensup.demosecurite.presentation;

import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;

public class DemoProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Obtenir la liste  des providers pour cette version de JRE
		Provider[] providers= Security.getProviders();

		//2.Obtenir des informations sur chaque provider: nom et version
		for (Provider provider: providers) {
			System.out.println("providers : " + provider.getName()+ "version" +  provider.getVersion());
		}
		
		//1. Obtenir un fournisseur de sécurite particulier
		Provider p = Security.getProvider("SunJCE");
		
		//2. Obtenir des informations sur ce fournisseur
		System.out.println("service du provider " + p.getName());
		
		for (Service service : p.getServices()) {
			System.out.println("/t " + service.getType()+  " " + service.getAlgorithm());
		}
	}
	

}
