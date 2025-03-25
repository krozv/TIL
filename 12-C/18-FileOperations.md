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
- 파일을 개방하면 스트림 파일을 만들고 파일 포인터 반환

### 문자 입력 함수 fgetc
```c
while (1)
	{
		ch = fgetc(fp);         // 개방한 파일에서 문자 입력 - 한글자씩
		if (ch == EOF)          // 함수의 반환값이 EOF면 입력 종료
		{
			break;
		}
		putchar(ch);            // 입력한 문자를 화면에 출력
	}
	fclose(fp);                 // 파일 닫음
```

### 기본적으로 개방되는 표준 입출력 스트림 파일
```c
#include <stdio.h>

int main(void)
{
	int ch;						// 입력한 문자를 저장할 변수

	while (1)
	{
		ch = fgetc(stdin);		// 키보드에서 문자 입력
		if (ch == EOF)			// <Ctrl> + <Z>로 입력 종료
		{
			break;
		}
		fputc(ch, stdout);		// 화면에 문자 출력
	}

	return 0;
}
```

### 텍스트 파일과 바이너리 파일
```c
fp = fopen("a.txt", "wb"); // "bs binary mode로 개방

```

### 개방 모드, `fseek`, `rewind`, `feof` 함수
```c
int fseek(FILE *stream, long offset, int whence);
```

`feof`
- 파일의 끝이면 참(0이 아닌 값)을 반환함

## 18-2. 다양한 파일 입출력 함수
### `fgets`와 `fputs`: 한 줄씩 입출력

### 스트림 파일의 버퍼 공유 문제와 `fflush` 함수
```c
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	FILE* fp;                       // 파일 포인터
	int age;                        // 나이 저장 변수
	char name[20];                  // 이름 저장 배열

	fp = fopen("a.txt", "r");       // 파일 개방

	fscanf(fp, "%d", &age);         // 나이 입력
	fgets(name, sizeof(name), fp);  // 이름 입력 - 줄바꿈이 나올때까지 불러옴

	printf("나이 : %d, 이름 : %s", age, name);  // 입력 데이터 출력
	fclose(fp);                     // 파일 닫음

	return 0;
}
```

### `fread`와 `fwrite` 함수
```c
// #define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	FILE* afp, * bfp;
	int num = 10;
	int res;

	afp = fopen("a.txt", "wt");         // 텍스트 모드로 출력 파일 개방
	fprintf(afp, "%d", num);            // num의 값을 문자로 변환하여 출력

	bfp = fopen("b.txt", "wb");         // 바이너리 모드로 출력 파일 개방
	fwrite(&num, sizeof(num), 1, bfp);  // num의 값을 그대로 파일에 출력

	fclose(afp);
	fclose(bfp);

	bfp = fopen("b.txt", "rb");         // 바이너리 모드로 입력 파일 개방
	fread(&res, sizeof(res), 1, bfp);   // 파일의 데이터를 그대로 변수에 입력
	printf("%d", res);                  // 입력한 데이터 확인

	fclose(bfp);

	return 0;
}
```