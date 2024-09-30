
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
//Ajax와 clickEvent가 대표적인 비동기
// 	window.onload = funcion(){}
	window.addEventListener("load", function(){
		const btn = document.querySelector("#btn")
		btn.addEventListener("click", function(){
			
			console.log("click!!!!")
			
			const xhr = new XMLHttpRequest();
// 			const url = "ajax";
			const url = "ajax/dto";
			
			const data = {
					//js에서 key값의 ""는 생략 가능 하지만 java에서 보낼 떈 꼭 써 줘야 한다.
					"ename" : "이름",
					sal : 3200,
			}
			
			xhr.open("POST", url, true)
			
			//json 타입으로 설정
			xhr.setRequestHeader("Content-Type","application/json")
			
			const strData = JSON.stringify(data);
			console.log(data); // 객체 그 자체. 네트워크는 객체를 전달 할 수없다.
			console.log(strData); // 그래서 json 에서 지원하는 stringify 로 String 타입으로 변경
			
			xhr.send(strData)
			
			xhr.onload = function() {
				console.log(xhr.responseText)
				
				try{
					let result = JSON.parse(xhr.responseText)
					console.log(result)
					console.log(result.ename)
					console.log(result["ename"])
				}catch(e){
					console.log("json아님")
					
				}
				}

			

		
		
		
		})
	})

</script>
</head>
<body>

	<button id="btn">Run-Ajax</button>

</body>
</html>