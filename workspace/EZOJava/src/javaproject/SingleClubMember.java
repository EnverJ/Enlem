package javaproject;

public class SingleClubMember extends Member {
	private int club;
	 SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees,int pClub) {
		super(pMemberType, pMemberID, pName, pFees);
		club=pClub;
		
	}
	public int getClub() {
		return club;
	}
	public void setClub(int pClub) {
		this.club = pClub;
	}

public String toStringg(){
	return super.toString()+","+club;
}

}
