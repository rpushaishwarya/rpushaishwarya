package abstracrionInterface;

public class accesing implements  Whatsup {

	public void chatting(String chat) {
		// TODO Auto-generated method stub
		System.out.println(chat);
		
	}

	public void calling(boolean bol) {
		// TODO Auto-generated method stub
		System.out.println(bol);
		
	}

	public void statusUpdating(String status) {
		// TODO Auto-generated method stub
		System.out.println(status);
		
	}
	public static void main(String[] args) {
		accesing ac=new accesing();
		ac.chatting("hii pappa");
		ac.calling(false);
		ac.statusUpdating("softwaretester");
	}

}
