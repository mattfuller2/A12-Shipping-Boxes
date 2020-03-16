class Bank {

	String n;
	String add;
	int an;
	int bal;
	int dep;

	public Bank(String n, String add, int an, int bal)
		{
			System.out.println("BANK: ");

			this.add = add;
			this.bal = bal;
			this.an = an;
			this.n = n;

		}

	@Override
	public String toString() {
		System.out.println("TOSTRING: ");
		System.out.println();

		return "Name of the customer.:" + this.n + ",, " + "Address of the customer.:" + this.add + ",, "
		        + "A/c no..:" + this.an + ",, " + "Balance in A/c..:" + this.bal;
	}
}
