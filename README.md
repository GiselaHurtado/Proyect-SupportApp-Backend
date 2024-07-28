# 🚀 Psychological SupportApp 🧠 🧘‍♀️

Welcome to PsyChela App!! where your psyche queries could be done as fast as your thoughts ! 🧘‍♀️

SupportApp is a comprehensive application designed to make managing psychological support requests as relaxing as a zen garden 🍃 (but much more efficient).

In other words, this Psychological SupportApp is a full-stack application designed to streamline and manage psychological requests efficiently. It provides a user-friendly interface for submitting, tracking, and resolving support tickets. 🍃🧘‍♀️

<img width="1152" alt="Captura de pantalla 2024-07-28 a la(s) 13 16 40" src="https://github.com/user-attachments/assets/1dd57efe-97f7-4e6a-8427-16b4c1ff7b14">
<img width="1270" alt="Captura de pantalla 2024-07-28 a la(s) 13 17 00" src="https://github.com/user-attachments/assets/d2018415-80e0-4679-96d8-0a6cd56054a1">
<img width="1285" alt="Captura de pantalla 2024-07-28 a la(s) 13 17 52" src="https://github.com/user-attachments/assets/c5a73ec5-c925-4d1a-a97f-781a1c497074">


## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
    - [Frontend](#frontend)
    - [Backend](#backend)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## 🌟 Features

- 🔐 User authentication (because mental health is a private matter) 🚧In construction🚧
- 🧠 Create, read, update, and delete support request
- ⚡ Real-time updates on request status
- 📊 Dashboard for administrators to manage request 🚧In construction🚧
- 📱Responsive design for mobile and desktop use

## 🛠️ Technologies

### Frontend
- Vue.js 3
- Vite
- Pinia for state management
- Axios for API requests
- Vue Router for navigation

### Backend
- Java
- Spring Boot
- Spring Data JPA
- MySQL Database
- Spring Security for authentication

## 🚀 Getting Started

### Prerequisites

- Node.js (v14 or later)
- npm or yarn
- Java JDK 11 or later
- Maven
- MySQL

### Installation

#### Frontend

1. Clone the frontend repository:
```bash
git clone https://github.com/FactoriaF5-Asturias/Proyect-SupportApp-Frontend2.git
```
2. Install dependencies:
```bash
npm install
```

3. Start the development server:
```bash
npm run dev
```


#### Backend
1. Clone the backend repository:
```bash
git clone https://github.com/GiselaHurtado/Proyect-SupportApp-Backend.git
```

2. Configure the database connection in `src/main/resources/application.properties`:
```bash
spring.datasource.url=jdbc:h2:mem:dcbapp
spring.datasource.username=sa
spring.datasource.password=
```

3. Run the application:
```bash
mvn spring-boot:run
```
## 🎮 Usage

1. Open your browser and navigate to `http://localhost:5173` (or the port specified by Vite).
2. Register a new account or log in with existing credentials.
3. Create a new support ticket or view existing ones.
4. Administrators can manage tickets from the dashboard.

## 🛣️ API Endpoints

- `GET/api/requests/all`: Get all Requests: localhost:8080/api/v1/requests/all
- `POST/api/request/all`: Create a new Request: localhost:8080/api/v1/requests
- `GET /api/requests/{id}`: Get a specific Request: localhost:8080/api/v1/requests/5
- `PUT /api/requestss/{id}`: Update a ticket: localhost:8080/api/v1/requests/5
- `DELETE /api/requests/{id}`: Delete a ticket: localhost:8080/api/v1/requests/7

For a complete list of endpoints and their usage, please refer to the API documentation.

## 🤝 Contributing

Want to make SupportApp even more psychologically awesome? We're all ears! Here's how:

1. Fork it (not with a real fork, please 🍴)
2. Create your feature branch: `git checkout -b feature/MindBlowingFeature`
3. Commit your changes: `git commit -m 'Add some MindBlowingFeature'`
4. Push to the branch: `git push origin feature/MindBlowingFeature`
5. Open a Pull Request (and maybe do some breathing exercises 🧘‍♂️)

## 📜 License

This project has no active licence 🧑‍⚖️.

## 📞 Contact 
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)]([https://www.linkedin.com/in/tu-perfil-de-linkedin](https://www.linkedin.com/in/gisela-hurtado-ela11ian/)) 
[Gisela Hurtado](http://https://www.linkedin.com/in/gisela-hurtado-ela11ian/ "Linkedin")

## 🔗 Project Links: 
- Frontend: [https://github.com/FactoriaF5-Asturias/Proyect-SupportApp-Frontend2](https://github.com/FactoriaF5-Asturias/Proyect-SupportApp-Frontend2)
- Backend: [https://github.com/GiselaHurtado/Proyect-SupportApp-Backend](https://github.com/GiselaHurtado/Proyect-SupportApp-Backend)

