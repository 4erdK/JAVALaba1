public class Pevec {
    private String Name;
    private String Lastname;
    private double Raiting;
    private double Albumcount;

    @Override
    public String toString() {
        return "Певец : " +
                "Имя '" + Name + '\'' +
                ", Фамилия '" + Lastname + '\'' +
                ", Рэйтинг = " + Raiting +
                ", Количество альбомов = " + Albumcount;
    }

    public String toString1() {
        return "Лучший певец - " + Lastname +
                ", с рейтингом - " + Raiting;
    }

    public String toString2() {
        return "Певец :" +
                "Имя '" + Name + '\'' +
                ", Фамилия '" + Lastname + '\'';
    }

    public String toString3() {
        return "Найден :" +
                "Имя '" + Name + '\'' +
                ", Фамилия '" + Lastname + '\'';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public double get() {
        return Raiting;
    }
    public double getRaiting() {
        return Raiting;
    }

    public void setRaiting(double raiting) {
        Raiting = raiting;
    }

    public double getAlbumcount() {
        return Albumcount;
    }

    public void setAlbumcount(double albumcount) {
        Albumcount = albumcount;
    }

    public Pevec() {};
    public Pevec(String Name, String Lastname, double Raiting, double Albumcount)
    {   this.Name = Name;
        this.Lastname = Lastname;
        this.Raiting = Raiting;
        this.Albumcount = Albumcount;
    }
}
