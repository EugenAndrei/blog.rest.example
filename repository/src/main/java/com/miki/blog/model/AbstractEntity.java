package com.miki.blog.model;

import org.springframework.data.annotation.Id;

import java.math.BigInteger;

/**
 * Created by mcsere on 7/8/2015.
 */
public abstract class AbstractEntity {

    @Id
    private String id;

    /**
     * Returns the identifier of the document.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (this.id == null || obj == null || !(this.getClass().equals(obj.getClass()))) {
            return false;
        }

        AbstractEntity that = (AbstractEntity) obj;

        return this.id.equals(that.getId());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}
