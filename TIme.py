import time
timestamp = time.strftime('%H:%M:%S')
print(timestamp)
timestamp = int(time.strftime("%H"))
print(timestamp)
timestamp = int(time.strftime("%M"))
print(timestamp)
timestamp = int(time.strftime("%S"))
print(timestamp)

if ( int(time.strftime("%H")) <= 12):
  print("Good Morning")

elif ( int(time.strftime("%H")) > 12):
  print("Good Afternoon")

elif ( int(time.strftime("%H")) >= 8):
  print("Good Night")