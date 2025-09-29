## Sentinel — Full-Stack Data Integrity Framework


A comprehensive automation testing framework that validates data integrity across REST APIs and web interfaces using Selenium WebDriver, REST Assured, and Cucumber BDD.

###🚀 Features
REST API Testing: Automated tests for GoREST API using REST Assured

Web UI Testing: Selenium WebDriver tests for AdminLTE demo application

BDD Support: Cucumber integration for behavior-driven development

CI/CD Pipeline: GitHub Actions workflow for continuous integration

ExtentReports: Detailed HTML test reporting

Cross-Platform: Supports Windows, Linux, and macOS

###📁 Project Structure
text
sentinel/
├── src/
│   ├── main/java/com/sentinel/
│   │   ├── api/GoRestClient.java          # API client for GoREST
│   │   ├── ui/pages/ContactsPage.java     # Page Object for contacts
│   │   └── utils/                         # Utilities (Config, WebDriverFactory)
│   └── test/java/com/sentinel/tests/
│       ├── api/UserApiTests.java          # API test cases
│       ├── ui/                            # UI test cases
│       └── bdd/DataValidationSteps.java   # Cucumber step definitions
├── src/test/resources/
│   ├── features/DataValidation.feature    # BDD feature files
│   └── extent-config.xml                  # ExtentReports configuration
├── .github/workflows/
│   └── ci-pipeline.yml                    # GitHub Actions CI configuration
└── pom.xml                               # Maven configuration
🛠️ Prerequisites
JDK 17 or later

Maven 3.8 or later

Chrome Browser (for UI tests)

GoREST API Token

⚙️ Setup Instructions
1. Clone the Repository
bash
git clone <repository-url>
cd sentinel
2. Set Environment Variables
Set your GoREST API token as an environment variable:

Linux/macOS:

bash
export GOREST_TOKEN="your_gorest_token_here"
Windows (PowerShell):

powershell
$env:GOREST_TOKEN="your_gorest_token_here"
Windows (Command Prompt):

cmd
set GOREST_TOKEN=your_gorest_token_here
3. Run Tests
Run all tests:

bash
mvn test
Run only API tests:

bash
mvn test -Dtest=UserApiTests
Run only UI tests:

bash
mvn test -Dtest=TestDynamicTableInteraction,TestFileUpload
Run Cucumber BDD tests:

bash
mvn test -Dtest=DataValidationSteps
🔧 Configuration
Environment Variables
GOREST_TOKEN: Your GoREST API authentication token

GOREST_BASE: GoREST API base URL (default: https://gorest.co.in/public/v2)

ADMINLTE_BASE: AdminLTE demo application URL (default: https://adminlte.io/themes/v3)

Browser Configuration
The framework uses headless Chrome by default. To run tests in headed mode, modify WebDriverFactory.java:

java
// Remove headless option for visible browser
// options.addArguments("--headless=new");
###📊 Test Reports
After test execution, ExtentReports generates detailed HTML reports in the test-output/ directory. Open ExtentReport.html to view test results.

###🔄 CI/CD Pipeline
The GitHub Actions workflow (ci-pipeline.yml) automatically:

Runs on pushes to the main branch

Sets up JDK 17 and Maven caching

Executes all tests with the GoREST token from repository secrets

Generates test reports

Setting up GitHub Secrets
Go to your repository Settings → Secrets and variables → Actions

Click New repository secret

Add GOREST_TOKEN with your actual GoREST API token

###🧪 Test Types
API Tests (UserApiTests.java)
User creation, reading, updating, and deletion (CRUD)

JSON request/response validation

HTTP status code verification

UI Tests
Dynamic Table Interaction: Search and validate table data

File Upload: Test file upload functionality

Contacts Page: Data validation in AdminLTE contacts table

BDD Tests (DataValidation.feature)
End-to-end data integrity validation

API-to-UI data synchronization

Cross-platform data consistency checks

###🛡️ Security Notes
✅ Never commit real API tokens to version control

✅ Use environment variables or GitHub Secrets

✅ The .gitignore file excludes sensitive configuration

✅ All external dependencies use secure HTTPS
