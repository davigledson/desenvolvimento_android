fun main(){
    //clssifique as pessoas atraves de faixa etaria
    //idoso - 60 anos acima | Adulto entre 21 a 59 anos |
    // Jovem entre 13 a 20 | criança 13 ou abaixo
    var idade:Int = 40
    if(idade >= 60){
        println("idoso")
    } else if(idade <=59 && idade >= 21){
        println("adulto")
    } else if(idade <=20 && idade >= 13){
        println("Jovem")
    }
    else {
        println("criança")
    }
}

