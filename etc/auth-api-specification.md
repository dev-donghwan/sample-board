# 목차
1. [토큰 발급](#토큰-발급)
   1. [기능](#기능)
   2. [성공](#성공)
   3. [실패](#실패)
2. [토큰 검증](#토큰-검증)
   1. [기능](#기능-1)
   2. [성공](#성공-1)
   3. [실패](#실패-1)

---


# 토큰 발급

### 기능

Jwt Token을 발급한다.

### 성공

```
// HttpStatus 201 CREATED

{
  "code": "CREATE_TOKEN",
  "message": "token created successfully.",
  "data": {
    "accessToken": "token-value"
  }
}
```

### 실패

```
// HttpStatus 500 InternalServerError

{
  "code": "TOKEN_CREATION_FAILED",
  "message": "failed to create token",
  "data": null
}
```

# 토큰 검증

### 기능

토큰 유효성을 검증한다.

### 성공

```
// HttpStatus 200 OK

{
  "code": "VALID_TOKEN",
  "message": "token is valid",
  "data": null
}
```

### 실패

```
// HttpStatus 401 Unauthorized

{
  "code": "INVALID_TOKEN",
  "message": "token is expired or invalid",
  "data": null
}
```
