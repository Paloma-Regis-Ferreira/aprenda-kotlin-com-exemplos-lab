// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    // Criação de usuários
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Paloma")
    val usuario3 = Usuario("Maria")
    val usuario4 = Usuario("Leo")

    // Criação de conteúdos educacionais
    val conteudoKotlin1 = ConteudoEducacional("Programação Avançada em Kotlin", 200)
    val conteudoKotlin2 = ConteudoEducacional("Introdução ao Kotlin", 200)
    val conteudoJava1 = ConteudoEducacional("Lógica de programação em Java", 100)
    val conteudoJava2 = ConteudoEducacional("Spring Boot e java", 200)
    
    // Criação de uma formação
    val formacaoKotlin = Formacao("Formação de Kotlin", Nivel.INTERMEDIARIO, listOf(conteudoKotlin1, conteudoKotlin2))
    val formacaoJava = Formacao("Formação de Java", Nivel.BASICO, listOf(conteudoJava1, conteudoJava2))

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoJava.matricular(usuario3)
    formacaoJava.matricular(usuario4)
    
}
