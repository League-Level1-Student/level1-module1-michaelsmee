package _05_vault;

class akselVault {

	public static void main(String[] args) {

		Vault vault = new Vault();

		JamesBond michael = new JamesBond();

		michael.findCode(vault);

		for (int i = 0; i < 10; i++) {
			vault.tryCode(i);
		}

	}
}
