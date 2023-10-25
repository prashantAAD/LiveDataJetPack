package www.revengerfitness.blogspot.com.livedatajetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private val factsTextView: TextView
        get() = findViewById(R.id.textView)

    private val btnUpdate: Button
        get() = findViewById(R.id.btn)

    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.factsLiveData.observe(this) {
            factsTextView.text = it
        }
        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}