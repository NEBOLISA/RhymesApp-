package com.hfad.rhymes;

public class RhymeClass {
  private String Title;
  private  String Text;
  private int ImageId;
  private int SongId;
  public static RhymeClass rhymes[]={ new RhymeClass("Old Roger is Dead","Old Roger is dead\n" +
          "And gone to his grave\n" +
                  "They planted an apple tree\n" +
                  "Over his head\n" +
                  "Hm, ha,\n" +
                  "Over his head.\n" +
                  "The apples were ripe\n" +
                  "And ready to drop\n" +
                  "Hm, ha\n" +
                  "Ready to drop\n" +
                  "There came an east wind\n" +
                  "A-blowing them off\n" +
                  "Hm, ha\n" +
                  "A-blowing them off\n" +
                  "There came an old woman\n" +
                  "A-picking them up\n" +
                  "Hm, ha\n" +
                  "A-picking them up\n" +
                  "Old Roger got up\n" +
                  "And gave her a knock\n" +
                  "Hm, ha\n" +
                  "Gave her a knock\n" +
                  "Which made the old woman\n" +
                  "Go hippity-hop\n" +
                  "Hm, ha\n" +
                  "Hippity-hop",R.drawable.old_roger,R.raw.old), new RhymeClass("Twinkle Little Star","Twinkle, twinkle, little star,\n" +
          "How I wonder what you are!\n" +
          "Up above the world so high,\n" +
          "Like a diamond in the sky.\n"+
          "When the blazing sun is gone,\n" +
          "When he nothing shines upon,\n" +
          "Then you show your little light,\n"+
          "Twinkle, twinkle, all the night.\n" +
           "Then the traveler in the dark\n" +
          "Thanks you for your tiny spark,\n" +
          "How could he see where to go,\n" +
          "If you did not twinkle so?\n" +
          "In the dark blue sky you keep,\n" +
          "Often through my curtains peep\n" +
          "For you never shut your eye,\n" +
          "Till the sun is in the sky.\n" +
          "As your bright and tiny spark\n" +
          "Lights the traveler in the dark,\n" +
          "Though I know not what you are,\n" +
          "Twinkle, twinkle, little star,", R.drawable.twinkle_star,R.raw.twinkle),new RhymeClass("Jack and Jill","\n" +
          "Jack and Jill went up the hill\n" +
          "To fetch a pail of water;\n" +
          "Jack fell down and broke his crown,\n" +
          "and Jill came tumbling after.\n" +
          "\n" +
          "Up Jack got, and home did trot,\n" +
          "As fast as he could caper,\n" +
          "To old Dame Dob, who patched his nob\n" +
          "With vinegar and brown paper.\n" +
          "\n",R.drawable.jack_jill,R.raw.jack), new RhymeClass("Mary Had a Little Lamb", "Mary had a little lamb\n" +
          "Little lamb, little lamb\n" +
          "Mary had a little lamb\n" +
          "Its fleece was white as snow\n" +
          "And everywhere that Mary went\n" +
          "Mary went, Mary went\n" +
          "Everywhere that Mary went\n" +
          "The lamb was sure to go\n" +
          "\n" +
          "He followed her to school one day\n" +
          "School one day, school one day\n" +
          "He followed her to school one day\n" +
          "Which was against the rule\n" +
          "It made the children laugh and play\n" +
          "Laugh and play, laugh and play\n" +
          "It made the children laugh and play\n" +
          "To see a lamb at school\n" +
          "\n" +
          "And so the teacher turned him out\n" +
          "Turned him out, turned him out\n" +
          "And so the teacher turned him out\n" +
          "But still he lingered near\n" +
          "And waited patiently\n" +
          "Patiently, patiently\n" +
          "And wai-aited patiently\n" +
          "Til Mary did appear\n" +
          "\n" +
          "Mary had a little lamb\n" +
          "Little lamb, little lamb\n" +
          "Mary had a little lamb\n" +
          "Its fleece was white as snow\n" +
          "And everywhere that Mary went\n" +
          "Mary went, Mary went\n" +
          "Everywhere that Mary went\n" +
          "The lamb was sure to go ",R.drawable.mary_lamb,R.raw.mary), new RhymeClass("Row Row Your Boat","Row, row, row your boat\n" +
          "Gently down the stream\n" +
          "Merrily, merrily, merrily, merrily\n" +
          "Life is but a dream\n" +
          "\n" +
          "Row, row, row your boat\n" +
          "Gently down the stream\n" +
          "Merrily, merrily, merrily, merrily\n" +
          "Life is but a dream\n" +
          "Sing as a round ",R.drawable.row_boat,R.raw.row),new RhymeClass("One, Two Buckle My shoe","One, two,\n" +
          "Buckle my shoe;\n" +
          "Three, four,\n" +
          "Knock at the door;\n" +
          "Five, six,\n" +
          "Pick up sticks;\n" +
          "Seven, eight,\n" +
          "Lay them straight:\n" +
          "Nine, ten,\n" +
          "A big fat hen;\n" +
          "Eleven, twelve,\n" +
          "Dig and delve;\n" +
          "Thirteen, fourteen,\n" +
          "Maids a-courting;\n" +
          "Fifteen, sixteen,\n" +
          "Maids in the kitchen;\n" +
          "Seventeen, eighteen,\n" +
          "Maids a-waiting\n" +
          "Nineteen, twenty,\n" +
          "My plate’s empty",R.drawable.buckle_shoe,R.raw.one),new RhymeClass("Baa, Baa Black Sheep","\n" +
          "Baa, baa, black sheep\n" +
          "Have you any wool?\n" +
          "Yes sir, yes sir, three bags full.\n" +
          "One for the master,\n" +
          "And one for the dame,\n" +
          "And one for the little boy\n" +
          "Who lives down the lane.\n" +
          "\n",R.drawable.baa_black,R.raw.baa ) };
public RhymeClass(String Title, String Text, int ImageId, int SongId){
  this.SongId=SongId;
  this.Title=Title;
  this.Text=Text;
  this.ImageId=ImageId;
}
public String getTitle(){
 return Title;
}
public String getText(){
  return Text;
}
public int getImageId(){
  return ImageId;
}
public int getSongId(){return SongId;}
}
