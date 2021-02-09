get /api/common/teachers

此接口为登录后获取所有教师信息的通用接口。学生选导师，教师查看，主任查看，均使用此接口获取数据。  

success: 200
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