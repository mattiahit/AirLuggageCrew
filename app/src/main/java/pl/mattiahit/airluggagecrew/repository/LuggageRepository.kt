package pl.mattiahit.airluggagecrew.repository

import pl.mattiahit.airluggagecrew.rest.model.Flight
import pl.mattiahit.airluggagecrew.rest.model.Plane
import pl.mattiahit.airluggagecrew.rest.model.Server
import pl.mattiahit.airluggagecrew.rest.model.User
import pl.mattiahit.airluggagecrew.util.Resource
import retrofit2.Response

interface LuggageRepository {

    suspend fun getServers(): Resource<Response<List<Server>>>

    suspend fun getUsers(): Resource<Response<List<User>>>

    suspend fun getFlights(): Resource<Response<List<Flight>>>

    suspend fun getPlanes(): Resource<Response<List<Plane>>>

    suspend fun getUserByLoginAndPassword(login: String, password: String): Resource<User?>

}