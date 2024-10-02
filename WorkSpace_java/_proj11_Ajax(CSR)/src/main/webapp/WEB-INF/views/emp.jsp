<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<header>
		Logo
		<nav>emp > 회원 목록</nav>
	</header>
	<main>
		<a href="emp0?cmd=join">회원가입</a>
		<section>
			<article>
				<form id="frm" method="get" action="emp0">
					<select name="searchType">
						<option value="1"
							${searchType == 1 ? " selected='selected' " : "" }>이름</option>
						<option value="2"
							${searchType == 2 ? " selected='selected' " : "" }>직책</option>
						<option value="3"
							${searchType == 3 ? " selected='selected' " : "" }>이름+직책</option>
						<option value="4"
							${searchType == 4 ? " selected='selected' " : "" }>연봉(이하)</option>
					</select> <input type="text" name="keyword" placeholder="검색어를 입력하세요"
						value="${keyword }"> <input type="submit" value="검색">


					<input type="hidden" name="orderType" value="${orderType }">
					<table border="1">
						<caption>회원 목록 표시 : display:none으로 감춰놓자</caption>
						<thead>
							<tr>
								<th>선택</th>
								<th id="empno">empno <c:if test='${orderType == "desc" }'>↓</c:if>
									<c:if test='${orderType eq "asc" }'>↑</c:if>
								</th>
								<th>ename</th>
								<th>job</th>
								<th>sal</th>
								<th>hireDate</th>
								<th>삭제</th>
							</tr>
						</thead>
						<tbody id="list">
							<tr><td colspan='7'>자료가 없습니다</td></tr>
						</tbody>
					</table>
				</form>
			</article>
		</section>
	</main>
	<footer>휴먼</footer>

	<script>


	window.addEventListener("load", function(){
		getList()
	})
	
	// cb : callback
	function ajax(url, param, cb, method){
		// javascript에서 false는 null, undefined, 0
		// true는 false가 아닌것
		if(!method) method = "get";
		
		const xhr = new XMLHttpRequest();
		xhr.open(method, url);
		xhr.setRequestHeader("Content-Type","application/json");
		xhr.send( JSON.stringify(param) );
		
		if(typeof cb == "function"){
			xhr.onload = function(){
				cb(xhr.responseText)
			}
		}
	}
	
	function getList(){
		ajax("listEmp", null, drawList, "get")
	}

	function drawList(text) {
		try{
			const empList = JSON.parse(text);
			
			let html = "";
			
			if(empList.length == 0){
				html = "<tr><td colspan='7'>자료가 없습니다</td></tr>"
			} else {
				for(let i=0; i<empList.length; i++){
					
					const hiredate = new Date(empList[i].hireDate)
					const y = hiredate.getFullYear()
					let m = hiredate.getMonth() + 1
					if(m < 10){
						m = "0" + m
					}
					const d = hiredate.getDate()
					
					html += `
							<tr>
								<td>
									<input type="checkbox" name="check" value="\${empList[i].empno }">
								</td>
								<td>\${empList[i].empno}</td>
								<td><a href="emp0?cmd=detail&empno=\${empList[i].empno }">\${empList[i].ename }</a></td>
								<td>\${empList[i].job}</td>
								<td>\${empList[i].sal}</td>
								<td>
									\${y}년 \${m}월 \${d}일
								</td>
								<td>
									<button type="button" data-empno="\${empList[i].empno }" class="btnDel" id="btn_\${empList[i].empno }">삭제</button>
								</td>
							</tr>
						`;
					
				}
					
			}
			document.querySelector("#list").innerHTML = html;
			
			bind()
		
			
			
		}catch(e){
			console.log("ERROR : drawList", e);
		}
	}

	function bind(){
		const delBtnList = document.querySelectorAll("[id^=btn_]")
		//				const delBtnList = document.querySelectorAll(".btnDel")
		for(let btn of delBtnList){
			btn.addEventListener("click", function(event){
			//	console.log(this)
			// 	console.log(event.target)
							
// 				const id = event.target.getAttribute("id")
// 				// btn_7788 : substring, split...
				const empno = event.target.getAttribute("data-empno")
				console.log("empno", empno)
				
				const data = {
						"empno" : empno
				}
				ajax("deleteEmp", data, function(result){
					if(result != 0){
						getList()
					} else {
						alert("삭제에 실패했습니다.")
					}
				}, "delete")
				
			})
		}
	}
	
// window.addEventListener("load",function(){
   
//    const url="listEmp";
   
//    const xhr = new XMLHttpRequest();
//    xhr.open("get",url);
// //    xhr.setRequestHeader("Content-Type","application/json");
//    xhr.send();
//    xhr.onload=function(){
//       console.log(xhr.responseText);  
      
//       try{
//          const empList = JSON.parse(xhr.responseText);
//          let html ="";
//          for(let i=0; i<empList.length; i++){
            
//          const hiredate = new Date(empList[i].hireDate)
//          const y = hiredate.getFullYear()
//          let m = hiredate.getMonth() +1
//          if(m<10){
//             m= "0"+m
//          }
//          let d = hiredate.getDate()
//          if(d<10){
//              d= "0"+d
//           }
//             html +=`
//                <tr>
//                   <td>
//                   <input type="checkbox" name="check" value="${dto.empno }">
//                   </td>
//                   <td>\${empList[i].empno }</td>
//                   <td><a href="emp0?cmd=detail&empno=\${empList[i].empno }">\${empList[i].ename }</a></td>
//                   <td>\${empList[i].job }</td>
//                   <td>\${empList[i].sal }</td>
//                   <td>
//                   \${y}년 \${m}월 \${d}일                  
//                   </td>
//                   <td>
//                      <button type="button" data-empno = "\${empList[i].empno}" class = btnDel id = "btn_\${empList[i].empno}">삭제</button>
//                   </td>
//                </tr> 
//             `;
// //             console.log(empList[i].ename)
// //             <fmt:formatDate value="${dto.hireDate }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />
//          }
//          document.querySelector("#list").innerHTML = html;
// //          const delBtnList = document.querySelectorAll("[id^ =btn_]") //btn_ 로 시작하는 id, _btn으로 끝나는 아이디는 id$ = _btn
//          const delBtnList = document.querySelectorAll(".btnDel") //class를 사용 했을 때
//          for(let btn of delBtnList){
// //           btn.addEventListener("click", ()=>{  
// //           = arrow function(화살표 함수) 사용 시 this가 외부객체를 참조하므로, 이벤트에서 필요한 this를 가리키지 않음.
// //           따라서, this가 이벤트가 발생한 DOM 요소(btn)를 가리키도록 하기 위해 일반 함수(function)으로 대체.
//  			btn.addEventListener("click", function() {

//         		 console.log(this)
//         		 console.log(event.target)
        		 
//         		 const id = event.target.getAttribute("id"); 
//         		// id 값이 "btn_7788"과 같은 형식일 때, substr() 또는 split()을 사용하여 "7788"만 추출 가능.
//         		// ex1) substr(4) 사용: id의 첫 4자리("btn_")를 제거하여 숫자 부분(7788)을 추출.
//         		// ex2) split("_") 사용: "_"를 기준으로 나눠 ["btn", "7788"] 배열 생성 후 숫자 부분 추출.
// 				const parts = id.split("_"); // 결과: ["btn", "7788"]
// 				const empno = parts[1]; // 결과: "7788"
// 				console.log("empno : "+ empno)
				
// 				let url2 = "deleteEmp"
// 				const xhr2 = new XMLHttpRequest();
//         		const data = {
//         				"empno" : empno
//         		}
//         		xhr2.open("delete", url2);
//         		xhr2.setRequestHeader("Content-Type", "application/json");
//         		xhr2.send(JSON.stringify(data));
        		
//         		xhr2.onload = function(){
//         			console.log(xhr.responseText)
//         		}
        			
    			
        		
        		 
//         	 })
//          }
//       } catch(e){
//          console.log("ajax ERROR : url : ", url,e);
         
//       }
      
      
   
//    }
   
   
   
   
   
// })



   document.querySelector("#empno").addEventListener("click", function(){
      const orderType = document.querySelector("[name=orderType]");
      
      // '' > 'desc' > 'asc' > '' 처럼 세개의 값을 순환하게 만들기
      console.log(orderType.value, orderType.value == '');
      if(orderType.value == ''){
         orderType.value = 'desc'
      } else if(orderType.value == 'desc'){
         orderType.value = 'asc'
      } else if(orderType.value == 'asc'){
         orderType.value = ''
      }
      
      const frm = document.querySelector("#frm");
      frm.submit();
      
   })

</script>

</body>
</html>




