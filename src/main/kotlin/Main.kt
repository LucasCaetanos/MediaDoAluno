fun main(args: Array<String>) {

    println("Digite duas 4 notas para saber a média: ")
    print("Primeira nota: ")
    var nota1 = readLine()!!.toInt()
    print("Segunda nota nota: ")
    var nota2 = readLine()!!.toInt()
    print("Terceira nota: ")
    var nota3 = readLine()!!.toInt()
    print("Quarta nota: ")
    var nota4 = readLine()!!.toInt()

    var media = (nota1 + nota2 + nota3 + nota4) / 4

    if (media >=0 && media <= 4){
        println("Você foi reprovado")
    }else if( media > 4 && media <=5){
        println("Você está na média")
    }else if (media > 5 && media <= 8){
        println("Sua nota é boa")
    }else if (media > 8 && media <= 10){
        println("Sua nota é excelente")
    }else{
        println("Sua média é invalida")
    }

}

