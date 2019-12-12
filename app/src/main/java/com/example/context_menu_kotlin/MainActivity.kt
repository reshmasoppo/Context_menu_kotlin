package com.example.context_menu_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{

    val lang= arrayOf<String>("A1","B1","C1")


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

            val list:ListView=findViewById<ListView>(R.id.list)
            val arrayadapter1=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lang)
            list.adapter=arrayadapter1
            registerForContextMenu(list)
        }


    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?)
    {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menus,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
      {
      R.id.call_action ->
      {
        Toast.makeText(applicationContext, "call code", Toast.LENGTH_LONG).show()
        return true
      }

      R.id.sms_action ->
       {
        Toast.makeText(applicationContext, "sms code", Toast.LENGTH_LONG).show()
        return true
       }

        }

        return super.onContextItemSelected(item)


    }



    }

