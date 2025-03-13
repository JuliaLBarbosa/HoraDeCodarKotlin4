fun main(){
    val estudantes = mutableListOf<String>()
    var resposta: String

  do{ println("Cadastre um nome: ")
      val nome = readln()!!.toString()
      estudantes.add(nome)
      println("Deseja continuar? S/N ")
      resposta = readln()
  } while(resposta != "pare")
     println("O programa parou!")
    println("A quantidade dos alunos: ${estudantes.size} \n Os nomes dos estudantes são: $estudantes")
  }

