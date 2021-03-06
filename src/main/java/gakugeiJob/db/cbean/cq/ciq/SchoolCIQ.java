package gakugeiJob.db.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import gakugeiJob.db.cbean.*;
import gakugeiJob.db.cbean.cq.bs.*;
import gakugeiJob.db.cbean.cq.*;

/**
 * The condition-query for in-line of school.
 * @author DBFlute(AutoGenerator)
 */
public class SchoolCIQ extends AbstractBsSchoolCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSchoolCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SchoolCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSchoolCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueSchoolId() { return _myCQ.getSchoolId(); }
    public String keepSchoolId_ExistsReferrer_SchoolOfferList(SchoolOfferCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSchoolId_NotExistsReferrer_SchoolOfferList(SchoolOfferCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSchoolId_InScopeRelation_SchoolOfferList(SchoolOfferCQ sq)
    { return _myCQ.keepSchoolId_InScopeRelation_SchoolOfferList(sq); }
    public String keepSchoolId_NotInScopeRelation_SchoolOfferList(SchoolOfferCQ sq)
    { return _myCQ.keepSchoolId_NotInScopeRelation_SchoolOfferList(sq); }
    public String keepSchoolId_SpecifyDerivedReferrer_SchoolOfferList(SchoolOfferCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSchoolId_QueryDerivedReferrer_SchoolOfferList(SchoolOfferCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSchoolId_QueryDerivedReferrer_SchoolOfferListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueUserId() { return _myCQ.getUserId(); }
    public String keepUserId_InScopeRelation_Login(LoginCQ sq)
    { return _myCQ.keepUserId_InScopeRelation_Login(sq); }
    public String keepUserId_NotInScopeRelation_Login(LoginCQ sq)
    { return _myCQ.keepUserId_NotInScopeRelation_Login(sq); }
    protected ConditionValue getCValueName() { return _myCQ.getName(); }
    protected ConditionValue getCValueKinds() { return _myCQ.getKinds(); }
    protected ConditionValue getCValuePhoneNumber() { return _myCQ.getPhoneNumber(); }
    protected ConditionValue getCValueMailAddress() { return _myCQ.getMailAddress(); }
    protected ConditionValue getCValueUrl() { return _myCQ.getUrl(); }
    protected ConditionValue getCValueOneThing() { return _myCQ.getOneThing(); }
    public String keepScalarCondition(SchoolCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SchoolCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SchoolCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SchoolCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(SchoolCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SchoolCB.class.getName(); }
    protected String xinCQ() { return SchoolCQ.class.getName(); }
}
