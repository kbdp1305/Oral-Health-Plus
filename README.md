# 🦷 OralHealth+ — AI-Powered Oral Disease Detection App  
### 🏆 National Data Science Competition (TSDN 2024) — by Data Academy  
### 👥 Team Pick A Team Name | Universitas Gadjah Mada

---

## 📘 Overview
**OralHealth+** is an AI-based mobile application designed to help users perform **early detection of oral and dental diseases** using smartphone-captured images.  
This project was developed for the **Turnamen Sains Data Nasional 2024 (TSDN 2024)** hosted by **Data Academy Indonesia**.  
The solution leverages **MobileNetV2-Lite** for on-device inference, combined with **Firebase**, **SQLite**, and **Gemini AI Chatbot** for an integrated digital-health experience.

---

## 🎯 Problem Statement
According to the **WHO Global Oral Health Report (2022)**, more than **3.5 billion people** worldwide suffer from oral diseases, with dental caries and periodontal disease being the most common.  
In Indonesia, the **Ministry of Health (2021)** reported that only **10.2 %** of citizens use dental-health services, despite more than **80 %** experiencing tooth decay.  
This project aims to **bridge the accessibility gap** by enabling AI-driven early screening directly through smartphones.

---

## 🧩 Objectives
- Increase public awareness about oral hygiene.  
- Provide **AI-based early detection** for oral and dental conditions.  
- Offer **instant educational content and doctor consultation** through chatbots.  
- Connect users with **nearby clinics and dentists** for immediate care.

---

## 🧠 Data & Model Pipeline

### 🔹 Dataset  
Kaggle dataset: [Oral Diseases Classification](https://www.kaggle.com/datasets/salmansajid05/oral-diseases)  

### 🔹 Pre-processing
- Image resizing to 224×224 pixels  
- Augmentation (rotation, flipping, zoom)  
- Normalization (0–1 scale)  
- Train/validation split 90 : 10  

### 🔹 Model Architecture
- **Base Model :** MobileNetV2 (pretrained on ImageNet)  
- **Framework :** TensorFlow / Keras  
- **Epochs :** 10  
- **Loss :** Categorical Cross Entropy  
- **Optimizer :** Adam  
- **Accuracy :** **93.14 %**, Loss = **0.1420**  

MobileNetV2-Lite was selected for its **lightweight design and real-time inference efficiency** on mobile devices.

---

## 📱 Application Features

| Feature | Description |
|:--|:--|
| 🩺 **AI Disease Detection** | Users upload a mouth or tooth photo → AI predicts possible conditions and confidence score. |
| 👤 **User Authentication** | Login/Register via **SQLite** or **Firebase Auth (Google Login)**. |
| 🚀 **Onboarding Screen** | Introduces features using **ViewPager + Lottie Animations**. |
| 🤖 **Chatbot Consultation** | Doctor-style chatbot powered by **Google Gemini API** for Q&A. |
| 🎥 **Educational Videos** | Embedded YouTube tutorials for oral-care guidance. |
| 📰 **Health News** | Latest oral-health updates using **newsapi.org public API**. |
| 🏥 **Nearby Clinics** | Map-based clinic search via **Google Maps API**. |
| 👨‍⚕️ **Find a Doctor** | Redirects to WhatsApp contact of dental specialists. |
| 🧠 **Know Your Disease** | Educational disease encyclopedia with treatments and prevention tips. |

---

## 🏗️ System Architecture
```text
Image Input → Preprocessing → MobileNetV2 Prediction → 
Result Display → User Actions → 
(Consultation | Education | Doctor Referral)
```

---

## 💡 Technology Stack
- **Languages:** Python (TensorFlow/Keras), Kotlin (Android Studio), TypeScript (Next.js)  
- **AI Model:** MobileNetV2 Lite  
- **Backend & APIs:** Firebase, SQLite, Gemini API, NewsAPI, Maps API  
- **UI/UX:** Figma Prototype [Design Link](https://www.figma.com/design/ZJ1Hollm8wpcgAcPxY5QD0/Prototype-TSDN-2024---Oral-Diseases-App)  
- **Repositories:**  
  - Android App → [github.com/antoniuswisnu/Oral-Diseases-App](https://github.com/antoniuswisnu/Oral-Diseases-App)  
  - Chatbot API → [github.com/rahoelr/chat-bot-api/tree/rollback-api](https://github.com/rahoelr/chat-bot-api/tree/rollback-api)

---

## 📊 Results & Achievements
- ✅ Model Accuracy = **93.14 %**  
- ✅ Loss = **0.1420**  
- 🚀 Mobile-optimized AI inference under 200 ms per image  
- 🧩 Fully functional app prototype (80 % completed with chatbot integration in progress)  
- 🏅 Won 3rd Place at **National Data Science Competition 2024 – Data Academy Indonesia**


## 🧾 References
- World Health Organization, *Global Status Report on Oral Health 2022*.  
- Kementerian Kesehatan RI (2021). Sehat Negeriku.  
- CNBC Indonesia (2023). *56 % Warga RI Rentan Sakit Gigi*.  
- Haibunda (2024). *Karies Gigi pada Anak jadi Kasus Paling Banyak di Indonesia.*

---

## 👥 Team Members
| Name | Role | Institution |
|:--|:--|:--|
| **Ridwan Akmal** | Team Leader & Developer | Universitas Gadjah Mada |
| **Krisna Bayu Dharma Putra** | Artificial Intelligence / Machine Learning Engineer | Universitas Gadjah Mada |
| **Rahul Rahmatullah** | Backend Engineer | Universitas Gadjah Mada |
| **Antonius Krisargo Wisnuaji Nugroho** | Mobile Developer | Universitas Gadjah Mada |

---

## 🌐 Links
📄 Competition Organizer → [Data Academy Indonesia](https://dataacademy.co.id)  
🔗 LinkedIn → [linkedin.com/in/dharma-putra1305](https://linkedin.com/in/dharma-putra1305)  
🌐 GitHub → [github.com/kbdp1305](https://github.com/kbdp1305)
