# git

분산 버전 관리 시스템(version control system)

버전 관리: 변화를 기록하고 추적하는 것

불필요한 메모리 소모 감소 -> 비용 감소 -> 조회시간 감소

## 중앙 집중식 vs 분산식

### Centralized VCS (CVCS)

버전을 중앙 서버에 저장

중앙 서버에서 파일을 가져와(= snapshot) 다시 중앙에 업로드

장점: 보안을 이유로 CVCS을 사용

### Distributed VCS (DVCS)

버전을 여러 개의 복제된 저장소에 저장 및 관리

중앙 서버에 의존 X

동시에 다양한 작업 수행 O

**장점**

- 중앙 서버의 장애나 손실에 대비하여 백업과 복구가 용이

- 인터넷이 없어도 이용 가능

    - 변경 이력과 코드를 로컬 저장소에 기록. 추후 중앙 서버와 동기화


## git의 영역

1. Working Directory

2. Staging Area

3. Repository

## git 명령어

1. git init

    local repository를 초기화(initialize)

    git 버전 관리를 시작할 디렉토리에서 진행해야 함

    git init를 입력하면 뒤에 (master) 표시를 확인할 수 있음

    (master)외에 (main)를 혼용하기도 함

    git local repository 내에 또 다른 local repository 생성 X

    -> git 저장소 안에 다른 저장소가 있을 경우 외부 저장소가 내부 저장소의 변경사항을 추적할 수 없기 때문

2. git config ~

    git config --global user.email "이메일"

    git config --global user.name "이름"

    git init 후에 author 정보를 입력하는 과정

3. git add

    로컬 저장소 내에 변경사항이 있는 파일을 staging area에 추가하는 명령어

4. git commit -m "변경사항 메모"

    staging area에 있는 파일을 repository로 이동

    버전을 생성하고 변경 이력을 남기는 것으로 반드시 commit message를 작성해야 함

5. git status

    파일이 staging area내에 위치하는 지 확인할 수 있는 명령어

    git add 후 올바르게 staging area에 위치할 경우 **Changes to be committed:** 메세지 하단에 파일명이 보인다

6. git log

    commit한 git 내역을 확인할 수 있음

    가장 오래된 commit이 하단에 위치함

## local repository & remote repository

### local repository

내 데스크탑 내에 git init으로 생성한 repository

### remote repository

github와 같은 버전관리시스템으로 생성한 repository

### git 명령어

1. git remote -v

    local repository와 연결된 remote repository가 존재할 경우 보여줌

2. git remote add {remote repo name} {remote repo url}

    (ex) git remote add origin https://github.com/krozv/TIL.git

    TIL repository를 origin이란 이름으로 연결함

3. git push -u origin master

    master(local repo) -> origin(remote repo)으로 파일 올림 (push)

4. git pull origin master

    origin(remote repo)-> master(local repo)로 파일 받음 (pull)

5. git fetch

    remote repo에서 데이터를 모두 local repo로 가져오는 것

> **fetch와 pull 차이** <br>
> fetch: 단순히 데이터를 가져오는 것 <br>
> pull: fetch + merge. 자동 merge까지 진행함 <br>
> merge: 같은 이름의 다른 내용 파일이 각각의 저장소에 존재할 경우 파일을  합병하는 것

6. git clone {remote_repo_url}

    (ex) git clone https://github.com/krozv/TIL.git

    원격 저장소 전체를 다운로드(복제)

    git init를 실행하지 않은 directory에서 사용할 것

## gitignore

git에서 특정 파일이나 디렉토리를 추적하지 않도록 설정하는 데 사용하는 텍스트 파일

협업을 하는 데 필요하지 않거나, 타인에게 방해가 되는 cach 파일, 타인에게 공유되길 원치 않는 API키 등을 선별하여 목록 작성

**touch .gitignore**

gitignore 파일 생성 명령