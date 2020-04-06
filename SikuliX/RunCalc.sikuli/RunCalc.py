import subprocess

path = "/home/gurleen/Desktop/testing_automation/Testing_automation/Java-Calculator/calculator.jar"
subprocess.Popen(["java", "-jar", path])

click("1581893056154.png")

click("1581892539353.png")

click("1581891711736.png")

click("1581891731458.png")

if exists(Pattern("1581893560070.png").similar(0.38).targetOffset(-15,3)):
    print ("correct")
else:
    print("wrong")
    



