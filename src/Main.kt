/*
Array
 - 배열은 그 크기가 늘어나지 않습니다.

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

    println("----- Multi-Dimensional Array -----")

    val array8 = arrayOf(arrayOf(10,20,30), arrayOf(40,50,60), arrayOf(70,80,90))

    println("array8 : $array8")
    println("array8 : ${array8.contentToString()}")
    // 다차원 배열 출력 방법 .contentDeepToString()
    println("array8 : ${array8.contentDeepToString()}")

    for (item1 in array8) {
        println("item1 : $item1")
        for (item2 in item1) {
            println("array8.item : $item2")
        }
    }

    println("----- 배열 출력 사용 방법 -----")

    println("array1 0 : ${array1[0]}")
    println("array1 1 : ${array1[1]}")
    println("array1 2 : ${array1.get(2)}")
    println("array1 3 : ${array1.get(3)}")

    println("----- 배열 요소 변경 -----")

    println("array1 : ${array1.contentToString()}")
    array1[0] = 100
    println("array1 : ${array1.contentToString()}")


    println("----- 배열 크기 -----")

    println("array1 size : ${array1.size}")

    println("----- Kotlin 배열 제공 함수 -----")

    println("array1 : ${array1.contentToString()}")

    val array10 = array1.plus(60)
    println("array1 : ${array1.contentToString()}") // 변화 없습니다.
    println("array10 : ${array10.contentToString()}") // .plus 함수를 통해서 array10 이라는 새로운 배열을 생성해야 출력이 됩니다.

    val array11 = array1.sliceArray(1..3) // 배열 요소 추출
    println("array11 : ${array11.contentToString()}") // => array11 : [200, 30, 40]

    println("첫 번째 값 : ${array1.first()}") // => 첫 번째 값 : 100
    println("마지막 값 : ${array1.last()}") // => 마지막 값 : 50
    println("30의 위치 : ${array1.indexOf(30)}") // => 30의 위치 : 2
    println("평균 : ${array1.average()}") // => 평균 : 84.0
    println("합 : ${array1.sum()}") // => 합 : 420
    println("개수 : ${array1.count()}") // => 개수 : 5
    println("개수 : ${array1.size}") // => 개수 : 5 (size Property)
    println("30을 포함하는가 : ${array1.contains(30)}") // => 30을 포함하는가 : true
    println("1000을 포함하는가 : ${array1.contains(1000)}") // => 1000을 포함하는가 : false
    println("30을 포함하는가 : ${30 in array1}") // => 30을 포함하는가 : true
    println("1000을 포함하는가 : ${1000 in array1}") // => 1000을 포함하는가 : false

    val array15 = arrayOf(100, 200, 300)
    println("최대 : ${array15.max()}")
    // println("최소 : ${array1.min()}")

    val array12 = arrayOf(5, 1, 3, 7, 10, 8)
    val array13 = array12.sortedArray()
    val array14 = array12.sortedArrayDescending()
    println("array13 : ${array13.contentToString()}") // => array13 : [1, 3, 5, 7, 8, 10]
    println("array14 : ${array14.contentToString()}") // => array14 : [10, 8, 7, 5, 3, 1]

}











