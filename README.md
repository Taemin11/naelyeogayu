<span style="font-size:30px">내</span><span style="font-size:25px">려</span><strong style="font-size:20px">가</strong><strong style="font-size:17px">유</strong>

SSAFY 4기 자율 1반 3팀 <span style="color: green; font-size: 25px">더치페이</span>입니다.

![image](https://user-images.githubusercontent.com/50867723/132435108-8a6c4c81-ad6f-4620-9078-8bfe5e30e9cc.png)

![image](https://user-images.githubusercontent.com/50867723/132435134-0fa98c6b-9330-4df9-b46b-22919f5365b9.png)
![image](https://user-images.githubusercontent.com/50867723/132435172-b5ee3cbe-354b-49c8-bdaa-90cbc0a30f1a.png)
![image](https://user-images.githubusercontent.com/50867723/132435184-aae7fdb6-f89a-4ea7-a075-0a89ff323112.png)


- 리퍼브 상품에 하향식 경매를 이용해 판매하는 쇼핑몰 프로젝트입니다.
- 저희가 취급하는 리퍼브 상품이란 소비자 기준에 미치지 못하는 상품들로 <br />
  못난이 농산품, 포장 불량 이나 상품 흠집들이 존재하는 공산품, 유통기한 임박상품이 있습니다.
-  하향식 경매는 최고가로 시작되어 시간이 지나면서 값이 점점 내려가는 경매 입니다.
- 리퍼브 상품들은 재고로 처리되며 시간이 지나면 점점 가치가 하락한다는 공통점이 있습니다.
- 따라서 리퍼브 상품에 하향식 경매를 적용해 시간에 따라 가치가 달라지는 점을 반영했습니다.
</p>
---

&nbsp;
&nbsp;
---
&nbsp;
&nbsp;


## 📗목차

- [기획배경](#기획배경)
- [기획](#기획)
  - 와이어프레임
  - ERD
  - API Table
- [주요기능](#주요기능)
- [기술스택](#기술스택)
- [개발환경](#개발환경)
  - 소스트리(Sourcetree)
  - Git 컨벤션
- [시작하기](#시작하기)
- [만든사람들](#만든사람들)

&nbsp;
&nbsp;
---
&nbsp;
&nbsp;


# 💡기획배경

![image](https://user-images.githubusercontent.com/50867723/132435232-935d3751-79e9-4423-b1f8-8cd70e8dbb4a.png)

&nbsp;
&nbsp;
---
&nbsp;
&nbsp;

# 💾기획

## [와이어 프레임](https://www.figma.com/file/6Qi8Xm9QdUBCSITZJSI4Qw/%EC%9E%90%EC%9C%A8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8?node-id=0%3A1)

![image](https://user-images.githubusercontent.com/50867723/132435277-0bdd9526-52bb-4530-80d2-485aab1a6d0c.png)

## [ERD](https://www.erdcloud.com/d/Q2J7PtKbnRL55vnw4)

![image](https://user-images.githubusercontent.com/50867723/132435282-c9569b4e-1f19-4134-9660-40d8ea7db81e.png)

## [API Table](https://www.notion.so/API-ad638aad80a84f769262a9eabb2930d0)

![image](https://user-images.githubusercontent.com/50867723/132435290-e5286071-09bf-46fb-b039-29d19e989523.png)
<br />
![image](https://user-images.githubusercontent.com/50867723/132435298-be5134e5-02ca-48f3-8985-499e5cfdbc47.png)
<br />
![image](https://user-images.githubusercontent.com/50867723/132435307-c93056e0-dc7c-4bd4-8b9b-fc4a859c2eca.png)

&nbsp;
&nbsp;
---
&nbsp;
&nbsp;

# 🛒주요기능

![image](https://user-images.githubusercontent.com/50867723/132435315-541f7e33-a050-4f90-bdbd-d968fdc6634c.png)
<br />
![image](https://user-images.githubusercontent.com/50867723/132435345-95e85984-caa8-498c-a3f3-fa8bd10aca85.png)
<br />
![image](https://user-images.githubusercontent.com/50867723/132435351-e06832ab-deb4-4976-a75e-9c2f2bc166e1.png)

## 1. 테마 별 상품 조회
## 2. 상품 카드화로 간편하게 정보 확인
## 3. 마이페이지를 통해 활동 내역 확인
## 4. 스케쥴러를 통해 지속적인 가격 변동, 경매 기간 확인, 예약 구매 기능


&nbsp;
&nbsp;
---
&nbsp;
&nbsp;


# 🛠기술스택

## FrontEnd

```
  
    "axios": "^0.21.1",
    "core-js": "^3.6.5",
    "eslint-config-prettier": "^8.2.0",
    "firebase": "^8.4.2",
    "jwt-decode": "^3.1.2",
    "moment": "^2.29.1",
    "swiper": "^5.3.7",
    "vue": "^2.6.11",
    "vue-awesome-swiper": "^4.1.1",
    "vue-infinite-loading": "^2.4.5",
    "vue-router": "^3.2.0",
    "vuetify": "^2.4.11",
    "vuex": "^3.4.0"
  
```

## [BackEnd](https://www.notion.so/Version-e100ebc4cd9640128633f853f336202e)

```
    "jdk" : "zulu-1.8.0_192",
    "sts" : "^3.9.14",
    "spring starter" : "^2.4.2",
    "lombok" : "^1.18.12",
    "jwt" : "^0.9.1",
    "swagger" : "^2.9.2",
    "spring security" : "^2.4.4",
    "JPA" : "^2.4.5"
```



&nbsp;
&nbsp;
---
&nbsp;
&nbsp;


# 📂개발환경

### 소스트리(Sourcetree)

![image](https://user-images.githubusercontent.com/50867723/132435367-43dcf77b-5586-406f-902b-7d69c7ea7a37.png)

- 소스트리를 활용하여 깃을 체계적으로 관리했습니다.
- branch를 쉽게 생성하며, 어떤 branch가 존재하는지 파악하기 쉽습니다.
- stash, push, pull, commit 등 알기 쉽게 구성되어 있고, 현재 어떤 상태인지 쉽게 파악할 수 있습니다.

### Git 컨벤션

```

    Commit : #<JIRA issue number> <type>:<subject>
    Branch : <type>/<Fe/Be><summary>  ⇒ Pascal 표기법으로 적기
    MR(PR) : <JIRA issue number> <description>
    
```


&nbsp;
&nbsp;
---
&nbsp;
&nbsp;


# 🐣시작하기
exec dir 를 참조해주세요!

---
&nbsp;
&nbsp;


# 👨‍💻만든사람들

## 팀장 : 하태민 (BackEnd + DevOps)
##  팀원 
## 1. 김명규 (BackEnd)
## 2. 권영일 (BackEnd)
## 3. 송지헌 (FrontEnd + 최종 발표)
## 4. 천창민 (FrontEnd + 중간 발표)

<h2>지금까지 <strong style="color: green; font-size: 45px;">더치페이</strong>의 리드미였습니다. <br/> 감사합니다!</h2>

![image](https://user-images.githubusercontent.com/50867723/132435380-82750a04-4204-4495-94fc-56d0545f4995.png)
