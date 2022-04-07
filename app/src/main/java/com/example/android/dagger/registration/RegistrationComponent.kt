package com.example.android.dagger.registration

import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Factory  //to create an instance of App component
    interface Factory{

        fun create(): RegistrationComponent
    }

    fun inject(activity:RegistrationActivity)
    fun inject(fragment:EnterDetailsFragment)
    fun inject(fragment:TermsAndConditionsFragment)
}