package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Daimhim on 2017/1/17.
 */

public class RefundPictureReponse extends JavaCommonResponse {

    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
