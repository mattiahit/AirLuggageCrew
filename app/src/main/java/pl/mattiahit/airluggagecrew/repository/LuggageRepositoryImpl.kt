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
        val getServersResponse = luggageApi.getServers()
        return if(getServersResponse.isSuccessful && getServersResponse.code() == 0) {
            Resource.Success(getServersResponse)
        } else {
            Resource.Error("Something went wrong: ${getServersResponse.code()}")
        }
    }

    override suspend fun getUsers(): Resource<Response<List<User>>> {
        val getUsersResponse = luggageApi.getUsers()
        return if(getUsersResponse.isSuccessful && getUsersResponse.code() == 0) {
            Resource.Success(getUsersResponse)
        } else {
            Resource.Error("Something went wrong: ${getUsersResponse.code()}")
        }
    }

    override suspend fun getFlights(): Resource<Response<List<Flight>>> {
        val getFlightsResponse = luggageApi.getFlights()
        return if(getFlightsResponse.isSuccessful && getFlightsResponse.code() == 0) {
            Resource.Success(getFlightsResponse)
        } else {
            Resource.Error("Something went wrong: ${getFlightsResponse.code()}")
        }
    }

    override suspend fun getPlanes(): Resource<Response<List<Plane>>> {
        val getPlanesResponse = luggageApi.getPlanes()
        return if(getPlanesResponse.isSuccessful && getPlanesResponse.code() == 0) {
            Resource.Success(getPlanesResponse)
        } else {
            Resource.Error("Something went wrong: ${getPlanesResponse.code()}")
        }
    }

    override suspend fun getUserByLoginAndPassword(
        login: String,
        password: String
    ): Resource<User?> {
        val getUsersResponse = this.getUsers()
        return if(getUsersResponse.data == null) {
            Resource.Error(getUsersResponse.message)
        } else {
            Resource.Success(getUsersResponse.data.body()?.firstOrNull { user -> user.login == login })
        }
    }


}