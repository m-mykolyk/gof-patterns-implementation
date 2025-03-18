package structural.proxy;

class RealVideoDownloader implements VideoDownloader {
    @Override
    public void downloadVideo(String downloadURL) {
        System.out.println("Downloading video from URL: " + downloadURL);
    }
}
