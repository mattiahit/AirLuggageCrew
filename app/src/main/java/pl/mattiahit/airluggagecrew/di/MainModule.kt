package pl.mattiahit.airluggagecrew.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pl.mattiahit.airluggagecrew.repository.LuggageRepository
import pl.mattiahit.airluggagecrew.repository.LuggageRepositoryImpl
import pl.mattiahit.airluggagecrew.rest.LuggageApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

private const val BASE_URL = "https://my-json-server.typicode.com/mattiahit/AirLuggageAndroid/"

@Module
@InstallIn(SingletonComponent::class)
class MainModule {

    @Singleton
    @Provides
    fun provideLuggageApi(): LuggageApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(LuggageApi::class.java)

    @Singleton
    @Provides
    fun provideMpcRepository(luggageApi: LuggageApi): LuggageRepository = LuggageRepositoryImpl(luggageApi)
}