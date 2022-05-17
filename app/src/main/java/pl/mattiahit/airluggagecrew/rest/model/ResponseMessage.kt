package pl.mattiahit.airluggagecrew.rest.model

import pl.mattiahit.airluggagecrew.rest.model.enum.MessageType

data class ResponseMessage(val message: String, val messageType: MessageType)
