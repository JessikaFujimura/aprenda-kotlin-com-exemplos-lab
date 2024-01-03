import java.lang.IllegalArgumentException
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
            println("${usuario.nome} matriculado com sucesso!")
        } else {
            throw IllegalArgumentException("${usuario.nome} já está matriculado!")
        }
    }

    fun desmatricular(usuario: Usuario){
        if(inscritos.all { it.identificador == usuario.identificador }){
            inscritos.remove(usuario);
            println("${usuario.nome} desmatriculado com sucesso!")
        }
    }

}

fun main() {
    print("Digite seu nome: ")
    val username = readlnOrNull().toString();
    val user1 = Usuario( username, Random.nextInt(0, 100))
    val contents : MutableList<ConteudoEducacional> = mutableListOf(ConteudoEducacional("Git", 30),
        ConteudoEducacional("Kotlin", 90))
    val formacao = Formacao("Programação em Kotlin", contents, Nivel.BASICO )
    formacao.matricular(user1)

}
