fun main(args: Array<String>){

    val hashMap:HashMap<Int,String> = HashMap<Int,String>()
    hashMap.put(1,"Ajay")
    hashMap.put(3,"Vijay")
    hashMap.put(4,"Prakash")
    hashMap.put(2,"Rohan")

    println(".....traversing hashmap.......")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }


    println(".....hashMap.clear().......")
    hashMap.clear()
    println(".....print hashMap after clear().......")
    println(hashMap)
}