# var-val-log
[Kotlin] 기본 문법 `var, val, Log` 간단 정리

<br>

## val, var

_**val**_ 은 값이 한 번 할당되면 **변경할 수 없는** 변수로,<br>
상수, 설정 값 등을 나타낼 때 사용합니다.

_**var**_ 은 값이 **여러 번 할당될 수 있는** 변수로,<br>
사용자 입력 값을 저장하거나 동적인 데이터를 저장할 때 사용합니다.

```Kotlin
val value1 = "이것은 value1"
val value2 = "이것은 value2"

// Error
// value1 = "value1 아니야"

var value3 = "이것은 value3"
value3 = "value3 아닌데?"
```

<br>

## Log

**_Log_** 는 디버깅 및 로그 출력을 위한 클래스로,<br>
프로그램 동작을 파악할 때, 주로 사용합니다.

```Kotlin
Log.e("MainActivity", "Log"); // 오류
Log.w("MainActivity", "Log"); // 경고
Log.i("MainActivity", "Log"); // 정보 (프로그램 동작 파악 시, 중요 이벤트 기록 시)
Log.d("MainActivity", "Log"); // 디버그 (개발 중 출력, 배포 시 출력 X)
Log.v("MainActivity", "Log"); // 상세 (프로그램 실행 흐름, 상세한 변수 확인 시)
```
