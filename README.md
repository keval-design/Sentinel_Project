# 🛡️ Sentinel – Software Testing Project  

## 📌 Project Overview  
**Sentinel** is a complete software testing project focused on ensuring **data integrity, functionality, usability, and API reliability** of a SaaS-based dashboard.  
It includes **manual testing, automation testing, and API testing** to showcase end-to-end QA practices.  

---

## ✨ Features  

- ✅ Functional Testing (UI & core modules)  
- ✅ Usability & UX Testing (improvement suggestions)  
- ✅ API Testing (Postman & RestAssured)  
- ✅ Automation Testing (Selenium / Cypress)  
- ✅ Test Documentation (Test Plan, Test Cases, RTM)  
- ✅ Defect Management (logs with severity & screenshots)  
- ✅ Agile Process (test coverage, reports, execution logs)  

---

---

## 🧩 Modules Tested  

- 🔹 **Authentication** → Login, Signup, Logout  
- 🔹 **Dashboard** → Data visualization & widgets  
- 🔹 **User Management** → CRUD operations  
- 🔹 **API Endpoints** → GET, POST, PUT, DELETE validation  
- 🔹 **Performance & Usability**  

---

## 🚀 API Testing  

Performed with **Postman** and **RestAssured**.  

**Examples:**  

- **GET Users**  
  - Endpoint: `/users`  
  - Status Code: `200 OK`  
  - Response Time: `< 500ms`  
  - Schema validation ✅  

- **POST User**  
  - Endpoint: `/users`  
  - Status Code: `201 Created`  
  - Request/Response validation ✅  

---

## 🛠 Tech Stack  

- **Manual Testing** → Excel/Docs for Test Plan, RTM, Defect Logs  
- **Automation** → Selenium / Cypress, TestNG, Mocha  
- **API Testing** → Postman, RestAssured  
- **Test Management** → JIRA, Agile boards  

---

## 📸 Screenshots & Reports  

_Add screenshots of test runs, API responses, and defect logs here._  

---

## 🚦 How to Run  

### 🔹 Manual Testing  
- Open `/TestCases` and `/DefectLogs` for detailed steps & results.  

### 🔹 Automation (if included)  
```bash
# Clone repo
git clone https://github.com/your-username/sentinel.git

# Navigate
cd sentinel/Automation

# Run tests (Maven + TestNG example)
mvn test
