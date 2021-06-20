package com.example.testingwithhilt.data

import com.example.testingwithhilt.data.Log
import com.example.testingwithhilt.data.LoggerDataSource
import java.util.*
import javax.inject.Inject

class LoggerInMemoryDataSource @Inject constructor() : LoggerDataSource {
    private val logs = LinkedList<Log>()

    override fun addLog(msg: String) {
        logs.addFirst(Log(msg, System.currentTimeMillis()))

    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        callback(logs)
    }

    override fun removeLogs() {
        logs.clear()
    }
}