package com.example.dice_roller

class Dice {
    public var luckyNumber=-1
    var size:Int=-1
    constructor(size: Int){
        this.luckyNumber =(1..size).random()
        this.size=size
    }

    fun roll(): Int {
        var rollOutput :Int=(1..this.size).random()
//        val textView: TextView =findViewById(R.id.diceNum)
//        val h:Num=2
        
        return rollOutput;

    }



}