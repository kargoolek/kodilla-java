package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsPublished;

    public ForumUser(final int ID, final String name, final char sex, final LocalDate birthDate, final int postsPublished) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsPublished = postsPublished;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsPublished() {
        return postsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsPublished=" + postsPublished +
                '}';
    }
}
