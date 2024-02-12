fun main(){
    var i = 0
    while (i<1000){
        if(i ==20){
            break
        }
        print("${i} ")
        i++
    }

    print("\n")
    var str = "teste de perfil"
    var j = 0

    while (j< str.length){
        if(str[j] == 'p'){
            break
        }
        print("${str[j]} ")
        j++
    }

    print("\n")
    for (i in 0..20){
        if(i%2 ==1){
            continue
        }
        print("${i} ")
    }

    print("\n")
    var str2 = "teste de perfil"


    for (i in 0..str2.length-1){
        if(str2[i] == 'e' || str2[i] == 'i'){
            continue // vai iginorar as letras e & i
        }
        print("${str2[i]} ")
    }



}

