package com.example

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.mainRoute() {
    route("/") {
        get {
            call.respondText(
                call.request.path()
            )
        }
        get("/1") {
            call.respondText(
                call.request.path()
            )
        }
        get("/2") {
            call.respondText(
                call.request.path()
            )
        }
    }
}

fun Route.subRoute() {
    route("/sub") {
        get {
            call.respondText(
                call.request.path()
            )
        }
        get("/1") {
            call.respondText(
                call.request.path()
            )
        }
        get("/2") {
            call.respondText(
                call.request.path()
            )
        }
    }
}