## 1、工具目录结构

![image.png](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/a0da460aaa544f8ba2213669506724d9~tplv-k3u1fbpfcp-watermark.image)

## 2、工具使用application配置（主要配置JsonToSqlUtil）

```yml
JsonToSqlUtil:
  # 数据字段名，必须按json中的返回顺序写(英文,隔开)
  field: id,name,description,pictureUrl,url,testUrl,ttUrl,aaUrl,kakaka,createDate 
  # 格式是时间的字段(英文,隔开)
  timeField: createDate,updateDate 
  # 是否为时间戳格式 true or false
  timeFieldType: false 
  # 本地的数据库表名
  tableName: data 
  # 主键名
  primaryKey: id  
  # 填写所需要数据data的路径 例如：{"store": { "data": [{"category": "reference"，"price": 8.95}，路径为：store.data
  dataPath: data
  # url
  url: http://localhost:8081/
  # 请求方式（post or get）
  method: post
  # 请求体，使用 '' 括起来,没有则留空
  body: ''
```

## 3、注意事项：
1、本地数据库建表时，字段需要使用utf8编码；

![image.png](https://p1-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/0a1ff89b8bd547468114cfdb47489b70~tplv-k3u1fbpfcp-watermark.image)


2、建表的字段必须写全，即json中的需要存储的data域里的所有字段都需要建好；
3、必须严格按照application中的配置说明填写；
3、可在task中的定时任务可自行修改cron表达式，更改执行周期。

## 4、效果：
建表：


![image.png](https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/69637a3b9d324724885cab17f15a6209~tplv-k3u1fbpfcp-watermark.image)

接口中生成10w条数据：


![image.png](https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/eef41e29a2b740e796dc9496a290bc67~tplv-k3u1fbpfcp-watermark.image)

运行同步工具，10w行数据，耗时2s：


![image.png](https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/c177bd640e7b455abfafc86c60f08cbb~tplv-k3u1fbpfcp-watermark.image)


![image.png](https://p1-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/089ffd34fe1c47388788512874170982~tplv-k3u1fbpfcp-watermark.image)

项目地址：https://github.com/ChangeWeDer/DataSync

