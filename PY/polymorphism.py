class Vehical:
    def __init__(self,brand,model):
        self.brand=brand
        self.model=model
    
    def move(self):
        return "Car moves on ground"

class car(Vehical):
    pass

class boat(Vehical):
    def move(self):
        return "Boat moves on river"

car1 =car("Ford","Mustang")
boat1=boat("INSV",765)

for i in (car1,boat1):
    print(i.brand)
    print(i.model)
    print(i.move())