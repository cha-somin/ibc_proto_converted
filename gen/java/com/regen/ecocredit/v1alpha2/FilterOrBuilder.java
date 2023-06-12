// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/types.proto

package com.regen.ecocredit.v1alpha2;

public interface FilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.ecocredit.v1alpha2.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * and specifies a list of filters where all conditions should be satisfied.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.And and = 1 [json_name = "and"];</code>
   * @return Whether the and field is set.
   */
  boolean hasAnd();
  /**
   * <pre>
   * and specifies a list of filters where all conditions should be satisfied.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.And and = 1 [json_name = "and"];</code>
   * @return The and.
   */
  com.regen.ecocredit.v1alpha2.Filter.And getAnd();
  /**
   * <pre>
   * and specifies a list of filters where all conditions should be satisfied.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.And and = 1 [json_name = "and"];</code>
   */
  com.regen.ecocredit.v1alpha2.Filter.AndOrBuilder getAndOrBuilder();

  /**
   * <pre>
   * or specifies a list of filters where at least one of the conditions should be satisfied.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.Or or = 2 [json_name = "or"];</code>
   * @return Whether the or field is set.
   */
  boolean hasOr();
  /**
   * <pre>
   * or specifies a list of filters where at least one of the conditions should be satisfied.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.Or or = 2 [json_name = "or"];</code>
   * @return The or.
   */
  com.regen.ecocredit.v1alpha2.Filter.Or getOr();
  /**
   * <pre>
   * or specifies a list of filters where at least one of the conditions should be satisfied.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.Or or = 2 [json_name = "or"];</code>
   */
  com.regen.ecocredit.v1alpha2.Filter.OrOrBuilder getOrOrBuilder();

  /**
   * <pre>
   * credit_type_name filters against credits from this credit type name.
   * </pre>
   *
   * <code>string credit_type_name = 3 [json_name = "creditTypeName"];</code>
   * @return Whether the creditTypeName field is set.
   */
  boolean hasCreditTypeName();
  /**
   * <pre>
   * credit_type_name filters against credits from this credit type name.
   * </pre>
   *
   * <code>string credit_type_name = 3 [json_name = "creditTypeName"];</code>
   * @return The creditTypeName.
   */
  java.lang.String getCreditTypeName();
  /**
   * <pre>
   * credit_type_name filters against credits from this credit type name.
   * </pre>
   *
   * <code>string credit_type_name = 3 [json_name = "creditTypeName"];</code>
   * @return The bytes for creditTypeName.
   */
  com.google.protobuf.ByteString
      getCreditTypeNameBytes();

  /**
   * <pre>
   * class_id filters against credits from this credit class id.
   * </pre>
   *
   * <code>string class_id = 4 [json_name = "classId"];</code>
   * @return Whether the classId field is set.
   */
  boolean hasClassId();
  /**
   * <pre>
   * class_id filters against credits from this credit class id.
   * </pre>
   *
   * <code>string class_id = 4 [json_name = "classId"];</code>
   * @return The classId.
   */
  java.lang.String getClassId();
  /**
   * <pre>
   * class_id filters against credits from this credit class id.
   * </pre>
   *
   * <code>string class_id = 4 [json_name = "classId"];</code>
   * @return The bytes for classId.
   */
  com.google.protobuf.ByteString
      getClassIdBytes();

  /**
   * <pre>
   * project_id filters against credits from this project.
   * </pre>
   *
   * <code>string project_id = 5 [json_name = "projectId"];</code>
   * @return Whether the projectId field is set.
   */
  boolean hasProjectId();
  /**
   * <pre>
   * project_id filters against credits from this project.
   * </pre>
   *
   * <code>string project_id = 5 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * project_id filters against credits from this project.
   * </pre>
   *
   * <code>string project_id = 5 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * batch_denom filters against credits from this batch.
   * </pre>
   *
   * <code>string batch_denom = 6 [json_name = "batchDenom"];</code>
   * @return Whether the batchDenom field is set.
   */
  boolean hasBatchDenom();
  /**
   * <pre>
   * batch_denom filters against credits from this batch.
   * </pre>
   *
   * <code>string batch_denom = 6 [json_name = "batchDenom"];</code>
   * @return The batchDenom.
   */
  java.lang.String getBatchDenom();
  /**
   * <pre>
   * batch_denom filters against credits from this batch.
   * </pre>
   *
   * <code>string batch_denom = 6 [json_name = "batchDenom"];</code>
   * @return The bytes for batchDenom.
   */
  com.google.protobuf.ByteString
      getBatchDenomBytes();

  /**
   * <pre>
   * class_admin filters against credits issued by this class admin.
   * </pre>
   *
   * <code>string class_admin = 7 [json_name = "classAdmin"];</code>
   * @return Whether the classAdmin field is set.
   */
  boolean hasClassAdmin();
  /**
   * <pre>
   * class_admin filters against credits issued by this class admin.
   * </pre>
   *
   * <code>string class_admin = 7 [json_name = "classAdmin"];</code>
   * @return The classAdmin.
   */
  java.lang.String getClassAdmin();
  /**
   * <pre>
   * class_admin filters against credits issued by this class admin.
   * </pre>
   *
   * <code>string class_admin = 7 [json_name = "classAdmin"];</code>
   * @return The bytes for classAdmin.
   */
  com.google.protobuf.ByteString
      getClassAdminBytes();

  /**
   * <pre>
   * issuer filters against credits issued by this issuer address.
   * </pre>
   *
   * <code>string issuer = 8 [json_name = "issuer"];</code>
   * @return Whether the issuer field is set.
   */
  boolean hasIssuer();
  /**
   * <pre>
   * issuer filters against credits issued by this issuer address.
   * </pre>
   *
   * <code>string issuer = 8 [json_name = "issuer"];</code>
   * @return The issuer.
   */
  java.lang.String getIssuer();
  /**
   * <pre>
   * issuer filters against credits issued by this issuer address.
   * </pre>
   *
   * <code>string issuer = 8 [json_name = "issuer"];</code>
   * @return The bytes for issuer.
   */
  com.google.protobuf.ByteString
      getIssuerBytes();

  /**
   * <pre>
   * owner filters against credits currently owned by this address.
   * </pre>
   *
   * <code>string owner = 9 [json_name = "owner"];</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <pre>
   * owner filters against credits currently owned by this address.
   * </pre>
   *
   * <code>string owner = 9 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * owner filters against credits currently owned by this address.
   * </pre>
   *
   * <code>string owner = 9 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * project_location can be specified in three levels of granularity:
   * country, sub-national-code, or postal code. If just country is given,
   * for instance "US" then any credits in the "US" will be matched even
   * their project location is more specific, ex. "US-NY 12345". If
   * a country, sub-national-code and postal code are all provided then
   * only projects in that postal code will match.
   * </pre>
   *
   * <code>string project_location = 10 [json_name = "projectLocation"];</code>
   * @return Whether the projectLocation field is set.
   */
  boolean hasProjectLocation();
  /**
   * <pre>
   * project_location can be specified in three levels of granularity:
   * country, sub-national-code, or postal code. If just country is given,
   * for instance "US" then any credits in the "US" will be matched even
   * their project location is more specific, ex. "US-NY 12345". If
   * a country, sub-national-code and postal code are all provided then
   * only projects in that postal code will match.
   * </pre>
   *
   * <code>string project_location = 10 [json_name = "projectLocation"];</code>
   * @return The projectLocation.
   */
  java.lang.String getProjectLocation();
  /**
   * <pre>
   * project_location can be specified in three levels of granularity:
   * country, sub-national-code, or postal code. If just country is given,
   * for instance "US" then any credits in the "US" will be matched even
   * their project location is more specific, ex. "US-NY 12345". If
   * a country, sub-national-code and postal code are all provided then
   * only projects in that postal code will match.
   * </pre>
   *
   * <code>string project_location = 10 [json_name = "projectLocation"];</code>
   * @return The bytes for projectLocation.
   */
  com.google.protobuf.ByteString
      getProjectLocationBytes();

  /**
   * <pre>
   * date_range filters against credit batch start_date and/or end_date.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.DateRange date_range = 11 [json_name = "dateRange"];</code>
   * @return Whether the dateRange field is set.
   */
  boolean hasDateRange();
  /**
   * <pre>
   * date_range filters against credit batch start_date and/or end_date.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.DateRange date_range = 11 [json_name = "dateRange"];</code>
   * @return The dateRange.
   */
  com.regen.ecocredit.v1alpha2.Filter.DateRange getDateRange();
  /**
   * <pre>
   * date_range filters against credit batch start_date and/or end_date.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter.DateRange date_range = 11 [json_name = "dateRange"];</code>
   */
  com.regen.ecocredit.v1alpha2.Filter.DateRangeOrBuilder getDateRangeOrBuilder();

  /**
   * <pre>
   * tag specifies a curation tag to match against.
   * </pre>
   *
   * <code>string tag = 12 [json_name = "tag"];</code>
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   * <pre>
   * tag specifies a curation tag to match against.
   * </pre>
   *
   * <code>string tag = 12 [json_name = "tag"];</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * tag specifies a curation tag to match against.
   * </pre>
   *
   * <code>string tag = 12 [json_name = "tag"];</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  com.regen.ecocredit.v1alpha2.Filter.SumCase getSumCase();
}
