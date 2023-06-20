package com.example.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.billmanagement.BillsList
import com.example.billmanagement.databinding.ActivityBillsListBinding
import com.example.contactlist.databinding.ContactplaceBinding
import com.squareup.picasso.Picasso


class ContactAdapter(var billList:List<BillsList>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ActivityBillsListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var persons=billList[position]
        var binding =holder.binding
        binding.etUserNme.text=persons.username
        binding.etPhoneNumber.text=persons.phoneNumber
        binding.etEmail.text=persons.emailAddress
        binding.etPassword.text=persons.password




    }



    override fun getItemCount(): Int {
        return billList.size
    }
}
class ContactViewHolder(var binding:ActivityBillsListBinding):RecyclerView.ViewHolder(binding.root){

}

