

# open jdk 18 버전 환경 구성
#FROM : Docker 이미지를 기반으로 사용할 베이스 이미지를 지정
# 베이스 이미지 : Docker 이미지를 만들 때 기반이 되는 기존 이미지
# 베이스 이미지를 사용하면 필요한 환경을 직접 설치할 필요 없이, 미리 준비된 상태에서 추가 설정만 하면 됨
# 기본적으로 OpenJDK 18이 설치된 환경을 가져온다는 뜻
FROM eclipse-temurin:18-jdk

# build가 되는 시점에 JAR_FILE 이라는 변수 명에 build/libs/*.jar 선언
# build/libs - gradle로 빌드했을 때 jar 파일이 생성되는 경로
# ARG : Docker 빌드 시 사용할 빌드 타임 변수를 선언
ARG JAR_FILE=build/libs/*.jar

# JAR_FILE을 app.jar 로 복사
# COPY : 로컬 머신에서 컨테이너 내부로 파일을 복사하는 명령어
COPY ${JAR_FILE} app.jar

# 운영 및 개발에서 사용되는 환경 설정을 분리
# ENTRYPOINT : 컨테이너 실행 시 변경하기 어려운 고정 실행 명령어
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/app.jar"]

EXPOSE 4060
# 컨테이너에서 4060 포트를 열어줌.


LABEL authors="김명찬"

