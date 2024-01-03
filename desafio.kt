import kotlin.random.Random

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var nome:String, var identificador: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        if(inscritos.all { it.identificador != usuario.identificador }){
            inscritos.add(usuario);
            println("${usuario.nome} matriculado(a) na formação $nome com sucesso!")
        } else {
            throw IllegalArgumentException("${usuario.nome} já está matriculado(a)!")
        }
    }

    fun desmatricular(usuario: Usuario){
        if(inscritos.all { it.identificador == usuario.identificador }){
            inscritos.remove(usuario);
            println("${usuario.nome} desmatriculado(a) com sucesso!")
        }
    }

}

fun main() {
    print("Digite seu nome: ")
    val username = readlnOrNull().toString();
    val user = Usuario( username, Random.nextInt(0, 100))

    val contentKotlin : MutableList<ConteudoEducacional> = mutableListOf(ConteudoEducacional("Git", 30),
        ConteudoEducacional("Kotlin", 90))
    val kotlin  = Formacao("Programação em Kotlin", contentKotlin, Nivel.BASICO )

    val contentJava : MutableList<ConteudoEducacional> = mutableListOf(ConteudoEducacional("Git", 30),
        ConteudoEducacional("Orientação a objeto", 60),ConteudoEducacional("Java", 90))
    val java  = Formacao("Programação em Java", contentJava, Nivel.INTERMEDIARIO )

    println("Lista de formações disponíveis:  ")
    println("1 - ${kotlin.nome}")
    println("2 - ${java.nome}")
    print("Informe o número de qual formação você deseja se inscrever: ")

    val option = readlnOrNull()?.toInt();
    when (option){
        1 -> kotlin.matricular(user)
        2 -> java.matricular(user)
    }
}
