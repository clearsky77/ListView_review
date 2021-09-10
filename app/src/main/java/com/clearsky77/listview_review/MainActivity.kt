package com.clearsky77.listview_review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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


//        리스튜뷰의 각 줄이 눌렸을 때 이벤트 처리// Item인 것 주의!!!!!!!!!!
        studentListView.setOnItemClickListener { adapterView, view, position, l ->
            Log.d("리스트 뷰 눌린 줄:", position.toString() )
            var clickedStudent = mStudentList[position]
            Toast.makeText( this, clickedStudent.name, Toast.LENGTH_SHORT ).show()
        }


//        리스튜뷰의 아이템 길게 눌렀을 때
//            경고창. 진짜 삭제할 것인지 확인 -> 확인 눌렀을 때만 삭제.
//                확인을 누르면 실행할 부분
        //목록(mStudentList)에서 제거 => 리스트뷰에서도 빠지게.
//            리스트 뷰의 어댑터에 변경 사항을 공지해줘야한다. 아니면 에러.
        //마지막에 결과로 true/false 지정 필요

    }


}