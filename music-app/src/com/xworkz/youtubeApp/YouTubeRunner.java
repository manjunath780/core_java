package com.xworkz.youtubeApp;

import com.xworkz.youtubeApp.Constants.Subcribtion;
import com.xworkz.youtubeApp.youtube.YouTube;
import com.xworkz.youtubeApp.youtubedto.YouTubeDto;

public class YouTubeRunner {
    public static void main(String arg[]){

        YouTubeDto youTubeDto = new YouTubeDto();
        youTubeDto.setEmail("baba@gmail");
        youTubeDto.setName("baba");
        youTubeDto.setPhnNo(9998887770l);
        youTubeDto.setSubcribtion(Subcribtion.monthly);
        youTubeDto.setPassword("bbbhdy675");

        YouTube youTube = new YouTube();
        if(youTube.User(youTubeDto)){
            System.out.println("successfully created");
        }
        else
            System.out.println("unsuccesfull creted");
    }
}
