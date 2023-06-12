// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/hard/v1beta1/query.proto

package com.kava.hard.v1beta1;

/**
 * <pre>
 * QueryInterestFactorsResponse is the response type for the Query/InterestFactors RPC method.
 * </pre>
 *
 * Protobuf type {@code kava.hard.v1beta1.QueryInterestFactorsResponse}
 */
public final class QueryInterestFactorsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.hard.v1beta1.QueryInterestFactorsResponse)
    QueryInterestFactorsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryInterestFactorsResponse.newBuilder() to construct.
  private QueryInterestFactorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryInterestFactorsResponse() {
    interestFactors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryInterestFactorsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryInterestFactorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryInterestFactorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.hard.v1beta1.QueryInterestFactorsResponse.class, com.kava.hard.v1beta1.QueryInterestFactorsResponse.Builder.class);
  }

  public static final int INTEREST_FACTORS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.kava.hard.v1beta1.InterestFactor> interestFactors_;
  /**
   * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
   */
  @java.lang.Override
  public java.util.List<com.kava.hard.v1beta1.InterestFactor> getInterestFactorsList() {
    return interestFactors_;
  }
  /**
   * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.kava.hard.v1beta1.InterestFactorOrBuilder> 
      getInterestFactorsOrBuilderList() {
    return interestFactors_;
  }
  /**
   * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
   */
  @java.lang.Override
  public int getInterestFactorsCount() {
    return interestFactors_.size();
  }
  /**
   * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
   */
  @java.lang.Override
  public com.kava.hard.v1beta1.InterestFactor getInterestFactors(int index) {
    return interestFactors_.get(index);
  }
  /**
   * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
   */
  @java.lang.Override
  public com.kava.hard.v1beta1.InterestFactorOrBuilder getInterestFactorsOrBuilder(
      int index) {
    return interestFactors_.get(index);
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
    for (int i = 0; i < interestFactors_.size(); i++) {
      output.writeMessage(1, interestFactors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < interestFactors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, interestFactors_.get(i));
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
    if (!(obj instanceof com.kava.hard.v1beta1.QueryInterestFactorsResponse)) {
      return super.equals(obj);
    }
    com.kava.hard.v1beta1.QueryInterestFactorsResponse other = (com.kava.hard.v1beta1.QueryInterestFactorsResponse) obj;

    if (!getInterestFactorsList()
        .equals(other.getInterestFactorsList())) return false;
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
    if (getInterestFactorsCount() > 0) {
      hash = (37 * hash) + INTEREST_FACTORS_FIELD_NUMBER;
      hash = (53 * hash) + getInterestFactorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse parseFrom(
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
  public static Builder newBuilder(com.kava.hard.v1beta1.QueryInterestFactorsResponse prototype) {
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
   * QueryInterestFactorsResponse is the response type for the Query/InterestFactors RPC method.
   * </pre>
   *
   * Protobuf type {@code kava.hard.v1beta1.QueryInterestFactorsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.hard.v1beta1.QueryInterestFactorsResponse)
      com.kava.hard.v1beta1.QueryInterestFactorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryInterestFactorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryInterestFactorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.hard.v1beta1.QueryInterestFactorsResponse.class, com.kava.hard.v1beta1.QueryInterestFactorsResponse.Builder.class);
    }

    // Construct using com.kava.hard.v1beta1.QueryInterestFactorsResponse.newBuilder()
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
      if (interestFactorsBuilder_ == null) {
        interestFactors_ = java.util.Collections.emptyList();
      } else {
        interestFactors_ = null;
        interestFactorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryInterestFactorsResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.QueryInterestFactorsResponse getDefaultInstanceForType() {
      return com.kava.hard.v1beta1.QueryInterestFactorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.QueryInterestFactorsResponse build() {
      com.kava.hard.v1beta1.QueryInterestFactorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.QueryInterestFactorsResponse buildPartial() {
      com.kava.hard.v1beta1.QueryInterestFactorsResponse result = new com.kava.hard.v1beta1.QueryInterestFactorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.kava.hard.v1beta1.QueryInterestFactorsResponse result) {
      if (interestFactorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          interestFactors_ = java.util.Collections.unmodifiableList(interestFactors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.interestFactors_ = interestFactors_;
      } else {
        result.interestFactors_ = interestFactorsBuilder_.build();
      }
    }

    private void buildPartial0(com.kava.hard.v1beta1.QueryInterestFactorsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.hard.v1beta1.QueryInterestFactorsResponse) {
        return mergeFrom((com.kava.hard.v1beta1.QueryInterestFactorsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.hard.v1beta1.QueryInterestFactorsResponse other) {
      if (other == com.kava.hard.v1beta1.QueryInterestFactorsResponse.getDefaultInstance()) return this;
      if (interestFactorsBuilder_ == null) {
        if (!other.interestFactors_.isEmpty()) {
          if (interestFactors_.isEmpty()) {
            interestFactors_ = other.interestFactors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInterestFactorsIsMutable();
            interestFactors_.addAll(other.interestFactors_);
          }
          onChanged();
        }
      } else {
        if (!other.interestFactors_.isEmpty()) {
          if (interestFactorsBuilder_.isEmpty()) {
            interestFactorsBuilder_.dispose();
            interestFactorsBuilder_ = null;
            interestFactors_ = other.interestFactors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            interestFactorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInterestFactorsFieldBuilder() : null;
          } else {
            interestFactorsBuilder_.addAllMessages(other.interestFactors_);
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
              com.kava.hard.v1beta1.InterestFactor m =
                  input.readMessage(
                      com.kava.hard.v1beta1.InterestFactor.parser(),
                      extensionRegistry);
              if (interestFactorsBuilder_ == null) {
                ensureInterestFactorsIsMutable();
                interestFactors_.add(m);
              } else {
                interestFactorsBuilder_.addMessage(m);
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

    private java.util.List<com.kava.hard.v1beta1.InterestFactor> interestFactors_ =
      java.util.Collections.emptyList();
    private void ensureInterestFactorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        interestFactors_ = new java.util.ArrayList<com.kava.hard.v1beta1.InterestFactor>(interestFactors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.hard.v1beta1.InterestFactor, com.kava.hard.v1beta1.InterestFactor.Builder, com.kava.hard.v1beta1.InterestFactorOrBuilder> interestFactorsBuilder_;

    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public java.util.List<com.kava.hard.v1beta1.InterestFactor> getInterestFactorsList() {
      if (interestFactorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(interestFactors_);
      } else {
        return interestFactorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public int getInterestFactorsCount() {
      if (interestFactorsBuilder_ == null) {
        return interestFactors_.size();
      } else {
        return interestFactorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public com.kava.hard.v1beta1.InterestFactor getInterestFactors(int index) {
      if (interestFactorsBuilder_ == null) {
        return interestFactors_.get(index);
      } else {
        return interestFactorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder setInterestFactors(
        int index, com.kava.hard.v1beta1.InterestFactor value) {
      if (interestFactorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterestFactorsIsMutable();
        interestFactors_.set(index, value);
        onChanged();
      } else {
        interestFactorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder setInterestFactors(
        int index, com.kava.hard.v1beta1.InterestFactor.Builder builderForValue) {
      if (interestFactorsBuilder_ == null) {
        ensureInterestFactorsIsMutable();
        interestFactors_.set(index, builderForValue.build());
        onChanged();
      } else {
        interestFactorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder addInterestFactors(com.kava.hard.v1beta1.InterestFactor value) {
      if (interestFactorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterestFactorsIsMutable();
        interestFactors_.add(value);
        onChanged();
      } else {
        interestFactorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder addInterestFactors(
        int index, com.kava.hard.v1beta1.InterestFactor value) {
      if (interestFactorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterestFactorsIsMutable();
        interestFactors_.add(index, value);
        onChanged();
      } else {
        interestFactorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder addInterestFactors(
        com.kava.hard.v1beta1.InterestFactor.Builder builderForValue) {
      if (interestFactorsBuilder_ == null) {
        ensureInterestFactorsIsMutable();
        interestFactors_.add(builderForValue.build());
        onChanged();
      } else {
        interestFactorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder addInterestFactors(
        int index, com.kava.hard.v1beta1.InterestFactor.Builder builderForValue) {
      if (interestFactorsBuilder_ == null) {
        ensureInterestFactorsIsMutable();
        interestFactors_.add(index, builderForValue.build());
        onChanged();
      } else {
        interestFactorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder addAllInterestFactors(
        java.lang.Iterable<? extends com.kava.hard.v1beta1.InterestFactor> values) {
      if (interestFactorsBuilder_ == null) {
        ensureInterestFactorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, interestFactors_);
        onChanged();
      } else {
        interestFactorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder clearInterestFactors() {
      if (interestFactorsBuilder_ == null) {
        interestFactors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        interestFactorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public Builder removeInterestFactors(int index) {
      if (interestFactorsBuilder_ == null) {
        ensureInterestFactorsIsMutable();
        interestFactors_.remove(index);
        onChanged();
      } else {
        interestFactorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public com.kava.hard.v1beta1.InterestFactor.Builder getInterestFactorsBuilder(
        int index) {
      return getInterestFactorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public com.kava.hard.v1beta1.InterestFactorOrBuilder getInterestFactorsOrBuilder(
        int index) {
      if (interestFactorsBuilder_ == null) {
        return interestFactors_.get(index);  } else {
        return interestFactorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public java.util.List<? extends com.kava.hard.v1beta1.InterestFactorOrBuilder> 
         getInterestFactorsOrBuilderList() {
      if (interestFactorsBuilder_ != null) {
        return interestFactorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(interestFactors_);
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public com.kava.hard.v1beta1.InterestFactor.Builder addInterestFactorsBuilder() {
      return getInterestFactorsFieldBuilder().addBuilder(
          com.kava.hard.v1beta1.InterestFactor.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public com.kava.hard.v1beta1.InterestFactor.Builder addInterestFactorsBuilder(
        int index) {
      return getInterestFactorsFieldBuilder().addBuilder(
          index, com.kava.hard.v1beta1.InterestFactor.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.hard.v1beta1.InterestFactor interest_factors = 1 [json_name = "interestFactors", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "InterestFactors"];</code>
     */
    public java.util.List<com.kava.hard.v1beta1.InterestFactor.Builder> 
         getInterestFactorsBuilderList() {
      return getInterestFactorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.hard.v1beta1.InterestFactor, com.kava.hard.v1beta1.InterestFactor.Builder, com.kava.hard.v1beta1.InterestFactorOrBuilder> 
        getInterestFactorsFieldBuilder() {
      if (interestFactorsBuilder_ == null) {
        interestFactorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kava.hard.v1beta1.InterestFactor, com.kava.hard.v1beta1.InterestFactor.Builder, com.kava.hard.v1beta1.InterestFactorOrBuilder>(
                interestFactors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        interestFactors_ = null;
      }
      return interestFactorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.hard.v1beta1.QueryInterestFactorsResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.hard.v1beta1.QueryInterestFactorsResponse)
  private static final com.kava.hard.v1beta1.QueryInterestFactorsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.hard.v1beta1.QueryInterestFactorsResponse();
  }

  public static com.kava.hard.v1beta1.QueryInterestFactorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryInterestFactorsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryInterestFactorsResponse>() {
    @java.lang.Override
    public QueryInterestFactorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryInterestFactorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryInterestFactorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.hard.v1beta1.QueryInterestFactorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

