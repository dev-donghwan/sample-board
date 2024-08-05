# 목차
1. [게시글 작성](#게시글-작성)
2. [게시글 수정](#게시글-수정)
3. [게시글 삭제](#게시글-삭제)
4. [게시글 활성화](#게시글-활성화)
5. [게시글 비활성화](#게시글-비활성화)
6. [게시글 조회](#게시글-조회)
7. [게시글 검색](#게시글-검색)
8. [게시글 좋아요 등록](#게시글-좋아요-등록)
9. [게시글 좋아요 취소](#게시글-좋아요-취소)
10. [게시글 북마크 등록](#게시글-북마크-등록)
11. [게시글 북마크 취소](#게시글-북마크-취소)

---

## 게시글 작성

### 기능

- 게시글을 작성한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 201
// Location /post/{postId}

{
  "code": "CREATE_POST",
  "message": "post create successfully.",
  "data": {
    "id": 1,
    "writerId": 1,
    "title": "title",
    "content": "content"
  }
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_TITLE_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter title is missing",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "POST_CONTENT_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is missing",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "INVALID_POST_TITLE",
  "message": "invalid title",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "INVALID_POST_CONTENT",
  "message": "invalid content",
  "data": null
}
```

---

## 게시글 수정

### 기능

- 게시글을 수정한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "UPDATE_POST",
  "message": "post update successfully.",
  "data": {
    "id": 1,
    "writerId": 1,
    "title": "title",
    "content": "content"
  }
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "POST_TITLE_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter title is missing",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "POST_CONTENT_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is missing",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "INVALID_POST_TITLE",
  "message": "invalid title",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "INVALID_POST_CONTENT",
  "message": "invalid content",
  "data": null
}
```

---

### 게시글 삭제

### 기능

- 게시글을 삭제한다.
- 관리자 권한 또는 게시글의 작성자만 삭제 가능하도록 한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "DELETE_POST",
  "message": "post delete successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

---

### 게시글 비활성화

### 기능

- 게시글을 숨긴다.
- 관리자 권한 또는 게시글의 작성자만 비활성화 가능하도록 한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "DEACTIVE_POST",
  "message": "post deactivate successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

---

### 게시글 활성화

### 기능

- 숨겨진 게시글을 보이도록 한다.
- 관리자 권한 또는 게시글의 작성자만 활성화 가능하도록 한다.
- 관리자가 비활성화한 경우는 게시글 작성자는 다시 활성화 할 수 없다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "ACTIVATE_POST",
  "message": "post activate successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

```json
// HttpStatus 403

{
  "code": "POST_ACTIVATION_FORBIDDEN",
  "message": "post deactivated by admin",
  "data": null
}
```

---

### 게시글 조회

### 기능

- postId 기반으로 게시글을 조회한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "FIND_POST_BY_ID",
  "message": "post find successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

---

### 게시글 검색

### 기능

- 게시글 검색
- 게시글명과 게시글작성자로 검색 가능하도록한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "SEARCH_POST",
  "message": "post search successfully.",
  "data": [
    {
      "id": 1,
      "writerId": 1,
      "title": "First Post Title",
      "content": "This is the content of the first post."
    },
    {
      "id": 2,
      "writerId": 2,
      "title": "Second Post Title",
      "content": "This is the content of the second post."
    }
  ]
}
```

### 실패

---

### 게시글 좋아요 등록

### 기능

- 게시글을 좋아요한다.
- 내가 좋아요 누른 게시글을 확인 할 수 있다.
- 좋아요를 추가한 뒤 다시 호출하여도 멱등성을 유지하도록 동작한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "POST_ADD_LIKE",
  "message": "post add like successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

---

### 게시글 좋아요 취소

### 기능

- 게시글 좋아요를 취소한다.
- 좋아요한 기록을 삭제한다.
- 좋아요 취소한 뒤 다시 호출하여도 멱등성을 유지한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "POST_REMOVE_LIKE",
  "message": "post remove like successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

---

### 게시글 북마크 등록

### 기능

- 게시글 북마크를 등록한다.
- 내가 북마크한 게시글을 확인 할 수 있다.
- 북마크를 추가한 뒤 다시 호출하여도 멱등성을 유지하도록 동작한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "POST_ADD_BOOKMARK",
  "message": "post add bookmark successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

---

### 게시글 좋아요 취소

### 기능

- 북마크를 취소한다.
- 북마크한 기록을 삭제한다.
- 좋아요 취소한 뒤 다시 호출하여도 멱등성을 유지한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "POST_REMOVE_BOOKMARK",
  "message": "post remove bookmark successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter id is missing",
  "data": null
}
```

---
