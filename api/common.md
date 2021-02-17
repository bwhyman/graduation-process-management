*** 此接口为登录后所有用户均需使用数据的通用接口 ***

---
获取所有教师信息

get /api/common/teachers  

```json
{
  "code": 200,
  "data": {
    "teachers": [
      {
        "id": 1234567890123456789,
        "title": "讲师",
        "name": "李琰",
        "description": "description",
        "group": 2,
        "quantity": 10,
        "updateTime": "2021-02-01T19:34:53"
      }
    ]
  }
}
```
---
获取全部学生的基本信息。topic属性可能不存在  

get /api/common/students  

```json
{
  "code": 200,
  "data": {
    "students": [
      {
        "id": 1234567890123456789,
        "number": "2046204600",
        "clazz": "软件工程2018-01",
        "name": "王小明",
        "topic": "新墨课堂管理系统的设计与实现",
        "updateTime": "2021-02-01T19:34:53"
      }
    ]
  }
}
```
---

所有用户修改个人密码。在token提取用户ID修改，不传ID值  
无需重新登录，仍使用原token即可  

patch /api/common/password
```json
{
  "password": "654321"
}
```

get /api/common/students/count
```json
{
  "count": 110
}
```
