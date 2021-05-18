package cts.crisan.diana.g1092.pattern.command;

public class TestCommand {

	public static void main(String[] args) {
		TaskManager taskManager = new TaskManager();

		System.out.println("HOME BANK is the internal bank - priority!");
		taskManager.addAsyncTask(new AsyncCommand("Home Bank", "RO12HOME2344541234567684", "RO12HOME4455362788751234",
				900, new TransactionModule()));
		taskManager.addAsyncTask(new AsyncCommand("Home Bank", "RO12HOME27HAS41234567684", "RO12HOME4455362788567874",
				1580.65, new TransactionModule()));
		taskManager.addAsyncTask(new AsyncCommand("Raiffeisen Bank", "RO12RZBR2344541234567684",
				"RO12RZBR4455362788751234", 900, new TransactionModule()));
		taskManager.addAsyncTask(new AsyncCommand("Libra Bank", "RO12LIBR2112241234567684", "RO12RZBR4455362788751234",
				100, new TransactionModule()));

		for (int i = 0; i < 4; i++) {
			taskManager.executeTask();
		}
	}

}
