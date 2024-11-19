package com.example.SimonDicePCClase.model

/**
 * Singletons con los datos de la aplicacion
 */
object Datos {

    //los aciertos que lleva el usuario
    var aciertos = 0
    //las rondas que lleva el usuario
    var rondas = 0
    // los numeros randoms para meter en la lista de la maquina
    var numRandom = 0
    //el record maximo del usuario
    var record = 0
    //la lista de numeros randoms de la maquina
    val listaNumerosRandom : MutableList<Int> = mutableListOf()


    var listaColores : MutableList<Int> = mutableListOf()

    /*
    // sonidos botones
    val sounds = listOf(
        MediaPlayer.create(DataContext.context, raw.sound1),
        MediaPlayer.create(DataContext.context, R.raw.sound2),
        MediaPlayer.create(DataContext.context, R.raw.sound3),
        MediaPlayer.create(DataContext.context, R.raw.sound4)
    )

    // sonidos
    object DataContext{
        lateinit var context: Context

        fun init(context: Context){
            this.context = context
        }
    }*/

}