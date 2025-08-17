public class Codec {
      String org;
      String dec;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        this.org = longUrl;
        return dec;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        this.dec = shortUrl;
        return org;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));