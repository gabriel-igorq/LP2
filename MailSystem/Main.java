public class Main{
	public static void main(String[] args){
		MailServer server;
		server = new MailServer();
		MailClient client1;
		client1 = new MailClient(server, "Bonoro");
		MailClient client2;
		client2 = new MailClient(server, "Lula");
		client1.sendMailItem("Lula", "Comunista. Pra melhorar a saúde o povo precisa de armas");
		System.out.println("Verificando se o usuário recebeu a mensagem");
		client2.printNextMailItem();
	}
}
