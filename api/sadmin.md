超级管理员，导入教师名单  
post /api/sadmin/teachers

required: number/name  
not null: number/name/role/password/  
```json
[
  {
    "number": "1002",
    "name": "李明",
    "role": "2",
    "title": "讲师"
  }
]
```
success:
```json
{
  "code": 200,
  "data": {
    "teachers": [
      {
        "number": "1002",
        "name": "李明",
        "role": "2",
        "title": "讲师",
        "quantity": 0
      }
    ]
  }
}
```