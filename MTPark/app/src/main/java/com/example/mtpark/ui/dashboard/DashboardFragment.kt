package com.example.mtpark.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mtpark.FavorisActivity
import com.example.mtpark.ParkingActivity
import com.example.mtpark.R
import io.realm.Realm

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    var empDataHashMap = HashMap<String, String>()
    var empList: ArrayList<HashMap<String, String>> = ArrayList()
    var _realm = Realm.getDefaultInstance()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })
        //code:




        return root
    }
}


