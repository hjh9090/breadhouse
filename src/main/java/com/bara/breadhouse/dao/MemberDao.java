package com.bara.breadhouse.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bara.breadhouse.dao.mapper.MemberMapper;
import com.bara.breadhouse.vo.MemberVo;

@Repository
public class MemberDao {
	
	
	@Autowired
	private SqlSession session;
	
	
	//로그인 할 때 아이디와 패스워드 유효성 검사 
	public int getMemberData(String id, String password) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int result = 0;
		result = mapper.getMemberData(id, password);
		
		if(result != 1) {
			
		}
		
		return result;
	}
	/*
	 * 반환되는 데이터는 현재 int, 추후 유효성 검사 추가시 boolean으로 변경
	 * or int 형으로 그대로 가고 Controller 쪽에서 유효성 검사 ㄱㄱ?
	 * 
	 * */
	public int insertMember (MemberVo member) {
		int result = 0;
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		result = mapper.insertMember(member);
		return result;
	}
	
	
	/*
	 * 반환되는 데이터는 현재 void, 추후 유효성 검사 추가시 boolean으로 변경
	 * or int 형으로 그대로 가고 Controller 쪽에서 유효성 검사 ㄱㄱ?
	 * 
	 * */
	public void deleteMember (String id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		mapper.deleteMember(id);
	}
	
	
	//회원 정보 수정
	public int updateMember (String id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int result = 0;
		result = mapper.updateMember(id);
		return result;
	}
	
	

}
