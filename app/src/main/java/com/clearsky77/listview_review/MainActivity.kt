package com.clearsky77.listview_review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clearsky77.listview_review.adapters.StudentAdapter
import com.clearsky77.listview_review.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //    임시 방편. 직접 데이터를 추가.
        mStudentList.add(StudentData("김일일", 1977, "서울시 중구"))
        mStudentList.add(StudentData("김이이", 1978, "서울시 성동구"))
        mStudentList.add(StudentData("김삼삼", 1979, "서울시 송파구"))
        mStudentList.add(StudentData("김사사", 1980, "서울시 강남구"))
        mStudentList.add(StudentData("김오오", 1981, "서울시 서초구"))
        mStudentList.add(StudentData("김육육", 1982, "서울시 동작구"))
        mStudentList.add(StudentData("김칠칠", 1983, "서울시 관악구"))
        mStudentList.add(StudentData("김팔팔", 1984, "서울시 금천구"))

        mAdapter = StudentAdapter(this,R.layout.student_list_item,mStudentList)
        studentListView.adapter = mAdapter



    }


}