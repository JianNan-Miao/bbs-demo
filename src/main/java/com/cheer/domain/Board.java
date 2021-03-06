package com.cheer.domain;

import java.io.Serializable;

public class Board implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column board.boardid
     *
     * @mbg.generated
     */
    private Integer boardid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column board.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column board.blogid
     *
     * @mbg.generated
     */
    private Integer blogid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column board.msg
     *
     * @mbg.generated
     */
    private String msg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column board.boardtime
     *
     * @mbg.generated
     */
    private String boardtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column board.useravatar
     *
     * @mbg.generated
     */
    private String useravatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table board
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column board.boardid
     *
     * @return the value of board.boardid
     *
     * @mbg.generated
     */
    public Integer getBoardid() {
        return boardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column board.boardid
     *
     * @param boardid the value for board.boardid
     *
     * @mbg.generated
     */
    public void setBoardid(Integer boardid) {
        this.boardid = boardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column board.username
     *
     * @return the value of board.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column board.username
     *
     * @param username the value for board.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column board.blogid
     *
     * @return the value of board.blogid
     *
     * @mbg.generated
     */
    public Integer getBlogid() {
        return blogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column board.blogid
     *
     * @param blogid the value for board.blogid
     *
     * @mbg.generated
     */
    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column board.msg
     *
     * @return the value of board.msg
     *
     * @mbg.generated
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column board.msg
     *
     * @param msg the value for board.msg
     *
     * @mbg.generated
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column board.boardtime
     *
     * @return the value of board.boardtime
     *
     * @mbg.generated
     */
    public String getBoardtime() {
        return boardtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column board.boardtime
     *
     * @param boardtime the value for board.boardtime
     *
     * @mbg.generated
     */
    public void setBoardtime(String boardtime) {
        this.boardtime = boardtime == null ? null : boardtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column board.useravatar
     *
     * @return the value of board.useravatar
     *
     * @mbg.generated
     */
    public String getUseravatar() {
        return useravatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column board.useravatar
     *
     * @param useravatar the value for board.useravatar
     *
     * @mbg.generated
     */
    public void setUseravatar(String useravatar) {
        this.useravatar = useravatar == null ? null : useravatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table board
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Board other = (Board) that;
        return (this.getBoardid() == null ? other.getBoardid() == null : this.getBoardid().equals(other.getBoardid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getBlogid() == null ? other.getBlogid() == null : this.getBlogid().equals(other.getBlogid()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()))
            && (this.getBoardtime() == null ? other.getBoardtime() == null : this.getBoardtime().equals(other.getBoardtime()))
            && (this.getUseravatar() == null ? other.getUseravatar() == null : this.getUseravatar().equals(other.getUseravatar()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table board
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBoardid() == null) ? 0 : getBoardid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getBlogid() == null) ? 0 : getBlogid().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        result = prime * result + ((getBoardtime() == null) ? 0 : getBoardtime().hashCode());
        result = prime * result + ((getUseravatar() == null) ? 0 : getUseravatar().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table board
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", boardid=").append(boardid);
        sb.append(", username=").append(username);
        sb.append(", blogid=").append(blogid);
        sb.append(", msg=").append(msg);
        sb.append(", boardtime=").append(boardtime);
        sb.append(", useravatar=").append(useravatar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}