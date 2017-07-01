package com.udacity.gradle.jokes;

import java.util.concurrent.ThreadLocalRandom;

public class Joker {

    // http://www.rd.com/jokes/one-liners/
    String[] jokeArray = {"Some people just have a way with words, and other people ... oh ... not have way. - Steve Martin",
            "The four most beautiful words in our common language: I told you so. - Gore Vidal",
    "All pro athletes are bilingual. They speak English and profanity. - Gordie Howe, hockey player",
            "I bought one of those tapes to teach you Spanish in your sleep. During the night, the tape skipped. Now I can only stutter in Spanish. - Steven Wright",
            "My girlfriend and I often laugh about how competitive we are. But I laugh more.",
            "Probably the worst thing you can hear when you're wearing a bikini is 'Good for you!' - @ElizaBayne",
            "When I lost my rifle, the Army charged me $85. That's why in the Navy, the captain goes down with the ship. - Comedian Dick Gregory",
            "A conference call is the best way for a dozen people to say 'bye' 300 times. - @DamienFahey",
            "The Revenant (2015). An epic tale of one man's desperate journey to do whatever it takes to finally win an Oscar. - @badbanana (Tim Siedell)",
            "If growing up in the '80s taught me one thing, it's that my friends and I should have found a treasure map by now. - @LizHackett",
            "Watch The Walking Dead with someone who's super into it so every time a zombie appears, you can pull the old, 'Wait, who's this, now?' - @KarenKilgariff",
            "Every Scooby-Doo episode would literally be two minutes long if the gang went to the mask store first and asked a few questions. - @SCbchbum (Erica)",
            "Drama: a word boring people use to describe fun people. - @jennyandteets (Jenny Mollen)",
            "One of my friends is pregnant. And I'm really excited. Not for the baby but because she's one of my skinniest friends. - @MichelleIsAWolf (Michelle Wolf)",
            "This may be the wine talking, but I really, really, really, really love wine. - @RobinMcCauley",
            "Please stop calling us your 'squad,' Linda; this is book club. - @RandiLawson",
            "Instagram is just Twitter for people who go outside. - @JoshGondelman",
            "If people say they just love the smell of books, I always want to pull them aside and ask, To be clear, do you know how reading works? - @bridger_w (Bridger Winegar)",
            "We get it, poets: Things are like other things. - @shutupmikeginn (Mike Ginn)",
            "Yeah, I'd probably freak out too if a raven flew into my house. That poem still holds up. - @SeanWhiteComedy (Sean Gilbert White)",
            "You'll never be as lazy as whoever named the fireplace. - @longwall26",
            "A Canadian psychologist is selling a video that teaches you how to test your dog's IQ. Here's how it works: If you spend $12.99 for the video, your dog is smarter than you. - Jay Leno",
            "We've begun to long for the pitter-patter of little feet, so we bought a dog. It's cheaper, and you get more feet. - Rita Rudner",
            "Why do dogs always race to the door when the doorbell rings? It's hardly ever for them. - Harry Hill",
            "I spend three minutes every day choosing a TV channel to leave on for my dog. Then I go to work, and people take me seriously as an adult. - @damienfahey",
            "The Complete Law and Order boxed set is now available for only $300. The perfect gift for someone unaware of the existence of USA Network. - @EliBraden, comedian",
            "My greatest acting performance is when I check the caller ID, then adopt an air of polite curiosity as I answer the phone 'Hello?' - @SethMacFarlane",
            "Sick of having to go to two different huts to buy pizza and sunglasses. - @Leemanish",
            "The closest I've been to a diet this year is erasing food searches from my browser history. - @PaulyPeligroso",
            "Bifocals are God's way of saying, 'Keep your chin up.' - Comedian Matt Wohlfarth",
            "My friends tell me that cooking is easy, but it's not easier than not cooking. - Maria Bamford",
            "How can you ever be late for anything in London? They have a huge clock right in the middle of the town. - Jimmy Kimmel",
            "I put so much more effort into naming my first Wi-Fi than my first child. - @1followernodad (Sophia Benoit)",
            "'Pickup artists' and 'garbagemen' should switch names. - @ceejoyner (Chris Joyner)",
            "Whoever named it necking is a poor judge of anatomy. - Groucho Marx",
            "My girlfriend told me to take a spider out instead of killing it. We went and had some drinks. Cool guy. Wants to be a lawyer. - @FattMernandez (Matt Fernandez)",
            "The biggest change after having kids was putting a swear jar in the house. Whenever I say a bad word, I have to put a dollar in the jar, and at the end of every month, I take all that money and buy myself a nice steak for being such a cool dad. - Comedian Mark Chalifoux",
            "I wonder if Superman ever put glasses on Lois Lane's dog and she was like, 'I've never seen this dog before. Is this a new dog?' - @Robfee",
            "I walked up to a tourist information booth and asked them to tell me about a couple of people who were here last year. - Steven Wright",
            "Why is there so much pressure to spend Independence Day with other people? - Betsy Salkind",
            "My favorite game  is 'Professional Dog Walker or Crazy Person?' - @KenJennings",
            "A hotel minibar allows you to see into the future and find out what a can of Pepsi will cost in 2020. - Comedian Rich Hall",
            "Sometimes I like to sit my dog down for a performance review, just to remind him who's boss. - @rmfnord",
            "Febreze air fresheners: for people who are like, 'Cover a smell instead of cleaning it? Yes, I'm OK with that.' - Erin Whitehead @girlwithatail",
            "I used to date a hoarder, and she broke up with me. That stings extra hard-I'm like the one thing she can get rid of. - Sam Morril",
            "Every novel is a mystery novel if you never finish it. - @meganamram",
            "I can still remember a time when I knew more than my phone. - @clarkekant",
            "One Christmas, my grandfather gave me a box of broken glass. He gave my brother a box of Band-Aids and said, 'You two share.' - Steven Wright"
    };

    public String getJoke() {
        int size;
        size = jokeArray.length;

        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java/363692#363692

        int randomNum = ThreadLocalRandom.current().nextInt(0, size);

        return jokeArray[randomNum];
    }
}
