package pl.mattiahit.airluggagecrew.repository

import pl.mattiahit.airluggagecrew.rest.LuggageApi
import pl.mattiahit.airluggagecrew.rest.model.Flight
import pl.mattiahit.airluggagecrew.rest.model.Plane
import pl.mattiahit.airluggagecrew.rest.model.Server
import pl.mattiahit.airluggagecrew.rest.model.User
import pl.mattiahit.airluggagecrew.util.Resource
import retrofit2.Response

class LuggageRepositoryImpl(private val luggageApi: LuggageApi) : LuggageRepository {

    override suspend fun getServers(): Resource<Response<List<Server>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getUsers(): Resource<Response<List<User>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getFlights(): Resource<Response<List<Flight>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getPlanes(): Resource<Resource<List<Plane>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserByLoginAndPassword(
        login: String,
        password: String
    ): Resource<User?> {
        TODO("Not yet implemented")
    }


}