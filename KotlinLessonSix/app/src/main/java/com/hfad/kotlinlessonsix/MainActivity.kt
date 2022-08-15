package com.hfad.kotlinlessonsix

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.hfad.kotlinlessonsix.Constance.Constance
import com.hfad.kotlinlessonsix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == Constance.REQUEST_CODE_SING_IN) {

            val l = data?.getStringExtra(Constance.LOGIN)
            val p = data?.getStringExtra(Constance.PASSWORD)
            if (login == l && password == p) {
                bindingClass.imAvatar.visibility = View.VISIBLE
                bindingClass.imAvatar.setImageResource(avatarImageId)
                val textInfo = "$name $name2 $name3"
                bindingClass.tvInfo.text = textInfo
                bindingClass.btnHide.visibility = View.GONE
                bindingClass.btnExit.text = "Выйти"
            } else {
                bindingClass.imAvatar.visibility = View.VISIBLE
                bindingClass.imAvatar.setImageResource(avatarImageId)
                bindingClass.tvInfo.text = "Такого аккаунта не существует!"

            }


        } else if (requestCode == Constance.REQUEST_CODE_SING_UP) {

            login = data?.getStringExtra(Constance.LOGIN)!!
            password = data?.getStringExtra(Constance.PASSWORD)!!
            name = data?.getStringExtra(Constance.NAME)!!
            name2 = data?.getStringExtra(Constance.NAME2)!!
            name3 = data?.getStringExtra(Constance.NAME3)!!
            avatarImageId = data?.getIntExtra(Constance.AVATAR_ID, 0)!!
            bindingClass.imAvatar.visibility = View.VISIBLE
            bindingClass.imAvatar.setImageResource(avatarImageId)
            val textInfo = "$name $name2 $name3"
            bindingClass.tvInfo.text = textInfo
            bindingClass.btnHide.visibility = View.GONE
            bindingClass.btnExit.text = "Выйти"
        }
    }

    fun onClickSingIn(view: View) {

        if (bindingClass.imAvatar.isVisible && bindingClass.tvInfo.text.toString() != "Такого аккаунта не существует!") {

            bindingClass.imAvatar.visibility = View.INVISIBLE
            bindingClass.tvInfo.text = ""
            bindingClass.btnHide.visibility = View.VISIBLE
            bindingClass.btnExit.text = getString(R.string.sing_in)
        } else {


            val intent = Intent(this, SingInUpActivity::class.java)
            intent.putExtra(Constance.SING_STATE, Constance.SING_IN_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SING_IN)
        }

    }

    fun onClickSingUp(view: View) {

        val intent = Intent(this, SingInUpActivity::class.java)
        intent.putExtra(Constance.SING_STATE, Constance.SING_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SING_UP)

    }
}
