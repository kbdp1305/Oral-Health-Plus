package com.example.oraldiseasesapp.gemini

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oraldiseasesapp.databinding.ActivityChatbotBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ChatbotActivity : AppCompatActivity() {

    private lateinit var chatAdapter: ChatAdapter
    private lateinit var binding : ActivityChatbotBinding
    private val messages = mutableListOf<Message>()
    private val apiService = Retrofit.Builder()
        .baseUrl("https://api.google.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GeminiApiService::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatbotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        chatAdapter = ChatAdapter(messages)
        binding.chatRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@ChatbotActivity)
            adapter = chatAdapter
        }

        binding.sendButton.setOnClickListener {
            val userMessage = binding.messageInput.text.toString().trim()
            if (userMessage.isNotEmpty()) {
                messages.add(Message(userMessage, true))
                chatAdapter.notifyDataSetChanged()
                binding.messageInput.text.clear()
                sendMessageToBot(userMessage)
            }
        }
    }

    private fun sendMessageToBot(message: String) {
        val request = GeminiRequest(input = message)
        apiService.getBotResponse(request).enqueue(object : Callback<GeminiResponse> {
            override fun onResponse(call: Call<GeminiResponse>, response: Response<GeminiResponse>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        messages.add(Message(it.response, false))
                        chatAdapter.notifyDataSetChanged()
                    }
                } else {
                    showError("Failed to get a response")
                }
            }

            override fun onFailure(call: Call<GeminiResponse>, t: Throwable) {
                showError("Error: ${t.message}")
            }
        })
    }

    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
