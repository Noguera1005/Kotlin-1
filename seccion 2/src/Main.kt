
//seccion 2 del curso de Kotlin sobres los tipos de variables y un poco de array


fun main() {

    // leccion 2: numeros enteros Int

    var operando1: Int = 5
    var operando2: Int = 10

 println("suma de enteros: " + sumaint(operando1, operando2))

  //leccion 3: dato decimales float y double

    var operando3: Float
    var operando4: Float

    operando3= 4.5f
    operando4= 12.2f

   var resultado: Float= sumaFloat(operando3, operando4)
    println("suma de decimales: "+ resultado)

    //double

    var operando5: Double
    var operando6: Double

    operando5 = 5.5
    operando6 = 12.5

    var resultadodouble: Double= sumaDouble(operando5, operando6)
    println("suma de Double: "+ resultadodouble)

    //leccion 4: caracteres: Char y String

    // caracteres Char
     val c: Char = '1'
     val d: Char = '2'

    println("resultado de c + d = "+ c + d)

    // caracteres String
    val mensaje: String = "hola mundo"
    val nombre ="jose"
    val nacimiento = 2004
    val actual= 2025

    println("El estudiante $nombre tiene ${actual - nacimiento } años" )

    //leccion 5: booleano para jestionar balores que solo tenga 2 tipos (true o false)

    val llueve: Boolean = true
    val nublado: Boolean = true
    val hacefrio: Boolean = true

    //or - Diyuncion ||
    if(llueve || hacefrio){
        println("No voy a salir a pasear")
    }

    //and - conjuncion &&
    if(nublado && hacefrio ){
        println("seguramente llueva")
    }

    //Not- negacion
    if(!llueve){
        println("no necesita paraguas")
    }

    //leccion 6: convercion de tipos numericos

    val i: Int = 1
    val l: Long = i.toLong()
    val s: String = i.toString()

    println(s)

    //leccion 6: Arrays. tipos primitivos

    val arrayPares: IntArray= intArrayOf(0,2,4,6,8)

    println(arrayPares[1])

    val arrayImpares: IntArray= IntArray(10)
    println(arrayImpares[5])

    val arrayImparesv2: IntArray = IntArray(5){1}
    println(arrayImparesv2[3])
    println(arrayImparesv2[2])

    val arrayImparesv3: IntArray= IntArray (5) { it * 3}
    println("numeros potencia de 3" )
    println(arrayImparesv3[0])
    println(arrayImparesv3[1])
    println(arrayImparesv3[2])
}


//funcion de la leccion 2
fun sumaint(op1: Int , op2: Int ): Int{
    return op1 + op2
}

// funcion de la leccion 3
fun sumaFloat(op3: Float, op4: Float): Float{
   return op3 + op4
}

fun sumaDouble(op5: Double, op6: Double): Double{
    return op5 + op6
}