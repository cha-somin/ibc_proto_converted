// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/farming/v1beta1/proposal.proto

package com.crescent.farming.v1beta1;

public interface PublicPlanProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.farming.v1beta1.PublicPlanProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * title specifies the title of the plan
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title specifies the title of the plan
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * description specifies the description of the plan
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description specifies the description of the plan
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * add_plan_requests specifies AddPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.AddPlanRequest add_plan_requests = 3 [json_name = "addPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"add_plan_requests&#92;""];</code>
   */
  java.util.List<com.crescent.farming.v1beta1.AddPlanRequest> 
      getAddPlanRequestsList();
  /**
   * <pre>
   * add_plan_requests specifies AddPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.AddPlanRequest add_plan_requests = 3 [json_name = "addPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"add_plan_requests&#92;""];</code>
   */
  com.crescent.farming.v1beta1.AddPlanRequest getAddPlanRequests(int index);
  /**
   * <pre>
   * add_plan_requests specifies AddPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.AddPlanRequest add_plan_requests = 3 [json_name = "addPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"add_plan_requests&#92;""];</code>
   */
  int getAddPlanRequestsCount();
  /**
   * <pre>
   * add_plan_requests specifies AddPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.AddPlanRequest add_plan_requests = 3 [json_name = "addPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"add_plan_requests&#92;""];</code>
   */
  java.util.List<? extends com.crescent.farming.v1beta1.AddPlanRequestOrBuilder> 
      getAddPlanRequestsOrBuilderList();
  /**
   * <pre>
   * add_plan_requests specifies AddPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.AddPlanRequest add_plan_requests = 3 [json_name = "addPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"add_plan_requests&#92;""];</code>
   */
  com.crescent.farming.v1beta1.AddPlanRequestOrBuilder getAddPlanRequestsOrBuilder(
      int index);

  /**
   * <pre>
   * modify_plan_requests specifies ModifyPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.ModifyPlanRequest modify_plan_requests = 4 [json_name = "modifyPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"modify_plan_requests&#92;""];</code>
   */
  java.util.List<com.crescent.farming.v1beta1.ModifyPlanRequest> 
      getModifyPlanRequestsList();
  /**
   * <pre>
   * modify_plan_requests specifies ModifyPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.ModifyPlanRequest modify_plan_requests = 4 [json_name = "modifyPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"modify_plan_requests&#92;""];</code>
   */
  com.crescent.farming.v1beta1.ModifyPlanRequest getModifyPlanRequests(int index);
  /**
   * <pre>
   * modify_plan_requests specifies ModifyPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.ModifyPlanRequest modify_plan_requests = 4 [json_name = "modifyPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"modify_plan_requests&#92;""];</code>
   */
  int getModifyPlanRequestsCount();
  /**
   * <pre>
   * modify_plan_requests specifies ModifyPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.ModifyPlanRequest modify_plan_requests = 4 [json_name = "modifyPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"modify_plan_requests&#92;""];</code>
   */
  java.util.List<? extends com.crescent.farming.v1beta1.ModifyPlanRequestOrBuilder> 
      getModifyPlanRequestsOrBuilderList();
  /**
   * <pre>
   * modify_plan_requests specifies ModifyPlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.ModifyPlanRequest modify_plan_requests = 4 [json_name = "modifyPlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"modify_plan_requests&#92;""];</code>
   */
  com.crescent.farming.v1beta1.ModifyPlanRequestOrBuilder getModifyPlanRequestsOrBuilder(
      int index);

  /**
   * <pre>
   * delete_plan_requests specifies DeletePlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.DeletePlanRequest delete_plan_requests = 5 [json_name = "deletePlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delete_plan_requests&#92;""];</code>
   */
  java.util.List<com.crescent.farming.v1beta1.DeletePlanRequest> 
      getDeletePlanRequestsList();
  /**
   * <pre>
   * delete_plan_requests specifies DeletePlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.DeletePlanRequest delete_plan_requests = 5 [json_name = "deletePlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delete_plan_requests&#92;""];</code>
   */
  com.crescent.farming.v1beta1.DeletePlanRequest getDeletePlanRequests(int index);
  /**
   * <pre>
   * delete_plan_requests specifies DeletePlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.DeletePlanRequest delete_plan_requests = 5 [json_name = "deletePlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delete_plan_requests&#92;""];</code>
   */
  int getDeletePlanRequestsCount();
  /**
   * <pre>
   * delete_plan_requests specifies DeletePlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.DeletePlanRequest delete_plan_requests = 5 [json_name = "deletePlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delete_plan_requests&#92;""];</code>
   */
  java.util.List<? extends com.crescent.farming.v1beta1.DeletePlanRequestOrBuilder> 
      getDeletePlanRequestsOrBuilderList();
  /**
   * <pre>
   * delete_plan_requests specifies DeletePlanRequest object
   * </pre>
   *
   * <code>repeated .crescent.farming.v1beta1.DeletePlanRequest delete_plan_requests = 5 [json_name = "deletePlanRequests", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delete_plan_requests&#92;""];</code>
   */
  com.crescent.farming.v1beta1.DeletePlanRequestOrBuilder getDeletePlanRequestsOrBuilder(
      int index);
}
