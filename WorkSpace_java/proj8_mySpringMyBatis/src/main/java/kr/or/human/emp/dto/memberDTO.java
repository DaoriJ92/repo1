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

//위의 다섯가지를 한번에 만들어주는게 @Data 이다.
@Data
public class memberDTO {
	
	private String userID;	
	private String userPW;
	private String userName;
	private int age ;
	private String job;
	
}
