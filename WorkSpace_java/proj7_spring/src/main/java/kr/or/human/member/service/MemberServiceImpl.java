package kr.or.human.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human.member.dao.MemberDAO;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService {
	
//	IoC
//	Inversion of Control
//	제어의 역전
//	찾아서 new 까지 대신 해 줌
	
//	DI
//	Dependency Injection
//	의존성 주입
//	의존성 주입은 객체가 다른 객체와 의존관계를 맺을 때, 
//	그 의존 객체를 직접 생성하지 않고 외부에서 주입받는다는 개념
//	생성자, 필드(field), setter
	
//	우선순위
//	1. 완전히 동일한 클래스
//	2. 자동 형변환 가능한 클래스
	
	// @Autowired를 할 때 두개 이상의 bean이 후보라면
	// @Qualifier가 있는 경우 bean id에 해당 하는 객체를 찾는다.
	@Autowired
	@Qualifier("MemberDAOImpl2") // 전달인자를 생략 하는 경우 자동으로 클래스 명이 bean id로 등록 된다.
	MemberDAO memberDAO;
	
//	MemberServiceImpl(MemberDAO memberDAO){
//		this.memberDAO = memberDAO;
//	}
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List listMember() {
//		MemberDAO dao = new MemberDAOImpl(); 인터페이스로 호출 가능 (자동 형변환)
//		MemberDAOImpl dao = new MemberDAOImpl();
//		List list = dao.selectMember();
		
		List list = this.memberDAO.selectMember();
		
		
		return list;
	}

}
