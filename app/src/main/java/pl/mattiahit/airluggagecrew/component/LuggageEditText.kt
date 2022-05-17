package pl.mattiahit.airluggagecrew.component

import android.content.Context
import android.content.res.Configuration
import android.text.InputType
import android.util.AttributeSet

class LuggageEditText(context: Context?, attrs: AttributeSet?) :
    androidx.appcompat.widget.AppCompatEditText(context!!, attrs) {

    init {
        if (context != null) {
            if(context.resources.configuration.keyboard != Configuration.KEYBOARD_NOKEYS){
                this.setRawInputType(InputType.TYPE_NULL)
                this.isFocusable = true
            }
        }

    }

//    override fun onCheckIsTextEditor(): Boolean {
//        return context.resources.configuration.keyboard == Configuration.KEYBOARD_NOKEYS
//    }


}