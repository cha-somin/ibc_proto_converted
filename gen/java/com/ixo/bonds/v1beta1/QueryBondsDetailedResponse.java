// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/bonds/v1beta1/query.proto

package com.ixo.bonds.v1beta1;

/**
 * <pre>
 * QueryBondsDetailedResponse is the response type for the Query/BondsDetailed
 * RPC method.
 * </pre>
 *
 * Protobuf type {@code ixo.bonds.v1beta1.QueryBondsDetailedResponse}
 */
public final class QueryBondsDetailedResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.bonds.v1beta1.QueryBondsDetailedResponse)
    QueryBondsDetailedResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBondsDetailedResponse.newBuilder() to construct.
  private QueryBondsDetailedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBondsDetailedResponse() {
    bondsDetailed_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBondsDetailedResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryBondsDetailedResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryBondsDetailedResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.bonds.v1beta1.QueryBondsDetailedResponse.class, com.ixo.bonds.v1beta1.QueryBondsDetailedResponse.Builder.class);
  }

  public static final int BONDS_DETAILED_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.ixo.bonds.v1beta1.BondDetails> bondsDetailed_;
  /**
   * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.ixo.bonds.v1beta1.BondDetails> getBondsDetailedList() {
    return bondsDetailed_;
  }
  /**
   * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ixo.bonds.v1beta1.BondDetailsOrBuilder> 
      getBondsDetailedOrBuilderList() {
    return bondsDetailed_;
  }
  /**
   * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
   */
  @java.lang.Override
  public int getBondsDetailedCount() {
    return bondsDetailed_.size();
  }
  /**
   * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
   */
  @java.lang.Override
  public com.ixo.bonds.v1beta1.BondDetails getBondsDetailed(int index) {
    return bondsDetailed_.get(index);
  }
  /**
   * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
   */
  @java.lang.Override
  public com.ixo.bonds.v1beta1.BondDetailsOrBuilder getBondsDetailedOrBuilder(
      int index) {
    return bondsDetailed_.get(index);
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
    for (int i = 0; i < bondsDetailed_.size(); i++) {
      output.writeMessage(1, bondsDetailed_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bondsDetailed_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bondsDetailed_.get(i));
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
    if (!(obj instanceof com.ixo.bonds.v1beta1.QueryBondsDetailedResponse)) {
      return super.equals(obj);
    }
    com.ixo.bonds.v1beta1.QueryBondsDetailedResponse other = (com.ixo.bonds.v1beta1.QueryBondsDetailedResponse) obj;

    if (!getBondsDetailedList()
        .equals(other.getBondsDetailedList())) return false;
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
    if (getBondsDetailedCount() > 0) {
      hash = (37 * hash) + BONDS_DETAILED_FIELD_NUMBER;
      hash = (53 * hash) + getBondsDetailedList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse parseFrom(
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
  public static Builder newBuilder(com.ixo.bonds.v1beta1.QueryBondsDetailedResponse prototype) {
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
   * QueryBondsDetailedResponse is the response type for the Query/BondsDetailed
   * RPC method.
   * </pre>
   *
   * Protobuf type {@code ixo.bonds.v1beta1.QueryBondsDetailedResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.bonds.v1beta1.QueryBondsDetailedResponse)
      com.ixo.bonds.v1beta1.QueryBondsDetailedResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryBondsDetailedResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryBondsDetailedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.bonds.v1beta1.QueryBondsDetailedResponse.class, com.ixo.bonds.v1beta1.QueryBondsDetailedResponse.Builder.class);
    }

    // Construct using com.ixo.bonds.v1beta1.QueryBondsDetailedResponse.newBuilder()
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
      if (bondsDetailedBuilder_ == null) {
        bondsDetailed_ = java.util.Collections.emptyList();
      } else {
        bondsDetailed_ = null;
        bondsDetailedBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryBondsDetailedResponse_descriptor;
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.QueryBondsDetailedResponse getDefaultInstanceForType() {
      return com.ixo.bonds.v1beta1.QueryBondsDetailedResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.QueryBondsDetailedResponse build() {
      com.ixo.bonds.v1beta1.QueryBondsDetailedResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.QueryBondsDetailedResponse buildPartial() {
      com.ixo.bonds.v1beta1.QueryBondsDetailedResponse result = new com.ixo.bonds.v1beta1.QueryBondsDetailedResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ixo.bonds.v1beta1.QueryBondsDetailedResponse result) {
      if (bondsDetailedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bondsDetailed_ = java.util.Collections.unmodifiableList(bondsDetailed_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bondsDetailed_ = bondsDetailed_;
      } else {
        result.bondsDetailed_ = bondsDetailedBuilder_.build();
      }
    }

    private void buildPartial0(com.ixo.bonds.v1beta1.QueryBondsDetailedResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.bonds.v1beta1.QueryBondsDetailedResponse) {
        return mergeFrom((com.ixo.bonds.v1beta1.QueryBondsDetailedResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.bonds.v1beta1.QueryBondsDetailedResponse other) {
      if (other == com.ixo.bonds.v1beta1.QueryBondsDetailedResponse.getDefaultInstance()) return this;
      if (bondsDetailedBuilder_ == null) {
        if (!other.bondsDetailed_.isEmpty()) {
          if (bondsDetailed_.isEmpty()) {
            bondsDetailed_ = other.bondsDetailed_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBondsDetailedIsMutable();
            bondsDetailed_.addAll(other.bondsDetailed_);
          }
          onChanged();
        }
      } else {
        if (!other.bondsDetailed_.isEmpty()) {
          if (bondsDetailedBuilder_.isEmpty()) {
            bondsDetailedBuilder_.dispose();
            bondsDetailedBuilder_ = null;
            bondsDetailed_ = other.bondsDetailed_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bondsDetailedBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBondsDetailedFieldBuilder() : null;
          } else {
            bondsDetailedBuilder_.addAllMessages(other.bondsDetailed_);
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
              com.ixo.bonds.v1beta1.BondDetails m =
                  input.readMessage(
                      com.ixo.bonds.v1beta1.BondDetails.parser(),
                      extensionRegistry);
              if (bondsDetailedBuilder_ == null) {
                ensureBondsDetailedIsMutable();
                bondsDetailed_.add(m);
              } else {
                bondsDetailedBuilder_.addMessage(m);
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

    private java.util.List<com.ixo.bonds.v1beta1.BondDetails> bondsDetailed_ =
      java.util.Collections.emptyList();
    private void ensureBondsDetailedIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bondsDetailed_ = new java.util.ArrayList<com.ixo.bonds.v1beta1.BondDetails>(bondsDetailed_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ixo.bonds.v1beta1.BondDetails, com.ixo.bonds.v1beta1.BondDetails.Builder, com.ixo.bonds.v1beta1.BondDetailsOrBuilder> bondsDetailedBuilder_;

    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public java.util.List<com.ixo.bonds.v1beta1.BondDetails> getBondsDetailedList() {
      if (bondsDetailedBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bondsDetailed_);
      } else {
        return bondsDetailedBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public int getBondsDetailedCount() {
      if (bondsDetailedBuilder_ == null) {
        return bondsDetailed_.size();
      } else {
        return bondsDetailedBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public com.ixo.bonds.v1beta1.BondDetails getBondsDetailed(int index) {
      if (bondsDetailedBuilder_ == null) {
        return bondsDetailed_.get(index);
      } else {
        return bondsDetailedBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder setBondsDetailed(
        int index, com.ixo.bonds.v1beta1.BondDetails value) {
      if (bondsDetailedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondsDetailedIsMutable();
        bondsDetailed_.set(index, value);
        onChanged();
      } else {
        bondsDetailedBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder setBondsDetailed(
        int index, com.ixo.bonds.v1beta1.BondDetails.Builder builderForValue) {
      if (bondsDetailedBuilder_ == null) {
        ensureBondsDetailedIsMutable();
        bondsDetailed_.set(index, builderForValue.build());
        onChanged();
      } else {
        bondsDetailedBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder addBondsDetailed(com.ixo.bonds.v1beta1.BondDetails value) {
      if (bondsDetailedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondsDetailedIsMutable();
        bondsDetailed_.add(value);
        onChanged();
      } else {
        bondsDetailedBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder addBondsDetailed(
        int index, com.ixo.bonds.v1beta1.BondDetails value) {
      if (bondsDetailedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondsDetailedIsMutable();
        bondsDetailed_.add(index, value);
        onChanged();
      } else {
        bondsDetailedBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder addBondsDetailed(
        com.ixo.bonds.v1beta1.BondDetails.Builder builderForValue) {
      if (bondsDetailedBuilder_ == null) {
        ensureBondsDetailedIsMutable();
        bondsDetailed_.add(builderForValue.build());
        onChanged();
      } else {
        bondsDetailedBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder addBondsDetailed(
        int index, com.ixo.bonds.v1beta1.BondDetails.Builder builderForValue) {
      if (bondsDetailedBuilder_ == null) {
        ensureBondsDetailedIsMutable();
        bondsDetailed_.add(index, builderForValue.build());
        onChanged();
      } else {
        bondsDetailedBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder addAllBondsDetailed(
        java.lang.Iterable<? extends com.ixo.bonds.v1beta1.BondDetails> values) {
      if (bondsDetailedBuilder_ == null) {
        ensureBondsDetailedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bondsDetailed_);
        onChanged();
      } else {
        bondsDetailedBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder clearBondsDetailed() {
      if (bondsDetailedBuilder_ == null) {
        bondsDetailed_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bondsDetailedBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public Builder removeBondsDetailed(int index) {
      if (bondsDetailedBuilder_ == null) {
        ensureBondsDetailedIsMutable();
        bondsDetailed_.remove(index);
        onChanged();
      } else {
        bondsDetailedBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public com.ixo.bonds.v1beta1.BondDetails.Builder getBondsDetailedBuilder(
        int index) {
      return getBondsDetailedFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public com.ixo.bonds.v1beta1.BondDetailsOrBuilder getBondsDetailedOrBuilder(
        int index) {
      if (bondsDetailedBuilder_ == null) {
        return bondsDetailed_.get(index);  } else {
        return bondsDetailedBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public java.util.List<? extends com.ixo.bonds.v1beta1.BondDetailsOrBuilder> 
         getBondsDetailedOrBuilderList() {
      if (bondsDetailedBuilder_ != null) {
        return bondsDetailedBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bondsDetailed_);
      }
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public com.ixo.bonds.v1beta1.BondDetails.Builder addBondsDetailedBuilder() {
      return getBondsDetailedFieldBuilder().addBuilder(
          com.ixo.bonds.v1beta1.BondDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public com.ixo.bonds.v1beta1.BondDetails.Builder addBondsDetailedBuilder(
        int index) {
      return getBondsDetailedFieldBuilder().addBuilder(
          index, com.ixo.bonds.v1beta1.BondDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .ixo.bonds.v1beta1.BondDetails bonds_detailed = 1 [json_name = "bondsDetailed", (.gogoproto.moretags) = "yaml:&#92;"bonds_detailed&#92;""];</code>
     */
    public java.util.List<com.ixo.bonds.v1beta1.BondDetails.Builder> 
         getBondsDetailedBuilderList() {
      return getBondsDetailedFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ixo.bonds.v1beta1.BondDetails, com.ixo.bonds.v1beta1.BondDetails.Builder, com.ixo.bonds.v1beta1.BondDetailsOrBuilder> 
        getBondsDetailedFieldBuilder() {
      if (bondsDetailedBuilder_ == null) {
        bondsDetailedBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ixo.bonds.v1beta1.BondDetails, com.ixo.bonds.v1beta1.BondDetails.Builder, com.ixo.bonds.v1beta1.BondDetailsOrBuilder>(
                bondsDetailed_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bondsDetailed_ = null;
      }
      return bondsDetailedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ixo.bonds.v1beta1.QueryBondsDetailedResponse)
  }

  // @@protoc_insertion_point(class_scope:ixo.bonds.v1beta1.QueryBondsDetailedResponse)
  private static final com.ixo.bonds.v1beta1.QueryBondsDetailedResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.bonds.v1beta1.QueryBondsDetailedResponse();
  }

  public static com.ixo.bonds.v1beta1.QueryBondsDetailedResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryBondsDetailedResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryBondsDetailedResponse>() {
    @java.lang.Override
    public QueryBondsDetailedResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryBondsDetailedResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryBondsDetailedResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.bonds.v1beta1.QueryBondsDetailedResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

