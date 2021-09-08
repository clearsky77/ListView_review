package com.clearsky77.listview_review.adapters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.clearsky77.listview_review.datas.StudentData

class StudentAdapter(
    val mContext: Context, //화면이 어딘가요?
    val resId: Int, //(리소스 폴더에 아이디)어떤 모양으로 리스트를 뿌릴 건가요?
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList) { //<데이터 표현용 클래스>
                                            //StudentAdapter을 생성할 때 받아 온것을 부모에게도 넘겨 준다.
    val mInflater = LayoutInflater.from(mContext)


}