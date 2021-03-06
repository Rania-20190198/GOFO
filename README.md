# Software Engineering 
# GOFO 
This project is a booking system for football playgrounds. It serves the players and playground owners as well. An administrator oversees the overall operations of the system and ensures that no fraud takes place. 
Anyone can register himself on the system and create a profile. He can see the playgrounds near to him or in a specific area or all of them. 

# Task 1:
1. Class Diagram<br>
2. Sequence Diagrams<br>
3. State diagrams
# Task 2:
## Playground owner:
This is the person who wants to register his playground. He first registers himself on the system and creates a profile like any user, with his name, ID and password, email, phone and default location. Then he requests registering a playground and adds its name, its location, its size, the available hours, the price per hour and the cancellation period. A playground is not active until approved by the administrator who may check if information given is true.
## The administrator: 
has the right to delete a playground or suspend it.
This is usually the case if the owner does some fraudulent activities like double booking or if the playground gets a lot of complaints from the players.
Then the administrator can activate it again or delete it completely. 
## Player:
This is a person who is interested in booking a playground. He registers with the system and creates a profile as described above.
He can display the playgrounds near to him or in a specific location on specific dates. He can filter them by the hours and date he selects. 
He can book a time slot of 1 or more hours if available and not booked.
## The owner:
can set and change the hours available for booking for his playground. He can view his bookings. And he can check the money in his eWallet. 
## An eWallet:
is an electronic payment system used to allow players to pay for the bookings they make and allow ground owners collect their money. 
It is externally connected with a service like Fawry that allows players to add money to their eWallet and ground owners to take the money from it.
Any user can check the money in his eWallet or transfer some of it to another eWallet. Adding money to the eWallet happens outside the system boundary.
 ## Author 
@ToqaMohamed0 <br>
@Rania-20190198<br>
@fatma-20190374
