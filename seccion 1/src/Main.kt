const val x = 2213013
const val titulo2 = "jose noguera "

// leccion 2: hola mundo
fun main(args: Array<String>) {
    println("hola mundo ")

//leccion 3: definicion de variables.

    var titulo = "creado por jose noguera "
    var subtitulo: String

    subtitulo = " estudiante de 4to año de ingnieria en sistemas "
    println ( "titulo: " +titulo )
    println( "subtitulo: "+subtitulo)

//leccion 4: definicion de variables read_only

    // con val no es posible modificar su valor, si se quisiera modificar tendria que usar var

    val mensaje = "UNP"
    val mensajeCompleto = "De la univercidad " + mensaje

    println(mensajeCompleto)

//leccion 5: constantes

//no es una variable local, por ende se pone fuera de la funcion ya que es gloval

    println("carnet: "+ x)
    println(titulo2)

//llamando a la funcion de abajo hecha en la leccion 6

    printHeader(titulo3 = "Funcion creada")

    var resultado = printfooter(titulo3 = "funncion2 con resultado")
    println(resultado)

//tipos de comentarios

     //comentario de linea (normal), recomendacion siempre usar una linea en blanco despues de usaarla
    /* con este se puede cometar en varias lineas
    *
    *
    *
    *  sin importar cuantas lineas ocupe */

}

//leccion 6: Declaracion de una funcion

fun printHeader (titulo3: String ){
    println("\n*******************************")
    println("******* "+ titulo3 +" ********")
    println("*******************************")

}

fun printfooter(titulo3: String): String{
    var footer = "\n*******************************\n"
    footer = footer + titulo3
    footer = footer + "\n*******************************"
    return footer
}