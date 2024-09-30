package kr.or.human.emp.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.or.human.emp.dto.EmpDTO;

@Repository // �� Ŭ������ DAO ������ �Ѵٴ� ���� Spring���� �˸�
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlSession; // Spring���� MyBatis�� SqlSession ��ü�� �ڵ����� ���Թ���

	@Override
	public List<EmpDTO> selectEmp() {
		
		// MyBatis�� selectList �޼��带 ����� "mapper.emp.selectEmp" ������ ����
		// �� ������ ���� ���Ͽ� ���ǵ� SQL ���� �ǹ��ϸ�, ����� EmpDTO ��ü�� ����Ʈ�� ��ȯ��
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		
		return result; // ��ȸ ����� ����Ʈ�� ��ȯ
	}
}
