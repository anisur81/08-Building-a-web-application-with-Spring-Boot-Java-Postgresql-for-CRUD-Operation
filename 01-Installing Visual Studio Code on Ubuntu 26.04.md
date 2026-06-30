## Installing Visual Studio Code on Ubuntu 26.04

Your installation commands look correct! Here's a complete guide with explanations and troubleshooting:

### **1. Basic Installation (Your Commands)**

```bash
# Add Microsoft's GPG key
curl -fsSL https://packages.microsoft.com/keys/microsoft.asc | sudo gpg --dearmor -o /usr/share/keyrings/microsoft.gpg

# Add VS Code repository
echo "deb [arch=amd64 signed-by=/usr/share/keyrings/microsoft.gpg] https://packages.microsoft.com/repos/code stable main" | sudo tee /etc/apt/sources.list.d/vscode.list

# Update and install
sudo apt update
sudo apt install code

# Verify installation
code --version
```

### **2. Essential Java/Spring Extensions for Your Portfolio Project**

Since you have a Spring Boot portfolio project, install these extensions:

```bash
# Complete Java Development Pack
code --install-extension vscjava.vscode-java-pack

# Spring Boot Extensions
code --install-extension vscjava.vscode-spring-initializr
code --install-extension vmware.vscode-spring-boot

# Additional helpful extensions
code --install-extension vscjava.vscode-spring-boot-dashboard
code --install-extension vscjava.vscode-java-debug
code --install-extension vscjava.vscode-java-dependency
code --install-extension vscjava.vscode-maven

# Check all installed extensions
code --list-extensions
```

### **3. Launch VS Code with Your Portfolio Project**

```bash
# Open VS Code from terminal
code

# Or open your project directly
cd /path/to/your/portfolio
code .
```

### **4. Troubleshooting Common Issues**

**If `code` command not found:**
```bash
# Try restarting terminal or
source ~/.bashrc
# Or add to PATH manually
export PATH="$PATH:/usr/share/code/bin"
```

**If GPG key has issues:**
```bash
# Alternative method - download and install .deb package
wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > packages.microsoft.gpg
sudo install -o root -g root -m 644 packages.microsoft.gpg /usr/share/keyrings/
sudo sh -c 'echo "deb [arch=amd64 signed-by=/usr/share/keyrings/packages.microsoft.gpg] https://packages.microsoft.com/repos/code stable main" > /etc/apt/sources.list.d/vscode.list'
```

### **5. Recommended VS Code Settings for Spring Boot**

Create `.vscode/settings.json` in your project:

```json
{
  "java.configuration.updateBuildConfiguration": "automatic",
  "java.compile.nullAnalysis.mode": "automatic",
  "spring-boot.ls.java.home": "/usr/lib/jvm/java-17-openjdk-amd64",
  "files.autoSave": "onFocusChange",
  "editor.formatOnSave": true
}
```

### **6. Keyboard Shortcuts for Ubuntu**
- **Open Command Palette**: `Ctrl+Shift+P`
- **Open Terminal**: `Ctrl+` ` (backtick)
- **Run Project**: `Ctrl+F5`
- **Debug**: `F5`

### **7. For Your Portfolio Project Specifically**

After installing extensions, VS Code will:
- Automatically detect your `pom.xml`
- Suggest Spring Boot run configurations
- Provide code completion for Thymeleaf templates
- Highlight issues in your Java code

### **8. Quick Project Setup in VS Code**

1. Open your portfolio folder
2. VS Code will detect Maven project
3. Click "Run" button in Spring Boot Dashboard (left sidebar)
4. Or use terminal: `./mvnw spring-boot:run`

### **Alternative Installation Methods**

**Snap (Simpler):**
```bash
sudo snap install --classic code
```

**Download .deb directly:**
```bash
wget -O code.deb https://code.visualstudio.com/sha/download?build=stable&os=linux-deb-x64
sudo dpkg -i code.deb
sudo apt install -f  # Fix dependencies if needed
```

### **Verify Everything Works**
```bash
# Check installation
which code
code --version

# Test extensions
code --list-extensions | grep -E "(java|spring)"

# Open with project
code ~/portfolio
```

Your Spring Boot portfolio project should now work perfectly in VS Code! The extensions you've installed will provide:
- **Java IntelliSense** (autocomplete)
- **Spring Boot** support (automatic restart on changes)
- **Thymeleaf** template support
- **Maven** project management
- **Debugging** capabilities
