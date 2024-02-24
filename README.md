# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)


# 기능 요구사항 목록
- [X] : 사람 이름을 입력 받는다.
  - [X] : 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 
  - [X] : 사람 이름은 쉼표(,)를 기준으로 구분한다. 
  - [X] `예외처리` : 빈 값을 입력받는 경우 
- [X] : 사다리 높이를 입력 받는다.
  - [X] `예외처리` : 빈 값을 입력받는 경우
  - [X] `예외처리` : 숫자가 아닌 경우
  - [X] `예외처리` : 0 이하인 경우
- [X] : 사다리를 출력한다.
  - [X] : 사다리를 출력할 때 사람 이름도 같이 출력한다.
  - [X] : 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
  - [X] : 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.

# 추가된 기능 요구사항 목록
- [X] : 실행 결과(상품목록)를 입력 받는다.
  - [X] `예외처리` : 빈 값을 입력받는 경우
  - [X] `예외처리` : 사람 수와 결과 수가 다른 경우
  - [X] `예외처리` : 쉼표로 구분되지 않는 경우
- [ ] : 사다리 실행 결과를 출력해야 한다.
  - [ ] : 실행 결과도 5가 기준으로 출력해준다.
- [ ] : 결과를 보고 싶은 사람을 입력 받는다.
  - [ ] `예외처리` : 존재하지 않는 이름을 입력받는 경우
  - [ ] : 개인별 이름을 입력하면 개인별 결과를 출력한다. 
  - [ ] : "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.
    - [ ] : `{이름} : {결과}` 형식으로 출력한다.
