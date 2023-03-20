package com.example.skuta.topappbarassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_menu_item -> {
                Toast.makeText(this,"You clicked ADD!", Toast.LENGTH_SHORT).show()
            }
            R.id.message_menu_item -> {
                Toast.makeText(this,"You clicked MESSAGES!", Toast.LENGTH_SHORT).show()
            }
            R.id.home_menu_item -> {
                Toast.makeText(this,"You clicked HOME!", Toast.LENGTH_SHORT).show()
            }
            R.id.close_menu_item -> {
                finish()
            }
        }
        return true
    }
}