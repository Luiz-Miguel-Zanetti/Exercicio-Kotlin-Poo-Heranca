package classes

class Cavalo(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Som do cavalo: HihIHiHiHIHhiIHhihIHhiiHHIhhiHIIHihiiHIhihiIHIihihi")
    }

    override fun correr() {
        super.correr()
        println("O cavalo correu")
    }
}