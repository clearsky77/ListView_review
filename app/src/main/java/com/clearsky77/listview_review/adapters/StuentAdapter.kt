package com.clearsky77.listview_review.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.clearsky77.listview_review.datas.StudentData

class StuentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>() {
}