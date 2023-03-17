# Imports two libraries:
import time
from adafruit_circuitplayground import cp

# Defines variables to hold the timings
short = 0.1  # the length of a short/dit
long = 0.3  # the length of a long/dah
spacer = 0.3  # the spacer between blinks

# This defines a function that can be called later
def blink():
    cp.pixels.fill((25, 0, 0))  # set all the LEDs (pixels) to the RGB(25,0,0)
    time.sleep(short)  # pause the execution for the time, in seconds
    cp.pixels.fill((0, 0, 0))  # set all of the LEDs to off
    time.sleep(spacer)

# The code indented below this runs in an infinite loop
while True:
    blink()  # call the function we defined above
    time.sleep(short)  # sleep for 2 seconds
