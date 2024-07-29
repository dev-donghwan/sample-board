# 목차
1. [댓글 작성](#댓글-작성)
2. [댓글 삭제](#댓글-삭제)
3. [댓글 수정](#댓글-수정)

---


## 댓글 작성

### 기능

- 댓글을 작성한다.
- 대댓글을 작성하는 경우는 상위 댓글의 식별자를 포함한다. (Optional)

### 요청

- TODO

### 성공

```json
// HttpStatus 201 CREATED
// Location /posts/{postId}/comments/{commentId}

{
  "code": "CREATE_COMMENT_SUCCESS",
  "message": "comment created successfully.",
  "data": {
    "id": 1,
    "content": "comment-comtent"
  }
}
```

### 실패

```json
// HttpStatus 400

{
  "code": "COMMENT_PARENT_POST_ID_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is postId",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "COMMENT_CONTENT_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is content",
  "data": null
}
```

## 댓글 삭제

### 기능

- 댓글을 삭제한다.
- 삭제된 경우 실제로 삭제를 하는것이 아니라 삭제된 댓글이라는 메세지를 출력 할 수 있도록한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "DELETE_COMMENT_SUCCESS",
  "message": "comment deleted successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 404

{
  "code": "COMMENT_NOT_FOUND",
  "message": "comment not found",
  "data": null
}
```

### 댓글 수정

### 기능

- 댓글을 수정한다.

### 요청

- TODO

### 성공

```json
// HttpStatus 200

{
  "code": "UPDATE_COMMENT_SUCCESS",
  "message": "comment updated successfully.",
  "data": null
}
```

### 실패

```json
// HttpStatus 404

{
  "code": "COMMENT_NOT_FOUND",
  "message": "comment not found",
  "data": null
}
```

```json
// HttpStatus 400

{
  "code": "COMMENT_CONTENT_MISSING_REQUIRED_PARAMETER",
  "message": "required parameter content is content",
  "data": null
}
```
