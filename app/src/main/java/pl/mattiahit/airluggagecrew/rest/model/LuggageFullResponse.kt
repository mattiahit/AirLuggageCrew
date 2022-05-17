package pl.mattiahit.airluggagecrew.rest.model

data class LuggageFullResponse(
    val flights: List<Flight>,
    val planes: List<Plane>,
    val servers: List<Server>,
    val users: List<User>
)