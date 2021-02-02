主任，导入学生名单  
post /api/director/students

required: number/name  
not null: number/name/role/password/
```json
[
  {
    "number": "2046204600",
    "name": "王小明",
    "clazz": "软件工程2018-01"
  }
]
```

patch /api/director/teachers/{uid}/role

```json
{
  "role": 4
}
```

patch /api/director/teachers/{uid}/info

```json
{
  "name":"",
  "title": ""
}
```

put /api/director/teachers/{uid}/password
