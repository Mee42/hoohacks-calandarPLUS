import spark.kotlin.*

fun main() {
    ignite().get("/hello") { "helo, world!" }
}