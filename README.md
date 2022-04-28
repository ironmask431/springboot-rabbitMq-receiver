# springboot-rabbitMq-receiver

#### * 목적
1. springBoot와 RabbitMQ 연동
2. RabbitMQ를 통해 문자열과 객체 sender, receive 만들어보기

#### * 순서
1. Local에 docker를 통해서 RabbitMQ 설치
2. 문자열 sender, receiver 개발, 테스트
3. 객체 sender, receiver 개발, 테스트 

#### * 메시지 흐름
1. Sender 에서 Receiver로 메세지 전송  
2. Receiver 에서 메세지 수신
3. Receiver 에서 메시지 수신 후 Sender로 메세지 리턴 
4. Sender 에서 리턴받은 메세지 수신 

![023](https://user-images.githubusercontent.com/48856906/165856446-36e40aaf-6776-4b49-8b2c-2fcaa67c6ed5.PNG)

----

1. rabbitMQ 로컬 설치후 어드민 접속

![004](https://user-images.githubusercontent.com/48856906/165857617-c4cbc77d-e034-404b-81ba-5b2b6478e01a.PNG)

2. sender, receiver 개발 후 time 메세지 송신, 수신 테스트

![013](https://user-images.githubusercontent.com/48856906/165857903-40d98076-9f87-420c-a21d-5c3ceec68e08.PNG)

![014](https://user-images.githubusercontent.com/48856906/165857911-566173d6-5cf1-4a55-944b-0012dea0f6e5.PNG)

3. RabbitMQ 어드민에서 메세지 송,수신 모니터링

![011](https://user-images.githubusercontent.com/48856906/165857990-1cb4ca9e-939b-4b0b-996b-678a4ebc1348.PNG)

4. 객체 전송, 수신 테스트  

![019](https://user-images.githubusercontent.com/48856906/165858346-72252ab3-fa82-4eee-815c-1c9ce75d7eb3.PNG)

![020](https://user-images.githubusercontent.com/48856906/165858362-b8dec77e-fd59-4957-a5e8-63a81ff808af.PNG)

5. (1) Sender에서 객체 전송 + (2) Receiver 에서 객체 수신 + (3) Receiver 에서 객체 리턴 + (4) Sender에서 객체 수신 완료

![021](https://user-images.githubusercontent.com/48856906/165858375-b2feffa3-a462-4403-a71d-d5a70d53c42d.PNG)

![022](https://user-images.githubusercontent.com/48856906/165858389-20d99029-aa79-4e6c-a2eb-05be50ba740e.PNG)
