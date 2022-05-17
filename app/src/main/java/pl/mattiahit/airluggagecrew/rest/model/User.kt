package pl.mattiahit.airluggagecrew.rest.model

data class User(
    val avatar: String,
    val email: String,
    val id: Int,
    val login: String,
    val name: String,
    val password: String,
    val roles: List<String>,
    val secondName: String,
    val serverAvailable: List<Int>
)