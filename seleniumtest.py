from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager
import time

# Setup Chrome driver using webdriver-manager
service = Service(ChromeDriverManager().install())
driver = webdriver.Chrome(service=service)

# Open Google and search for GeeksforGeeks
driver.get("http://www.google.com")
search_box = driver.find_element(By.NAME, "q")
search_box.send_keys("GeeksforGeeks")
search_box.send_keys(Keys.ENTER)

time.sleep(5)  # Let the user see the result
driver.quit()

print("Sample test Successful")


# pip install selenium
# Create and activate virtual environment:
# python -m venv selenium-env
# .\selenium-env\Scripts\activate  
# pip install selenium webdriver-manager



