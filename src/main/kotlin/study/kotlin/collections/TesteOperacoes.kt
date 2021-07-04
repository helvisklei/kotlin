package study.kotlin.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0,4000.0)

    for (salario in salarios){
        println(salario)
}
    println("---------------------------------------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")


    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("------------------------------------------------")
    salariosMaiorQue2500.forEach{println(it)}

    println("------------------------------------------------")
    println(salarios.count { it in 2000.0..5000.0 }) // contou dentro de uma range...intervalo salarios entre 2000 e 5000 = 2

    println("------------------------------------------------")
    println(salarios.find { it == 2250.0 }) //uma pesquisa do valor indicado que foi 2250.0
    println(salarios.find { it == 500.0 })// null

    println("------------------------------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}
