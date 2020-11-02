fun main(args: Array<String>) {

//    Aqui estamos declarando una variable sin darle un valor
    val num1:Int
//    Aqui estamos declarando una varible dandole un valor
    val num2:Int = 10
//    Con la instruccion 'println()' se muestra algo por pantalla
    println("Ingrese un numero")
/*Con la funcion 'readline()' leemos un dato que el usuario ingresa, y al final declaras como se guardara lo ingresado, aca lo guardamos como entero 'toInt'*/
    val num3 = readLine()!!.toInt()

//    Aca declaramos un condicional 'if' poniendo la condicion entre parentesis, este caso declarando un rango
    if (num3 in 3..10){
        println("El numero ingresado esta entre 3 y 10")
    }/* Y colocamos un 'else' que es la que se cumple cuando la condicon del if no es vedadera */
    else {
        println("El numero ingresado no esta entre 3 y 10")
    }
    
}