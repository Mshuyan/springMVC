# springMVC注解

> + springMVC的所有注解，可以在`spring-web-5.0.6.RELEASE.jar`和`spring-webmvc-5.0.6.RELEASE.jar`两个jar包中直接`find in path`搜索`@interface`找到
>
>   > 注意，两个jar包需要先下载源码
>
> + 学习资料
>
>   

## spring-web

### @RequestHeader

+ 作用：用于获取指定的请求头

+ 例

  ```java
  public void queryUser(@RequestHeader("Accept-Encoding") String encoding,  @RequestHeader("Keep-Alive") long keepAlive)  {  
  }  
  ```

### @ExceptionHandler



### @ResponseStatus



### @RestControllerAdvice



### @InitBinder



### @ModelAttribute



### @RestController



### @PutMapping



### @GetMapping



### @CrossOrigin



### @RequestBody



### @RequestPart



### @RequestAttribute



### @CookieValue



### @RequestParam



### @RequestMapping



### @SessionAttribute



### @DeleteMapping



### @SessionAttributes



### @PathVariable



### @Mapping



### @PostMapping



### @ApplicationScope



### @RequestScope



### @SessionScope



### @PatchMapping



### @MatrixVariable



## spring-webmvc

### @EnableWebMvc







