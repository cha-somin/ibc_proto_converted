// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/proposal.proto

package com.crescent.lpfarm.v1beta1;

public interface FarmingPlanProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.lpfarm.v1beta1.FarmingPlanProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .crescent.lpfarm.v1beta1.CreatePlanRequest create_plan_requests = 3 [json_name = "createPlanRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.crescent.lpfarm.v1beta1.CreatePlanRequest> 
      getCreatePlanRequestsList();
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.CreatePlanRequest create_plan_requests = 3 [json_name = "createPlanRequests", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.lpfarm.v1beta1.CreatePlanRequest getCreatePlanRequests(int index);
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.CreatePlanRequest create_plan_requests = 3 [json_name = "createPlanRequests", (.gogoproto.nullable) = false];</code>
   */
  int getCreatePlanRequestsCount();
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.CreatePlanRequest create_plan_requests = 3 [json_name = "createPlanRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.crescent.lpfarm.v1beta1.CreatePlanRequestOrBuilder> 
      getCreatePlanRequestsOrBuilderList();
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.CreatePlanRequest create_plan_requests = 3 [json_name = "createPlanRequests", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.lpfarm.v1beta1.CreatePlanRequestOrBuilder getCreatePlanRequestsOrBuilder(
      int index);

  /**
   * <code>repeated .crescent.lpfarm.v1beta1.TerminatePlanRequest terminate_plan_requests = 4 [json_name = "terminatePlanRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.crescent.lpfarm.v1beta1.TerminatePlanRequest> 
      getTerminatePlanRequestsList();
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.TerminatePlanRequest terminate_plan_requests = 4 [json_name = "terminatePlanRequests", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.lpfarm.v1beta1.TerminatePlanRequest getTerminatePlanRequests(int index);
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.TerminatePlanRequest terminate_plan_requests = 4 [json_name = "terminatePlanRequests", (.gogoproto.nullable) = false];</code>
   */
  int getTerminatePlanRequestsCount();
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.TerminatePlanRequest terminate_plan_requests = 4 [json_name = "terminatePlanRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.crescent.lpfarm.v1beta1.TerminatePlanRequestOrBuilder> 
      getTerminatePlanRequestsOrBuilderList();
  /**
   * <code>repeated .crescent.lpfarm.v1beta1.TerminatePlanRequest terminate_plan_requests = 4 [json_name = "terminatePlanRequests", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.lpfarm.v1beta1.TerminatePlanRequestOrBuilder getTerminatePlanRequestsOrBuilder(
      int index);
}
