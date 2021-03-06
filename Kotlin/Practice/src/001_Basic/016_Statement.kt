package `001_Basic`

/**
 * @date 2019.05.14
 *
 * 문장 : 독립적으로 실행할 수 있는 코틀린 코드 조각
 *
 * \[참고] 문장은 독립적인 코드 조각을 세는 단위로, 표현식과 다르다
 */
fun main() {
    val num: Int    // 다른 줄과 연결되지 않은 독립된 코드 조각 (하나의 문장)
    num = 15        // 독립적인 코드 조각 (문장)

    println(
        num + 7 + 3 // 사실상 하나의 문
    )
}