package javaproject;

public class MultiClubMember extends Member {
	private int membershipPoints;

	 public int getMembershipPoints() {
		return membershipPoints;
	}

	public void setMembershipPoints(int PmembershipPoints) {
		this.membershipPoints = PmembershipPoints;
	}

	MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees,int pMembershipPoints) {
		super(pMemberType, pMemberID, pName, pFees);
		 membershipPoints=pMembershipPoints;
		
		 
	}
	public String toString(){
		return super.toString()+", "+membershipPoints;
		
	}

}
