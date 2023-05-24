# Spring Core Study

---
## gradle 한글 인코딩 설정하기

---

1. shift 두번 타건 후 통합검색창에 vm검색
2. 사용자 지정 vm옵션(Edit custom VM options) 편집 클릭
3. 가장 아래줄에 **`-Dfile.encoding=utf-8`** 입력 후 인텔리제이 재실행

---
## java 설정
1. 좌측 상단 Project 바로 밑의 폴더명을 우클릭
2. Open Module Sttings(F4) 클릭
3. Project Settings 화면실행되면 좌측 상단 목록 중 Project클릭
4. SDK 17.0.7 버전 클릭 후 오른쪽 하단 'OK'버튼 누름 다운로드 실행
5. 코끼리 새로고침 버튼을 꼭 누르기! -> 다운로드 쭈르륵\

### 안된다면...
1. File 메뉴창에서 Settings 선택
2. 좌측상단에 gradle 검색
3. 우측 하단에 gradel JVM 에 'eclips ... 17.0.7'버전 클릭 -> 하단 OK클릭
4. 코끼리 새로고침 버튼 꼭 누르기!

---
## 인텔리제이 화면상 글씨 크기 조절

1. File 메뉴창에서 Settings 선택
2. 좌측 Editor 탭의 General 클릭
3. 상단의 Change font size(Zoom) with Ctrl-Mouse Wheel 체크저장
4. 컨트롤 누르고 마우스 휠 위아래로 조정시 확대 및 축소 가능.

---
## 테마 및 아이콘 설치

1. File 메뉴창에서 Settings에서 plugin검색 후 material 검색
2. Atom material icon, Material Theme UI 적용
   (File -> Settings -> Theme 검색 후 모양 탭에서 테마 선택)

---
## 깃허브 연동

1. File -> Settings -> Version Control -> 깃허브계정 등록
2. 하단부에 Terminal 열고 $ git rm -r --cached 입력

---
### chap01 수업내용 (2023.05.22) - 자바만 가지고도 구현이 가능한 프로그램 제작(~chap02)
1. 한식,중식,일식 등 요리사를 만들 예정
2. Chef 인터페이스생성
3. void cook();을 가짐
4. java 클래스 하나 생성 - KoreanChef implements Chef
5. System.out.println 이클립스에서는 'sysout' , 인텔리제이에선 'sout'
6. java 클래스 하나 생성 - JapaneseChef implements Chef
7. java 클래스 하나 생성 - ChineseChef implements Chef
---
### 추가
1. Restaurant 레스토랑 인터페이스 생성 (한식요리사-한국, 중식요리사-중국...)
2. void order();를 가짐
3. Course 인터페이스를 생성
4. 한정식, 오마카세,중국코스요리 만들 수 있도록
5. void combineMenu(); 코스요리 구성
---
### 추가
1. FusionRestaurant 생성, Hotel 생성
2. test폴더에 HotelTest 생성
---
### chap02 수업내용(2023.05.22) - Bean팩토리 패턴 제작
1. java패키지 생성 -> .config생성 -> java 클래스 HotelManager를 생성
2. 생성만 해주는.. 인스턴스를 만들어주는 역할을하는 것

---
## 자바 옵션이 안 보이는 경우

1. File ->Settings -> build tools->gradle 하단 SDK세팅
2. File->project structure->project의 SDK는 버전맞게
   하단의 Language level은 sdk default로 설정

--- 
## 복습
1. HotelTest1코드 눌러서 호출흐름을 파악해보고
2. 메모리 구조 그려보기

---
## chap03 수업내용 (2023.05.23)
1. chap02 수업내용 복붙
2. config생성
3. 