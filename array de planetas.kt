fun main(){

    val listaPlanetas:MutableList<String> = mutableListOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

      println("Digite um novo planeta: ")
      var planeta = readln()
    if(planeta in listaPlanetas){
        println("Planeta já se encontra na lista")
    }else{
        println("Planeta não está na lista.")
    }
}

