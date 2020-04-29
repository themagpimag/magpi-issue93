from sense_hat import SenseHat
from time import sleep

sense = SenseHat()

r = (255, 0, 0)     # red
o = (255, 128, 0)   # orange
y = (255, 255, 0)   # yellow
g = (0, 255, 0)     # green
c = (0, 255, 255)   # cyan
b = (0, 0, 255)     # blue
p = (255, 0, 255)   # purple
n = (255, 128, 128) # pink
w =(255, 255, 255)  # white
k = (0, 0, 0)       # blank

rainbow = [r, o, y, g, c, b, p, n]

heart = [
        k, r, r, k, k, r, r, k,
        r, r, r, r, r, r, r, r,
        r, r, r, r, r, r, r, r,
        r, r, r, r, r, r, r, r,
        r, r, r, r, r, r, r, r,
        k, r, r, r, r, r, r, k,
        k, k, r, r, r, r, k, k,
        k, k, k, r, r, k, k, k
        ]

while True:
    sense.clear()

    sense.set_pixels(heart)
    sleep(3)
    
    for y in range(8):
        colour = rainbow[y]
        for x in range(8):
            sense.set_pixel(x, y, colour)
            
        sleep(1)
    sleep(3)
     
    sense.show_message("THANK YOU NHS!", text_colour = w, back_colour = b)
    sleep(3)