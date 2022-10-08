package com.example.convertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main1.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

//Declaring the strings global
var v1:String?=null
var v2:String?=null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //toast for the user
        Toast.makeText(this,"Choose Convertor you wanna Use",Toast.LENGTH_LONG).show()
        setContentView(R.layout.activity_main)

        //change layout from activity_main  to  activity_main1 when click on Distance convertor button
        findViewById<Button>(R.id.b1).setOnClickListener {
            setContentView(R.layout.activity_main1)

            //store the values entered in Spinner by the user to strings
            fromSp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(adopterView : AdapterView<*>?, view: View?, position : Int, id : Long) {
                    v1 = adopterView?.getItemAtPosition(position).toString()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }
            toSp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(adopterView : AdapterView<*>?, view: View?, position : Int, id : Long) {
                    v2 = adopterView?.getItemAtPosition(position).toString()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }
            //when click on convert Button
            button1.setOnClickListener {
                activity1()
            }
        }


        //change layout from activity_main  to  activity_main2 when click on Currency convertor button
        findViewById<Button>(R.id.b2).setOnClickListener {
            setContentView(R.layout.activity_main2)

            //store the values entered in Spinner by the user to strings
            fromSp2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(adopterView : AdapterView<*>?, view: View?, position : Int, id : Long) {
                    v1 = adopterView?.getItemAtPosition(position).toString()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }
            toSp2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(adopterView : AdapterView<*>?, view: View?, position : Int, id : Long) {
                    v2 = adopterView?.getItemAtPosition(position).toString()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }
            //when click on convert Button
            button2.setOnClickListener {
                activity2()
            }
        }


        //change layout from activity_main  to  activity_main3 when click on Time convertor button
        findViewById<Button>(R.id.b3).setOnClickListener {
            setContentView(R.layout.activity_main3)

            //store the values entered in Spinner by the user to strings
            fromSp3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(adopterView : AdapterView<*>?, view: View?, position : Int, id : Long) {
                    v1 = adopterView?.getItemAtPosition(position).toString()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }
            toSp3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(adopterView : AdapterView<*>?, view: View?, position : Int, id : Long) {
                    v2 = adopterView?.getItemAtPosition(position).toString()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }

            //when click on convert Button
            button3.setOnClickListener {
                activity3()
            }
        }

    }

    //function to convert distance
    fun activity1(){
        result1.text= "Converted Amount"
        if(value1.text.toString()==""){
            Toast.makeText(this,"Enter the value",Toast.LENGTH_LONG).show()
            return
        }
        if(v1==v2 && v1 != null && v1 != "Choose any from below")
            result1.text=value1.text.toString()
        else if(v1.equals("centimeter")) {
            if (v2.equals("meter"))
                function1(0.01)
            else if (v2.equals("kilometer"))
                function1(0.00001)
            else if (v2.equals("miles"))
                function1(0.0000062137)
        }
        else if(v1.equals("meter")){
            if(v2.equals("centimeter"))
                function1(100.0)
            else if (v2.equals("kilometer"))
                function1(0.001)
            else if (v2.equals("miles"))
                function1(0.00062137)
        }
        else if(v1.equals("kilometer")){
            if(v2.equals("centimeter"))
                function1(100000.0)
            else if (v2.equals("meter"))
                function1(1000.0)
            else if (v2.equals("miles"))
                function1(0.62137)
        }
        else if(v1.equals("miles")){
            if(v2.equals("centimeter"))
                function1(160934.0)
            else if (v2.equals("meter"))
                function1(1609.34)
            else if (v2.equals("kilometer"))
                function1(1.60934)
        }
    }
    fun function1(a:Double){
        result1.text=(value1.text.toString().toDouble() * a ).toString()
    }

    //function to convert currency
    fun activity2(){
        result2.text= "Converted Amount"
        if(value2.text.toString()=="") {
            Toast.makeText(this,"Enter the value",Toast.LENGTH_LONG).show()
            return
        }
        if(v1==v2 && v1 != null && v1 != "Choose any from below")
            result2.text=value2.text.toString()
        else if(v1.equals("Rupees(India)")) {
            if (v2.equals("Dollar(USA)"))
                function2(0.012)
            else if (v2.equals("Pound(UK)"))
                function2(0.011)
            else if (v2.equals("Rubles(Russia)"))
                function2(0.74)
        }
        else if(v1.equals("Dollar(USA)")){
            if(v2.equals("Rupees(India)"))
                function2(81.59)
            else if (v2.equals("Pound(UK)"))
                function2(0.88)
            else if (v2.equals("Rubles(Russia)"))
                function2(60.25)
        }
        else if(v1.equals("Pound(UK)")){
            if(v2.equals("Rupees(India)"))
                function2(92.53)
            else if (v2.equals("Dollar(USA)"))
                function2(1.13)
            else if (v2.equals("Rubles(Russia)"))
                function2(68.33)
        }
        else if(v1.equals("Rubles(Russia)")){
            if(v2.equals("Rupees(India)"))
                function2(1.31)
            else if (v2.equals("Dollar(USA)"))
                function2(0.016)
            else if (v2.equals("Pound(UK)"))
                function2(0.014)
        }
    }
    fun function2(a:Double){
        result2.text=(value2.text.toString().toDouble() *a).toString()
    }

    //function to convert time
    fun activity3() {
        result3.text = "Converted Time"
        day.text=""
        if(value3.text.toString() == "") {
            Toast.makeText(this,"Enter the time",Toast.LENGTH_LONG).show()
            return
        }
        if (v1 == v2 && v1 != null && v1 != "Choose any from below")
            function3(0)
        else if (v1.equals("IST(UTC+05:30)")) {
            if (v2.equals("GMT(UTC+00:00)"))
                function3(-530)
            else if (v2.equals("England,UK(UTC+01:00)"))
                function3(-430)
            else if (v2.equals("EDT(UTC-04:00)"))
                function3(-930)
        } else if (v1.equals("GMT(UTC+00:00)")) {
            if (v2.equals("IST(UTC+05:30)"))
                function3(530)
            else if (v2.equals("England,UK(UTC+01:00)"))
                function3(100)
            else if (v2.equals("EDT(UTC-04:00)"))
                function3(-400)
        } else if (v1.equals("England,UK(UTC+01:00)")) {
            if (v2.equals("IST(UTC+05:30)"))
                function3(430)
            else if (v2.equals("GMT(UTC+00:00)"))
                function3(-100)
            else if (v2.equals("EDT(UTC-04:00)"))
                function3(-500)
        } else if (v1.equals("EDT(UTC-04:00)")) {
            if (v2.equals("IST(UTC+05:30)"))
                function3(930)
            else if (v2.equals("GMT(UTC+00:00)"))
                function3(400)
            else if (v2.equals("England,UK(UTC+01:00)"))
                function3(500)
        }
    }
    
    // function to reduce the repetition of code
    fun function3(a : Int){
        // input data to int format to do calculation
        val s=value3.text.toString()
        val h: Int = s[0].digitToInt()*10 + s[1].digitToInt()
        val m: Int=s[3].digitToInt()*10 + s[4].digitToInt()
        if(s[2]!=':' || s.length != 5 ||m>=60){
            Toast.makeText(this,"Entered wrong format ",Toast.LENGTH_LONG).show()
            return
        }
        var a1 = h*100+m
        if(a>=0){
            if(a+a1<2360){
                day.text="today"
                a1+=a
                val a2=a1%100
                if(a2/60==1)
                    a1+=40
            }
            else {
                day.text="tomorrow"
                val b=a%100
                val b1=a1%100
                if(b + b1<60){
                    a1+=a-2400
                }
                else {
                    a1+=a-2360
                }
            }
        }
        else {
            if(a+a1>0){
                day.text="today"
                var b=a%100
                b=b+(-2*b)
                val b1=a1%100
                if(b<=b1){
                    a1+=a
                }
                else{
                    a1+=a
                    a1-=40
                }
                val a2=a1%100
                if(a2/60==1)
                    a1+=40
            }
            else{
                day.text="lastday"
                var b=a%100
                b=b+(-2*b)
                val b1=a1%100
                if(b<=b1){
                    a1 += a + 2360+40
                }
                else {
                    a1+=a+2360
                }
                val a2=a1%100
                if(a2/60==1)
                    a1+=40
            }
        }
        //change again to output format 
        val a3=a1%100
        val a4=a1/100
        if(a3<10 && a4<10)
            result3.text="0$a4:0$a3"
        else if(a3>=10&&a4<10)
            result3.text="0$a4:$a3"
        else if(a3>=10&&a4>=10)
            result3.text="$a4:$a3"
        else
            result3.text="$a4:0${a3}"
    }
}


