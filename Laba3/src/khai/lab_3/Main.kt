package khai.lab_3

class Implementor: LogicFindMedian,IterationLess3K,ArrayFirstLess {
    override fun find_median(a: Double, b: Double, c: Double): Double {
        var res:Double = 0.0
        if ((a>b && a<c) || (a>c && a<b)){
            res = a
        }else if((b>a && b<c) || (b>c && b<a)){
            res = b
        }else if ((c>a && c<b) || (c>b && c<a)){
            res = c
        }
        println("Медиана: $res")
        return 0.0
    }

    override fun less_3k(N: Int) {
        var K:Int = (N/3)+1;
        println("Найменьшее целое число К: $K")
    }

    override fun first_less(A: Array<Int>, T: Double) {
        for (i in 1 until A.size - 1){
            if(A[i] < T){
                println("Первое меньшее значение ${A[i]}")
                break
            } else if(A[i].toInt() == 9){
		    println("Таких значений нет")
	        }
        }
    }
}

fun main(args: Array<String>) {
    println("Lab 3.")

    val C = Implementor()

    val A = arrayOf(21, 6, -7, 8, 23, 7, 12, 0, -5, 17)

    C.find_median(1.0,2.0,3.0)
    C.less_3k(10)
    C.first_less(A, 5.0)
}