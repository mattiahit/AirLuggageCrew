package pl.mattiahit.airluggagecrew.rest

import pl.mattiahit.airluggagecrew.rest.model.Flight
import pl.mattiahit.airluggagecrew.rest.model.Plane
import pl.mattiahit.airluggagecrew.rest.model.Server
import pl.mattiahit.airluggagecrew.rest.model.User
import retrofit2.Response
import retrofit2.http.GET

interface LuggageApi {
    @GET("/servers")
    suspend fun getServers(): Response<List<Server>>

    @GET("/users")
    suspend fun getUsers(): Response<List<User>>

    @GET("/flights")
    suspend fun getFlights(): Response<List<Flight>>

    @GET("/planes")
    suspend fun getPlanes(): Response<List<Plane>>
}