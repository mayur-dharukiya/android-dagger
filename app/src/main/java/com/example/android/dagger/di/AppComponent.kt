package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class,AppSubcomponents::class])
interface AppComponent {


    @Component.Factory  //to create an instance of App component
    interface Factory{

        fun create(@BindsInstance context: Context):AppComponent
    }

    fun injection(activity:RegistrationActivity)
    fun injection(activity:MainActivity)

    fun loginComponent():LoginComponent.Factory


}