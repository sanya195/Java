package khai.lab2

//ВАРИАНТ 2

open class Student(val chsngemark: Int):Bachelor(),Exam,Bad {
    val tema:String = "Генераторы СВЧ"
    val university:String = "ХАИ"
    private val x: Int
        get() = chsngemark
    override fun study() {
        println("Студент учится в $university на специальности $specialization")
    }
    override var specialization: String
        get() = "Telecomunication"
        set(value) {
            specialization = value;
        }
    override var mark: Int
        get() = 4
        set(value) {
            mark =value
        }
    override fun pass() {
        println("Студент сдал экзамен на $mark")
    }
    override fun send_down() {
    }
    inner class Curiosity{
        fun assess() {
            println("Студент делает курсовой на тему :$tema")
        }
    }
    fun deepingStudyInner(){
        val fullcuriosity = Student(100).Curiosity().assess()
    }

    open class verybad {
        val a = Mark.F
        class notbad {
            val a = Mark.D
            class good {
                val a = Mark.C
                class morethengood{
                    val a = Mark.B
                    class awesome{
                        val a = Mark.A
                    }
                }
            }
        }
    }
    fun trytobeperfect(){
        val scolorship = verybad.notbad.good.morethengood.awesome()
        val tail = verybad.notbad.good.morethengood()
        val moretails = verybad.notbad()
        val goout = verybad()
        println("Все учатся на: ${scolorship.a},${tail.a},${moretails.a},${goout.a}")
    }
    abstract class situation() {
        open fun anothersituation() {
            println("Студент получил оценку ${Mark.C} и уехал домой")
        }
    }
    // was writting about myself and new leader
    fun sboy() {
        val leaderone = Person("Anton","Kemenchedgy","Староста группы")
        val changeleader = leaderone.copy(status = "student")
        val secondleader = leaderone.copy(name = "Alex",surname = "Zhukov" )

    }
    // make private settings
    class litledifferent() {
        fun changemark(){
            val marko = Student(100)
            val change = marko.x
        }
    }
}
