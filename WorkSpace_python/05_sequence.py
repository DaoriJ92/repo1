# 시퀀스 객체란?
# 리스트, 튜플, 문자열, rage 등 반복 할 수 있는 객체

a = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
print(30 in a)  # in : 시퀀스에 특정 값이 있는지 조사
# 출력값 : True

print(100 not in a)
# 출력값 : True
print("o" in "hello")
print(3 in range(0, 10, 2))

b = [1, 2, 3]
print(a + b)
print("hello" + "world")

# print ('hello' + 3) # TypeError: can only concatenate str (not "int") to str
# 3은 시퀀스 객체가 아닌 int 객체이므로 에러 발생
# 파이썬 에서는 문자열 + 문자열만 가능
# 시퀀스 + 시퀀스만 가능
print("hello" + str(3))  # 으로 해결 가능

print(b * 4)  # 문자열 곱하기 가능( 곱한 수 만큼 반복 )

print("-" * 100)

print(len(a))  # 10 , 배열의 길이를 출력 해 줌
print(a)
del a[1]  # del : 해당하는 배열의 인덱스 값을 지움
print(a)

c = "abcde"
print(c[0])
# c[0] = 'b' # index로 접근하는 경우 range, 튜플, 문자열은 읽기만 된다.


# 슬라이스
# [index]로 접근 할 수 있는 모든 것에 적용 됨
# [시작index, 종료index, step]
# 시작index부터 종료index 바로 앞까지 step씩 증가 하면서 읽기
# 종료index가 원본의 길이보다 커도 원본의 길이만큼만 읽는다.(에러가 뜨지 않음)
# 시작 index 기본값 : 0
# 종료 index 기본값 : len() 즉 length
# step 기본값 : 1
print(a[0:3])
print(a[:3])  # 시작 index 생략시 처음부터
print(a[3:])  # 종료 index 생략시 시작index 부터 끝까지
print(a[:])  # 모두 다
print(a[::2])  # 2씩 건너 뛰면서 출력
print(a[5:1:-1])  # step을 음수로 지정 할 수 있음

a[0] = 100
a[2:4] = [1, 2]
print(a)
a[2:4] = [1]
print(a)
a[2:4] = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(a)
a[2:8:2] = [-1, -2, -3]  # step이 있는 경우 할당 개수가 정확해야 한다.
print(a)
del a[2:8:2]
print(a)
