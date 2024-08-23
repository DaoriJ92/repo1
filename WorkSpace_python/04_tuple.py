# 기본적으로 list와 같지만 수정이 되지 않는다는 특이점이 있다.

t = (1, 2, 3)
l = [1, 2, 3]

l[0] = 10

# t[0] = 10 TypeError: 'tuple' object does not support item assignment 라는 에러가 뜸
# 값을 바꿀 수 없는 리스트

print(t[0])

# 튜플 선언 방법
t1 = (1, 2, 3, 4)
t2 = (
    1,
    2,
    3,
    4,
)  # 변수가 하나 일땐 튜플로 묶어서 넣어주고 변수가 여러 개 일땐 각각 적용 된다.

print(t1)
print(t2)

# 한개짜리 튜플을 만들 때
t3 = 1  # 그냥 int 1
t3 = 1  # 마찬가지로 그냥 int 1
# 그렇기 때문에 한개짜리 튜플은
t3 = (1,)
t3 = (1,)  # , (컴마) 를 붙여줘야 한다.

print(t3)
# print(t3[1]) 튜플도 마찬가지로
# tuple index out of range 출력

t = tuple(range(5))  # range를 tuple로 형 변환
print(t)

l = list("hello")  # 문자열 이기때문에
print(l)  # ['h', 'e', 'l', 'l', 'o'] 로 출력 ( char 배열)
t = tuple("hello")
print(t)  # ()'h', 'e', 'l', 'l', 'o') 로 출력 ( char 배열)
