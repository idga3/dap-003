public interface ISubject {
	
	public void AddUser(User O);
	public void DeleteUser(User O);
	public void send(String nck, String user, String msg);
}