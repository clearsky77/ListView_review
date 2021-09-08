package com.clearsky77.listview_review.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.clearsky77.listview_review.R
import com.clearsky77.listview_review.datas.StudentData

class StudentAdapter(
    val mContext: Context, //화면이 어딘가요?
    val resId: Int, //(리소스 폴더에 아이디)어떤 모양으로 리스트를 뿌릴 건가요?
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList) { //<데이터 표현용 클래스>
                                            //StudentAdapter을 생성할 때 받아 온것을 부모에게도 넘겨 준다.
    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent) 리턴 슈퍼는 꼭 지우세요
        var tempRow = convertView
        if(tempRow == null){
            tempRow = mInflater.inflate(R.layout.student_list_item, null) //Student_list_item.xml 틀을 가져와서
        }
//        tempRow는 null이 절대 될 수 없다.
        val row = tempRow!!

        return row
    }


}