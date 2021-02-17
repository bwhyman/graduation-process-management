post /api/login

```json
{
  "number": "1001",
  "password": "1001"
}
```
success:  
headers: authorization: 744193c872b677aab12a0ced447882f4cf9fca92a09d428a26ed145ed2ed2eec665c8824ebc353042ba2be136efcb5c6

学生返回信息。教师/题目等可能为空
```json
{
  "code": 200,
  "data": {
    "role": "243f45a3ce",
    "name": "王小明",
    "number": "2046204600",
    "topic": "新墨课堂管理系统的设计与实现",
    "clazz": "软件工程2018-01",
    "teacher": "李琰"
  }
}
```
教师返回信息  
```json
{
  "code": 200,
  "data": {
    "role": "243f45a3ce",
    "name": "李琰",
    "number": "2046204600",
    "quantity": 8,
    "group": "",
    "students": [
      {
        "number": "2046204600",
        "name": "王小明",
        "clazz": "软件工程2018-01",
        "group": "",
        "topic": "新墨课堂管理系统的设计与实现"
      }
    ]
  }
}
```

error: 401  
http status code: 200
```json
{
  "code": 401,
  "message": "用户名密码错误"
}
```