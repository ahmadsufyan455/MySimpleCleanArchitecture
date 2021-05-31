package com.fyndev.mysimplecleanarchitecture.data

import com.fyndev.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}