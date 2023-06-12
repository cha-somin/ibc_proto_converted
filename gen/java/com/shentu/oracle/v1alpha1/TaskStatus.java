// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/oracle/v1alpha1/oracle.proto

package com.shentu.oracle.v1alpha1;

/**
 * <pre>
 * TaskStatus enumerates the valid statuses of a task.
 * </pre>
 *
 * Protobuf enum {@code shentu.oracle.v1alpha1.TaskStatus}
 */
public enum TaskStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TASK_STATUS_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "TaskStatusNil"];</code>
   */
  TASK_STATUS_UNSPECIFIED(0),
  /**
   * <code>TASK_STATUS_PENDING = 1 [(.gogoproto.enumvalue_customname) = "TaskStatusPending"];</code>
   */
  TASK_STATUS_PENDING(1),
  /**
   * <code>TASK_STATUS_SUCCEEDED = 2 [(.gogoproto.enumvalue_customname) = "TaskStatusSucceeded"];</code>
   */
  TASK_STATUS_SUCCEEDED(2),
  /**
   * <code>TASK_STATUS_FAILED = 3 [(.gogoproto.enumvalue_customname) = "TaskStatusFailed"];</code>
   */
  TASK_STATUS_FAILED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TASK_STATUS_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "TaskStatusNil"];</code>
   */
  public static final int TASK_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TASK_STATUS_PENDING = 1 [(.gogoproto.enumvalue_customname) = "TaskStatusPending"];</code>
   */
  public static final int TASK_STATUS_PENDING_VALUE = 1;
  /**
   * <code>TASK_STATUS_SUCCEEDED = 2 [(.gogoproto.enumvalue_customname) = "TaskStatusSucceeded"];</code>
   */
  public static final int TASK_STATUS_SUCCEEDED_VALUE = 2;
  /**
   * <code>TASK_STATUS_FAILED = 3 [(.gogoproto.enumvalue_customname) = "TaskStatusFailed"];</code>
   */
  public static final int TASK_STATUS_FAILED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TaskStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TaskStatus forNumber(int value) {
    switch (value) {
      case 0: return TASK_STATUS_UNSPECIFIED;
      case 1: return TASK_STATUS_PENDING;
      case 2: return TASK_STATUS_SUCCEEDED;
      case 3: return TASK_STATUS_FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TaskStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TaskStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TaskStatus>() {
          public TaskStatus findValueByNumber(int number) {
            return TaskStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.shentu.oracle.v1alpha1.OracleProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TaskStatus[] VALUES = values();

  public static TaskStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TaskStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:shentu.oracle.v1alpha1.TaskStatus)
}

