lux = {"health": 490, "mana": 334, "melee": 550, "armor": 18.72}
print(lux)
print(lux["mana"])  # 키와 벨류 값으로 접근 가능
lux["mana"] = 400  # 수정도 가능 (덮어쓰기)
print(lux["mana"])
x = {1, 2, 3}  # 키만 존재 할 수도 있으나
print(x)  # list, 튜플 등이 있기 때문에 굳이 사용 하진 않음
print("-" * 100)
lux2 = dict(zip(["health", "mana", "melee", "armor"], [490, 334, 550, 18.72]))
# zip 함수를 이용하면 키값과 벨류값을 각각 따로 지정하여 적용 시킬 수 있다.
print(lux2)

print("mana" in lux)  # in 을 이용하여 키값이 있는지 확인 할 수 있다
# 출력값 : true
print(len(lux))  # 길이도 확인 할 수 있고

# 키 값만 뽑아 올 수도 있다.
print(lux.items())
print(lux.keys())
print(lux.values())

print(lux.get("mana"))
print(lux.get("mana2"))  # 키값이 없을 때 None이 출력
print(lux.get("mana2", "not found"))  # None일때 기본값을 지정할 수 있다.
