// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/events.proto

package com.crescent.lpfarm.v1beta1;

/**
 * Protobuf type {@code crescent.lpfarm.v1beta1.EventTerminatePlan}
 */
public final class EventTerminatePlan extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.lpfarm.v1beta1.EventTerminatePlan)
    EventTerminatePlanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventTerminatePlan.newBuilder() to construct.
  private EventTerminatePlan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventTerminatePlan() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventTerminatePlan();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.lpfarm.v1beta1.EventsProto.internal_static_crescent_lpfarm_v1beta1_EventTerminatePlan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.lpfarm.v1beta1.EventsProto.internal_static_crescent_lpfarm_v1beta1_EventTerminatePlan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.lpfarm.v1beta1.EventTerminatePlan.class, com.crescent.lpfarm.v1beta1.EventTerminatePlan.Builder.class);
  }

  public static final int PLAN_ID_FIELD_NUMBER = 1;
  private long planId_ = 0L;
  /**
   * <code>uint64 plan_id = 1 [json_name = "planId"];</code>
   * @return The planId.
   */
  @java.lang.Override
  public long getPlanId() {
    return planId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (planId_ != 0L) {
      output.writeUInt64(1, planId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (planId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, planId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.crescent.lpfarm.v1beta1.EventTerminatePlan)) {
      return super.equals(obj);
    }
    com.crescent.lpfarm.v1beta1.EventTerminatePlan other = (com.crescent.lpfarm.v1beta1.EventTerminatePlan) obj;

    if (getPlanId()
        != other.getPlanId()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PLAN_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlanId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.crescent.lpfarm.v1beta1.EventTerminatePlan prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code crescent.lpfarm.v1beta1.EventTerminatePlan}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.lpfarm.v1beta1.EventTerminatePlan)
      com.crescent.lpfarm.v1beta1.EventTerminatePlanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.lpfarm.v1beta1.EventsProto.internal_static_crescent_lpfarm_v1beta1_EventTerminatePlan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.lpfarm.v1beta1.EventsProto.internal_static_crescent_lpfarm_v1beta1_EventTerminatePlan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.lpfarm.v1beta1.EventTerminatePlan.class, com.crescent.lpfarm.v1beta1.EventTerminatePlan.Builder.class);
    }

    // Construct using com.crescent.lpfarm.v1beta1.EventTerminatePlan.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      planId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.lpfarm.v1beta1.EventsProto.internal_static_crescent_lpfarm_v1beta1_EventTerminatePlan_descriptor;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.EventTerminatePlan getDefaultInstanceForType() {
      return com.crescent.lpfarm.v1beta1.EventTerminatePlan.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.EventTerminatePlan build() {
      com.crescent.lpfarm.v1beta1.EventTerminatePlan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.EventTerminatePlan buildPartial() {
      com.crescent.lpfarm.v1beta1.EventTerminatePlan result = new com.crescent.lpfarm.v1beta1.EventTerminatePlan(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.crescent.lpfarm.v1beta1.EventTerminatePlan result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.planId_ = planId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.lpfarm.v1beta1.EventTerminatePlan) {
        return mergeFrom((com.crescent.lpfarm.v1beta1.EventTerminatePlan)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.lpfarm.v1beta1.EventTerminatePlan other) {
      if (other == com.crescent.lpfarm.v1beta1.EventTerminatePlan.getDefaultInstance()) return this;
      if (other.getPlanId() != 0L) {
        setPlanId(other.getPlanId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              planId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long planId_ ;
    /**
     * <code>uint64 plan_id = 1 [json_name = "planId"];</code>
     * @return The planId.
     */
    @java.lang.Override
    public long getPlanId() {
      return planId_;
    }
    /**
     * <code>uint64 plan_id = 1 [json_name = "planId"];</code>
     * @param value The planId to set.
     * @return This builder for chaining.
     */
    public Builder setPlanId(long value) {

      planId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 plan_id = 1 [json_name = "planId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPlanId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      planId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:crescent.lpfarm.v1beta1.EventTerminatePlan)
  }

  // @@protoc_insertion_point(class_scope:crescent.lpfarm.v1beta1.EventTerminatePlan)
  private static final com.crescent.lpfarm.v1beta1.EventTerminatePlan DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.lpfarm.v1beta1.EventTerminatePlan();
  }

  public static com.crescent.lpfarm.v1beta1.EventTerminatePlan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventTerminatePlan>
      PARSER = new com.google.protobuf.AbstractParser<EventTerminatePlan>() {
    @java.lang.Override
    public EventTerminatePlan parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EventTerminatePlan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventTerminatePlan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.lpfarm.v1beta1.EventTerminatePlan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

