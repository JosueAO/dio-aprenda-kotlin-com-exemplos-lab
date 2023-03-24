// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO, INTERMEDIARIO, AVANCADO
}

data class Usuario(val nome: String)

data class ConteudoEducacional(
    val nome: String,
    val nivel: Nivel,
    val duracao: Int = 60
)

class Formacao(
    val nome: String,
    val nivel: Nivel,
    vararg conteudos: ConteudoEducacional
) {
    val inscritos = mutableListOf<Usuario>()
    val conteudos = mutableListOf(*conteudos)

    fun matricular(vararg usuarios: Usuario) {
        usuarios.forEach { usuario ->
            when {
                inscritos.contains(usuario) -> println("Usuário ${usuario.nome} já está matriculado na formação $nome.")
                else -> {
                    inscritos.add(usuario)
                    println("Usuário ${usuario.nome} matriculado na formação $nome!")
                }
            }
        }
    }

    fun cancelarMatricula(usuario: Usuario) {
        if (inscritos.contains(usuario)) {
            inscritos.remove(usuario)
            println("Matrícula do usuário ${usuario.nome} cancelada na formação $nome.")
        } else {
            println("Usuário ${usuario.nome} não está matriculado na formação $nome.")
        }
    }

    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println("- ${it.nome}") }
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("Pedro")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Desenvolvimento de APIs RESTful", Nivel.INTERMEDIARIO)
    val conteudo4 = ConteudoEducacional("Testes automatizados", Nivel.AVANCADO)

    val formacao1 = Formacao("Formação Kotlin", Nivel.INTERMEDIARIO, conteudo1, conteudo2, conteudo3)
    val formacao2 = Formacao("Formação Testes", Nivel.AVANCADO, conteudo4)

    // Vincula conteúdos à formação
    formacao1.conteudos.addAll(listOf(conteudo1, conteudo2, conteudo3))
    formacao2.conteudos.add(conteudo4)

    // Matricula usuários nas formações
    formacao1.matricular(usuario1, usuario2)
    formacao2.matricular(usuario3)

    // Exibe lista de inscritos nas formações
    formacao1.listarInscritos() // Saída esperada: João, Maria
    formacao2.listarInscritos() // Saída esperada: Pedro

    // Tenta matricular usuário já inscrito em uma formação
    formacao1.matricular(usuario1) // Saída esperada: Usuário João já está matriculado na formação Formação Kotlin.

    // Cancela matrícula de usuário
    formacao1.cancelarMatricula(usuario2) // Saída esperada: Matrícula do usuário Maria cancelada na formação Formação Kotlin.
    formacao1.listarInscritos() // Saída esperada: João
}
