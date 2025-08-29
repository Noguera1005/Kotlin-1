//seccion 3 del curso

fun main() {
//leccion 1: condicional  si (if)
  val name1= "maria"
  val name2= "juan"

//invocamos al metodo 1
 getlongestname1(name1, name2)

// invocamos al metodo 2
 getlongestname2(name1,name2)

// invocamos al metodo 3
 getlongestname3(name1,name2)

  //leccion 2: condicional cuando (when)

     val contraseña = "ytfuigiygt"

    when(contraseña.length) {
        0 -> println("contraseña vacia ")
        in 1..4 -> println("contraseña muy debil")
        5,6 -> println("contraseña debil")
        else -> println("contraseña segura")
    }
    espar(x = 2578)

    //leccion 3: bucle para (for)

    val num = intArrayOf(1,2,3,4,5,6)
    for(number: Int in num) print(" "+number)

    println("")
    println("***NUMEROS PARES***")
    val numpares= intArrayOf(0,2,4,6,8,10)
    for((indice, valor) in numpares.withIndex()){
        println("elemento $indice : $valor")
    }


    for (i in 1..10) print(" "+i)
    println("")

    //leccion 4: bucle  mientras y hacer mientras (while y do while)

    var i=10
    while (i > 0 ){
        print(" "+i)
        i--
    }


    println("")
    println("do while")
    do{
        print(" "+ i)
        i++
    }while (i <= 10)
println(" ")
// leccion 5: labels : continue y break
    loop@ for(i in 1..10){
        for (j in 1 ..10){
            if(i==5 && j== 5){
                println("Estamos en la mitad")
                break@loop
            }else{
            println("i = $i, j= $j")
            }
        }
    }
}

//metodo 1 de la leccion 1
fun getlongestname1(name1: String, name2: String){
    var longestname = name2

    if(name1.length >name2.length) longestname = name1

    println("el nombre mas largo es: $longestname")
}

//metodo 2 de la leccion 1
fun getlongestname2(name1: String, name2: String){
    var longestname = ""

    if(name1.length >name2.length) {
       longestname = name2

    }else{
        longestname = name1
    }

    println("el nombre mas corto es: $longestname")
}

//metodo 3 de la leccion 1
fun getlongestname3(name1: String, name2: String){
    var longestname =if(name1.length >name2.length){
    println("el nombre mas largo es: $name1")
        name1
    }else{
    println("el nombre mas largo es: $name2")
    name2
    }
  println("longestname = $longestname")
}

//funcion de la leccion 3
fun espar (x: Int) = when(x % 2){
    0 -> println("el numero es par")
    else -> println("el numero NO es par")

}