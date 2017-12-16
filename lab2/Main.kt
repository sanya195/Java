package khai.lab2

fun main(args: Array<String>) {
    val obj = object: Student(123), Bad, Exam{
        override fun send_down() {
            println ("Отправить на пересдачу тех, у кого оценка ${Mark.F}")
        }
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
                mark = value
            }
        override fun pass() {
            println("Студент сдал экзамен на $mark")
        }
        inner class Curiosity{
            fun assess() {
                println("Студент делает курсовой на тему :$tema")
            }
        }
    }
    obj.send_down()
    obj.study()
    obj.pass()
    obj.Curiosity().assess()
}