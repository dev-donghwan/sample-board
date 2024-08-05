# 목차
1. [이메일 인증 요청](#이메일-인증-요청)
2. [이메일 인증 검증](#이메일-인증-검증)


## 이메일 인증 요청

### 기능

- 회원가입에서 이메일 중복체크를 통과한 이메일에 대해 회원가입에 필요한 인증코드를 발급한다.
- 유효시간은 5분으로 제한한다.
- 이메일 발송 성공을 기준으로 해당날짜 00시00분부터 23시59분59초까지 최대 N번의 횟수 제한을 둔다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "SEND_EMAIL_SUCCESS",
  "message": "email send successfully.",
  "data": {
    "type": "SIGN_UP",
    "email": "abcefg@naver.com"
  }
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "EMAIL_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is email",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "VERIFICATION_TYPE_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is type",
  "data": null
}
```

```json
// HttpStatus 429

{
  "code": "EMAIL_SEND_LIMIT_EXCEEDED",
  "message": "email send limited",
  "data": null
}
```

## 이메일 인증 검증

### 기능

- 인증에 대해서 확인을 진행한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "EMAIL_VERIFICATION_SUCCESS",
  "message": "email send successfully.",
  "data": {
    "type": "SIGN_UP",
    "email": "abcefg@naver.com",
    "code" : "code-value"
  }
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "EMAIL_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is email",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "VERIFICATION_TYPE_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is type",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "VERIFICATION_CODE_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is code",
  "data": null
}
```

```json
// HttpStatus 409

{
  "code": "INVALID_EMAIL_VERIFICATION_CODE",
  "message": "invalid email verification code",
  "data": null
}
```

```json
// HttpStatus 409

{
  "code": "EMAIL_VERIFICATION_CODE_EXPIRED",
  "message": "email verification code is expired",
  "data": null
}
```
