package woowacourse.paint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import woowacourse.paint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initializeRangeSlider()
    }

    private fun initializeRangeSlider() {
        binding.rangeSlider.addOnChangeListener { _, value, fromUser ->
            if (fromUser) {
                binding.paintBoard.setStrokeWidth(value)
            }
        }
    }
}
