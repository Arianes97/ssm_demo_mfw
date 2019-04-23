package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * note
 * @author 
 */
public class Note implements Serializable {
    private Integer noteId;

    private Integer custId;

    private String noteTitle;

    private String noteHeadImg;

    private Date noteCreateTime;

    private Date noteUpdateTime;

    private String noteCountry;

    private String noteCity;

    private String noteArea;

    private Integer noteType;

    private Integer noteCharCount;

    private Integer noteImgCount;

    private Date noteTripDate;

    private Integer notePeopleCount;

    private Integer noteTripFeePerPeople;

    private Integer noteTripDays;

    private Integer noteTripPartner;

    private Integer noteReadCount;

    private Integer noteCollectCount;

    private Integer noteLikeCount;

    private Integer noteCommentCount;

    private String noteSearchKeyword;

    private Integer noteStatus;

    private String others1;

    private String othsrs2;

    private String noteContent;

    private static final long serialVersionUID = 1L;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteHeadImg() {
        return noteHeadImg;
    }

    public void setNoteHeadImg(String noteHeadImg) {
        this.noteHeadImg = noteHeadImg;
    }

    public Date getNoteCreateTime() {
        return noteCreateTime;
    }

    public void setNoteCreateTime(Date noteCreateTime) {
        this.noteCreateTime = noteCreateTime;
    }

    public Date getNoteUpdateTime() {
        return noteUpdateTime;
    }

    public void setNoteUpdateTime(Date noteUpdateTime) {
        this.noteUpdateTime = noteUpdateTime;
    }

    public String getNoteCountry() {
        return noteCountry;
    }

    public void setNoteCountry(String noteCountry) {
        this.noteCountry = noteCountry;
    }

    public String getNoteCity() {
        return noteCity;
    }

    public void setNoteCity(String noteCity) {
        this.noteCity = noteCity;
    }

    public String getNoteArea() {
        return noteArea;
    }

    public void setNoteArea(String noteArea) {
        this.noteArea = noteArea;
    }

    public Integer getNoteType() {
        return noteType;
    }

    public void setNoteType(Integer noteType) {
        this.noteType = noteType;
    }

    public Integer getNoteCharCount() {
        return noteCharCount;
    }

    public void setNoteCharCount(Integer noteCharCount) {
        this.noteCharCount = noteCharCount;
    }

    public Integer getNoteImgCount() {
        return noteImgCount;
    }

    public void setNoteImgCount(Integer noteImgCount) {
        this.noteImgCount = noteImgCount;
    }

    public Date getNoteTripDate() {
        return noteTripDate;
    }

    public void setNoteTripDate(Date noteTripDate) {
        this.noteTripDate = noteTripDate;
    }

    public Integer getNotePeopleCount() {
        return notePeopleCount;
    }

    public void setNotePeopleCount(Integer notePeopleCount) {
        this.notePeopleCount = notePeopleCount;
    }

    public Integer getNoteTripFeePerPeople() {
        return noteTripFeePerPeople;
    }

    public void setNoteTripFeePerPeople(Integer noteTripFeePerPeople) {
        this.noteTripFeePerPeople = noteTripFeePerPeople;
    }

    public Integer getNoteTripDays() {
        return noteTripDays;
    }

    public void setNoteTripDays(Integer noteTripDays) {
        this.noteTripDays = noteTripDays;
    }

    public Integer getNoteTripPartner() {
        return noteTripPartner;
    }

    public void setNoteTripPartner(Integer noteTripPartner) {
        this.noteTripPartner = noteTripPartner;
    }

    public Integer getNoteReadCount() {
        return noteReadCount;
    }

    public void setNoteReadCount(Integer noteReadCount) {
        this.noteReadCount = noteReadCount;
    }

    public Integer getNoteCollectCount() {
        return noteCollectCount;
    }

    public void setNoteCollectCount(Integer noteCollectCount) {
        this.noteCollectCount = noteCollectCount;
    }

    public Integer getNoteLikeCount() {
        return noteLikeCount;
    }

    public void setNoteLikeCount(Integer noteLikeCount) {
        this.noteLikeCount = noteLikeCount;
    }

    public Integer getNoteCommentCount() {
        return noteCommentCount;
    }

    public void setNoteCommentCount(Integer noteCommentCount) {
        this.noteCommentCount = noteCommentCount;
    }

    public String getNoteSearchKeyword() {
        return noteSearchKeyword;
    }

    public void setNoteSearchKeyword(String noteSearchKeyword) {
        this.noteSearchKeyword = noteSearchKeyword;
    }

    public Integer getNoteStatus() {
        return noteStatus;
    }

    public void setNoteStatus(Integer noteStatus) {
        this.noteStatus = noteStatus;
    }

    public String getOthers1() {
        return others1;
    }

    public void setOthers1(String others1) {
        this.others1 = others1;
    }

    public String getOthsrs2() {
        return othsrs2;
    }

    public void setOthsrs2(String othsrs2) {
        this.othsrs2 = othsrs2;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

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
        Note other = (Note) that;
        return (this.getNoteId() == null ? other.getNoteId() == null : this.getNoteId().equals(other.getNoteId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getNoteTitle() == null ? other.getNoteTitle() == null : this.getNoteTitle().equals(other.getNoteTitle()))
            && (this.getNoteHeadImg() == null ? other.getNoteHeadImg() == null : this.getNoteHeadImg().equals(other.getNoteHeadImg()))
            && (this.getNoteCreateTime() == null ? other.getNoteCreateTime() == null : this.getNoteCreateTime().equals(other.getNoteCreateTime()))
            && (this.getNoteUpdateTime() == null ? other.getNoteUpdateTime() == null : this.getNoteUpdateTime().equals(other.getNoteUpdateTime()))
            && (this.getNoteCountry() == null ? other.getNoteCountry() == null : this.getNoteCountry().equals(other.getNoteCountry()))
            && (this.getNoteCity() == null ? other.getNoteCity() == null : this.getNoteCity().equals(other.getNoteCity()))
            && (this.getNoteArea() == null ? other.getNoteArea() == null : this.getNoteArea().equals(other.getNoteArea()))
            && (this.getNoteType() == null ? other.getNoteType() == null : this.getNoteType().equals(other.getNoteType()))
            && (this.getNoteCharCount() == null ? other.getNoteCharCount() == null : this.getNoteCharCount().equals(other.getNoteCharCount()))
            && (this.getNoteImgCount() == null ? other.getNoteImgCount() == null : this.getNoteImgCount().equals(other.getNoteImgCount()))
            && (this.getNoteTripDate() == null ? other.getNoteTripDate() == null : this.getNoteTripDate().equals(other.getNoteTripDate()))
            && (this.getNotePeopleCount() == null ? other.getNotePeopleCount() == null : this.getNotePeopleCount().equals(other.getNotePeopleCount()))
            && (this.getNoteTripFeePerPeople() == null ? other.getNoteTripFeePerPeople() == null : this.getNoteTripFeePerPeople().equals(other.getNoteTripFeePerPeople()))
            && (this.getNoteTripDays() == null ? other.getNoteTripDays() == null : this.getNoteTripDays().equals(other.getNoteTripDays()))
            && (this.getNoteTripPartner() == null ? other.getNoteTripPartner() == null : this.getNoteTripPartner().equals(other.getNoteTripPartner()))
            && (this.getNoteReadCount() == null ? other.getNoteReadCount() == null : this.getNoteReadCount().equals(other.getNoteReadCount()))
            && (this.getNoteCollectCount() == null ? other.getNoteCollectCount() == null : this.getNoteCollectCount().equals(other.getNoteCollectCount()))
            && (this.getNoteLikeCount() == null ? other.getNoteLikeCount() == null : this.getNoteLikeCount().equals(other.getNoteLikeCount()))
            && (this.getNoteCommentCount() == null ? other.getNoteCommentCount() == null : this.getNoteCommentCount().equals(other.getNoteCommentCount()))
            && (this.getNoteSearchKeyword() == null ? other.getNoteSearchKeyword() == null : this.getNoteSearchKeyword().equals(other.getNoteSearchKeyword()))
            && (this.getNoteStatus() == null ? other.getNoteStatus() == null : this.getNoteStatus().equals(other.getNoteStatus()))
            && (this.getOthers1() == null ? other.getOthers1() == null : this.getOthers1().equals(other.getOthers1()))
            && (this.getOthsrs2() == null ? other.getOthsrs2() == null : this.getOthsrs2().equals(other.getOthsrs2()))
            && (this.getNoteContent() == null ? other.getNoteContent() == null : this.getNoteContent().equals(other.getNoteContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoteId() == null) ? 0 : getNoteId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getNoteTitle() == null) ? 0 : getNoteTitle().hashCode());
        result = prime * result + ((getNoteHeadImg() == null) ? 0 : getNoteHeadImg().hashCode());
        result = prime * result + ((getNoteCreateTime() == null) ? 0 : getNoteCreateTime().hashCode());
        result = prime * result + ((getNoteUpdateTime() == null) ? 0 : getNoteUpdateTime().hashCode());
        result = prime * result + ((getNoteCountry() == null) ? 0 : getNoteCountry().hashCode());
        result = prime * result + ((getNoteCity() == null) ? 0 : getNoteCity().hashCode());
        result = prime * result + ((getNoteArea() == null) ? 0 : getNoteArea().hashCode());
        result = prime * result + ((getNoteType() == null) ? 0 : getNoteType().hashCode());
        result = prime * result + ((getNoteCharCount() == null) ? 0 : getNoteCharCount().hashCode());
        result = prime * result + ((getNoteImgCount() == null) ? 0 : getNoteImgCount().hashCode());
        result = prime * result + ((getNoteTripDate() == null) ? 0 : getNoteTripDate().hashCode());
        result = prime * result + ((getNotePeopleCount() == null) ? 0 : getNotePeopleCount().hashCode());
        result = prime * result + ((getNoteTripFeePerPeople() == null) ? 0 : getNoteTripFeePerPeople().hashCode());
        result = prime * result + ((getNoteTripDays() == null) ? 0 : getNoteTripDays().hashCode());
        result = prime * result + ((getNoteTripPartner() == null) ? 0 : getNoteTripPartner().hashCode());
        result = prime * result + ((getNoteReadCount() == null) ? 0 : getNoteReadCount().hashCode());
        result = prime * result + ((getNoteCollectCount() == null) ? 0 : getNoteCollectCount().hashCode());
        result = prime * result + ((getNoteLikeCount() == null) ? 0 : getNoteLikeCount().hashCode());
        result = prime * result + ((getNoteCommentCount() == null) ? 0 : getNoteCommentCount().hashCode());
        result = prime * result + ((getNoteSearchKeyword() == null) ? 0 : getNoteSearchKeyword().hashCode());
        result = prime * result + ((getNoteStatus() == null) ? 0 : getNoteStatus().hashCode());
        result = prime * result + ((getOthers1() == null) ? 0 : getOthers1().hashCode());
        result = prime * result + ((getOthsrs2() == null) ? 0 : getOthsrs2().hashCode());
        result = prime * result + ((getNoteContent() == null) ? 0 : getNoteContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noteId=").append(noteId);
        sb.append(", custId=").append(custId);
        sb.append(", noteTitle=").append(noteTitle);
        sb.append(", noteHeadImg=").append(noteHeadImg);
        sb.append(", noteCreateTime=").append(noteCreateTime);
        sb.append(", noteUpdateTime=").append(noteUpdateTime);
        sb.append(", noteCountry=").append(noteCountry);
        sb.append(", noteCity=").append(noteCity);
        sb.append(", noteArea=").append(noteArea);
        sb.append(", noteType=").append(noteType);
        sb.append(", noteCharCount=").append(noteCharCount);
        sb.append(", noteImgCount=").append(noteImgCount);
        sb.append(", noteTripDate=").append(noteTripDate);
        sb.append(", notePeopleCount=").append(notePeopleCount);
        sb.append(", noteTripFeePerPeople=").append(noteTripFeePerPeople);
        sb.append(", noteTripDays=").append(noteTripDays);
        sb.append(", noteTripPartner=").append(noteTripPartner);
        sb.append(", noteReadCount=").append(noteReadCount);
        sb.append(", noteCollectCount=").append(noteCollectCount);
        sb.append(", noteLikeCount=").append(noteLikeCount);
        sb.append(", noteCommentCount=").append(noteCommentCount);
        sb.append(", noteSearchKeyword=").append(noteSearchKeyword);
        sb.append(", noteStatus=").append(noteStatus);
        sb.append(", others1=").append(others1);
        sb.append(", othsrs2=").append(othsrs2);
        sb.append(", noteContent=").append(noteContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}