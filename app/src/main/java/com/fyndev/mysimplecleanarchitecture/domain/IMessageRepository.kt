package com.fyndev.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMassage(name: String): MessageEntity
}