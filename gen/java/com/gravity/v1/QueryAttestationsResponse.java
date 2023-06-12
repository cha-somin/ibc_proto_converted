// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/query.proto

package com.gravity.v1;

/**
 * Protobuf type {@code gravity.v1.QueryAttestationsResponse}
 */
public final class QueryAttestationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravity.v1.QueryAttestationsResponse)
    QueryAttestationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAttestationsResponse.newBuilder() to construct.
  private QueryAttestationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAttestationsResponse() {
    attestations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAttestationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryAttestationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryAttestationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravity.v1.QueryAttestationsResponse.class, com.gravity.v1.QueryAttestationsResponse.Builder.class);
  }

  public static final int ATTESTATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.gravity.v1.Attestation> attestations_;
  /**
   * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.gravity.v1.Attestation> getAttestationsList() {
    return attestations_;
  }
  /**
   * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.gravity.v1.AttestationOrBuilder> 
      getAttestationsOrBuilderList() {
    return attestations_;
  }
  /**
   * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getAttestationsCount() {
    return attestations_.size();
  }
  /**
   * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.gravity.v1.Attestation getAttestations(int index) {
    return attestations_.get(index);
  }
  /**
   * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.gravity.v1.AttestationOrBuilder getAttestationsOrBuilder(
      int index) {
    return attestations_.get(index);
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
    for (int i = 0; i < attestations_.size(); i++) {
      output.writeMessage(1, attestations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < attestations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, attestations_.get(i));
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
    if (!(obj instanceof com.gravity.v1.QueryAttestationsResponse)) {
      return super.equals(obj);
    }
    com.gravity.v1.QueryAttestationsResponse other = (com.gravity.v1.QueryAttestationsResponse) obj;

    if (!getAttestationsList()
        .equals(other.getAttestationsList())) return false;
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
    if (getAttestationsCount() > 0) {
      hash = (37 * hash) + ATTESTATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAttestationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.gravity.v1.QueryAttestationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.gravity.v1.QueryAttestationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.QueryAttestationsResponse parseFrom(
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
  public static Builder newBuilder(com.gravity.v1.QueryAttestationsResponse prototype) {
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
   * Protobuf type {@code gravity.v1.QueryAttestationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravity.v1.QueryAttestationsResponse)
      com.gravity.v1.QueryAttestationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryAttestationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryAttestationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravity.v1.QueryAttestationsResponse.class, com.gravity.v1.QueryAttestationsResponse.Builder.class);
    }

    // Construct using com.gravity.v1.QueryAttestationsResponse.newBuilder()
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
      if (attestationsBuilder_ == null) {
        attestations_ = java.util.Collections.emptyList();
      } else {
        attestations_ = null;
        attestationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryAttestationsResponse_descriptor;
    }

    @java.lang.Override
    public com.gravity.v1.QueryAttestationsResponse getDefaultInstanceForType() {
      return com.gravity.v1.QueryAttestationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravity.v1.QueryAttestationsResponse build() {
      com.gravity.v1.QueryAttestationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravity.v1.QueryAttestationsResponse buildPartial() {
      com.gravity.v1.QueryAttestationsResponse result = new com.gravity.v1.QueryAttestationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.gravity.v1.QueryAttestationsResponse result) {
      if (attestationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          attestations_ = java.util.Collections.unmodifiableList(attestations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attestations_ = attestations_;
      } else {
        result.attestations_ = attestationsBuilder_.build();
      }
    }

    private void buildPartial0(com.gravity.v1.QueryAttestationsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravity.v1.QueryAttestationsResponse) {
        return mergeFrom((com.gravity.v1.QueryAttestationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravity.v1.QueryAttestationsResponse other) {
      if (other == com.gravity.v1.QueryAttestationsResponse.getDefaultInstance()) return this;
      if (attestationsBuilder_ == null) {
        if (!other.attestations_.isEmpty()) {
          if (attestations_.isEmpty()) {
            attestations_ = other.attestations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttestationsIsMutable();
            attestations_.addAll(other.attestations_);
          }
          onChanged();
        }
      } else {
        if (!other.attestations_.isEmpty()) {
          if (attestationsBuilder_.isEmpty()) {
            attestationsBuilder_.dispose();
            attestationsBuilder_ = null;
            attestations_ = other.attestations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attestationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttestationsFieldBuilder() : null;
          } else {
            attestationsBuilder_.addAllMessages(other.attestations_);
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
              com.gravity.v1.Attestation m =
                  input.readMessage(
                      com.gravity.v1.Attestation.parser(),
                      extensionRegistry);
              if (attestationsBuilder_ == null) {
                ensureAttestationsIsMutable();
                attestations_.add(m);
              } else {
                attestationsBuilder_.addMessage(m);
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

    private java.util.List<com.gravity.v1.Attestation> attestations_ =
      java.util.Collections.emptyList();
    private void ensureAttestationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attestations_ = new java.util.ArrayList<com.gravity.v1.Attestation>(attestations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gravity.v1.Attestation, com.gravity.v1.Attestation.Builder, com.gravity.v1.AttestationOrBuilder> attestationsBuilder_;

    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.gravity.v1.Attestation> getAttestationsList() {
      if (attestationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attestations_);
      } else {
        return attestationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public int getAttestationsCount() {
      if (attestationsBuilder_ == null) {
        return attestations_.size();
      } else {
        return attestationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public com.gravity.v1.Attestation getAttestations(int index) {
      if (attestationsBuilder_ == null) {
        return attestations_.get(index);
      } else {
        return attestationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAttestations(
        int index, com.gravity.v1.Attestation value) {
      if (attestationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttestationsIsMutable();
        attestations_.set(index, value);
        onChanged();
      } else {
        attestationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAttestations(
        int index, com.gravity.v1.Attestation.Builder builderForValue) {
      if (attestationsBuilder_ == null) {
        ensureAttestationsIsMutable();
        attestations_.set(index, builderForValue.build());
        onChanged();
      } else {
        attestationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAttestations(com.gravity.v1.Attestation value) {
      if (attestationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttestationsIsMutable();
        attestations_.add(value);
        onChanged();
      } else {
        attestationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAttestations(
        int index, com.gravity.v1.Attestation value) {
      if (attestationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttestationsIsMutable();
        attestations_.add(index, value);
        onChanged();
      } else {
        attestationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAttestations(
        com.gravity.v1.Attestation.Builder builderForValue) {
      if (attestationsBuilder_ == null) {
        ensureAttestationsIsMutable();
        attestations_.add(builderForValue.build());
        onChanged();
      } else {
        attestationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAttestations(
        int index, com.gravity.v1.Attestation.Builder builderForValue) {
      if (attestationsBuilder_ == null) {
        ensureAttestationsIsMutable();
        attestations_.add(index, builderForValue.build());
        onChanged();
      } else {
        attestationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllAttestations(
        java.lang.Iterable<? extends com.gravity.v1.Attestation> values) {
      if (attestationsBuilder_ == null) {
        ensureAttestationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attestations_);
        onChanged();
      } else {
        attestationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAttestations() {
      if (attestationsBuilder_ == null) {
        attestations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attestationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeAttestations(int index) {
      if (attestationsBuilder_ == null) {
        ensureAttestationsIsMutable();
        attestations_.remove(index);
        onChanged();
      } else {
        attestationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public com.gravity.v1.Attestation.Builder getAttestationsBuilder(
        int index) {
      return getAttestationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public com.gravity.v1.AttestationOrBuilder getAttestationsOrBuilder(
        int index) {
      if (attestationsBuilder_ == null) {
        return attestations_.get(index);  } else {
        return attestationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.gravity.v1.AttestationOrBuilder> 
         getAttestationsOrBuilderList() {
      if (attestationsBuilder_ != null) {
        return attestationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attestations_);
      }
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public com.gravity.v1.Attestation.Builder addAttestationsBuilder() {
      return getAttestationsFieldBuilder().addBuilder(
          com.gravity.v1.Attestation.getDefaultInstance());
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public com.gravity.v1.Attestation.Builder addAttestationsBuilder(
        int index) {
      return getAttestationsFieldBuilder().addBuilder(
          index, com.gravity.v1.Attestation.getDefaultInstance());
    }
    /**
     * <code>repeated .gravity.v1.Attestation attestations = 1 [json_name = "attestations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.gravity.v1.Attestation.Builder> 
         getAttestationsBuilderList() {
      return getAttestationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gravity.v1.Attestation, com.gravity.v1.Attestation.Builder, com.gravity.v1.AttestationOrBuilder> 
        getAttestationsFieldBuilder() {
      if (attestationsBuilder_ == null) {
        attestationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.gravity.v1.Attestation, com.gravity.v1.Attestation.Builder, com.gravity.v1.AttestationOrBuilder>(
                attestations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        attestations_ = null;
      }
      return attestationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:gravity.v1.QueryAttestationsResponse)
  }

  // @@protoc_insertion_point(class_scope:gravity.v1.QueryAttestationsResponse)
  private static final com.gravity.v1.QueryAttestationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravity.v1.QueryAttestationsResponse();
  }

  public static com.gravity.v1.QueryAttestationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAttestationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAttestationsResponse>() {
    @java.lang.Override
    public QueryAttestationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAttestationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAttestationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravity.v1.QueryAttestationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

