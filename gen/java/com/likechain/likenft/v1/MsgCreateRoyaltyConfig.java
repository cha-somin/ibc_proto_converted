// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/tx.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.MsgCreateRoyaltyConfig}
 */
public final class MsgCreateRoyaltyConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.MsgCreateRoyaltyConfig)
    MsgCreateRoyaltyConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateRoyaltyConfig.newBuilder() to construct.
  private MsgCreateRoyaltyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateRoyaltyConfig() {
    creator_ = "";
    classId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateRoyaltyConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateRoyaltyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateRoyaltyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.MsgCreateRoyaltyConfig.class, com.likechain.likenft.v1.MsgCreateRoyaltyConfig.Builder.class);
  }

  public static final int CREATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creator_ = "";
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  @java.lang.Override
  public java.lang.String getCreator() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creator_ = s;
      return s;
    }
  }
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatorBytes() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLASS_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classId_ = "";
  /**
   * <code>string class_id = 2 [json_name = "classId"];</code>
   * @return The classId.
   */
  @java.lang.Override
  public java.lang.String getClassId() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classId_ = s;
      return s;
    }
  }
  /**
   * <code>string class_id = 2 [json_name = "classId"];</code>
   * @return The bytes for classId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassIdBytes() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROYALTY_CONFIG_FIELD_NUMBER = 3;
  private com.likechain.likenft.v1.RoyaltyConfigInput royaltyConfig_;
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   * @return Whether the royaltyConfig field is set.
   */
  @java.lang.Override
  public boolean hasRoyaltyConfig() {
    return royaltyConfig_ != null;
  }
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   * @return The royaltyConfig.
   */
  @java.lang.Override
  public com.likechain.likenft.v1.RoyaltyConfigInput getRoyaltyConfig() {
    return royaltyConfig_ == null ? com.likechain.likenft.v1.RoyaltyConfigInput.getDefaultInstance() : royaltyConfig_;
  }
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.likechain.likenft.v1.RoyaltyConfigInputOrBuilder getRoyaltyConfigOrBuilder() {
    return royaltyConfig_ == null ? com.likechain.likenft.v1.RoyaltyConfigInput.getDefaultInstance() : royaltyConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, classId_);
    }
    if (royaltyConfig_ != null) {
      output.writeMessage(3, getRoyaltyConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, classId_);
    }
    if (royaltyConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRoyaltyConfig());
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
    if (!(obj instanceof com.likechain.likenft.v1.MsgCreateRoyaltyConfig)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.MsgCreateRoyaltyConfig other = (com.likechain.likenft.v1.MsgCreateRoyaltyConfig) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (!getClassId()
        .equals(other.getClassId())) return false;
    if (hasRoyaltyConfig() != other.hasRoyaltyConfig()) return false;
    if (hasRoyaltyConfig()) {
      if (!getRoyaltyConfig()
          .equals(other.getRoyaltyConfig())) return false;
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
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator().hashCode();
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    if (hasRoyaltyConfig()) {
      hash = (37 * hash) + ROYALTY_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getRoyaltyConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.MsgCreateRoyaltyConfig prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.MsgCreateRoyaltyConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.MsgCreateRoyaltyConfig)
      com.likechain.likenft.v1.MsgCreateRoyaltyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateRoyaltyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateRoyaltyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.MsgCreateRoyaltyConfig.class, com.likechain.likenft.v1.MsgCreateRoyaltyConfig.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.MsgCreateRoyaltyConfig.newBuilder()
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
      creator_ = "";
      classId_ = "";
      royaltyConfig_ = null;
      if (royaltyConfigBuilder_ != null) {
        royaltyConfigBuilder_.dispose();
        royaltyConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateRoyaltyConfig_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgCreateRoyaltyConfig getDefaultInstanceForType() {
      return com.likechain.likenft.v1.MsgCreateRoyaltyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgCreateRoyaltyConfig build() {
      com.likechain.likenft.v1.MsgCreateRoyaltyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgCreateRoyaltyConfig buildPartial() {
      com.likechain.likenft.v1.MsgCreateRoyaltyConfig result = new com.likechain.likenft.v1.MsgCreateRoyaltyConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.MsgCreateRoyaltyConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.classId_ = classId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.royaltyConfig_ = royaltyConfigBuilder_ == null
            ? royaltyConfig_
            : royaltyConfigBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.MsgCreateRoyaltyConfig) {
        return mergeFrom((com.likechain.likenft.v1.MsgCreateRoyaltyConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.MsgCreateRoyaltyConfig other) {
      if (other == com.likechain.likenft.v1.MsgCreateRoyaltyConfig.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRoyaltyConfig()) {
        mergeRoyaltyConfig(other.getRoyaltyConfig());
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
              creator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              classId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRoyaltyConfigFieldBuilder().getBuilder(),
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

    private java.lang.Object creator_ = "";
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The creator.
     */
    public java.lang.String getCreator() {
      java.lang.Object ref = creator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The bytes for creator.
     */
    public com.google.protobuf.ByteString
        getCreatorBytes() {
      java.lang.Object ref = creator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreator() {
      creator_ = getDefaultInstance().getCreator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The bytes for creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object classId_ = "";
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @return The classId.
     */
    public java.lang.String getClassId() {
      java.lang.Object ref = classId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @return The bytes for classId.
     */
    public com.google.protobuf.ByteString
        getClassIdBytes() {
      java.lang.Object ref = classId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @param value The classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassId() {
      classId_ = getDefaultInstance().getClassId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @param value The bytes for classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.likechain.likenft.v1.RoyaltyConfigInput royaltyConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.likechain.likenft.v1.RoyaltyConfigInput, com.likechain.likenft.v1.RoyaltyConfigInput.Builder, com.likechain.likenft.v1.RoyaltyConfigInputOrBuilder> royaltyConfigBuilder_;
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     * @return Whether the royaltyConfig field is set.
     */
    public boolean hasRoyaltyConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     * @return The royaltyConfig.
     */
    public com.likechain.likenft.v1.RoyaltyConfigInput getRoyaltyConfig() {
      if (royaltyConfigBuilder_ == null) {
        return royaltyConfig_ == null ? com.likechain.likenft.v1.RoyaltyConfigInput.getDefaultInstance() : royaltyConfig_;
      } else {
        return royaltyConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRoyaltyConfig(com.likechain.likenft.v1.RoyaltyConfigInput value) {
      if (royaltyConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        royaltyConfig_ = value;
      } else {
        royaltyConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRoyaltyConfig(
        com.likechain.likenft.v1.RoyaltyConfigInput.Builder builderForValue) {
      if (royaltyConfigBuilder_ == null) {
        royaltyConfig_ = builderForValue.build();
      } else {
        royaltyConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeRoyaltyConfig(com.likechain.likenft.v1.RoyaltyConfigInput value) {
      if (royaltyConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          royaltyConfig_ != null &&
          royaltyConfig_ != com.likechain.likenft.v1.RoyaltyConfigInput.getDefaultInstance()) {
          getRoyaltyConfigBuilder().mergeFrom(value);
        } else {
          royaltyConfig_ = value;
        }
      } else {
        royaltyConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearRoyaltyConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      royaltyConfig_ = null;
      if (royaltyConfigBuilder_ != null) {
        royaltyConfigBuilder_.dispose();
        royaltyConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyConfigInput.Builder getRoyaltyConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRoyaltyConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyConfigInputOrBuilder getRoyaltyConfigOrBuilder() {
      if (royaltyConfigBuilder_ != null) {
        return royaltyConfigBuilder_.getMessageOrBuilder();
      } else {
        return royaltyConfig_ == null ?
            com.likechain.likenft.v1.RoyaltyConfigInput.getDefaultInstance() : royaltyConfig_;
      }
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfigInput royalty_config = 3 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.likechain.likenft.v1.RoyaltyConfigInput, com.likechain.likenft.v1.RoyaltyConfigInput.Builder, com.likechain.likenft.v1.RoyaltyConfigInputOrBuilder> 
        getRoyaltyConfigFieldBuilder() {
      if (royaltyConfigBuilder_ == null) {
        royaltyConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.likechain.likenft.v1.RoyaltyConfigInput, com.likechain.likenft.v1.RoyaltyConfigInput.Builder, com.likechain.likenft.v1.RoyaltyConfigInputOrBuilder>(
                getRoyaltyConfig(),
                getParentForChildren(),
                isClean());
        royaltyConfig_ = null;
      }
      return royaltyConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.MsgCreateRoyaltyConfig)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.MsgCreateRoyaltyConfig)
  private static final com.likechain.likenft.v1.MsgCreateRoyaltyConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.MsgCreateRoyaltyConfig();
  }

  public static com.likechain.likenft.v1.MsgCreateRoyaltyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateRoyaltyConfig>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateRoyaltyConfig>() {
    @java.lang.Override
    public MsgCreateRoyaltyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateRoyaltyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateRoyaltyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.MsgCreateRoyaltyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

