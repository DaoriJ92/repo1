a = 10
naver = 1
nvaer = 2  # 변수에 오타 주의

b = a // 3
print(b)
print(-a // 3)
print(a % 3)

print(2**10)

a = int(-3.3)
print(a)

# 정밀도
# a = 0.123412523523467347345923874987234
# 출력값 0.12341252352346735
# print (a)
# 소숫점 14자리까지만 정밀하며 그 이하는 신뢰성 없음

a, b, c = 10, 20, 30  # 변수 여러개를 한 번에 지정 할 수 있다.
print(a, b, c)

a = True  # JS와 마찬가지로 False가 아닌 것
b = False  # False로 인식 되는 경우 : False, None, 0 // JS와 동일, 빈 컨테이너(배열의 사이즈가 0 인것, 빈 배열)
c = None  # null 대신 None을 사용
# boolean 변수는 대문자로 시작

# a = input()
# print(a)

print(1, 2, 3, sep=", ")  # sep에 콤마와 공백을 지정
print()

# 파이썬은 문자열 비교도 ==, !=로 가능하다.
# 다만 객체 비교가 아닌 값을 비교 하기 때문에
# 객체 비교에는 ==이나 != 대신 is, is not 을 사용 한다.
# 그렇기때문에 값 비교에 is, is not을 사용하지 않도록 한다.
# ex)

print("abc" == "abc")

# 문자도 값이기 때문에 == 으로 비교

a = 3 > 5
b = 7 > 5


print(a and b)
print(a or b)
print(not (a or b))


id = "아이디"
html = """
<div>
    <strong>아이디</strong>
</div>
 """
print(html)

html = f"""
<div>
    <strong>{id}</strong>
</div>
 """
print(html)

print('쌍따옴표 : " " ')
