package pl.mattiahit.airluggagecrew.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.mattiahit.airluggagecrew.repository.LuggageRepository
import pl.mattiahit.airluggagecrew.rest.model.ResponseMessage
import pl.mattiahit.airluggagecrew.rest.model.User
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val luggageRepository: LuggageRepository) : ViewModel() {

    var userData = MutableLiveData<User>()
    var messageData = MutableLiveData<ResponseMessage>()


}