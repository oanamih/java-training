package code._4_student_effort;
public class EnumStars {
    Stars star;

    EnumStars() {

    }

    EnumStars(Stars star) {
        this.star = star;
    }

    public String getStars() {
        switch (star) {
            case one:
                return "*";
            case two:
                return "**";
            case three:
                return "***";
            case four:
                return "****";
            case five:
                return "*****";
        }
        return null;
    }
}
