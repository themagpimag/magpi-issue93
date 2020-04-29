from sense_hat import SenseHat

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

sense.set_pixels(heart)