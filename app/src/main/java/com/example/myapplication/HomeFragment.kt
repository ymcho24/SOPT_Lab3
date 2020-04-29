package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var instaAdapter: InstaAdapter
    val datas = mutableListOf<InstaData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instaAdapter = InstaAdapter(view.context)
        rv_home.adapter = instaAdapter //리사이클러뷰의 어댑터를 instaAdapter로 지정해줌
        loadDatas() //데이터를 임의로 생성하고 어댑터에 전달해주겠습니다
    }

    private fun loadDatas() {
        datas.apply {
            add(
                InstaData(
                userName = "강희원",
                img_profile1 = "https://images.unsplash.com/photo-1502759683299-cdcd6974244f?auto=format&fit=crop&w=440&h=220&q=60",
                img_contents1 = "https://cdn.pixabay.com/photo/2020/04/26/05/56/daisies-5093658__480.jpg"
            ))
            add(
                InstaData(
                userName = "안드로이드",
                img_profile1 = "https://cdn.pixabay.com/photo/2020/04/25/09/42/house-mouse-5090096__480.jpg",
                img_contents1 = "https://cdn.pixabay.com/photo/2020/04/26/00/57/ornamental-quince-5093163__480.jpg"
            ))
            add(
                InstaData(
                userName = "최고",
                img_profile1 = "https://cdn.pixabay.com/photo/2020/04/27/15/00/friends-5100219__480.jpg",
                img_contents1 = "https://cdn.pixabay.com/photo/2020/04/18/17/10/bernese-mountain-dog-5060025__480.jpg"
            ))
        }
        instaAdapter.datas = datas
        instaAdapter.notifyDataSetChanged()
    }

}
