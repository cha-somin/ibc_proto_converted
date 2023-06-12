// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/query/v1beta1/stakers.proto

package com.kyve.query.v1beta1;

/**
 * <pre>
 * StakerPoolResponse ...
 * </pre>
 *
 * Protobuf type {@code kyve.query.v1beta1.StakerPoolResponse}
 */
public final class StakerPoolResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.query.v1beta1.StakerPoolResponse)
    StakerPoolResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StakerPoolResponse.newBuilder() to construct.
  private StakerPoolResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StakerPoolResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StakerPoolResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.query.v1beta1.StakersProto.internal_static_kyve_query_v1beta1_StakerPoolResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.query.v1beta1.StakersProto.internal_static_kyve_query_v1beta1_StakerPoolResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.query.v1beta1.StakerPoolResponse.class, com.kyve.query.v1beta1.StakerPoolResponse.Builder.class);
  }

  public static final int STAKER_FIELD_NUMBER = 1;
  private com.kyve.query.v1beta1.FullStaker staker_;
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
   * @return Whether the staker field is set.
   */
  @java.lang.Override
  public boolean hasStaker() {
    return staker_ != null;
  }
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
   * @return The staker.
   */
  @java.lang.Override
  public com.kyve.query.v1beta1.FullStaker getStaker() {
    return staker_ == null ? com.kyve.query.v1beta1.FullStaker.getDefaultInstance() : staker_;
  }
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
   */
  @java.lang.Override
  public com.kyve.query.v1beta1.FullStakerOrBuilder getStakerOrBuilder() {
    return staker_ == null ? com.kyve.query.v1beta1.FullStaker.getDefaultInstance() : staker_;
  }

  public static final int VALACCOUNT_FIELD_NUMBER = 2;
  private com.kyve.stakers.v1beta1.Valaccount valaccount_;
  /**
   * <pre>
   * valaccount ...
   * </pre>
   *
   * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
   * @return Whether the valaccount field is set.
   */
  @java.lang.Override
  public boolean hasValaccount() {
    return valaccount_ != null;
  }
  /**
   * <pre>
   * valaccount ...
   * </pre>
   *
   * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
   * @return The valaccount.
   */
  @java.lang.Override
  public com.kyve.stakers.v1beta1.Valaccount getValaccount() {
    return valaccount_ == null ? com.kyve.stakers.v1beta1.Valaccount.getDefaultInstance() : valaccount_;
  }
  /**
   * <pre>
   * valaccount ...
   * </pre>
   *
   * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
   */
  @java.lang.Override
  public com.kyve.stakers.v1beta1.ValaccountOrBuilder getValaccountOrBuilder() {
    return valaccount_ == null ? com.kyve.stakers.v1beta1.Valaccount.getDefaultInstance() : valaccount_;
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
    if (staker_ != null) {
      output.writeMessage(1, getStaker());
    }
    if (valaccount_ != null) {
      output.writeMessage(2, getValaccount());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (staker_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStaker());
    }
    if (valaccount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValaccount());
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
    if (!(obj instanceof com.kyve.query.v1beta1.StakerPoolResponse)) {
      return super.equals(obj);
    }
    com.kyve.query.v1beta1.StakerPoolResponse other = (com.kyve.query.v1beta1.StakerPoolResponse) obj;

    if (hasStaker() != other.hasStaker()) return false;
    if (hasStaker()) {
      if (!getStaker()
          .equals(other.getStaker())) return false;
    }
    if (hasValaccount() != other.hasValaccount()) return false;
    if (hasValaccount()) {
      if (!getValaccount()
          .equals(other.getValaccount())) return false;
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
    if (hasStaker()) {
      hash = (37 * hash) + STAKER_FIELD_NUMBER;
      hash = (53 * hash) + getStaker().hashCode();
    }
    if (hasValaccount()) {
      hash = (37 * hash) + VALACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getValaccount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.query.v1beta1.StakerPoolResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.query.v1beta1.StakerPoolResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.StakerPoolResponse parseFrom(
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
  public static Builder newBuilder(com.kyve.query.v1beta1.StakerPoolResponse prototype) {
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
   * StakerPoolResponse ...
   * </pre>
   *
   * Protobuf type {@code kyve.query.v1beta1.StakerPoolResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.query.v1beta1.StakerPoolResponse)
      com.kyve.query.v1beta1.StakerPoolResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.query.v1beta1.StakersProto.internal_static_kyve_query_v1beta1_StakerPoolResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.query.v1beta1.StakersProto.internal_static_kyve_query_v1beta1_StakerPoolResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.query.v1beta1.StakerPoolResponse.class, com.kyve.query.v1beta1.StakerPoolResponse.Builder.class);
    }

    // Construct using com.kyve.query.v1beta1.StakerPoolResponse.newBuilder()
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
      staker_ = null;
      if (stakerBuilder_ != null) {
        stakerBuilder_.dispose();
        stakerBuilder_ = null;
      }
      valaccount_ = null;
      if (valaccountBuilder_ != null) {
        valaccountBuilder_.dispose();
        valaccountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.query.v1beta1.StakersProto.internal_static_kyve_query_v1beta1_StakerPoolResponse_descriptor;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.StakerPoolResponse getDefaultInstanceForType() {
      return com.kyve.query.v1beta1.StakerPoolResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.StakerPoolResponse build() {
      com.kyve.query.v1beta1.StakerPoolResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.StakerPoolResponse buildPartial() {
      com.kyve.query.v1beta1.StakerPoolResponse result = new com.kyve.query.v1beta1.StakerPoolResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.query.v1beta1.StakerPoolResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.staker_ = stakerBuilder_ == null
            ? staker_
            : stakerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.valaccount_ = valaccountBuilder_ == null
            ? valaccount_
            : valaccountBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.query.v1beta1.StakerPoolResponse) {
        return mergeFrom((com.kyve.query.v1beta1.StakerPoolResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.query.v1beta1.StakerPoolResponse other) {
      if (other == com.kyve.query.v1beta1.StakerPoolResponse.getDefaultInstance()) return this;
      if (other.hasStaker()) {
        mergeStaker(other.getStaker());
      }
      if (other.hasValaccount()) {
        mergeValaccount(other.getValaccount());
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
                  getStakerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValaccountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.kyve.query.v1beta1.FullStaker staker_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.query.v1beta1.FullStaker, com.kyve.query.v1beta1.FullStaker.Builder, com.kyve.query.v1beta1.FullStakerOrBuilder> stakerBuilder_;
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     * @return Whether the staker field is set.
     */
    public boolean hasStaker() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     * @return The staker.
     */
    public com.kyve.query.v1beta1.FullStaker getStaker() {
      if (stakerBuilder_ == null) {
        return staker_ == null ? com.kyve.query.v1beta1.FullStaker.getDefaultInstance() : staker_;
      } else {
        return stakerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     */
    public Builder setStaker(com.kyve.query.v1beta1.FullStaker value) {
      if (stakerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        staker_ = value;
      } else {
        stakerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     */
    public Builder setStaker(
        com.kyve.query.v1beta1.FullStaker.Builder builderForValue) {
      if (stakerBuilder_ == null) {
        staker_ = builderForValue.build();
      } else {
        stakerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     */
    public Builder mergeStaker(com.kyve.query.v1beta1.FullStaker value) {
      if (stakerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          staker_ != null &&
          staker_ != com.kyve.query.v1beta1.FullStaker.getDefaultInstance()) {
          getStakerBuilder().mergeFrom(value);
        } else {
          staker_ = value;
        }
      } else {
        stakerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     */
    public Builder clearStaker() {
      bitField0_ = (bitField0_ & ~0x00000001);
      staker_ = null;
      if (stakerBuilder_ != null) {
        stakerBuilder_.dispose();
        stakerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     */
    public com.kyve.query.v1beta1.FullStaker.Builder getStakerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStakerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     */
    public com.kyve.query.v1beta1.FullStakerOrBuilder getStakerOrBuilder() {
      if (stakerBuilder_ != null) {
        return stakerBuilder_.getMessageOrBuilder();
      } else {
        return staker_ == null ?
            com.kyve.query.v1beta1.FullStaker.getDefaultInstance() : staker_;
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.FullStaker staker = 1 [json_name = "staker"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.query.v1beta1.FullStaker, com.kyve.query.v1beta1.FullStaker.Builder, com.kyve.query.v1beta1.FullStakerOrBuilder> 
        getStakerFieldBuilder() {
      if (stakerBuilder_ == null) {
        stakerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kyve.query.v1beta1.FullStaker, com.kyve.query.v1beta1.FullStaker.Builder, com.kyve.query.v1beta1.FullStakerOrBuilder>(
                getStaker(),
                getParentForChildren(),
                isClean());
        staker_ = null;
      }
      return stakerBuilder_;
    }

    private com.kyve.stakers.v1beta1.Valaccount valaccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.stakers.v1beta1.Valaccount, com.kyve.stakers.v1beta1.Valaccount.Builder, com.kyve.stakers.v1beta1.ValaccountOrBuilder> valaccountBuilder_;
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     * @return Whether the valaccount field is set.
     */
    public boolean hasValaccount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     * @return The valaccount.
     */
    public com.kyve.stakers.v1beta1.Valaccount getValaccount() {
      if (valaccountBuilder_ == null) {
        return valaccount_ == null ? com.kyve.stakers.v1beta1.Valaccount.getDefaultInstance() : valaccount_;
      } else {
        return valaccountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     */
    public Builder setValaccount(com.kyve.stakers.v1beta1.Valaccount value) {
      if (valaccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valaccount_ = value;
      } else {
        valaccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     */
    public Builder setValaccount(
        com.kyve.stakers.v1beta1.Valaccount.Builder builderForValue) {
      if (valaccountBuilder_ == null) {
        valaccount_ = builderForValue.build();
      } else {
        valaccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     */
    public Builder mergeValaccount(com.kyve.stakers.v1beta1.Valaccount value) {
      if (valaccountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          valaccount_ != null &&
          valaccount_ != com.kyve.stakers.v1beta1.Valaccount.getDefaultInstance()) {
          getValaccountBuilder().mergeFrom(value);
        } else {
          valaccount_ = value;
        }
      } else {
        valaccountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     */
    public Builder clearValaccount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      valaccount_ = null;
      if (valaccountBuilder_ != null) {
        valaccountBuilder_.dispose();
        valaccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     */
    public com.kyve.stakers.v1beta1.Valaccount.Builder getValaccountBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValaccountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     */
    public com.kyve.stakers.v1beta1.ValaccountOrBuilder getValaccountOrBuilder() {
      if (valaccountBuilder_ != null) {
        return valaccountBuilder_.getMessageOrBuilder();
      } else {
        return valaccount_ == null ?
            com.kyve.stakers.v1beta1.Valaccount.getDefaultInstance() : valaccount_;
      }
    }
    /**
     * <pre>
     * valaccount ...
     * </pre>
     *
     * <code>.kyve.stakers.v1beta1.Valaccount valaccount = 2 [json_name = "valaccount"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.stakers.v1beta1.Valaccount, com.kyve.stakers.v1beta1.Valaccount.Builder, com.kyve.stakers.v1beta1.ValaccountOrBuilder> 
        getValaccountFieldBuilder() {
      if (valaccountBuilder_ == null) {
        valaccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kyve.stakers.v1beta1.Valaccount, com.kyve.stakers.v1beta1.Valaccount.Builder, com.kyve.stakers.v1beta1.ValaccountOrBuilder>(
                getValaccount(),
                getParentForChildren(),
                isClean());
        valaccount_ = null;
      }
      return valaccountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kyve.query.v1beta1.StakerPoolResponse)
  }

  // @@protoc_insertion_point(class_scope:kyve.query.v1beta1.StakerPoolResponse)
  private static final com.kyve.query.v1beta1.StakerPoolResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.query.v1beta1.StakerPoolResponse();
  }

  public static com.kyve.query.v1beta1.StakerPoolResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StakerPoolResponse>
      PARSER = new com.google.protobuf.AbstractParser<StakerPoolResponse>() {
    @java.lang.Override
    public StakerPoolResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StakerPoolResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StakerPoolResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.query.v1beta1.StakerPoolResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

