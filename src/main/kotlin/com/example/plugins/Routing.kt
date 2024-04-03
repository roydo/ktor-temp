package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

val myList = listOf(1,2,3,4)

fun Application.configureRouting() {
    routing {
        route("/") {
            get {
                call.respond(FreeMarkerContent(
                    "index.ftl",
                    mapOf("mylist" to myList)
                ))
            }
        }
    }
}
