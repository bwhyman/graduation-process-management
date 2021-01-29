post /api/login

```json
{
  "number": "1001",
  "password": "1001"
}
```
success:  
headers: Authorization: 744193c872b677aab12a0ced447882f4cf9fca92a09d428a26ed145ed2ed2eec665c8824ebc353042ba2be136efcb5c6

```json
{
  "code": 200,
  "data": {
    "role": "243f45a3ce"
  }
}
```
error: 401
```json
{
  "code": 401,
  "message": "用户名密码错误"
}
```