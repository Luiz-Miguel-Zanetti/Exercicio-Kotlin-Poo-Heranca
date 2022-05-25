package classes

open class Preguiça(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()

        println("Som da preguiça: AaAaAaAaAaAaAaAaAaAaAaAaA ")

    }

     fun subirEmArvore() {
         println("O bicho-preguiça subiu na arvore: ")
    }
}