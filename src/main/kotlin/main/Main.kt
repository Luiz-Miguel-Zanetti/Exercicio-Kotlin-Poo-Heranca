package main

import classes.Animal
import classes.Cachorro
import classes.Cavalo
import classes.Preguiça

fun main() {

/*


    Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
    utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os
    animais fique na classe Animal:

    */

    var cachorro = Cachorro("Spike", 5)
    var cavalo = Cavalo("Snow", 10)
    var preguiça = Preguiça("Dormioco", 12)

    cachorro.emitirSom()
    cavalo.emitirSom()
    preguiça.emitirSom()


}

