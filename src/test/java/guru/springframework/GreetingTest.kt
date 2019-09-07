package guru.springframework

import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GreetingTest {

    var greet=Greeting()

    @BeforeAll
    fun startUp(){
        println("Before starting all")
    }
    @BeforeEach
    private fun setUp(){
        println("Before each")
        greet=Greeting()
    }

    @Test
    fun getHello() {
        assertEquals("Hello",greet.hello)
    }

    @Test
    fun getWorld() {
    }

    @Test
    fun helloworld() {

        assertEquals("Hello world",greet.helloworld())
    }

    @Test
    fun testHelloworld() {

        assertEquals("Hello Andrea",greet.helloworld("Andrea"))
    }
    @AfterAll
    fun tearDown(){
        println("After all tests...")
    }
}

