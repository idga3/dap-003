public class principal {
	public static void main(String[] args) {
		
		/* Creaci�n del chat */
		ChatRoom CR = new ChatRoom();
		
		/* Creaci�n de los usuarios */
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