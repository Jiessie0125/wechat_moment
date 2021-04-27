package com.example.simple.wechatmoment.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simple.wechatmoment.R

/**
 * Created by jiessie on 2021/4/27.
 */
class UserInfoAdapter(val context: Activity ) : RecyclerView.Adapter<FridendViewHolder>() {

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: FridendViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FridendViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class FridendViewHolder(view : View?): RecyclerView.ViewHolder(view){
    var mUser_image: ImageView?
    var mUser_name: TextView?
    var mUser_contents: TextView?
    var mUser_content_image: GridView?
    var mLocal_time: TextView?
    var mUser_more: ImageView?

    init {
        mUser_image = view?.findViewById(R.id.user_image)
        mUser_name = view?.findViewById(R.id.user_name)
        mUser_contents = view?.findViewById(R.id.user_contents)
        mUser_content_image = view?.findViewById(R.id.user_content_image)
        mLocal_time = view?.findViewById(R.id.local_time)
        mUser_more = view?.findViewById(R.id.user_more)
    }
}