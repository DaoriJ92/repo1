package kr.or.human.emp.dto;

import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode

//���� �ټ������� �ѹ��� ������ִ°� @Data �̴�.
@Data
public class memberDTO {
	
	private String userID;	
	private String userPW;
	private String userName;
	private int age ;
	private String job;
	
}
