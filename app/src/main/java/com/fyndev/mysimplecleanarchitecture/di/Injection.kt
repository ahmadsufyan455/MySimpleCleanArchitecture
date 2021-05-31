package com.fyndev.mysimplecleanarchitecture.di

import com.fyndev.mysimplecleanarchitecture.data.IMessageDataSource
import com.fyndev.mysimplecleanarchitecture.data.MessageDataSource
import com.fyndev.mysimplecleanarchitecture.data.MessageRepository
import com.fyndev.mysimplecleanarchitecture.domain.IMessageRepository
import com.fyndev.mysimplecleanarchitecture.domain.MessageInteractor
import com.fyndev.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}