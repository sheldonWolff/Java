import java.util.Set;
import java.util.HashMap;
public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Wardrobe monsters", "Cold sweats creeping My paralysed body My heart keeps beating Its in the dark that I see him I shake I swear Theres something over there Inside the dark But no one ever cares to look Or maybe it was in my head My head It was in my head My head Just stopped breathing As her hands wrapped around my neck As I claw at the ceiling I never even thought to check I shake I swear Theres something over there Inside the dark But no one ever cares to look Or maybe it was in my head My head It was in my head My head In the corner of my eye Childish imagination They never told is that they'd leave us with the pieces In the corner of my eye We'll wait till things get better They never told us that we have to put it back together Or maybe it was in our heads Our heads It was in our heads Our heads It was in our heads Our heads It was In our heads Our heads");
        trackList.put("Am I Wrong", "Am I wrong for thinking out the box from where I stay? Am I wrong for saying that I'll choose another way? I ain't trying to do what everybody else doing Just cause everybody doing what they all do If one thing I know, how far would I grow? I'm walking down this road of mine, this road that I call home So am I wrong for thinking that we could be something for real? Now am I wrong for trying to reach the things that I can't see? But that's just how I feel, that's just how I feel That's just how I feel trying to reach the things that I can't see Am I tripping for having a vision? My prediction; I'mma be on the top of the world Hope you, hope you don't look back, always do what you decide Don't let them control your life, that's just how I feel Fight for yours and don't let go, don't let them compare you, no Don't worry, you're not alone, that's just how we feel So am I wrong for thinking that we could be something for real? Now am I wrong for trying to reach the things that I can't see? But that's just how I feel, that's just how I feel That's just how I feel trying to reach the things that I can't see If you tell me I'm wrong, wrong I don't wanna be right, right If you tell me I'm wrong, wrong I don't wanna be right If you tell me I'm wrong, wrong I don't wanna be right, right If you tell me I'm wrong, wrong I don't wanna be right So am I wrong for thinking that we could be something for real? Now am I wrong for trying to reach the things that I can't see? But that's just how I feel, that's just how I feel That's just how I feel trying to reach the things that I can't see That's just how I feel That's just how I feel That's just how I feel trying to reach the things that I can't see");
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.printf(key);
            System.out.printf(" : ");
            System.out.println(trackList.get(key));
            System.out.printf(" \n "); 
        }
    }
}

