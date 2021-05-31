package com.fyndev.mysimplecleanarchitecture.data

import com.fyndev.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name welcome to clean architecture")
    }
}