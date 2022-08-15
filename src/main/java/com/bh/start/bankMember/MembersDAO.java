package com.bh.start.bankMember;

import java.util.ArrayList;

public interface MembersDAO {

	// 인터페이스
	// 추상 메서드이기 때문에 오버로딩 필요
	// ㄴ 선언부만 있음
	
	
	public int setJoin (BankMembersDAO bankMembersDAO) throws Exception;
	
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception;
	
	
	
}
