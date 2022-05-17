package pl.mattiahit.airluggagecrew

import android.content.res.Configuration
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import pl.mattiahit.airluggagecrew.databinding.ActivityLuggageBinding

abstract class LuggageActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLuggageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLuggageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.layoutBottomNav.btnLeft.setOnClickListener {
            onLeftPressed()
        }

        binding.layoutBottomNav.btnMiddle.setOnClickListener {
            onMiddlePressed()
        }

        binding.layoutBottomNav.btnRight.setOnClickListener {
            onRightPressed()
        }
    }

    override fun dispatchKeyEvent(event: KeyEvent?): Boolean {
        if(event?.action == KeyEvent.ACTION_DOWN) {
            when (event.keyCode) {
                KeyEvent.KEYCODE_DPAD_LEFT -> {
                    onLeftPressed()
                    return true
                }
                KeyEvent.KEYCODE_DPAD_RIGHT -> {
                    onRightPressed()
                    return true
                }
            }
        }
        return super.dispatchKeyEvent(event)
    }

    fun isHardwareKeyboardAvailable(): Boolean {
        return resources.configuration.keyboard != Configuration.KEYBOARD_NOKEYS
    }

    fun blockLeftNavBtn(block: Boolean) {
        binding.layoutBottomNav.btnLeft.isEnabled = block
    }

    fun blockRightNavBtn(block: Boolean) {
        binding.layoutBottomNav.btnRight.isEnabled = block
    }

    fun blockMiddleNavBtn(block: Boolean) {
        binding.layoutBottomNav.btnMiddle.isEnabled = block
    }

    fun blockBottomNav(block : Boolean) {
        this.blockLeftNavBtn(block)
        this.blockMiddleNavBtn(block)
        this.blockRightNavBtn(block)
    }

    fun setBottomNotificationMessage(message: String) {
        binding.tvAppMessage.text = message
    }

    fun setBottomNotificationWarning(optionalMessage: String?) {
        optionalMessage?.let {
            setBottomNotificationMessage(it)
        }
        binding.layoutBottomAppMessage.setBackgroundColor(getColor(R.color.warning))
    }

    fun setBottomNotificationError(optionalMessage: String?) {
        optionalMessage?.let {
            setBottomNotificationMessage(it)
        }
        binding.layoutBottomAppMessage.setBackgroundColor(getColor(R.color.error))
    }

    fun setBottomNotificationOK(optionalMessage: String?) {
        optionalMessage?.let {
            setBottomNotificationMessage(it)
        }
        binding.layoutBottomAppMessage.setBackgroundColor(getColor(R.color.success))
    }

    fun setMiddleButtonText(label: String) {
        binding.layoutBottomNav.btnMiddle.text = label
    }

    fun setOnLeftPressedListener(listener: View.OnClickListener) {
        binding.layoutBottomNav.btnLeft.setOnClickListener(listener)
    }

    fun setOnMiddlePressedListener(listener: View.OnClickListener) {
        binding.layoutBottomNav.btnMiddle.setOnClickListener(listener)
    }

    fun setOnRightPressedListener(listener: View.OnClickListener) {
        binding.layoutBottomNav.btnRight.setOnClickListener(listener)
    }

    fun onLeftPressed() {
        binding.layoutBottomNav.btnLeft.performClick()
    }

    fun onRightPressed() {
        binding.layoutBottomNav.btnRight.performClick()
    }

    fun onMiddlePressed() {
        binding.layoutBottomNav.btnMiddle.performClick()
    }

}