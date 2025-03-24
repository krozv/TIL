# 18. 파일 입출력
## 18-1. 파일 개방과 입출력
### file operations
1. High level io
- buffer
```c
FILE * fp = fopen(...);
```

2. Low level io
- buffer(io)
```c
int fd = open(...);
```

### 파일 개방과 폐쇄
```c
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	FILE *fp;                   // 파일 포인터

	fp = fopen("a.txt", "r");   // a.txt 파일을 읽기 전용으로 개방
	if (fp == NULL)             // fp가 널 포인터면 파일 개방 실패
	{
		printf("파일이 열리지 않았습니다.\n");   // 안내 메시지 출력
		return 1;                    // 프로그램 종료
	}
	printf("파일이 열렸습니다.\n");
	fclose(fp);                      // 파일 닫기 - multi thread 일 경우, 필수로 닫아야함

	return 0;
}
```

### 스트림 파일과 파일 포인터
- 파일 입출력은 스트림 파일을 통해서 수행
