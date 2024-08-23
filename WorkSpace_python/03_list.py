a = [1, 1.2, "문자", True]  # JS처럼 배열에 모두 집어넣을 수 있고 관리 할 수 있다.
print(a)
print(a[1])
# print ( a[10])  범위가 벗어 날 경우 에러 발생
print(a[-2])  # 음수 index 는 뒤에서부터 터 센다. 제일 마지막 인덱스 : -1

a[3] = False
a[-1] = False

print("abcd"[0])  # 문자열도 배열로 취급
print(a[2][1])

# list
a = []  # a라는 배열을 초기화
a = list  # a라는 배열을 초기화

# range
# range(시작index, 종료index, step(증감식))
# 시작 index 부터  종료 index 바로 앞까지 step만큼 증가
# 시작 index 기본값 : 0;
# step 기본값 : 1;
a = range(10)  # 전달인자 한개인 경우 종료 index로 인식
print(a)
print(list(a))

print(
    list(range(4, 11, 2))
)  # 4부터 11까지 2씩 증가(4부터 11 바로 전까지의 2의 배수 출력)
print(
    list(range(10, 0))
)  # 종료index가 시작index 보다 작으면 시작과 동시에 종료값이 만족하여 종료 됨
print(list(range(10, 0, -1)))  # step도 음수가 될 수 있음


# https://wikidocs.net/14   // 파이썬 교재 list자료형

a = [100, 43, 2312, 45, 1]
a.append(5)  # 마지막에 추가
print(a)


a.sort()  # 오름차 순으로 정렬
print(a)

a.reverse()  # 배열 뒤집기( 내림차 순 정렬이 따로 없기 때문에 오름차 순 정렬 후 적용 )

a.sort(
    reverse=True
)  # sort에 전달인자로 reverse = True 값을 주면 바로 내림차순 정렬 가능
print(a)
print("=" * 100)
print(a.index(43))  # 값이 있는곳의 index를 반환
a.insert(1, 200)  # 원하는 index에 끼워넣기
print(a)

a.remove(1)  # 순차적으로 첫번 째 나오는 값을 삭제
# 값이 없는 경우 에러 발생

x = a.pop()  # pop()은 리스트의 맨 마지막 요소를 리턴하고 그 요소는 삭제한다.
print(x)
print(a)

print(a.count(1))  # 값이 몇개가 있는지 확인

b = [-1, -2]
a.extend(b)  # a += b 와 같다.
print(a)

""" 
sort, extend 등 파괴함수는 
원본을 바꿔버리기 때문에 사용하는데 주의
"""

print(min(a))  # 배열 내 최솟값
print(max(a))  # 배열 내 최댓값
print(sum(a))  # 값들의 합
