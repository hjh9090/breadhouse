package com.bara.breadhouse.dao.mapper;


import com.bara.breadhouse.vo.MemberVo;

public interface MemberMapper {

	
	public int insertMember (MemberVo memberVo);
	
	public int getMemberData (String id, String password);
	
	public void deleteMember (String id);
	
	public int updateMember (String id);
	
	
}
