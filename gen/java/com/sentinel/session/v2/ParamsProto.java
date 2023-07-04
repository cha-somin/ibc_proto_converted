// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/session/v2/params.proto

package com.sentinel.session.v2;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.session.v2.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the inactiveDuration field is set.
     */
    boolean hasInactiveDuration();
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The inactiveDuration.
     */
    com.google.protobuf.Duration getInactiveDuration();
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    com.google.protobuf.DurationOrBuilder getInactiveDurationOrBuilder();

    /**
     * <code>bool proof_verification_enabled = 2 [json_name = "proofVerificationEnabled"];</code>
     * @return The proofVerificationEnabled.
     */
    boolean getProofVerificationEnabled();
  }
  /**
   * Protobuf type {@code sentinel.session.v2.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.session.v2.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.session.v2.ParamsProto.internal_static_sentinel_session_v2_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.session.v2.ParamsProto.internal_static_sentinel_session_v2_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.session.v2.ParamsProto.Params.class, com.sentinel.session.v2.ParamsProto.Params.Builder.class);
    }

    public static final int INACTIVE_DURATION_FIELD_NUMBER = 1;
    private com.google.protobuf.Duration inactiveDuration_;
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the inactiveDuration field is set.
     */
    @java.lang.Override
    public boolean hasInactiveDuration() {
      return inactiveDuration_ != null;
    }
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The inactiveDuration.
     */
    @java.lang.Override
    public com.google.protobuf.Duration getInactiveDuration() {
      return inactiveDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : inactiveDuration_;
    }
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.DurationOrBuilder getInactiveDurationOrBuilder() {
      return inactiveDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : inactiveDuration_;
    }

    public static final int PROOF_VERIFICATION_ENABLED_FIELD_NUMBER = 2;
    private boolean proofVerificationEnabled_ = false;
    /**
     * <code>bool proof_verification_enabled = 2 [json_name = "proofVerificationEnabled"];</code>
     * @return The proofVerificationEnabled.
     */
    @java.lang.Override
    public boolean getProofVerificationEnabled() {
      return proofVerificationEnabled_;
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
      if (inactiveDuration_ != null) {
        output.writeMessage(1, getInactiveDuration());
      }
      if (proofVerificationEnabled_ != false) {
        output.writeBool(2, proofVerificationEnabled_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (inactiveDuration_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getInactiveDuration());
      }
      if (proofVerificationEnabled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, proofVerificationEnabled_);
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
      if (!(obj instanceof com.sentinel.session.v2.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.sentinel.session.v2.ParamsProto.Params other = (com.sentinel.session.v2.ParamsProto.Params) obj;

      if (hasInactiveDuration() != other.hasInactiveDuration()) return false;
      if (hasInactiveDuration()) {
        if (!getInactiveDuration()
            .equals(other.getInactiveDuration())) return false;
      }
      if (getProofVerificationEnabled()
          != other.getProofVerificationEnabled()) return false;
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
      if (hasInactiveDuration()) {
        hash = (37 * hash) + INACTIVE_DURATION_FIELD_NUMBER;
        hash = (53 * hash) + getInactiveDuration().hashCode();
      }
      hash = (37 * hash) + PROOF_VERIFICATION_ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getProofVerificationEnabled());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.sentinel.session.v2.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.sentinel.session.v2.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.session.v2.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.sentinel.session.v2.ParamsProto.Params prototype) {
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
     * Protobuf type {@code sentinel.session.v2.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.session.v2.Params)
        com.sentinel.session.v2.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sentinel.session.v2.ParamsProto.internal_static_sentinel_session_v2_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sentinel.session.v2.ParamsProto.internal_static_sentinel_session_v2_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sentinel.session.v2.ParamsProto.Params.class, com.sentinel.session.v2.ParamsProto.Params.Builder.class);
      }

      // Construct using com.sentinel.session.v2.ParamsProto.Params.newBuilder()
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
        inactiveDuration_ = null;
        if (inactiveDurationBuilder_ != null) {
          inactiveDurationBuilder_.dispose();
          inactiveDurationBuilder_ = null;
        }
        proofVerificationEnabled_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sentinel.session.v2.ParamsProto.internal_static_sentinel_session_v2_Params_descriptor;
      }

      @java.lang.Override
      public com.sentinel.session.v2.ParamsProto.Params getDefaultInstanceForType() {
        return com.sentinel.session.v2.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.sentinel.session.v2.ParamsProto.Params build() {
        com.sentinel.session.v2.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sentinel.session.v2.ParamsProto.Params buildPartial() {
        com.sentinel.session.v2.ParamsProto.Params result = new com.sentinel.session.v2.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.sentinel.session.v2.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.inactiveDuration_ = inactiveDurationBuilder_ == null
              ? inactiveDuration_
              : inactiveDurationBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.proofVerificationEnabled_ = proofVerificationEnabled_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sentinel.session.v2.ParamsProto.Params) {
          return mergeFrom((com.sentinel.session.v2.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sentinel.session.v2.ParamsProto.Params other) {
        if (other == com.sentinel.session.v2.ParamsProto.Params.getDefaultInstance()) return this;
        if (other.hasInactiveDuration()) {
          mergeInactiveDuration(other.getInactiveDuration());
        }
        if (other.getProofVerificationEnabled() != false) {
          setProofVerificationEnabled(other.getProofVerificationEnabled());
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
                    getInactiveDurationFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                proofVerificationEnabled_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private com.google.protobuf.Duration inactiveDuration_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> inactiveDurationBuilder_;
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return Whether the inactiveDuration field is set.
       */
      public boolean hasInactiveDuration() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return The inactiveDuration.
       */
      public com.google.protobuf.Duration getInactiveDuration() {
        if (inactiveDurationBuilder_ == null) {
          return inactiveDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : inactiveDuration_;
        } else {
          return inactiveDurationBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setInactiveDuration(com.google.protobuf.Duration value) {
        if (inactiveDurationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          inactiveDuration_ = value;
        } else {
          inactiveDurationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setInactiveDuration(
          com.google.protobuf.Duration.Builder builderForValue) {
        if (inactiveDurationBuilder_ == null) {
          inactiveDuration_ = builderForValue.build();
        } else {
          inactiveDurationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder mergeInactiveDuration(com.google.protobuf.Duration value) {
        if (inactiveDurationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            inactiveDuration_ != null &&
            inactiveDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
            getInactiveDurationBuilder().mergeFrom(value);
          } else {
            inactiveDuration_ = value;
          }
        } else {
          inactiveDurationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder clearInactiveDuration() {
        bitField0_ = (bitField0_ & ~0x00000001);
        inactiveDuration_ = null;
        if (inactiveDurationBuilder_ != null) {
          inactiveDurationBuilder_.dispose();
          inactiveDurationBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.Duration.Builder getInactiveDurationBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getInactiveDurationFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.DurationOrBuilder getInactiveDurationOrBuilder() {
        if (inactiveDurationBuilder_ != null) {
          return inactiveDurationBuilder_.getMessageOrBuilder();
        } else {
          return inactiveDuration_ == null ?
              com.google.protobuf.Duration.getDefaultInstance() : inactiveDuration_;
        }
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [json_name = "inactiveDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
          getInactiveDurationFieldBuilder() {
        if (inactiveDurationBuilder_ == null) {
          inactiveDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                  getInactiveDuration(),
                  getParentForChildren(),
                  isClean());
          inactiveDuration_ = null;
        }
        return inactiveDurationBuilder_;
      }

      private boolean proofVerificationEnabled_ ;
      /**
       * <code>bool proof_verification_enabled = 2 [json_name = "proofVerificationEnabled"];</code>
       * @return The proofVerificationEnabled.
       */
      @java.lang.Override
      public boolean getProofVerificationEnabled() {
        return proofVerificationEnabled_;
      }
      /**
       * <code>bool proof_verification_enabled = 2 [json_name = "proofVerificationEnabled"];</code>
       * @param value The proofVerificationEnabled to set.
       * @return This builder for chaining.
       */
      public Builder setProofVerificationEnabled(boolean value) {

        proofVerificationEnabled_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool proof_verification_enabled = 2 [json_name = "proofVerificationEnabled"];</code>
       * @return This builder for chaining.
       */
      public Builder clearProofVerificationEnabled() {
        bitField0_ = (bitField0_ & ~0x00000002);
        proofVerificationEnabled_ = false;
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


      // @@protoc_insertion_point(builder_scope:sentinel.session.v2.Params)
    }

    // @@protoc_insertion_point(class_scope:sentinel.session.v2.Params)
    private static final com.sentinel.session.v2.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sentinel.session.v2.ParamsProto.Params();
    }

    public static com.sentinel.session.v2.ParamsProto.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
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

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sentinel.session.v2.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_session_v2_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_session_v2_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n sentinel/session/v2/params.proto\022\023sent" +
      "inel.session.v2\032\024gogoproto/gogo.proto\032\036g" +
      "oogle/protobuf/duration.proto\"\230\001\n\006Params" +
      "\022P\n\021inactive_duration\030\001 \001(\0132\031.google.pro" +
      "tobuf.DurationB\010\310\336\037\000\230\337\037\001R\020inactiveDurati" +
      "on\022<\n\032proof_verification_enabled\030\002 \001(\010R\030" +
      "proofVerificationEnabledB\314\001\n\027com.sentine" +
      "l.session.v2B\013ParamsProtoZ0github.com/se" +
      "ntinel-official/hub/x/session/types\242\002\003SS" +
      "X\252\002\023Sentinel.Session.V2\312\002\023Sentinel\\Sessi" +
      "on\\V2\342\002\037Sentinel\\Session\\V2\\GPBMetadata\352" +
      "\002\025Sentinel::Session::V2\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_sentinel_session_v2_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_session_v2_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_session_v2_Params_descriptor,
        new java.lang.String[] { "InactiveDuration", "ProofVerificationEnabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}