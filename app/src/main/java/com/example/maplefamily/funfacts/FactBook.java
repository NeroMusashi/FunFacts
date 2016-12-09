package com.example.maplefamily.funfacts;


import java.util.Random;

public class FactBook {

    String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "When a Google employee dies, their spouses receive half pay " +
                    "from the company for 10 years and their children US$1,000 per month until they turn 19.",
            "Google intends to scan all known existing 129 million unique books before 2020.",
            "The \"I'm feeling lucky\" button costs Google US$110 million per year, as it bypasses all ads.\n" +
                    "SOURCE♺ SHARE❤ FAV\n",
            "Firefox web browser's lead developer is now working for Google Chrome.",
            "Google got its name by accident. The founders misspelled \"googol\", which refers to the number 1 followed by 100 zeroes.",
            "Google Maps calculates traffic by tracking how fast Android devices are moving on the road.",
            "The Android operating system was developed by Android Inc., in 2004 backed by Google. Later Google bought it in " +
                    "2005 at a price of $50 million. - ",
            "Google launched Android operating system in November 5, 2007, which is a Linux based software " +
                    "system.",
            "Human with a robot appearance is the meaning of the word Android.  It refers to a male robot.  Gynoid is " +
                    "the female looking robot. - ",
            "Android is Andy Rubin who is the co-creator of Android, it was the name given to him at Apple before joining Google, for his " +
                    "obsession and love for robots.",
            "Now Android is used to power devices like Google Glass, Watches and so on."
    };

    public String getFacts() {

        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
