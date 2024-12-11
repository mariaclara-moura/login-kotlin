package moura.clara.maria.myapplication

import android.app.Activity
import android.os.Bundle
import moura.clara.maria.myapplication.databinding.ActivitySecondBinding

class SecondActivity : Activity() {

        private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userEmail = "${getString(R.string.user)} ${intent.getStringExtra("USER")}"
        val dateHour = "${getString(R.string.logged_in)} ${intent.getStringExtra("DATE_HOUR")}"

    }
}