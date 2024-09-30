package kr.or.human.emp.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.or.human.emp.dto.EmpDTO;

@Repository // 이 클래스가 DAO 역할을 한다는 것을 Spring에게 알림
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlSession; // Spring에서 MyBatis의 SqlSession 객체를 자동으로 주입받음

	@Override
	public List<EmpDTO> selectEmp() {
		
		// MyBatis의 selectList 메서드를 사용해 "mapper.emp.selectEmp" 쿼리를 실행
		// 이 쿼리는 매퍼 파일에 정의된 SQL 문을 의미하며, 결과는 EmpDTO 객체의 리스트로 반환됨
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		
		return result; // 조회 결과인 리스트를 반환
	}
}
