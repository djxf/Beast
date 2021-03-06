package com.djxf.beast

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var editText: EditText? = null
    var textView: TextView? = null
    var button: Button? = null
    var bt_decode: Button? = null
    var bt_clear: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.ed_text)
        textView = findViewById(R.id.tv_encode_text)
        button = findViewById(R.id.bt_encode)
        bt_decode = findViewById(R.id.bt_decode)
        bt_clear = findViewById(R.id.bt_clear)

        button?.setOnClickListener {
            val str = editText?.text.toString()
            val encodeStr = BeastUtil.strToBeastLan(str)
            textView?.text = "加密后：\n$encodeStr"

            val clipBoard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("加密后",encodeStr)
            clipBoard.setPrimaryClip(clip)
            Toast.makeText(this,"已为你复制到剪贴板！", Toast.LENGTH_LONG).show()
        }

        bt_decode?.setOnClickListener {
            val str = editText?.text.toString()
            if (!str.startsWith("~呜嗷") || !str.endsWith("啊")) {
                Toast.makeText(this,"格式不正确！不满足“~呜嗷xxxx啊”", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val decodeStr = BeastUtil.beastLanToString(str)
            textView?.text = "解密后：\n$decodeStr"
            val clipBoard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("加密后",decodeStr)
            clipBoard.setPrimaryClip(clip)
            Toast.makeText(this,"已为你复制到剪贴板！", Toast.LENGTH_LONG).show()
        }

        bt_clear?.setOnClickListener {
            editText?.setText("")
            textView?.text = ""
        }

    }


}