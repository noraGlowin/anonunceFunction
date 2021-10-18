fun main(){
    var Queen= "Nora" //.count({letter -> letter=='o'})
    println(Queen)
    println(
        {
        var currentYear =2021
        "Welcome $Queen your journey with kotlin started ($currentYear)"
}()
    )
// %%%%%%%%%%%%%%%%%%%%5.2 Assigning the anonymous function to a variable %%%%%%%%%%%%%%%%%%%%
//    val sayHelloZoro : ()-> String ={
//        val favoriteAnime= "Zoro"
//        "$favoriteAnime is  $Queen's favorite animetion in 2000 "
//
//    }
//println(sayHelloZoro())
//    %%%%%%%%%%%%%%%%%%%%5.3  Adding a parameter to the anonymous function %%%%%%%%%%%%%%%%%%%%
//    val sayHelloZoro : (String)-> String ={favoriteAnime ->
//
//        "$favoriteAnime is  $Queen's favorite animetion in 2000 "
//
//    }
//    println(sayHelloZoro("Zoro"))
 /// %%%%%%%%%%%%%%%%%%%%5.4  Using the it keyword %%%%%%%%%%%%%%%%%%%%
//    val sayHelloZoro : (String) -> String={it
//        "$it is  $Queen's favorite animetion in 2000 "
//
//    }
//    println(sayHelloZoro("Zoro"))
    //%%%%%%%%%%%%%%%%%%%%5.5  Accepting a second argument%%%%%%%%%%%%%%%%%%%%
//    val sayHelloZoro :(String , Int) -> String ={favoriteAnime , releaseDate ->
//        "$favoriteAnime is  $Queen's favorite animetion in 2000 it was  released in $releaseDate"
//    }
//    println(sayHelloZoro("Zoro", 1996))
    //%%%%%%%%%%%%%%%%%%%%5.6  Using type inference%%%%%%%%%%%%%%%%%%%%
    val sayHelloZoro ={favoriteAnime :String,releaseDate:Int ->
        "$favoriteAnime is  $Queen's favorite animetion in 2000 it was  released in $releaseDate"

    }
    println(sayHelloZoro("Zoro", 1996))

    println(favoriteStuff("kpop",sayHelloZoro))

}
fun favoriteStuff (music:String ,sayHello:(String,Int)->String):String{
    var character = sayHello("Zoro", 1996)
return "$music is Nora's favorite music and $character"
}