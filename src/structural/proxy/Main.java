package structural.proxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader proxyVideoDownloader = new CachedVideoDownloader();

        proxyVideoDownloader.downloadVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        proxyVideoDownloader.downloadVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        proxyVideoDownloader.downloadVideo("https://www.youtube.com/watch?v=CBOO8SMr1t8");
    }
}
