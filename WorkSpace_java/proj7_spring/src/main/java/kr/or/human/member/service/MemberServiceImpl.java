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
//	������ ����
//	ã�Ƽ� new ���� ��� �� ��
	
//	DI
//	Dependency Injection
//	������ ����
//	������ ������ ��ü�� �ٸ� ��ü�� �������踦 ���� ��, 
//	�� ���� ��ü�� ���� �������� �ʰ� �ܺο��� ���Թ޴´ٴ� ����
//	������, �ʵ�(field), setter
	
//	�켱����
//	1. ������ ������ Ŭ����
//	2. �ڵ� ����ȯ ������ Ŭ����
	
	// @Autowired�� �� �� �ΰ� �̻��� bean�� �ĺ����
	// @Qualifier�� �ִ� ��� bean id�� �ش� �ϴ� ��ü�� ã�´�.
	@Autowired
	@Qualifier("MemberDAOImpl2") // �������ڸ� ���� �ϴ� ��� �ڵ����� Ŭ���� ���� bean id�� ��� �ȴ�.
	MemberDAO memberDAO;
	
//	MemberServiceImpl(MemberDAO memberDAO){
//		this.memberDAO = memberDAO;
//	}
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List listMember() {
//		MemberDAO dao = new MemberDAOImpl(); �������̽��� ȣ�� ���� (�ڵ� ����ȯ)
//		MemberDAOImpl dao = new MemberDAOImpl();
//		List list = dao.selectMember();
		
		List list = this.memberDAO.selectMember();
		
		
		return list;
	}

}
