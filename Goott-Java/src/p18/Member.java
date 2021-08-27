package p18;

public class Member {
	public String id;
	Member(String id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
