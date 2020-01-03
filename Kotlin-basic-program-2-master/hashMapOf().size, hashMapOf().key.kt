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

    println(".....stringMap.size........")
    println(stringMap.size)

    println(".......stringMap.keys......")
    println(stringMap.keys)
}

Output:

......traverse stringMap.......
Key = city , value = Delhi
Key = name , value = Ashu
Key = department , value = Development
Key = hobby , value = Playing
.....stringMap.size........
4
.......stringMap.keys......
[city, name, department, hobby]

Kotlin hashMapOf() Example 8 - getValue(key), getOrDefault(key, defaultValue)

The getValue() function returns value of specified key of the HashMap. Whereas getOrDefault() function returns corresponding value of specified key if it exist in the HashMap or it returns mentioned default value if no such key exists in HashMap.

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

    println(".......stringMap.getValue(\"department\")......")
    println(stringMap.getValue("department"))

    println(".......stringMap.getOrDefault(\"name\", \"Default Value\")......")
    println(stringMap.getOrDefault("name", "Default Value"))
}

Output:

......traverse stringMap.......
Key = city , value = Delhi
Key = name , value = Ashu
Key = department , value = Development
Key = hobby , value = Playing
.......stringMap.getValue("department")......
Development
.......stringMap.getOrDefault("name", "Default Value")......
Ashu

Kotlin hashMapOf() Example 9 - remove(key)

The remove(key) function is used to remove the specified key along with its corresponding value. The remove(key) function returns the removed value.

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

    println("......stringMap.remove(\"city\").......")
    println(stringMap.remove("city"))
    println("......traverse stringMap after stringMap.remove(\"city\").......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
}

Output:

......traverse stringMap.......
Key = city , value = Delhi
Key = name , value = Ashu
Key = department , value = Development
Key = hobby , value = Playing
......stringMap.remove("city").......
Delhi
......traverse stringMap after stringMap.remove("city").......
Key = name , value = Ashu
Key = department , value = Development
Key = hobby , value = Playing

Kotlin hashMapOf() Example 10 - remove(key, value)

The remove(key, value) function is used to remove the specified key along with its corresponding value. The remove(key, value) function returns true if it remove the specified key along with its value else it returns false.

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
    println(".......stringMap.remove(\"hobby\",\"Playing\")......")
    println(stringMap.remove("hobby","Playing"))
    println("......traverse stringMap after stringMap.remove(\"hobby\",\"Playing\").......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
}

Output:

......traverse stringMap.......
Key = city , value = Delhi
Key = name , value = Ashu
Key = department , value = Development
Key = hobby , value = Playing
.......stringMap.remove("hobby","Playing")......
true
......traverse stringMap after stringMap.remove("hobby","Playing").......
Key = city , value = Delhi
Key = name , value = Ashu
Key = department , value = Development

Kotlin hashMapOf() Example 11 - set(key, value)

The set(key, value) function is used to set the given value at specified key if it exist. If the key does not exist in the HashMap it will add new key and set the given value corresponding to it.

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

    stringMap.set("name","Ashutosh")
    stringMap.set("skill","Kotlin")
    println("......traverse stringMap after stringMap.set(\"name\",\"Ashutosh\") and   stringMap.set(\"skill\",\"Kotlin\").......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
}

Output:

......traverse stringMap.......
Key = city , value = Delhi
Key = name , value = Ashu
Key = department , value = Development
Key = hobby , value = Playing
......stringMap.set("name","Ashutosh").......
......traverse stringMap after stringMap.set("name","Ashutosh") and stringMap.set("skill","Kotlin").......
Key = city , value = Delhi
Key = skill , value = Kotlin
Key = name , value = Ashutosh
Key = department , value = Development
Key = hobby , value = Playing

Kotlin hashMapOf() Example 12 - clear()

The clear() function is used to clear (or remove) all the key, value pair from the HashMap.

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

    println("......stringMap.clear().......")
    println(stringMap.clear())
    println(stringMap)

}

Output:

......traverse stringMap.......
Key = city , value = Delhi
Key = name , value = Ashu
Key = department , value = Development
Key = hobby , value = Playing
......stringMap.clear().......
kotlin.Unit
{}


Next TopicKotlin MutableMap: mutableMapOf()


← prev
next →


Help Others, Please Share
facebook twitter google plus pinterest
Join Javatpoint Test Series
Placement Papers
TCS
HCL
Infosys
IBM
Accenture
AMCAT
eLitmas
Java
Python
C Programming
Networking
Bank PO/Clerk
UPSSSC
Government Exams
SSC
Civil Services
SBI
GATE
NEET
CAT
Railway
CTET
IIT JEE
Learn Latest Tutorials
Sharepoint Tutorial

SharePoint
Mockito Tutorial

Mockito
Powershell Tutorial

Powershell
Kali Linux Tutorial

Kali Linux
OpenCV Tutorial

OpenCV
Kafka Tutorial

Kafka
Pandas Tutorial

Pandas
Joomla Tutorial

Joomla
Reinforcement Learning Tutorial

Reinforcement
SVN Tutorial

SVN
Unity Tutorial

Unity
HTTP Tutorial

HTTP
Preparation
Aptitude

Aptitude
Logical Reasoning

Reasoning
Verbal Ability

Verbal A.
Interview Questions

Interview
Company Interview Questions

Company
Trending Technologies
Artificial Intelligence Tutorial

AI
AWS Tutorial

AWS
Selenium tutorial

Selenium
Cloud tutorial

Cloud
Hadoop tutorial

Hadoop
ReactJS Tutorial

ReactJS
Data Science Tutorial

D. Science
Angular 7 Tutorial

Angular 7
Blockchain Tutorial

Blockchain
Git Tutorial

Git
Machine Learning Tutorial

ML
DevOps Tutorial

DevOps
B.Tech / MCA
DBMS tutorial

DBMS
Data Structures tutorial

DS
DAA tutorial

DAA
Operating System tutorial

OS
Computer Network tutorial

C. Network
Compiler Design tutorial

Compiler D.
Computer Organization and Architecture

COA
Discrete Mathematics Tutorial

D. Math.
Ethical Hacking Tutorial

E. Hacking
Computer Graphics Tutorial

C. Graphics
Software Engineering Tutorial

Software E.
html tutorial

Web Tech.
Cyber Security tutorial

Cyber Sec.
Automata Tutorial

Automata
C Language tutorial

C
C++ tutorial

C++
Java tutorial

Java
.Net Framework tutorial

.Net
Python tutorial

Python
List of Programs

Programs
Control Systems tutorial

Control S.
Data Mining Tutorial

Data Mining






