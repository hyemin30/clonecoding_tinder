## cloneCoding - tinder

## 주요기능
거리와 성별에 따른 회원 추천, 좋아요, 회원매칭, 매칭된 회원과 1:1 댓글방 생성

## 인프라 구조
![image](https://user-images.githubusercontent.com/116478121/220060585-2de072b2-6331-4ac5-988b-260cceb87a74.png)

## 프로젝트 중점사항
- GitHub Actions를 활용하여 CI/CD 구축
- 로그인 시 JWT 토큰 및 Redis 사용
  - API 수행 시마다 시큐리티 필터에서 회원정보 DB에 접근하는 것을 줄이기 위함
  - 로그인 시 회원정보를 Redis에 저장하여 로그인 한 사용자 정보를 찾을 때 Redis에서 먼저 검색하도록 함
  - Expiration을 설정하여 자주 로그인하지 않는 사용자의 데이터는 삭제함
- 회원 추천 시 거리 순서대로 정렬하여 추천
  - 회원가입시 위도와 경도 정보를 저장하여 거리를 계산함
- Swagger를 사용하여 API 관리 및 테스트

## ERD
![image](https://user-images.githubusercontent.com/116478121/220059067-b73dbf90-e417-4d98-bba0-9b3015e3d58f.png)

## API 설계
https://www.notion.so/a768a45ea6d7421599ad407f8d23c0cb?v=51c40d2a226f4b308f0e2585556de61d&pvs=4

<!-- ![image](https://user-images.githubusercontent.com/116478121/220059443-e1309421-1a8f-4231-9d5d-95259daebc17.png) -->
<!-- ![image](https://user-images.githubusercontent.com/116478121/220059453-c99c6444-2150-4ed3-8533-4874056da31d.png) -->

