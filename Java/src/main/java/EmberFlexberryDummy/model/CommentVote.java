package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: CommentVote
 */
@Entity(name = "EmberFlexberryDummyCommentVote")
@Table(schema = "public", name = "CommentVote")
public class CommentVote {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "CreateTime")
    private Timestamp createTime;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "EditTime")
    private Timestamp editTime;

    @Column(name = "Editor")
    private String editor;

    @Column(name = "VoteType")
    private String votetype;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "ApplicationUser")
    @Convert("ApplicationUser")
    @Column(name = "ApplicationUser", length = 16, unique = true, nullable = false)
    private UUID _applicationuserid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ApplicationUser", insertable = false, updatable = false)
    private ApplicationUser applicationuser;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Comment")
    @Convert("Comment")
    @Column(name = "Comment", length = 16, unique = true, nullable = false)
    private UUID _commentid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Comment", insertable = false, updatable = false)
    private Comment comment;


    public CommentVote() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Timestamp getCreateTime() {
      return createTime;
    }

    public void setCreateTime(Timestamp createtime) {
      this.createTime = createtime;
    }

    public String getCreator() {
      return creator;
    }

    public void setCreator(String creator) {
      this.creator = creator;
    }

    public Timestamp getEditTime() {
      return editTime;
    }

    public void setEditTime(Timestamp edittime) {
      this.editTime = edittime;
    }

    public String getEditor() {
      return editor;
    }

    public void setEditor(String editor) {
      this.editor = editor;
    }

    public String getVoteType() {
      return votetype;
    }

    public void setVoteType(String votetype) {
      this.votetype = votetype;
    }


}