package _05_vault;

public class JamesBond {

	public int findCode(Vault v) {
		for (int i = 0; i < 1000000; i++) {
						
			v.tryCode(i);
			System.out.println(i);
			if (i == 500000) {
				System.out.println("I cracked your code, hahahahahahhaha");
				return i;
				
			} else {
				System.out.println("u noob");
				continue;
			}
		}
		return -1;

	}
}
