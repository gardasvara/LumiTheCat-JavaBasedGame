import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Thankyou extends MyWorld
{
    /**
     * Constructor for objects of class Thankyou.
     */
    public Thankyou()
    {
        // Hanya menampilkan gambar terima kasih
        GreenfootImage thankYouImage = new GreenfootImage("thankyou.png");
        getBackground().drawImage(thankYouImage, (getWidth() - thankYouImage.getWidth()) / 2, (getHeight() - thankYouImage.getHeight()) / 2);
    }

    /**
     * Constructor for objects of class Thankyou.
     */
    public void act()
    {
        // Tidak ada tindakan khusus yang ditetapkan untuk objek ini
    }
}
