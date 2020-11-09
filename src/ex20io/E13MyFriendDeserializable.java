package ex20io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

 

public class E13MyFriendDeserializable {

	public static void main(String[] args) {

		try {
			ObjectInputStream in =
				new ObjectInputStream(
					new FileInputStream("src/ex20io/friend_info.obj")
				);
			
			while(true) {
				//Friend객체를 복원한다.
				Friend friend = (Friend)in.readObject();
				//더이상 복원할 객체가 없다면 루프를 탈출한다.
				if(friend==null) break;
				friend.showAllData();
			}
		}
		catch (Exception e) {
			System.out.println("복원시 예외발생");
		}
			
	}

}
