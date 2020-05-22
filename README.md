# SOPT_Lab3
※ 과제는 해당되는 branch에 각각 업로드 했습니다.

### 기본과제 1

![ezgif com-video-to-gif](https://user-images.githubusercontent.com/52772787/82639882-933a4480-9c44-11ea-9ddf-1920d3804d34.gif)

- 회원가입 부분도 인터페이스에 함께 추가

interface RequestInterface{

    @POST("/user/signin")
    fun requestLogin(@Body body : RequestLogin) : Call<ResponseLogin>

    @POST("/user/signup")
    fun requestRegister(@Body body : RequestRegister) : Call<ResponseRegister>
    
}




- 참고 : https://blog.naver.com/zion830/221661486117


### 기본과제 2

- login 관련 클래스 → login package


- bottomNavigation / recyclerView 활용한 인스타그램 메인 화면 관련 클래스 → insta package


- 서버와 통신 관련 클래스 / 인터페이스 → network package
