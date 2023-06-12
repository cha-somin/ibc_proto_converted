// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/participationrewards/v1/participationrewards.proto

package com.quicksilver.participationrewards.v1;

/**
 * <pre>
 * Params holds parameters for the participationrewards module.
 * </pre>
 *
 * Protobuf type {@code quicksilver.participationrewards.v1.Params_v1}
 */
public final class Params_v1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quicksilver.participationrewards.v1.Params_v1)
    Params_v1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params_v1.newBuilder() to construct.
  private Params_v1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params_v1() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params_v1();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quicksilver.participationrewards.v1.ParticipationrewardsProto.internal_static_quicksilver_participationrewards_v1_Params_v1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quicksilver.participationrewards.v1.ParticipationrewardsProto.internal_static_quicksilver_participationrewards_v1_Params_v1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quicksilver.participationrewards.v1.Params_v1.class, com.quicksilver.participationrewards.v1.Params_v1.Builder.class);
  }

  public static final int DISTRIBUTION_PROPORTIONS_FIELD_NUMBER = 1;
  private com.quicksilver.participationrewards.v1.DistributionProportions distributionProportions_;
  /**
   * <pre>
   * distribution_proportions defines the proportions of the minted
   * participation rewards;
   * </pre>
   *
   * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
   * @return Whether the distributionProportions field is set.
   */
  @java.lang.Override
  public boolean hasDistributionProportions() {
    return distributionProportions_ != null;
  }
  /**
   * <pre>
   * distribution_proportions defines the proportions of the minted
   * participation rewards;
   * </pre>
   *
   * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
   * @return The distributionProportions.
   */
  @java.lang.Override
  public com.quicksilver.participationrewards.v1.DistributionProportions getDistributionProportions() {
    return distributionProportions_ == null ? com.quicksilver.participationrewards.v1.DistributionProportions.getDefaultInstance() : distributionProportions_;
  }
  /**
   * <pre>
   * distribution_proportions defines the proportions of the minted
   * participation rewards;
   * </pre>
   *
   * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.quicksilver.participationrewards.v1.DistributionProportionsOrBuilder getDistributionProportionsOrBuilder() {
    return distributionProportions_ == null ? com.quicksilver.participationrewards.v1.DistributionProportions.getDefaultInstance() : distributionProportions_;
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
    if (distributionProportions_ != null) {
      output.writeMessage(1, getDistributionProportions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (distributionProportions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDistributionProportions());
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
    if (!(obj instanceof com.quicksilver.participationrewards.v1.Params_v1)) {
      return super.equals(obj);
    }
    com.quicksilver.participationrewards.v1.Params_v1 other = (com.quicksilver.participationrewards.v1.Params_v1) obj;

    if (hasDistributionProportions() != other.hasDistributionProportions()) return false;
    if (hasDistributionProportions()) {
      if (!getDistributionProportions()
          .equals(other.getDistributionProportions())) return false;
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
    if (hasDistributionProportions()) {
      hash = (37 * hash) + DISTRIBUTION_PROPORTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDistributionProportions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quicksilver.participationrewards.v1.Params_v1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quicksilver.participationrewards.v1.Params_v1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.participationrewards.v1.Params_v1 parseFrom(
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
  public static Builder newBuilder(com.quicksilver.participationrewards.v1.Params_v1 prototype) {
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
   * Params holds parameters for the participationrewards module.
   * </pre>
   *
   * Protobuf type {@code quicksilver.participationrewards.v1.Params_v1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quicksilver.participationrewards.v1.Params_v1)
      com.quicksilver.participationrewards.v1.Params_v1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quicksilver.participationrewards.v1.ParticipationrewardsProto.internal_static_quicksilver_participationrewards_v1_Params_v1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quicksilver.participationrewards.v1.ParticipationrewardsProto.internal_static_quicksilver_participationrewards_v1_Params_v1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quicksilver.participationrewards.v1.Params_v1.class, com.quicksilver.participationrewards.v1.Params_v1.Builder.class);
    }

    // Construct using com.quicksilver.participationrewards.v1.Params_v1.newBuilder()
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
      distributionProportions_ = null;
      if (distributionProportionsBuilder_ != null) {
        distributionProportionsBuilder_.dispose();
        distributionProportionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.quicksilver.participationrewards.v1.ParticipationrewardsProto.internal_static_quicksilver_participationrewards_v1_Params_v1_descriptor;
    }

    @java.lang.Override
    public com.quicksilver.participationrewards.v1.Params_v1 getDefaultInstanceForType() {
      return com.quicksilver.participationrewards.v1.Params_v1.getDefaultInstance();
    }

    @java.lang.Override
    public com.quicksilver.participationrewards.v1.Params_v1 build() {
      com.quicksilver.participationrewards.v1.Params_v1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quicksilver.participationrewards.v1.Params_v1 buildPartial() {
      com.quicksilver.participationrewards.v1.Params_v1 result = new com.quicksilver.participationrewards.v1.Params_v1(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.quicksilver.participationrewards.v1.Params_v1 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.distributionProportions_ = distributionProportionsBuilder_ == null
            ? distributionProportions_
            : distributionProportionsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quicksilver.participationrewards.v1.Params_v1) {
        return mergeFrom((com.quicksilver.participationrewards.v1.Params_v1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quicksilver.participationrewards.v1.Params_v1 other) {
      if (other == com.quicksilver.participationrewards.v1.Params_v1.getDefaultInstance()) return this;
      if (other.hasDistributionProportions()) {
        mergeDistributionProportions(other.getDistributionProportions());
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
              input.readMessage(
                  getDistributionProportionsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.quicksilver.participationrewards.v1.DistributionProportions distributionProportions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.quicksilver.participationrewards.v1.DistributionProportions, com.quicksilver.participationrewards.v1.DistributionProportions.Builder, com.quicksilver.participationrewards.v1.DistributionProportionsOrBuilder> distributionProportionsBuilder_;
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     * @return Whether the distributionProportions field is set.
     */
    public boolean hasDistributionProportions() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     * @return The distributionProportions.
     */
    public com.quicksilver.participationrewards.v1.DistributionProportions getDistributionProportions() {
      if (distributionProportionsBuilder_ == null) {
        return distributionProportions_ == null ? com.quicksilver.participationrewards.v1.DistributionProportions.getDefaultInstance() : distributionProportions_;
      } else {
        return distributionProportionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDistributionProportions(com.quicksilver.participationrewards.v1.DistributionProportions value) {
      if (distributionProportionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        distributionProportions_ = value;
      } else {
        distributionProportionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDistributionProportions(
        com.quicksilver.participationrewards.v1.DistributionProportions.Builder builderForValue) {
      if (distributionProportionsBuilder_ == null) {
        distributionProportions_ = builderForValue.build();
      } else {
        distributionProportionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeDistributionProportions(com.quicksilver.participationrewards.v1.DistributionProportions value) {
      if (distributionProportionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          distributionProportions_ != null &&
          distributionProportions_ != com.quicksilver.participationrewards.v1.DistributionProportions.getDefaultInstance()) {
          getDistributionProportionsBuilder().mergeFrom(value);
        } else {
          distributionProportions_ = value;
        }
      } else {
        distributionProportionsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearDistributionProportions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      distributionProportions_ = null;
      if (distributionProportionsBuilder_ != null) {
        distributionProportionsBuilder_.dispose();
        distributionProportionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.participationrewards.v1.DistributionProportions.Builder getDistributionProportionsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDistributionProportionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.participationrewards.v1.DistributionProportionsOrBuilder getDistributionProportionsOrBuilder() {
      if (distributionProportionsBuilder_ != null) {
        return distributionProportionsBuilder_.getMessageOrBuilder();
      } else {
        return distributionProportions_ == null ?
            com.quicksilver.participationrewards.v1.DistributionProportions.getDefaultInstance() : distributionProportions_;
      }
    }
    /**
     * <pre>
     * distribution_proportions defines the proportions of the minted
     * participation rewards;
     * </pre>
     *
     * <code>.quicksilver.participationrewards.v1.DistributionProportions distribution_proportions = 1 [json_name = "distributionProportions", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.quicksilver.participationrewards.v1.DistributionProportions, com.quicksilver.participationrewards.v1.DistributionProportions.Builder, com.quicksilver.participationrewards.v1.DistributionProportionsOrBuilder> 
        getDistributionProportionsFieldBuilder() {
      if (distributionProportionsBuilder_ == null) {
        distributionProportionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.quicksilver.participationrewards.v1.DistributionProportions, com.quicksilver.participationrewards.v1.DistributionProportions.Builder, com.quicksilver.participationrewards.v1.DistributionProportionsOrBuilder>(
                getDistributionProportions(),
                getParentForChildren(),
                isClean());
        distributionProportions_ = null;
      }
      return distributionProportionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:quicksilver.participationrewards.v1.Params_v1)
  }

  // @@protoc_insertion_point(class_scope:quicksilver.participationrewards.v1.Params_v1)
  private static final com.quicksilver.participationrewards.v1.Params_v1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quicksilver.participationrewards.v1.Params_v1();
  }

  public static com.quicksilver.participationrewards.v1.Params_v1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params_v1>
      PARSER = new com.google.protobuf.AbstractParser<Params_v1>() {
    @java.lang.Override
    public Params_v1 parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params_v1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params_v1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quicksilver.participationrewards.v1.Params_v1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

