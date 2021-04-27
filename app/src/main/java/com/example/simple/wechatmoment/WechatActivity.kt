package com.example.simple.wechatmoment

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_wechat.*

/**
 * Created by jiessie on 2021/4/26.
 */
class WechatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wechat)
        initView()
    }

    private fun initView() {
        wechatMomentsImageLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            // if appBarLayout is collapsing
            if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
                toolbar_view.title = resources.getString(R.string.wechat_moments)
            } else {
                collapsingToolbar.title = ""
            }
        })
    }

    override fun onStart() {
        super.onStart()
        this.window.apply {
            statusBarColor = Color.TRANSPARENT
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

    }
}