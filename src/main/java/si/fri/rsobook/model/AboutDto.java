package si.fri.rsobook.model;

public class AboutDto {

    public String[] clani;
    public String opis_projekta;
    public String[] mikrostoritve;
    public String[] github;
    public String[] travis;
    public String[] dockerhub;


    public static AboutDto build(){
        AboutDto aboutDto = new AboutDto();

        aboutDto.clani = new String[] {"jg17", "nk4741"};
        aboutDto.opis_projekta = "Rsobook (Facebook), implementacija vsebuje prijatelje, zid in klepetalnice";

        aboutDto.mikrostoritve = new String[] {
                "http://169.51.17.164:31055/api/v1/About",
                "http://169.51.17.164:31055/api/v1/ChatRelay",
                "http://169.51.17.164:31055/api/v1/User",
                "http://169.51.17.164:31055/api/v1/Images",
                "http://169.51.17.164:31055/api/v1/ChatRoom",
                "http://169.51.17.164:31055/api/v1/Ads",
                "http://169.51.17.164:31055/api/v1/Wall",
                "http://169.51.17.164:31055/api/v1/Pet",
                "http://169.51.17.164:31055/api/v1/Friends",
        };

        aboutDto.github = new String[] {
                "https://github.com/rsobook/ms-about",
                "https://github.com/rsobook/ms-chatrelay",
                "https://github.com/rsobook/ms-user",
                "https://github.com/rsobook/ms-images",
                "https://github.com/rsobook/ms-chatroom",
                "https://github.com/rsobook/ms-ads",
                "https://github.com/rsobook/ms-wall",
                "https://github.com/rsobook/ms-pet",
                "https://github.com/rsobook/ms-friends"
        };

        aboutDto.travis = new String[] {
                "https://travis-ci.org/rsobook/ms-about",
                "https://travis-ci.org/rsobook/ms-chatrelay",
                "https://travis-ci.org/rsobook/ms-user",
                "https://travis-ci.org/rsobook/ms-images",
                "https://travis-ci.org/rsobook/ms-chatroom",
                "https://travis-ci.org/rsobook/ms-ads",
                "https://travis-ci.org/rsobook/ms-wall",
                "https://travis-ci.org/rsobook/ms-pet",
                "https://travis-ci.org/rsobook/ms-friends"
        };

        aboutDto.dockerhub = new String[] {
                "https://travis-ci.org/rsobook/ms-about",
                "https://travis-ci.org/rsobook/ms-chatrelay",
                "https://travis-ci.org/rsobook/ms-user",
                "https://travis-ci.org/rsobook/ms-images",
                "https://travis-ci.org/rsobook/ms-chatroom",
                "https://travis-ci.org/rsobook/ms-ads",
                "https://travis-ci.org/rsobook/ms-wall",
                "https://travis-ci.org/rsobook/ms-pet",
                "https://travis-ci.org/rsobook/ms-friends"
        };

        return aboutDto;
    }

}


 /*

    {
        "clani": ["jm1234", "mn3322"],
        "opis_projekta": "Nas projekt implementira aplikacijo za oddajo nepremicnin.",
        "mikrostoritve": ["http://35.189.96.118:8081/v1/orders", "http://35.197.209.159:8080/v1/customers/"],
        "github": ["https://github.com/jmezna/rso-customers", "https://github.com/jmezna/rso-orders"],
        "travis": ["https://travis-ci.org/jmezna/rso-customers", "https://travis-ci.org/jmezna/rso-orders"],
        "dockerhub": ["https://hub.docker.com/r/jmezna/rso-customers/", "https://hub.docker.com/r/jmezna/rso-orders/"]
    }

     */