package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: LocalizedSuggestionType
 */
@Entity(name = "EmberFlexberryDummyLocalizedSuggestionType")
@Table(schema = "public", name = "LocalizedSuggestionType")
public class LocalizedSuggestionType {

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

    @Column(name = "Name")
    private String name;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Localization")
    @Convert("Localization")
    @Column(name = "Localization", length = 16, unique = true, nullable = false)
    private UUID _localizationid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Localization", insertable = false, updatable = false)
    private Localization localization;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SuggestionType")
    @Convert("SuggestionType")
    @Column(name = "SuggestionType", length = 16, unique = true, nullable = false)
    private UUID _suggestiontypeid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SuggestionType", insertable = false, updatable = false)
    private SuggestionType suggestiontype;


    public LocalizedSuggestionType() {
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

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }


}