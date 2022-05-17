package pl.mattiahit.airluggagecrew.rest.model

data class Flight(
    val destination: String,
    val from: String,
    val gate: String,
    val id: Int,
    val planeId: Int,
    val startTime: Int
)