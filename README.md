# Locators-Lab

Selenium WebDriver Java lab with practical locator strategy examples for real websites (Amazon, Flipkart, Ajio, Myntra, OpenCart, etc).

## Overview

This repository contains hands-on examples demonstrating various Selenium locator strategies applied to real-world websites. Perfect for learning and mastering web element identification techniques in test automation.

## Selenium Locator Strategies

Selenium provides 8 different locator strategies to identify web elements on a page. Understanding each strategy and when to use them is crucial for writing robust automation scripts.

### 1. ID Locator

**Description:** Locates elements by their unique `id` attribute. This is the fastest and most reliable locator when available.

**Example:**
```java
// HTML: <input id="email" type="text" />
WebDriver driver = new ChromeDriver();
WebElement emailField = driver.findElement(By.id("email"));
emailField.sendKeys("user@example.com");
```

### 2. Name Locator

**Description:** Locates elements by their `name` attribute. Commonly used for form elements.

**Example:**
```java
// HTML: <input name="username" type="text" />
WebElement usernameField = driver.findElement(By.name("username"));
usernameField.sendKeys("testuser");
```

### 3. Class Name Locator

**Description:** Locates elements by their CSS class name. Returns the first element with the matching class.

**Example:**
```java
// HTML: <button class="btn-submit">Submit</button>
WebElement submitButton = driver.findElement(By.className("btn-submit"));
submitButton.click();
```

### 4. Tag Name Locator

**Description:** Locates elements by their HTML tag name. Useful when you need to find all elements of a specific type.

**Example:**
```java
// HTML: <h1>Welcome</h1>
WebElement heading = driver.findElement(By.tagName("h1"));
System.out.println(heading.getText());

// Find all links on a page
List<WebElement> allLinks = driver.findElements(By.tagName("a"));
```

### 5. Link Text Locator

**Description:** Locates anchor elements by their exact visible text. Case-sensitive and must match completely.

**Example:**
```java
// HTML: <a href="/login">Login</a>
WebElement loginLink = driver.findElement(By.linkText("Login"));
loginLink.click();
```

### 6. Partial Link Text Locator

**Description:** Locates anchor elements by partial text match. Useful when link text is dynamic or very long.

**Example:**
```java
// HTML: <a href="/signup">Sign Up Now</a>
WebElement signupLink = driver.findElement(By.partialLinkText("Sign Up"));
signupLink.click();
```

### 7. CSS Selector

**Description:** Locates elements using CSS selector patterns. Very powerful and flexible for complex element identification.

**Example:**
```java
// HTML: <input id="search" class="search-box" />
// By ID
WebElement searchBox1 = driver.findElement(By.cssSelector("#search"));

// By class
WebElement searchBox2 = driver.findElement(By.cssSelector(".search-box"));

// By attribute
WebElement searchBox3 = driver.findElement(By.cssSelector("input[name='q']"));

// Combining selectors
WebElement submitBtn = driver.findElement(By.cssSelector("button.btn-primary[type='submit']"));
```

### 8. XPath

**Description:** Locates elements using XML path expressions. Most powerful and flexible locator, can traverse up and down the DOM.

**Example:**
```java
// HTML: <div><input id="password" type="password" /></div>

// Absolute XPath (not recommended - fragile)
WebElement pwd1 = driver.findElement(By.xpath("/html/body/div/input"));

// Relative XPath (recommended)
WebElement pwd2 = driver.findElement(By.xpath("//input[@id='password']"));

// XPath with text
WebElement link = driver.findElement(By.xpath("//a[text()='Click Here']"));

// XPath with contains
WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'submit')]"));

// Parent/Child navigation
WebElement parent = driver.findElement(By.xpath("//input[@id='email']/../.."));
```

## How to Extract Locators from a Webpage

### Method 1: Using Browser DevTools (Chrome/Edge)

1. **Open DevTools:**
   - Right-click on the element you want to locate
   - Select **"Inspect"** or press `F12`

2. **View Element Properties:**
   - The HTML for the element will be highlighted in the Elements tab
   - Look for attributes like `id`, `name`, `class`, etc.

3. **Copy XPath or CSS Selector:**
   - Right-click on the highlighted HTML element in DevTools
   - Select **Copy** → **Copy XPath** or **Copy selector**

4. **Test in Console:**
   ```javascript
   // Test XPath in browser console
   $x("//input[@id='search']")
   
   // Test CSS selector in browser console
   $("#search")
   ```

### Method 2: Using Browser Extensions

- **ChroPath:** Popular extension for generating and testing XPath and CSS selectors
- **SelectorsHub:** Advanced tool for creating robust locators
- **Ranorex Selocity:** Another useful extension for locator generation

### Method 3: Manual Inspection

1. Open DevTools (`F12`)
2. Use the **Element Picker** tool (top-left corner icon)
3. Hover over elements on the page to see their HTML structure
4. Click to select and view all attributes
5. Manually construct your locator based on unique attributes

### Best Practices for Locator Selection

- **Priority Order:** ID > Name > CSS Selector > XPath
- **Avoid absolute XPath** - use relative XPath instead
- **Use unique attributes** when available
- **Avoid using indexes** unless necessary
- **Create maintainable locators** that won't break with minor UI changes
- **Test locators** in browser console before using in code

## Features

- ✅ Comprehensive examples for all 8 Selenium locator strategies
- ✅ Real-world website scenarios (Amazon, Flipkart, Ajio, Myntra, OpenCart)
- ✅ Best practices and anti-patterns documentation
- ✅ Java-based test automation examples
- ✅ Practical exercises for hands-on learning
- ✅ Page Object Model (POM) implementation examples

## Project Structure

```
Locators-Lab/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/          # Page Object classes
│   └── test/
│       └── java/
│           ├── amazon/          # Amazon locator examples
│           ├── flipkart/        # Flipkart locator examples
│           ├── ajio/            # Ajio locator examples
│           ├── myntra/          # Myntra locator examples
│           └── opencart/        # OpenCart locator examples
├── pom.xml                      # Maven dependencies
└── README.md                    # This file
```

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- Maven 3.6+
- Chrome/Firefox browser
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Sudheernidamanuri/Locators-Lab.git
   cd Locators-Lab
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

3. **Run example tests:**
   ```bash
   mvn test
   ```

### Dependencies

Add these to your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.15.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.8.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Covered Websites

- **Amazon** - E-commerce platform with complex dynamic elements
- **Flipkart** - Indian e-commerce site with various locator challenges
- **Ajio** - Fashion e-commerce with modern UI elements
- **Myntra** - Fashion retail with dynamic product listings
- **OpenCart** - Open-source e-commerce platform for practice

## Learning Path

1. Start with basic locators (ID, Name, Class)
2. Progress to link-based locators
3. Master CSS Selectors for efficiency
4. Learn XPath for complex scenarios
5. Apply in real-world website examples
6. Implement Page Object Model patterns

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is open source and available for educational purposes.

## Contact

For questions or suggestions, please open an issue in this repository.

---

**Happy Testing! 🚀**
