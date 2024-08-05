# 목차
1. [회원가입](#회원가입)
2. [회원정보 가져오기](#회원정보-가져오기)
3. [닉네임 변경](#닉네임-변경)
4. [비밀번호 변경](#비밀번호-변경)

---

## 회원가입

### 기능

- 유저를 등록하는 기능을 담당한다.
- 일반 회원가입과 SSO 회원가입이 존재한다.
- 일반 회원가입의 경우는 이메일정보로 가입한다.
    - 이메일 중복체크를 진행
    - 로그인 아이디를 이메일로 등록
- SSO 회원가입의 경우는 최초의 SSO 회원가입에서 사용된 Provider가 제공한 정보로 가입한다.
    - 이메일 중복체크를 진행
    - 이미 가입된 이메일인 경우 일반 로그인으로 로그인 후 SSO 연동하도록 유도
- 랜덤한 닉네임을 생성하고 부여한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 201 CREATED
// Location /users/{userId}

{
  "code": "CREATE_USER",
  "message": "user created successfully.",
  "data": {
    "id": 1,
    "email": "abcefg@naver.com",
    "nickname": "nickname"
  }
}
```

### 실패

```json
// HttpStatus 409 Conflict

{
  "code": "DUPLICATED_USER",
  "message": "user email is duplicated",
  "data": null
}
```

---

## 회원정보 가져오기

### 기능

- UserId를 기반으로 해당 유저의 정보를 가져온다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "FIND_USER_BY_ID",
  "message": "user find successfully.",
  "data": {
    "id": 1,
    "email": "abcefg@naver.com",
    "nickname": "nickname"
  }
}
```

### 실패

```json
// HttpStatus 404

{
  "code": "USER_NOT_FOUND",
  "message": "user not found",
  "data": null
}
```

---

## 닉네임 변경

### 기능

- 내 계정 닉네임을 변경한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "UPDATE_NICKNAME",
  "message": "nickname updated successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "INVALID_NICKNAME",
  "message": "invalid is nickname",
  "data": null
}
```

```json
// HttpStatus 409

{
  "code": "DUPLICATE_NICKNAME",
  "message": "nickname is duplicated",
  "data": null
}
```

---

## 비밀번호 변경

### 기능

- 비밀번호를 변경한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "UPDATE_PASSWORD",
  "message": "password updated successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "INVALID_PASSWORD",
  "message": "invalid password",
  "data": null
}
```

---
