package com.example.test;
import com.example.access.PublicClass;
import com.example.access.PackagePrivateClass;

// else do this import com.example.access.*;
//it will import both classes

public class AccessTest {
	public static void main(String[] args) {
		
		PackagePrivateClass pc = new PackagePrivateClass();
		pc.PPmsg();
		
		PublicClass p = new PublicClass();
		p.ShowPC();
		
	}
//// que says we get an error Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The method PPmsg() from the type PackagePrivateClass is not visible
//
//	at com.example.test.AccessTest.main(AccessTest.java:12)
}
