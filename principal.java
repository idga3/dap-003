public class principal {
	public static void main(String[] args) {
		
		/* Creación del chat */
		ChatRoom CR = new ChatRoom();
		
		/* Creación de los usuarios */
		User Juan = new User("Juan", CR);
		User Maria = new User("Maria", CR);
		User Antonio = new User("Antonio", CR);
		User Laura = new User("Laura", CR);
		
		CR.AddUser(Juan);
		CR.AddUser(Maria);
		CR.AddUser(Antonio);
		CR.AddUser(Laura);
	}
}