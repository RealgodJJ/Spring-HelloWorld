package autowiring;

public class AutoWiringService {
    private AutoWiringDao autoWiringDao;

    public AutoWiringService(AutoWiringDao autoWiringDao) {
        System.out.println("AutoWiringService");
        this.autoWiringDao = autoWiringDao;
    }

    public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
        this.autoWiringDao = autoWiringDao;
    }

    public void say(String word) {
        this.autoWiringDao.say(word);
    }
}
