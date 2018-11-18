package com.example.demo;

import sun.misc.BASE64Encoder;
import sun.security.rsa.RSAKeyPairGenerator;

public class GenRSAKey {

	public static void main(String[] args) {
		RSAKeyPairGenerator rsa = new RSAKeyPairGenerator();
		System.out.println(rsa.generateKeyPair().getPrivate().getAlgorithm());
		byte[] b =rsa.generateKeyPair().getPrivate().getEncoded();
		byte[] a =rsa.generateKeyPair().getPublic().getEncoded();
		System.out.println(new BASE64Encoder().encode(b));
		System.out.println("///");
		System.out.println(new BASE64Encoder().encode(a));
	}

}
