package study.kotlin.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratracao: String

){
    override fun toString(): String =
        """
            nome: $nome
            salario: $salario
        """.trimIndent()
}
