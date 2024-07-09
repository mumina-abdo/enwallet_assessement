package com.akirachix.myenwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Walletc (var list_wallet:List<Wallet>):RecyclerView.Adapter<WallestsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallestsViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.wallets_list_item,parent,false)
        return WallestsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WallestsViewHolder, position: Int) {
        val walle=list_wallet[position]
        holder.tvMine.text=walle.total
        holder.tvMoney.text=walle.expense

    }

    override fun getItemCount(): Int {
        return list_wallet.size

    }
}


class WallestsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvMoney=itemView.findViewById<TextView>(R.id.textView2)
    var tvMine=itemView.findViewById<TextView>(R.id.idMine)
    var tvsalary=itemView.findViewById<TextView>(R.id.textView4)
}