// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/orm/query/v1alpha1/query.proto

package com.cosmos.orm.query.v1alpha1;

public interface GetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.orm.query.v1alpha1.GetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * message_name is the fully-qualified message name of the ORM table being queried.
   * </pre>
   *
   * <code>string message_name = 1 [json_name = "messageName"];</code>
   * @return The messageName.
   */
  java.lang.String getMessageName();
  /**
   * <pre>
   * message_name is the fully-qualified message name of the ORM table being queried.
   * </pre>
   *
   * <code>string message_name = 1 [json_name = "messageName"];</code>
   * @return The bytes for messageName.
   */
  com.google.protobuf.ByteString
      getMessageNameBytes();

  /**
   * <pre>
   * index is the index fields expression used in orm definitions. If it
   * is empty, the table's primary key is assumed. If it is non-empty, it must
   * refer to an unique index.
   * </pre>
   *
   * <code>string index = 2 [json_name = "index"];</code>
   * @return The index.
   */
  java.lang.String getIndex();
  /**
   * <pre>
   * index is the index fields expression used in orm definitions. If it
   * is empty, the table's primary key is assumed. If it is non-empty, it must
   * refer to an unique index.
   * </pre>
   *
   * <code>string index = 2 [json_name = "index"];</code>
   * @return The bytes for index.
   */
  com.google.protobuf.ByteString
      getIndexBytes();

  /**
   * <pre>
   * values are the values of the fields corresponding to the requested index.
   * There must be as many values provided as there are fields in the index and
   * these values must correspond to the index field types.
   * </pre>
   *
   * <code>repeated .cosmos.orm.query.v1alpha1.IndexValue values = 3 [json_name = "values"];</code>
   */
  java.util.List<com.cosmos.orm.query.v1alpha1.IndexValue> 
      getValuesList();
  /**
   * <pre>
   * values are the values of the fields corresponding to the requested index.
   * There must be as many values provided as there are fields in the index and
   * these values must correspond to the index field types.
   * </pre>
   *
   * <code>repeated .cosmos.orm.query.v1alpha1.IndexValue values = 3 [json_name = "values"];</code>
   */
  com.cosmos.orm.query.v1alpha1.IndexValue getValues(int index);
  /**
   * <pre>
   * values are the values of the fields corresponding to the requested index.
   * There must be as many values provided as there are fields in the index and
   * these values must correspond to the index field types.
   * </pre>
   *
   * <code>repeated .cosmos.orm.query.v1alpha1.IndexValue values = 3 [json_name = "values"];</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * values are the values of the fields corresponding to the requested index.
   * There must be as many values provided as there are fields in the index and
   * these values must correspond to the index field types.
   * </pre>
   *
   * <code>repeated .cosmos.orm.query.v1alpha1.IndexValue values = 3 [json_name = "values"];</code>
   */
  java.util.List<? extends com.cosmos.orm.query.v1alpha1.IndexValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * values are the values of the fields corresponding to the requested index.
   * There must be as many values provided as there are fields in the index and
   * these values must correspond to the index field types.
   * </pre>
   *
   * <code>repeated .cosmos.orm.query.v1alpha1.IndexValue values = 3 [json_name = "values"];</code>
   */
  com.cosmos.orm.query.v1alpha1.IndexValueOrBuilder getValuesOrBuilder(
      int index);
}
