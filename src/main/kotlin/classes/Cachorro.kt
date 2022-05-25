package classes

class Cachorro(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()

        println("Som do cachorro: AuAuAuAuAuAUaUAuAUAuAuAu")

    }

    override fun correr() {
        super.correr()
        println("Correr como cachorro")
    }
}