package study.kotlin.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val  maria = Funcionario("Maria", 4000.0, "CLT")

    println("--------------List------------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }


    println("--------------adicionar-------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("--------------remover-------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("--------------Set-------------------")
    val funcionarioSet = mutableSetOf(joao) /// adicionou joao
    funcionarioSet.forEach { println(it) }

     println("  --    ")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("-------------remover---------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }



}