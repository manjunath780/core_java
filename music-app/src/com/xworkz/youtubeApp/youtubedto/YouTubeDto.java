package com.xworkz.youtubeApp.youtubedto;

import com.xworkz.youtubeApp.Constants.Subcribtion;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class YouTubeDto {
    private String name;
    private String email;
    private long phnNo;
    private String password;
    private Subcribtion subcribtion;
}