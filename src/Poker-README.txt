Binley Yang
CSC 171
Project 2 - Poker

To accomplish the task required by the project, I used multiple methods to generate a deck, deal hands, classify hands, etc. 

For Problem 1: To generate a deck, I created a method that took two string arrays that contained the suits and values of the cards. Then
using nested for loops, I printed out the deck in order with my printer method. To shuffle the deck, I implemented the swapper method from Lab 14 into my shuffler method, then using a printer method, I printed out the shuffled deck.

For Problem 2: I used the previous methods for Problem 1 to print out a deck in order, shuffle it, and then I created a dealer method to deal out 2 hands, and display the remainder using for loops. 

For Problem 3: In order to evaluate the hands properly, I separated the 10 character string into an array, which was essential to my algorithm that compares the characters to determine if there is a pair, 2 pair, straight, etc. I used for loops and incremented my counter values during a series of tests to find the patterns that each type of hand had, and once I found out the pattern, I created an array of the types to access the type of the hand based on the counter value. 	

For Problem 4: To compare the two hands, I used two scores, one to determine the winner based on the type of hand, but if the two hands have the same type, then the second score scores the entire hand based on the value of the cards. To account for the "kicker" in poker, I created another method that scores the entire hand by assigning point values to each of the cards (i.e. 2 of Clubs = 2, 3 of Hearts = 3, and so on). This way, if two hands are of equal strength, i.e. two Full House's or two pairs, the second method will determine the winner based on the total points of the hands. FOr both of these scores, I used ArrayLists since it made it easy to determine the winner due to the .indexOf method.

How to Run the Program: Follow the command prompts instructions and enter what you want to do. When entering the hands, enter in the form of RSRSRSRSRS where R can be any one of the set (2,3,4,5,6,7,8,9,T,t,J,j,Q,q,K,k,A,a) and S can be any one of the set (C,c,H,h,S,s,D,d). For -t1 and -t2, my program will explicitly tell you what it's doing, and for -t3 and -t4 will tell you what the hand is and which hand wins, respectively. -t4 will also display the type of hand that you have as well. 

Test Cases: I ran -t1 and -t2 several times to make sure they printed out an unshuffled deck and a different shuffled deck each time. For -t3, I tested multiple strings that contained pairs, two pairs, three of a kind, straight, flush, full house, straight flush, and high cards to make sure it determined the type of hand correctly. 

For example, 3c5c7c9ctc returned a flush, which is correct.

For -t4, 3c3h4c6s8d vs. 3c4h5d6s7c yields 3c4h5d6s7c as the winner, which is correct since a straight is better than a pair. I ran many tests to make sure my scoring system yielded the correct result.

