package com.example.android.dagger.login

import android.content.Context
import com.example.android.dagger.di.AppComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent




@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory  //to create an instance of App component
    interface Factory{

        fun create():LoginComponent
    }

    fun injection(activity: LoginActivity)


}