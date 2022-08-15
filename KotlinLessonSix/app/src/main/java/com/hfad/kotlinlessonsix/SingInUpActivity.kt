package com.hfad.kotlinlessonsix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.hfad.kotlinlessonsix.Constance.Constance
import com.hfad.kotlinlessonsix.databinding.ActivitySingInUpBinding

class SingInUpActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivitySingInUpBinding
    private var singState = "empty"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySingInUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        singState = intent.getStringExtra(Constance.SING_STATE)!!

        if (singState == Constance.SING_IN_STATE) {

            bindingClass.etName.visibility = View.GONE
            bindingClass.etName2.visibility = View.GONE
            bindingClass.etName3.visibility = View.GONE
            bindingClass.btnAvatar.visibility = View.VISIBLE
        }
    }

    fun onClickDone(view: View) {
        if (singState == Constance.SING_UP_STATE) {

            val intent = Intent()
            intent.putExtra(Constance.LOGIN, bindingClass.etLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.etPassword.text.toString())
            intent.putExtra(Constance.NAME, bindingClass.etName.text.toString())
            intent.putExtra(Constance.NAME2, bindingClass.etName2.text.toString())
            intent.putExtra(Constance.NAME3, bindingClass.etName3.text.toString())
            if (bindingClass.imAvatar.isVisible)
                intent.putExtra(
                    Constance.AVATAR_ID,
                    R.drawable.ic_face_background
                )
            setResult(RESULT_OK, intent)
            finish()
        } else if (singState == Constance.SING_UP_STATE) {

            intent.putExtra(Constance.LOGIN, bindingClass.etLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.etPassword.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    fun onClickAvatar(view: View) {
        bindingClass.imAvatar.visibility = View.VISIBLE
    }
}