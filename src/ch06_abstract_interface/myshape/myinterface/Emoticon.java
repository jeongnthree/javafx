package ch06_abstract_interface.myshape.myinterface;

public enum Emoticon {
    LIKES("좋아요."), HATES("싫어요."), ANGRY("화나요."), SAD("슬퍼요");

    private String comment ;

    Emoticon(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
