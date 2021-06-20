package com.example.testingwithhilt.data

import com.example.testingwithhilt.data.Log

interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}