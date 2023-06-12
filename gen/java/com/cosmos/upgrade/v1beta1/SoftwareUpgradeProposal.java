// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/upgrade.proto

package com.cosmos.upgrade.v1beta1;

/**
 * <pre>
 * SoftwareUpgradeProposal is a gov Content type for initiating a software
 * upgrade.
 * Deprecated: This legacy proposal is deprecated in favor of Msg-based gov
 * proposals, see MsgSoftwareUpgrade.
 * </pre>
 *
 * Protobuf type {@code cosmos.upgrade.v1beta1.SoftwareUpgradeProposal}
 */
@java.lang.Deprecated public final class SoftwareUpgradeProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
    SoftwareUpgradeProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SoftwareUpgradeProposal.newBuilder() to construct.
  private SoftwareUpgradeProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SoftwareUpgradeProposal() {
    title_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SoftwareUpgradeProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.upgrade.v1beta1.UpgradeProto.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.upgrade.v1beta1.UpgradeProto.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.class, com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * title of the proposal
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * title of the proposal
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * description of the proposal
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * description of the proposal
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAN_FIELD_NUMBER = 3;
  private com.cosmos.upgrade.v1beta1.Plan plan_;
  /**
   * <pre>
   * plan of the proposal
   * </pre>
   *
   * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the plan field is set.
   */
  @java.lang.Override
  public boolean hasPlan() {
    return plan_ != null;
  }
  /**
   * <pre>
   * plan of the proposal
   * </pre>
   *
   * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The plan.
   */
  @java.lang.Override
  public com.cosmos.upgrade.v1beta1.Plan getPlan() {
    return plan_ == null ? com.cosmos.upgrade.v1beta1.Plan.getDefaultInstance() : plan_;
  }
  /**
   * <pre>
   * plan of the proposal
   * </pre>
   *
   * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.upgrade.v1beta1.PlanOrBuilder getPlanOrBuilder() {
    return plan_ == null ? com.cosmos.upgrade.v1beta1.Plan.getDefaultInstance() : plan_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (plan_ != null) {
      output.writeMessage(3, getPlan());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (plan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlan());
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
    if (!(obj instanceof com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)) {
      return super.equals(obj);
    }
    com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal other = (com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasPlan() != other.hasPlan()) return false;
    if (hasPlan()) {
      if (!getPlan()
          .equals(other.getPlan())) return false;
    }
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasPlan()) {
      hash = (37 * hash) + PLAN_FIELD_NUMBER;
      hash = (53 * hash) + getPlan().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
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
  public static Builder newBuilder(com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal prototype) {
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
   * <pre>
   * SoftwareUpgradeProposal is a gov Content type for initiating a software
   * upgrade.
   * Deprecated: This legacy proposal is deprecated in favor of Msg-based gov
   * proposals, see MsgSoftwareUpgrade.
   * </pre>
   *
   * Protobuf type {@code cosmos.upgrade.v1beta1.SoftwareUpgradeProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
      com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.upgrade.v1beta1.UpgradeProto.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.upgrade.v1beta1.UpgradeProto.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.class, com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.Builder.class);
    }

    // Construct using com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.newBuilder()
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
      title_ = "";
      description_ = "";
      plan_ = null;
      if (planBuilder_ != null) {
        planBuilder_.dispose();
        planBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.upgrade.v1beta1.UpgradeProto.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor;
    }

    @java.lang.Override
    public com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal getDefaultInstanceForType() {
      return com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal build() {
      com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal buildPartial() {
      com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal result = new com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.plan_ = planBuilder_ == null
            ? plan_
            : planBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal) {
        return mergeFrom((com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal other) {
      if (other == com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPlan()) {
        mergePlan(other.getPlan());
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
            case 10: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPlanFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * title of the proposal
     * </pre>
     *
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * title of the proposal
     * </pre>
     *
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * title of the proposal
     * </pre>
     *
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * title of the proposal
     * </pre>
     *
     * <code>string title = 1 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * title of the proposal
     * </pre>
     *
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * description of the proposal
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * description of the proposal
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * description of the proposal
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * description of the proposal
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * description of the proposal
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.upgrade.v1beta1.Plan plan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.upgrade.v1beta1.Plan, com.cosmos.upgrade.v1beta1.Plan.Builder, com.cosmos.upgrade.v1beta1.PlanOrBuilder> planBuilder_;
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the plan field is set.
     */
    public boolean hasPlan() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The plan.
     */
    public com.cosmos.upgrade.v1beta1.Plan getPlan() {
      if (planBuilder_ == null) {
        return plan_ == null ? com.cosmos.upgrade.v1beta1.Plan.getDefaultInstance() : plan_;
      } else {
        return planBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setPlan(com.cosmos.upgrade.v1beta1.Plan value) {
      if (planBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plan_ = value;
      } else {
        planBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setPlan(
        com.cosmos.upgrade.v1beta1.Plan.Builder builderForValue) {
      if (planBuilder_ == null) {
        plan_ = builderForValue.build();
      } else {
        planBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder mergePlan(com.cosmos.upgrade.v1beta1.Plan value) {
      if (planBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          plan_ != null &&
          plan_ != com.cosmos.upgrade.v1beta1.Plan.getDefaultInstance()) {
          getPlanBuilder().mergeFrom(value);
        } else {
          plan_ = value;
        }
      } else {
        planBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder clearPlan() {
      bitField0_ = (bitField0_ & ~0x00000004);
      plan_ = null;
      if (planBuilder_ != null) {
        planBuilder_.dispose();
        planBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.upgrade.v1beta1.Plan.Builder getPlanBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPlanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.upgrade.v1beta1.PlanOrBuilder getPlanOrBuilder() {
      if (planBuilder_ != null) {
        return planBuilder_.getMessageOrBuilder();
      } else {
        return plan_ == null ?
            com.cosmos.upgrade.v1beta1.Plan.getDefaultInstance() : plan_;
      }
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.upgrade.v1beta1.Plan, com.cosmos.upgrade.v1beta1.Plan.Builder, com.cosmos.upgrade.v1beta1.PlanOrBuilder> 
        getPlanFieldBuilder() {
      if (planBuilder_ == null) {
        planBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.upgrade.v1beta1.Plan, com.cosmos.upgrade.v1beta1.Plan.Builder, com.cosmos.upgrade.v1beta1.PlanOrBuilder>(
                getPlan(),
                getParentForChildren(),
                isClean());
        plan_ = null;
      }
      return planBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
  }

  // @@protoc_insertion_point(class_scope:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
  private static final com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal();
  }

  public static com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SoftwareUpgradeProposal>
      PARSER = new com.google.protobuf.AbstractParser<SoftwareUpgradeProposal>() {
    @java.lang.Override
    public SoftwareUpgradeProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<SoftwareUpgradeProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SoftwareUpgradeProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.upgrade.v1beta1.SoftwareUpgradeProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

