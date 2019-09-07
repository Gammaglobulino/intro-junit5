package guru.springframework

class Greeting(val hello:String="Hello", val world:String="world") {
    fun helloworld()="$hello $world"
    fun helloworld(name:String)="$hello $name"
}