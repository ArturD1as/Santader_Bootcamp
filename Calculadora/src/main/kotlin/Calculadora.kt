fun main() {
    println("________ CALCULADORA _______\n" +
            "Digite 1 para Adicao\n" +
            "Digite 2 para subtracao\n" +
            "Digite 3 para Multiplicacao\n" +
            "Digite 4 para Divisao\n" +
            "Digite 5 para Porcentagem\n" +
            "Digite 6 para Fatorial\n"+
            "Digite 7 para Potenciacao\n" +
            "____________________________")
    print("Qual opcao deseja?: ")

    when (val escolha = readLine()!!.toInt()) {
        in 1..4 -> {
            print("Digite o valor do primeiro numero: ")
            val num1 = readLine()!!.toFloat()
            print("Digite o valor do segundo numero: ")
            val num2 = readLine()!!.toFloat()

            when (escolha) {
                1 -> adicao(num1, num2)
                2 -> subtracao(num1, num2)
                3 -> multiplicacao(num1, num2)
                4 -> divisao(num1, num2)
            }

        }
        5 -> porcentagem()
        6 -> fatorial()
        7 -> potenciacao()
        else -> println("Escolha uma opcao valida no menu!")
    }
}
fun adicao(num1: Float, num2: Float) = println("O resultado da adicao e: ${num1 + num2}")

fun subtracao(num1: Float, num2: Float) = println("O resultado da subtracao e: ${num1 - num2}")

fun multiplicacao(num1: Float, num2: Float) = println("O resultado da multiplicacao e: ${num1 * num2}")

fun divisao(num1: Float, num2: Float) = println("O resultado da divisao e: ${num1 / num2}")

fun porcentagem(){
    print("Digite o valor da porcentagem que deseja: ")
    val num1 = readLine()!!.toFloat()
    print("Digite o valor do numero para se tirar a porcentagem: ")
    val num2 = readLine()!!.toFloat()
    println("O resultado de $num1 porcento de $num2 e: ${(num1/100) * num2}")
}

fun fatorial(){
    print("Digite o valor do numero que deseja saber o fatorial: ")
    val num1 = readLine()!!.toFloat()
    var i = 2
    var fat = 1
    while(i <= num1){
        fat *= i
        i += 1
    }
    println("O valor do fatorial de $num1 e: $fat")
}

fun potenciacao(){
    print("Digite o valor da base: ")
    val num1 = readLine()!!.toInt()
    print("Digite o valor do expoente: ")
    val num2 = readLine()!!.toInt()
    var pot = 1
    var i = 1
    while( i <= num2){
        pot  *= num1
        i += 1
    }
    println("O numero $num1 elevado a $num2 e: $pot")
}