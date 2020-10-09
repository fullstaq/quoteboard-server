package app.quoteboard

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("app.quoteboard")
		.start()
}

