package moura.clara.maria.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import moura.clara.maria.myapplication.ui.theme.ThirdClassTheme
import moura.clara.maria.myapplication.databinding.ActivityMainBinding
import java.util.Date

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(){
            val email = binding.email.text.toString().trim()
            val password = binding.senha.text.toString().trim()
            if(checkCredentials(email,password)){
                Toast.makeText(this, "success", Toast.LENGTH_LONG).show()
                val intent = Intent(this, SecondActivity:: class.java)
                intent.putExtra("USER", email)
                intent.putExtra("DATE_HOUR", Date().toString())
                startActivity(intent)
                finish()
            }
            else
                Toast.makeText(this, "inavlid credentials", Toast.LENGTH_LONG).show()


        }
    }
    private fun checkCredentials(email: String, password: String):Boolean{
        return email == "admin@cin.ufpe.br" && password == "admin"
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThirdClassTheme {
        Greeting("Android")
    }
}