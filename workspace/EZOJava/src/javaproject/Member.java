package javaproject;

public class Member {
private	char meberType;
private	int memberID;
private String name;
private double fees;
public char getMeberType() {
	return meberType;
}

public void setMeberType(char pMeberType) {
	this.meberType = pMeberType;
}

public int getMemberID() {
	return memberID;
}

public void setMemberID(int pMemberID) {
	this.memberID = pMemberID;
}

public String getName() {
	return name;
}

public void setName(String Pname) {
	this.name = Pname;
}

public double getFees() {
	return fees;
}

public void setFees(double Pfees) {
	this.fees = Pfees;
}


	
	public Member(char pMemberType,int pMemberID,String pName, double pFees){
		meberType=pMemberType;
		memberID=pMemberID;
		name=pName;
		fees=pFees;

}
	@Override
	public String toString(){
		return meberType+", " + memberID+", "+name+", "+fees;
		
	}
}
