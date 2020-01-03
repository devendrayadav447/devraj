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

    println(".......stringMap.replace(\"department\", \"Development\",\"Management\")......")
    println(stringMap.replace("department", "Development","Management"))
    println("......traverse stringMap after stringMap.replace(\"department\", \"Development\",\"Management\").......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
}