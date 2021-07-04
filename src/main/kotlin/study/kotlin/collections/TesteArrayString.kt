package study.kotlin.collections

fun main() {

    println("--------------------Array passando o tipo---------------------")
    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "Jose"

for (nome in nomes){

    println(nome)
}
    println("--------ForEach------------")
     nomes.sort()
    nomes.forEach { println(it) } // lambda

    println("------------- arrayOf---------------------")
    val nomes2 = arrayOf("MAria", "Zaza", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}