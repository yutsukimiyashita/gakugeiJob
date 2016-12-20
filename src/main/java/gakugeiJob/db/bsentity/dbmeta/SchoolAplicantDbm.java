package gakugeiJob.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import gakugeiJob.db.allcommon.*;
import gakugeiJob.db.exentity.*;

/**
 * The DB meta of school_aplicant. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SchoolAplicantDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SchoolAplicantDbm _instance = new SchoolAplicantDbm();
    private SchoolAplicantDbm() {}
    public static SchoolAplicantDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSchoolOfferId(), "schoolOfferId");
        setupEpg(_epgMap, new EpgStudentId(), "studentId");
        setupEpg(_epgMap, new EpgTitle(), "title");
        setupEpg(_epgMap, new EpgContent(), "content");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSchoolOfferId implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolAplicant)e).getSchoolOfferId(); }
        public void write(Entity e, Object v) { ((SchoolAplicant)e).setSchoolOfferId(cti(v)); }
    }
    public static class EpgStudentId implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolAplicant)e).getStudentId(); }
        public void write(Entity e, Object v) { ((SchoolAplicant)e).setStudentId(cti(v)); }
    }
    public static class EpgTitle implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolAplicant)e).getTitle(); }
        public void write(Entity e, Object v) { ((SchoolAplicant)e).setTitle((String)v); }
    }
    public static class EpgContent implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolAplicant)e).getContent(); }
        public void write(Entity e, Object v) { ((SchoolAplicant)e).setContent((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "school_aplicant";
    protected final String _tablePropertyName = "schoolAplicant";
    protected final TableSqlName _tableSqlName = new TableSqlName("school_aplicant", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSchoolOfferId = cci("school_offer_id", "school_offer_id", null, null, true, "schoolOfferId", Integer.class, true, false, "INT UNSIGNED", 10, 0, null, false, null, null, "schoolOffer", null, null);
    protected final ColumnInfo _columnStudentId = cci("student_id", "student_id", null, null, true, "studentId", Integer.class, true, false, "INT UNSIGNED", 10, 0, null, false, null, null, "student", null, null);
    protected final ColumnInfo _columnTitle = cci("title", "title", null, null, false, "title", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnContent = cci("content", "content", null, null, false, "content", String.class, false, false, "VARCHAR", 400, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSchoolOfferId() { return _columnSchoolOfferId; }
    public ColumnInfo columnStudentId() { return _columnStudentId; }
    public ColumnInfo columnTitle() { return _columnTitle; }
    public ColumnInfo columnContent() { return _columnContent; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSchoolOfferId());
        ls.add(columnStudentId());
        ls.add(columnTitle());
        ls.add(columnContent());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSchoolOfferId());
        ls.add(columnStudentId());
        return cpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignSchoolOffer() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSchoolOfferId(), SchoolOfferDbm.getInstance().columnSchoolOfferId());
        return cfi("school_aplicant_ibfk_1", "schoolOffer", this, SchoolOfferDbm.getInstance(), map, 0, false, false, false, false, null, false, "schoolAplicantList");
    }
    public ForeignInfo foreignStudent() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStudentId(), StudentDbm.getInstance().columnStudentId());
        return cfi("school_aplicant_ibfk_2", "student", this, StudentDbm.getInstance(), map, 1, false, false, false, false, null, false, "schoolAplicantList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.SchoolAplicant"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.SchoolAplicantCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.SchoolAplicantDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.SchoolAplicantBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SchoolAplicant> getEntityType() { return SchoolAplicant.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SchoolAplicant newMyEntity() { return new SchoolAplicant(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SchoolAplicant)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SchoolAplicant)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
