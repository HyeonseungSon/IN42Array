/*
Array
1. Array()
[형식]
Array(개수, {식})

{예시 1} val array0 = Array(5, {100}) // => array0 : [100, 100, 100, 100, 100]
{예시 2}

2. arrayOf()
 - 다양한 형태의 자료형을 저장할 수 있습니다.
 - 저장할 자료형을 제한하고 싶다면 자료형 + arrayOf() 형태의 함수를 사용합니다.
  : intArrayOf(), doubleArrayOf(), booleanArrayOf() ...
 - arrayof<Generic> 도 가능합니다.
[형식]
array(10, 20, 30 ...)
array(10, 11.11, "문자열", true ...)

3.
 */
fun main() {
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1 : $array1")
    println("array1 : ${array1.contentToString()}") // => array1 : [10, 20, 30, 40, 50]

    val array2 = arrayOf(100,11.11, "문자열", true)
    println("array2 : ${array2.contentToString()}") // => array2 : [100, 11.11, 문자열, true]

    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55)
    val array0 = booleanArrayOf(true, false, true, false)
    val array5 = arrayOf <String>("문자열1", "문자열2", "문자열3")
    println("array3 : ${array3.contentToString()}")
    println("array4 : ${array4.contentToString()}")
    println("array0 : ${array0.contentToString()}")
    println("array5 : ${array5.contentToString()}")

    val array6 = Array(5, {100})
    println("array6 : ${array6.contentToString()}")

    val array7 = Array(5, {it * 2}) // it 내부에는 1부터 1씩 증가되는 값이 존재합니다.
    println("array7 : ${array7.contentToString()}")

    println("----- For -----")

    var count = 1

    for (item in array1) {

        println("array1 ($count) : $item")
        count++
    }



}











