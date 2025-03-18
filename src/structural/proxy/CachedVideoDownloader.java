package structural.proxy;

import java.util.HashMap;
import java.util.Map;

class CachedVideoDownloader implements VideoDownloader {
    private final RealVideoDownloader realVideoDownloader;
    private final Map<String, String> videoCache;

    public CachedVideoDownloader() {
        this.realVideoDownloader =  new RealVideoDownloader();
        this.videoCache = new HashMap<>();
    }

    @Override
    public void downloadVideo(String downloadURL) {
        if(videoCache.containsKey(downloadURL)) {
            System.out.println("Returned cached video: " + downloadURL);
        } else {
            realVideoDownloader.downloadVideo(downloadURL);
            videoCache.put(downloadURL, "Cached video from: " + downloadURL);
        }
    }
}
