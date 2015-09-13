package cg.skylab.gestnote.utils;

public class TestCryptage {

	public static void main(String[] args) {
		
		String passe_crypt = CrypteUtil.encryptPassword("admin");
		
		System.out.println(passe_crypt);

	}

}
