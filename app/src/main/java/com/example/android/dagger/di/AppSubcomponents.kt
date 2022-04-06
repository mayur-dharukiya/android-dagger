package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import dagger.Module


@Module(subcomponents = [LoginComponent::class])
class AppSubcomponents