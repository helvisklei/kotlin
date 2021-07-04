package study.kotlin.collections

fun main() {

    // intanica de 3 funcionarios
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val  maria = Funcionario("Maria", 4000.0, "CLT")

    // setOf -> falamos de conjuntos
    // a locamos em dois conjunto os 3 funcionarios
    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)

    println("-------------------União de conjutos--------------------------------")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("------------------subtração--------------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("------------------intersect no s dois conjuntos--------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}