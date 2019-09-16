
网关的端口port都是整千的.有点意思
题眼在这里：
两类请求,  
http://localhost:5000/userapi/swagger-ui.html
1. http:127.0.0.1:5000/userapi/registry
   http:127.0.0.1:5000/userapi/login
   http:127.0.0.1:5000/userapi/{username}  根据用户名查询用户信息
http:127.0.0.1:5000/blogapi/swagger-ui.html   
2. http:127.0.0.1:5000/blogapi/
http:127.0.0.1:5000/blogapi/blog  发布blog
http:127.0.0.1:5000/blogapi/blog/{id}/detail  查询blog详情
http:127.0.0.1:5000/blogapi/blog/{username}   根据用户名查询该用户的所有blog
 ```
zuul:
  host:
    connect-timeout-millis: 20000
    socket-timeout-millis: 20000

  routes:
    user-service:
      path: /userapi/**
      serviceId: user-service
      sensitiveHeaders:

    blog-service:
      path: /blogapi/**
      serviceId: blog-service
      sensitiveHeaders:
```
# springcloud-book


### 书籍购买地址


![1.jpg](https://upload-images.jianshu.io/upload_images/2279594-3d9ee1555f555040.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/300)

[点击购买书籍-京东](https://item.jd.com/12312724.html)

[点击购买书籍-当当](http://product.dangdang.com/25231114.html)

[点击购买书籍-亚马逊](https://www.amazon.cn/dp/B079J8SCGY/ref=sr_1_2?ie=UTF8&qid=1521344315&sr=8-2&keywords=spring+cloud)




### 怎么使用源码

打开开发工具IDEA，然后import具体的章节的源码，注意不是import 整个跟目录。例如：

￼![image.png](https://upload-images.jianshu.io/upload_images/2279594-5337ed9945c271fa.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/600)