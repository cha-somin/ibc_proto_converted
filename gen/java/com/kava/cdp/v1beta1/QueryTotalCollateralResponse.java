// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/cdp/v1beta1/query.proto

package com.kava.cdp.v1beta1;

/**
 * <pre>
 * QueryTotalCollateralResponse defines the response type for the Query/TotalCollateral RPC method.
 * </pre>
 *
 * Protobuf type {@code kava.cdp.v1beta1.QueryTotalCollateralResponse}
 */
public final class QueryTotalCollateralResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.cdp.v1beta1.QueryTotalCollateralResponse)
    QueryTotalCollateralResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTotalCollateralResponse.newBuilder() to construct.
  private QueryTotalCollateralResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTotalCollateralResponse() {
    totalCollateral_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTotalCollateralResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.cdp.v1beta1.QueryProto.internal_static_kava_cdp_v1beta1_QueryTotalCollateralResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.cdp.v1beta1.QueryProto.internal_static_kava_cdp_v1beta1_QueryTotalCollateralResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.cdp.v1beta1.QueryTotalCollateralResponse.class, com.kava.cdp.v1beta1.QueryTotalCollateralResponse.Builder.class);
  }

  public static final int TOTAL_COLLATERAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.kava.cdp.v1beta1.TotalCollateral> totalCollateral_;
  /**
   * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
   */
  @java.lang.Override
  public java.util.List<com.kava.cdp.v1beta1.TotalCollateral> getTotalCollateralList() {
    return totalCollateral_;
  }
  /**
   * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.kava.cdp.v1beta1.TotalCollateralOrBuilder> 
      getTotalCollateralOrBuilderList() {
    return totalCollateral_;
  }
  /**
   * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
   */
  @java.lang.Override
  public int getTotalCollateralCount() {
    return totalCollateral_.size();
  }
  /**
   * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
   */
  @java.lang.Override
  public com.kava.cdp.v1beta1.TotalCollateral getTotalCollateral(int index) {
    return totalCollateral_.get(index);
  }
  /**
   * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
   */
  @java.lang.Override
  public com.kava.cdp.v1beta1.TotalCollateralOrBuilder getTotalCollateralOrBuilder(
      int index) {
    return totalCollateral_.get(index);
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
    for (int i = 0; i < totalCollateral_.size(); i++) {
      output.writeMessage(1, totalCollateral_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < totalCollateral_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, totalCollateral_.get(i));
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
    if (!(obj instanceof com.kava.cdp.v1beta1.QueryTotalCollateralResponse)) {
      return super.equals(obj);
    }
    com.kava.cdp.v1beta1.QueryTotalCollateralResponse other = (com.kava.cdp.v1beta1.QueryTotalCollateralResponse) obj;

    if (!getTotalCollateralList()
        .equals(other.getTotalCollateralList())) return false;
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
    if (getTotalCollateralCount() > 0) {
      hash = (37 * hash) + TOTAL_COLLATERAL_FIELD_NUMBER;
      hash = (53 * hash) + getTotalCollateralList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse parseFrom(
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
  public static Builder newBuilder(com.kava.cdp.v1beta1.QueryTotalCollateralResponse prototype) {
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
   * QueryTotalCollateralResponse defines the response type for the Query/TotalCollateral RPC method.
   * </pre>
   *
   * Protobuf type {@code kava.cdp.v1beta1.QueryTotalCollateralResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.cdp.v1beta1.QueryTotalCollateralResponse)
      com.kava.cdp.v1beta1.QueryTotalCollateralResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.cdp.v1beta1.QueryProto.internal_static_kava_cdp_v1beta1_QueryTotalCollateralResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.cdp.v1beta1.QueryProto.internal_static_kava_cdp_v1beta1_QueryTotalCollateralResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.cdp.v1beta1.QueryTotalCollateralResponse.class, com.kava.cdp.v1beta1.QueryTotalCollateralResponse.Builder.class);
    }

    // Construct using com.kava.cdp.v1beta1.QueryTotalCollateralResponse.newBuilder()
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
      if (totalCollateralBuilder_ == null) {
        totalCollateral_ = java.util.Collections.emptyList();
      } else {
        totalCollateral_ = null;
        totalCollateralBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.cdp.v1beta1.QueryProto.internal_static_kava_cdp_v1beta1_QueryTotalCollateralResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.cdp.v1beta1.QueryTotalCollateralResponse getDefaultInstanceForType() {
      return com.kava.cdp.v1beta1.QueryTotalCollateralResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.cdp.v1beta1.QueryTotalCollateralResponse build() {
      com.kava.cdp.v1beta1.QueryTotalCollateralResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.cdp.v1beta1.QueryTotalCollateralResponse buildPartial() {
      com.kava.cdp.v1beta1.QueryTotalCollateralResponse result = new com.kava.cdp.v1beta1.QueryTotalCollateralResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.kava.cdp.v1beta1.QueryTotalCollateralResponse result) {
      if (totalCollateralBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          totalCollateral_ = java.util.Collections.unmodifiableList(totalCollateral_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.totalCollateral_ = totalCollateral_;
      } else {
        result.totalCollateral_ = totalCollateralBuilder_.build();
      }
    }

    private void buildPartial0(com.kava.cdp.v1beta1.QueryTotalCollateralResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.cdp.v1beta1.QueryTotalCollateralResponse) {
        return mergeFrom((com.kava.cdp.v1beta1.QueryTotalCollateralResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.cdp.v1beta1.QueryTotalCollateralResponse other) {
      if (other == com.kava.cdp.v1beta1.QueryTotalCollateralResponse.getDefaultInstance()) return this;
      if (totalCollateralBuilder_ == null) {
        if (!other.totalCollateral_.isEmpty()) {
          if (totalCollateral_.isEmpty()) {
            totalCollateral_ = other.totalCollateral_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTotalCollateralIsMutable();
            totalCollateral_.addAll(other.totalCollateral_);
          }
          onChanged();
        }
      } else {
        if (!other.totalCollateral_.isEmpty()) {
          if (totalCollateralBuilder_.isEmpty()) {
            totalCollateralBuilder_.dispose();
            totalCollateralBuilder_ = null;
            totalCollateral_ = other.totalCollateral_;
            bitField0_ = (bitField0_ & ~0x00000001);
            totalCollateralBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTotalCollateralFieldBuilder() : null;
          } else {
            totalCollateralBuilder_.addAllMessages(other.totalCollateral_);
          }
        }
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
              com.kava.cdp.v1beta1.TotalCollateral m =
                  input.readMessage(
                      com.kava.cdp.v1beta1.TotalCollateral.parser(),
                      extensionRegistry);
              if (totalCollateralBuilder_ == null) {
                ensureTotalCollateralIsMutable();
                totalCollateral_.add(m);
              } else {
                totalCollateralBuilder_.addMessage(m);
              }
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

    private java.util.List<com.kava.cdp.v1beta1.TotalCollateral> totalCollateral_ =
      java.util.Collections.emptyList();
    private void ensureTotalCollateralIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        totalCollateral_ = new java.util.ArrayList<com.kava.cdp.v1beta1.TotalCollateral>(totalCollateral_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.cdp.v1beta1.TotalCollateral, com.kava.cdp.v1beta1.TotalCollateral.Builder, com.kava.cdp.v1beta1.TotalCollateralOrBuilder> totalCollateralBuilder_;

    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public java.util.List<com.kava.cdp.v1beta1.TotalCollateral> getTotalCollateralList() {
      if (totalCollateralBuilder_ == null) {
        return java.util.Collections.unmodifiableList(totalCollateral_);
      } else {
        return totalCollateralBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public int getTotalCollateralCount() {
      if (totalCollateralBuilder_ == null) {
        return totalCollateral_.size();
      } else {
        return totalCollateralBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public com.kava.cdp.v1beta1.TotalCollateral getTotalCollateral(int index) {
      if (totalCollateralBuilder_ == null) {
        return totalCollateral_.get(index);
      } else {
        return totalCollateralBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder setTotalCollateral(
        int index, com.kava.cdp.v1beta1.TotalCollateral value) {
      if (totalCollateralBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTotalCollateralIsMutable();
        totalCollateral_.set(index, value);
        onChanged();
      } else {
        totalCollateralBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder setTotalCollateral(
        int index, com.kava.cdp.v1beta1.TotalCollateral.Builder builderForValue) {
      if (totalCollateralBuilder_ == null) {
        ensureTotalCollateralIsMutable();
        totalCollateral_.set(index, builderForValue.build());
        onChanged();
      } else {
        totalCollateralBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder addTotalCollateral(com.kava.cdp.v1beta1.TotalCollateral value) {
      if (totalCollateralBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTotalCollateralIsMutable();
        totalCollateral_.add(value);
        onChanged();
      } else {
        totalCollateralBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder addTotalCollateral(
        int index, com.kava.cdp.v1beta1.TotalCollateral value) {
      if (totalCollateralBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTotalCollateralIsMutable();
        totalCollateral_.add(index, value);
        onChanged();
      } else {
        totalCollateralBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder addTotalCollateral(
        com.kava.cdp.v1beta1.TotalCollateral.Builder builderForValue) {
      if (totalCollateralBuilder_ == null) {
        ensureTotalCollateralIsMutable();
        totalCollateral_.add(builderForValue.build());
        onChanged();
      } else {
        totalCollateralBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder addTotalCollateral(
        int index, com.kava.cdp.v1beta1.TotalCollateral.Builder builderForValue) {
      if (totalCollateralBuilder_ == null) {
        ensureTotalCollateralIsMutable();
        totalCollateral_.add(index, builderForValue.build());
        onChanged();
      } else {
        totalCollateralBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder addAllTotalCollateral(
        java.lang.Iterable<? extends com.kava.cdp.v1beta1.TotalCollateral> values) {
      if (totalCollateralBuilder_ == null) {
        ensureTotalCollateralIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, totalCollateral_);
        onChanged();
      } else {
        totalCollateralBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder clearTotalCollateral() {
      if (totalCollateralBuilder_ == null) {
        totalCollateral_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        totalCollateralBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public Builder removeTotalCollateral(int index) {
      if (totalCollateralBuilder_ == null) {
        ensureTotalCollateralIsMutable();
        totalCollateral_.remove(index);
        onChanged();
      } else {
        totalCollateralBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public com.kava.cdp.v1beta1.TotalCollateral.Builder getTotalCollateralBuilder(
        int index) {
      return getTotalCollateralFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public com.kava.cdp.v1beta1.TotalCollateralOrBuilder getTotalCollateralOrBuilder(
        int index) {
      if (totalCollateralBuilder_ == null) {
        return totalCollateral_.get(index);  } else {
        return totalCollateralBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public java.util.List<? extends com.kava.cdp.v1beta1.TotalCollateralOrBuilder> 
         getTotalCollateralOrBuilderList() {
      if (totalCollateralBuilder_ != null) {
        return totalCollateralBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(totalCollateral_);
      }
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public com.kava.cdp.v1beta1.TotalCollateral.Builder addTotalCollateralBuilder() {
      return getTotalCollateralFieldBuilder().addBuilder(
          com.kava.cdp.v1beta1.TotalCollateral.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public com.kava.cdp.v1beta1.TotalCollateral.Builder addTotalCollateralBuilder(
        int index) {
      return getTotalCollateralFieldBuilder().addBuilder(
          index, com.kava.cdp.v1beta1.TotalCollateral.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.cdp.v1beta1.TotalCollateral total_collateral = 1 [json_name = "totalCollateral", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "TotalCollaterals"];</code>
     */
    public java.util.List<com.kava.cdp.v1beta1.TotalCollateral.Builder> 
         getTotalCollateralBuilderList() {
      return getTotalCollateralFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.cdp.v1beta1.TotalCollateral, com.kava.cdp.v1beta1.TotalCollateral.Builder, com.kava.cdp.v1beta1.TotalCollateralOrBuilder> 
        getTotalCollateralFieldBuilder() {
      if (totalCollateralBuilder_ == null) {
        totalCollateralBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kava.cdp.v1beta1.TotalCollateral, com.kava.cdp.v1beta1.TotalCollateral.Builder, com.kava.cdp.v1beta1.TotalCollateralOrBuilder>(
                totalCollateral_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        totalCollateral_ = null;
      }
      return totalCollateralBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.cdp.v1beta1.QueryTotalCollateralResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.cdp.v1beta1.QueryTotalCollateralResponse)
  private static final com.kava.cdp.v1beta1.QueryTotalCollateralResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.cdp.v1beta1.QueryTotalCollateralResponse();
  }

  public static com.kava.cdp.v1beta1.QueryTotalCollateralResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTotalCollateralResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTotalCollateralResponse>() {
    @java.lang.Override
    public QueryTotalCollateralResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTotalCollateralResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTotalCollateralResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.cdp.v1beta1.QueryTotalCollateralResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

