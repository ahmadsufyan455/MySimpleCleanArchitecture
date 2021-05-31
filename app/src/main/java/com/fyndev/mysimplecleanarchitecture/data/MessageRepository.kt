package com.fyndev.mysimplecleanarchitecture.data

import com.fyndev.mysimplecleanarchitecture.domain.IMessageRepository
import com.fyndev.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMassage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}