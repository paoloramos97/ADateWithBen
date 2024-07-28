/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cis18a.finalproject;

import java.util.Scanner;

/**
 *
 * @author paolo
 */

public class TextNovel
{
    Scanner input = new Scanner(System.in);
    
    public static void gameIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printLine(40);
        System.out.println("In one afternoon, you are waiting for your friend to hangout at a park.");
        System.out.println("Suddenly, you feel a large presence beside as a shadow towers over you.");
        System.out.println("A bulky bear wearing a coat stood beside you, it's your friend, Ben!");
        GameLogic.ContinueButton();
    }
    
    public static void dialogue1(Friend friend, Player player)
    {
        GameLogic.clearConsole();
        GameLogic.printLine(40);
        System.out.println(friend.name + ":\n Hey, there, " + player.name + ". Sorry that I'm late... I came across some roadblocks on the way.");
        System.out.println("He sheepishly answered, rubbing the back of his head. Regardless of his tardiness, you still smile at his presence.");
        System.out.println(player.name + ":\n That doesn't matter. I'm just glad to see you again, Ben. It's been so long.");
        System.out.println(friend.name + ":\n Yeah, it has. When was the last time we've met? A month ago?");
        System.out.println(player.name + ":\n Uh, actually. It's been four months...");
        System.out.println(friend.name + ":\n What...?! Where did the time go... Jesus, four months.");
        System.out.println(player.name + ":\n Don't sweat. Let's make the most of it today!");
        GameLogic.ContinueButton();
    }
    
    public static void dialogue2(Friend friend, Player player)
    {
        GameLogic.clearConsole();
        GameLogic.printLine(30);
        System.out.println(friend.name + ":\n You're right on that. So how are you?");
        System.out.println(player.name + ":\n I'm doing alright. Been busy with college and personal stuff. How about you, Ben?");
        System.out.println(friend.name + ":\n Not bad as well. Found a job two months ago and I bought this jacket that I always wanted. What do you think?");
        GameLogic.printLine(30);
        System.out.println("1) Compliment\n2) Flirt");
        int input = GameLogic.readInt("-> ", 2);
        if (input == 1)
        {
            GameLogic.clearConsole();
            friend.trust += 2;
            System.out.println(player.name + ":\n I think it looks good on you, Ben. That jacket appears in high quality too! You have good taste.");
            System.out.println("Ben's face flushes from the comment.");
            System.out.print(friend.name + ":\n Thank you, " + player.name + ". I'm glad you think so.");
            System.out.print(" Saw this on the internet and seriously loved the color and texture, and thought I should show it off.");
        }
        else
        {
            GameLogic.clearConsole();
            friend.trust += -1;
            System.out.println(player.name + ":\n Wow, dude. You look smoking hot in that jacket. You have sweet taste!\nYou wink at him");
            System.out.println("Ben looks away, his face red. Possibly embarrassed from the comment.");
            System.out.println(friend.name + ":\n U-Um, g-gee, uh-uh, thanks?");
            System.out.println(player.name + ":\n I was joking with you, dude. Don't take me seriously. You look good in it. ");
            System.out.println(friend.name + ":\n Right...");
        }
        System.out.println(player.name + ":\n Hey, there's an ice-cream truck ahead of us. Let's check it out.");
        GameLogic.ContinueButton();
    }
    public static void dialogue3(Friend friend, Player player)
    {
        GameLogic.clearConsole();
        GameLogic.printLine(30);
        System.out.println("You and Ben stroll over to a large sky blue ice-cream truck parked by the sidewalk.");
        System.out.println("While waiting in line, the two of you are deciding which flavor of ice cream to get.");
        System.out.println("You finally decided what to get, however, Ben seems hesitant and uncertain.");
        System.out.println(player.name + ":\n Is something wrong, Ben?");
        System.out.println(friend.name + ":\n To tell you the truth, I'm not much of an ice-cream guy. The last time I had ice-cream from a truck was when I was a cub.");
        System.out.println(player.name + ":\n Perhaps, I can choose a flavor for you.");
        System.out.println(friend.name + ":\n If that's the case, then I don't doubt your decision. You may get me to like ice-cream again. Enlighten me.");
        GameLogic.printLine(30);
        System.out.println("1) Honey Coated-Berry\n2) Vanilla Ice Cream\n3) Macaroni Surpise ");
        int input = GameLogic.readInt("-> ", 3);
        if (input == 1)
        {
            GameLogic.clearConsole();
            friend.trust += 2;
            System.out.println("Ben takes a scoope of the ice cream and carefully consumes the treat, processing and identifying the flavor.");
            System.out.println("Ben's eyes widen and hums happily, taking more big scoops.");
            System.out.println(friend.name + "\n This is amazing! The honey and the addition of berries. This is spectacular!");
            GameLogic.ContinueButton(); 
        }
        if (input == 2)
        {
            GameLogic.clearConsole();
            friend.trust += 1;
            System.out.println("Ben takes a scoope of the ice cream and carefully consumes the treat, processing and identifying the flavor.");
            System.out.println("The bear nods in approvement.");
            System.out.println(friend.name + ":\n I can see why vanilla is the standard flavor. The flavor is quite nice on the tongue yet basic.");
            GameLogic.ContinueButton();
        }
        else
        {
            GameLogic.clearConsole();
            friend.trust += -2;
            System.out.println("Ben takes a scoope of the ice cream and carefully consumes the treat, processing and identifying the flavor.");
            System.out.println("The bear looks like he was about to gag.");
            System.out.println(player.name + ":\n Are you okay, Ben? It looks like you are about hurl.");
            System.out.println(friend.name + ":\n Um, yeah. I think I won't be having ice-cream anytime soon.");
            GameLogic.ContinueButton();
        }
        GameLogic.clearConsole();
        System.out.println(player.name + ":\n I think eating ice-cream caused me to get more hungry. Let's find something to eat. I want real food.");
        System.out.println(friend.name + ":\n There should be a food stand nearby. They sell burgers.");
        System.out.println(player.name + ":\n Great! Let's head there now.");
        GameLogic.ContinueButton();
    }
    public static void dialogue4(Friend friend, Player player)
    {
        GameLogic.clearConsole();
        GameLogic.printLine(30);
        System.out.println("The both of you found the burger stand that Ben mentioned. You found that the line was long and the picnic tables were almost crowded.");
        System.out.println(player.name + ":\n I guess this burger stand is the real deal. I never seen so many people today.");
        System.out.println(friend.name + ":\n By the time we get our food, we'll be sitting on the concrete floor.");
        System.out.println(friend.name + ":\n How about this: you order us food and I'll find us a place to sit.");
        System.out.println(player.name + ":\n Sounds like a plan. What would you like on your burger?");
        System.out.println(friend.name + ":\n Yeah, get me double patties with cheese, grilled onions, no pickles, and light on the mayo. Got it?");
        System.out.println("You nodded and he leaves to find the both of you seats while you wait in line.");
        GameLogic.ContinueButton();
        GameLogic.clearConsole();
        System.out.println("You are finally next and the man behind the register asks for your order. You gave him what you wanted, but need to order Ben's burger.");
        System.out.println(player.name + ":\n (What did Ben wanted...?)");
        GameLogic.printLine(30);
        System.out.println("1) Triple patties with raw onion, pickles, and heavy on the mayo!");
        System.out.println("2) Double patties with grilled onion, no pickles, and light on the mayo!");
        int input = GameLogic.readInt("-> ", 2);
        if (input == 1)
        {
            GameLogic.clearConsole();
            friend.trust += -3;
            System.out.println("You arrive with your burgers to Ben waiting at a picnic table.");
            System.out.println("Ben retrieves his food and examines it.");
            System.out.println(friend.name + ":\n Dude, you messed up on my order...");
            System.out.println(player.name + ":\n I-I did? I'm so sorry! I thought I got it right! I can go back and-");
            System.out.println(friend.name + ":\n Nah, it's fine. I'll just have to deal with it. Thanks anyway...");
            GameLogic.ContinueButton();
        }
        else
        {
            GameLogic.clearConsole();
            friend.trust += 1;
            System.out.println("You arrive with your burgers to Ben waiting at a picnic table.");
            System.out.println("Ben retrieves his food and examines it.");
            System.out.println(friend.name + ":\n Hey, thank you for getting my burger. You are true bud, bud.");
            System.out.println(player.name + ":\n Why the double usage of bud? Hehe.");
            System.out.println(friend.name + ":\n I thought it would be funny.");
            GameLogic.ContinueButton();
        }
    }
    public static void ending(Friend friend, Player player)
    {
        GameLogic.clearConsole();
        GameLogic.printLine(30);
        System.out.println("It is starting sunset and both of you were getting ready to depart.");
        System.out.println("You walk Ben to his car and giving him company.");
        System.out.println(friend.name + ":\n Looks like this is where we part ways.");
        System.out.println(player.name + ":\n Yeah, it was great seeing you again, Ben. I hope you had a great time hanging out with me.");
        GameLogic.ContinueButton();
        if (friend.trust == 5 )
        {
            GameLogic.clearConsole();
            System.out.println(friend.name + ":\n I had a swell time. It's great seeing you again, " + player.name + ".");
            System.out.println("Ben hesitates for a moment before giving you a gentle embrace. After the hug, the both of you felt your faces flushed.");
            System.out.println(friend.name + ":\n I hope we get to meet again very soon. Maybe sometime next week...?");
            System.out.println(player.name + ":\n I'd like that.");
            GameLogic.printLine(30);
            System.out.println("With that, Ben smiles and enters his car. You left a great impression on the bear as the both of you wish to see each other again.");
            GameLogic.printHeader("BEST ENDING ACHIEVED");
            GameLogic.ContinueButton();
        }
        if (friend.trust >= 0)
        {
            GameLogic.clearConsole();
            System.out.println(friend.name + ":\n Yeah, I had a great time. Let's hang out again? Hopefully, this time it's not another four months.");
            System.out.println(player.name + ":\n For sure! Have a good night, Ben, and drive safe out there, okay?");
            System.out.println(friend.name + ":\n Hehe, I will. Goodbye, " + player.name + ".  See you later, bud.");
            System.out.println("Ben gets into his car. You wave goodbye as he passes you, returning a warm smile.");
            GameLogic.printHeader("GOOD ENDING ACHIEVED");
            GameLogic.ContinueButton();
        }
        if (friend.trust <= -1)
        {
            GameLogic.clearConsole();
            System.out.println(friend.name + ":\n It was alright.");
            System.out.println("His voice sounded disappointed as if he barely got the chance to enjoy himself today.");
            System.out.println(player.name + ":\n Oh, I see. Um, do you want to hang out again maybe next week?");
            System.out.println(friend.name + ":\n M-Maybe some other time. Sorry, I'm going to be busy with work.");
            System.out.println(player.name + ":\n Oh... Goodbye then, have a good night.");
            System.out.println(friend.name + ":\n Thanks. You too.");
            System.out.println("Ben enters his car and leaves without another word. You wondered if you'll ever see him again...");
            GameLogic.printHeader("BAD ENDING ACHIEVED");
            GameLogic.ContinueButton();
        }
    }
}