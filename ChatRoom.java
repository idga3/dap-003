import java.util.HashMap;

public class ChatRoom implements ISubject{
	
	private HashMap<String, User> users = new HashMap<String, User>();
	
	@Override
	public void AddUser(User u){
		
		users.put(u.getNickname(), u);
	}
	@Override
	public void DeleteUser(User u){
		
		users.remove(u.getNickname(), u);	
	}
	@Override
	public void send(String nck, String user, String msg){

		if(users.containsKey(nck) && users.containsKey(user)) {
			User u = users.get(user);
			User u2 = users.get(nck);
			u2.recive(nck,msg);
			u.recive(nck, msg);
		}
		else {
			System.out.println("Usuario inexistente");
		}
	}	
}