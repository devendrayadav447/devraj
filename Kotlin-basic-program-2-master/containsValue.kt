fun main(args: Array<String>){

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println(".......stringMap.containsValue(\"Delhi\")......")
    println(stringMap.containsValue("Delhi"))
    println(stringMap.containsValue("Mumbai"))
}